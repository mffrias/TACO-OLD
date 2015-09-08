package SourcesEstebanPintos;

//http://moderntone.blogspot.com.ar/2013/05/implementation-of-avl-tree-java-library.html
public class AVLTree2 {
	
	/*@ invariant (\forall AVLNode2 n; 
	  @ \reach(root, AVLNode2, right + left).has(n) == true; 
	  @ \reach(n.left, AVLNode2, left + right).has(n) == false && 
	  @ \reach(n.right, AVLNode2, left + right).has(n) == false &&
	  @ ((n.left!=null && n.right == null) ==> n.height < 2) &&
	  @ ((n.right!=null && n.left == null) ==> n.height < 2) &&
	  @ ((n.right==null && n.left == null) ==> n.height == 0) &&
	  @ (\forall AVLNode2 nLeft; (\reach(n.left, AVLNode2, left + right).has(nLeft) == true ==> (nLeft.value < n.value))) &&
	  @ (\forall AVLNode2 nRight; (\reach(n.right, AVLNode2, left + right).has(nRight) == true ==> (nRight.value >= n.value)))); 
	  @ */

	public /*@nullable@*/ AVLNode2 root;

	//No termina nunca
	/*@ requires true;
	  @ ensures (\exists AVLNode2 n; \reach(root, AVLNode2, left + right).has(n) == true; n.value == value); 
	  @ signals (Exception e) false;
	  @ */
	public void insert(int value) {
		if (root == null)
			root = new AVLNode2(value);
		else {
			AVLNode2 newNode = new AVLNode2(value);
			root.insertToLeaf(newNode);
			AVLNode2 keyNode = updateHeightsAndDetectKeyNode(newNode);
			if (keyNode != null)
				adjustTreeByRotation(keyNode);
		}
	}

	/*@ requires true;
	  @ ensures true; 
	  @ signals (Exception e) false;
	  @ */
	public void delete(AVLNode2 node) {
		int value = node.value;
		AVLNode2 parentOfDeletedLeaf = deleteBeforeAdjustment(value);
		if (parentOfDeletedLeaf != null) {
			AVLNode2 keyNode = detectKeyNode(parentOfDeletedLeaf);
			if (keyNode != null) {
				AVLNode2 newkeyNode = adjustTreeByRotation(keyNode);
				updateHeights(newkeyNode.parent);
			}
		} else {
			;
		}
	}

	/*@ requires true;
	  @ ensures (\exists AVLNode2 n; ((n.value == value && \reach(root, AVLNode2, left + right).has(n) == true ) ==> \result == n) &&
	  @ ((\forall AVLNode2 m; \reach(root, AVLNode2, left + right).has(m) == true; m.value != value) ==> \result == null));
	  @ signals (Exception e) false;
	  @ */
	public AVLNode2 lookup(int value) {
		AVLNode2 currentNode = root;
		while (currentNode != null) {
			if (currentNode.value == value)
				return currentNode;
			else
				if (value < currentNode.value){
					currentNode = currentNode.left;
				} else{
					currentNode = currentNode.right;
				}
		}
		return null;
	}
	
	/*@ requires true;
	  @ ensures true; 
	  @ signals (Exception e) false;
	  @ */
	public AVLNode2 detectKeyNode(AVLNode2 parentOfDeletedLeaf) {
		AVLNode2 currentNode = parentOfDeletedLeaf;
		while (currentNode != null) {
			int bf = currentNode.getBalanceFactor();
			if (bf == 2 || bf == -2)
				return currentNode;
			else
				currentNode = currentNode.parent;
		}
		return null;
	}

	/*@ requires true;
	  @ ensures true; 
	  @ signals (Exception e) false;
	  @ */
	public AVLNode2 deleteBeforeAdjustment(int value) {
		AVLNode2 currentNode = root;
		boolean flag = true;
		while (currentNode != null && flag == true) {
			if (currentNode.value == value)
				flag = false;
			else{
				if(value < currentNode.value){
					currentNode = currentNode.left;
				} else {
					currentNode = currentNode.right;
				}
			}
		}

		if (currentNode != null) {
			AVLNode2 replacement = null;
			while (!currentNode.isLeaf()) {
				if(currentNode.getBalanceFactor() < 0){
					replacement = currentNode.right
							.getLeftmost();
				}else {
					replacement = currentNode.left.getRightmost();
				}
				currentNode.value = replacement.value;
				currentNode = replacement;
			}

			AVLNode2 parent = currentNode.getParent();
			if (parent == null)
				root = null;
			else if (currentNode == parent.left)
				parent.setLeft(null);
			else
				parent.setRight(null);
			updateHeights(parent);
			return parent;
		}
		return null;
	}

	/*@ requires true;
	  @ ensures true; 
	  @ signals (Exception e) false;
	  @ */
	public void updateHeights(AVLNode2 fromParentOfDeletedLeaf) {
		AVLNode2 currentNode = fromParentOfDeletedLeaf;
		currentNode.adjustHeight();
		while (currentNode != null) {
			currentNode.adjustHeight();
			currentNode = currentNode.parent;
		}
	}

	/*@ requires true;
	  @ ensures true; 
	  @ signals (Exception e) false;
	  @ */
	public AVLNode2 updateHeightsAndDetectKeyNode(AVLNode2 newNode) {
		AVLNode2 keyNode = null;
		boolean flag = true;
		while (newNode.parent != null && flag == true) {
			if (newNode.getParent().height - newNode.height != 1) {
				if (keyNode == null) {
					int bf_parent = newNode.getParent().getBalanceFactor();
					if (bf_parent > 1 || bf_parent < -1) {
						keyNode = newNode.getParent();
						flag = false;
					}
				}
				if (flag == true){
					newNode.getParent().height++;
					newNode = newNode.getParent();
				}
			} else
				flag = false;;
		}
		return keyNode;
	}

	/*@ requires true;
	  @ ensures true; 
	  @ signals (Exception e) false;
	  @ */
	public AVLNode2 adjustTreeByRotation(AVLNode2 keyNode) {
		AVLNode2 newKeyNode = null;
		int bf_keyNode = keyNode.getBalanceFactor();
		if (bf_keyNode == 2) {
			if (keyNode.left.getBalanceFactor() == -1)
				keyNode.setLeft(keyNode.left.rotateLeft());
			newKeyNode = keyNode.rotateRight();
		} else if (bf_keyNode == -2) {
			if (keyNode.right.getBalanceFactor() == 1)
				keyNode.setRight(keyNode.right.rotateRight());
			newKeyNode = keyNode.rotateLeft();
		} else {
			return null;
		}

		if (keyNode.parent == null) {
			root = newKeyNode;
			root.parent = null;
		} else {
			if (keyNode == keyNode.parent.left)
				keyNode.parent.setLeft(newKeyNode);
			else
				keyNode.parent.setRight(newKeyNode);
			newKeyNode.parent.adjustHeight();
		}
		return newKeyNode;
	}
	


//	public static void main(String[] args) {
//		AVLTree2 a = new AVLTree2();
//        SourcesEstebanPintos.AVLNode2 _AVLNode2_1 = new SourcesEstebanPintos.AVLNode2();
//        SourcesEstebanPintos.AVLNode2 _AVLNode2_2 = new SourcesEstebanPintos.AVLNode2();
//        SourcesEstebanPintos.AVLNode2 _AVLNode2_3 = new SourcesEstebanPintos.AVLNode2();
//        int value_Integer_1 = -1109365222;
//        _AVLNode2_2.left = null;
//        _AVLNode2_2.right = null;
//        _AVLNode2_3.left = null;
//        _AVLNode2_3.right = null;
//        _AVLNode2_3.parent = null;
//        _AVLNode2_3.value = -176160653;
//        _AVLNode2_3.height = 0;
//        _AVLNode2_2.parent = _AVLNode2_3;
//        _AVLNode2_2.value = -1112408198;
//        _AVLNode2_2.height = 0;
//        _AVLNode2_1.left = _AVLNode2_2;
//        _AVLNode2_1.right = _AVLNode2_3;
//        _AVLNode2_1.parent = _AVLNode2_3;
//        _AVLNode2_1.value = -1108214295;
//        _AVLNode2_1.height = -1820173814;
//        a.root = _AVLNode2_1;
//        a.insert(value_Integer_1);
//        System.out.println("ACA");
//	}
	
	
}
