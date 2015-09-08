package SourcesHomovoc;

//http://moderntone.blogspot.com.ar/2013/05/implementation-of-avl-tree-java-library.html

public class AVLTree2 {
	
	/*@invariant  	(\forall AVLNode2 n; \reach(root, AVLNode2, right + left).has(n) == true; 
	  @				\reach(n.left, AVLNode2, left + right).has(n) == false && \reach(n.right, AVLNode2, left + right).has(n) == false
	  @				&& (\forall AVLNode2 m; \reach(n.left, AVLNode2, right + left).has(m); m.value < n.value)
	  @				&& (\forall AVLNode2 m; \reach(n.right, AVLNode2, right + left).has(m); n.value < m.value)
	  @				&& (n.left == null && n.right == null ==> n.height == 0)
	  @				&& (n.left == null && n.right == null ==> n.height == 0)
	  @				&& (n.left == null && n.right != null ==> n.height == 1 && n.right.height == 0) 
 	  @				&& (n.left != null && n.right == null ==> n.height == 1 && n.left.height == 0)
	  @				&& (n.left != null && n.right != null ==> n.height == (n.left.height > n.right.height ? n.left.height : n.right.height ) + 1 && ((n.left.height > n.right.height ? n.left.height - n.right.height : n.right.height - n.left.height)) <= 1)
	  @				&& (n.right != null ==> n.right.parent == n) && (n.left != null ==> n.left.parent == n) 
	  @				&& (n == this.root ==> n.parent == null));
	  @*/

	public /*@ nullable @*/ AVLNode2 root;

	public AVLTree2() {
	}

	/*@ requires (\forall AVLNode2 n; (\reach(root, AVLNode2, right + left)).has(n); n.value != value);
	  @ ensures (\reach(this.root, AVLNode2, right + left).int_size() == \old(\reach(this.root, AVLNode2, right + left)).int_size() + 1);
	  @ signals (Exception e) false;
	  @*/
	public void insert(int value) {
		if (root == null)
			root = new AVLNode2(value);
		else {
			AVLNode2 newNode = new AVLNode2(value);
			root.insertToLeaf(newNode);
			AVLNode2 keyNode = updateHeightsAndDetectKeyNode(newNode);
			if (keyNode != null) // rotate to adjust the tree
				adjustTreeByRotation(keyNode);
		}
	}

	
	/*@ requires true;
	  @ ensures (\reach(this.root, AVLNode2, right + left).int_size() == \old(\reach(this.root , AVLNode2, right + left)).int_size() - 1) <==>
	  @			(\exists AVLNode2 n; \old(\reach(this.root, AVLNode2, right + left)).has(n); n.value == value);                      
	  @ signals (Exception e) false;
	  @*/
	public void delete(int value) {
		AVLNode2 parentOfDeletedLeaf = deleteBeforeAdjustment(value);
		if (parentOfDeletedLeaf != null) {
			AVLNode2 keyNode = detectKeyNode(parentOfDeletedLeaf);
			if (keyNode != null) {
				AVLNode2 newkeyNode = adjustTreeByRotation(keyNode);
				updateHeights(newkeyNode.parent);
			}
		}
	}

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

	public AVLNode2 deleteBeforeAdjustment(int value) {
		AVLNode2 currentNode = root;
		boolean found = false;
		while (currentNode != null && !found) {
			if (currentNode.value == value) {
				found = true;
			} else {
				if(value < currentNode.value) {
					currentNode = currentNode.left;
				} else {
					currentNode = currentNode.right;
				}
			}
		}

		if (currentNode != null) {
			while (!currentNode.isLeaf()) {
				AVLNode2 replacement = null;
				if(currentNode.getBalanceFactor() < 0) {
					replacement = currentNode.right.getLeftmost();
				} else {
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

	public void updateHeights(AVLNode2 fromParentOfDeletedLeaf) {
		AVLNode2 currentNode = fromParentOfDeletedLeaf;
		currentNode.adjustHeight();
		while (currentNode != null) {
			currentNode.adjustHeight();
			currentNode = currentNode.parent;
		}
	}

	/**
	 * called by insert(int) keyNode: the node closest to the newly inserted
	 * node where |BF|>1
	 * 
	 * @param newNode
	 *            : newly added leaf AVLNode2
	 * @return keyNode
	 */
	public AVLNode2 updateHeightsAndDetectKeyNode(AVLNode2 newNode) {
		AVLNode2 keyNode = null;
		boolean found = false;
		while (newNode.parent != null && !found) {
			if (newNode.getParent().height - newNode.height != 1) {
				if (keyNode == null) {
					int bf_parent = newNode.getParent().getBalanceFactor();
					if (bf_parent > 1 || bf_parent < -1) {
						keyNode = newNode.getParent();
						found = true;
					}
				}
				newNode.getParent().height++;
				newNode = newNode.getParent();
			} else
				found = true;
		}
		return keyNode;
	}
	
	/*@ requires true;
	  @ ensures (\exists AVLNode2 n; \reach(this.root, AVLNode2, right + left).has(n); n.value == value) <==> \result;
	  @ signals (Exception e) false;
	  @*/
	public boolean lookup(int value) {
		AVLNode2 currentNode = root;
		while (currentNode != null) {
			if (currentNode.value == value) {
				return true;
			} else {
				if(value < currentNode.value) {
					currentNode = currentNode.left;
				} else {
					currentNode = currentNode.right;
				}
			}
		}
		return false;
	}

	/**
	 * LL or LR type if balance factor == 2; rotateRight for keyNode if bf of
	 * keyNode.left == -1, it's LR type; rotateLeft for keyNode.left first RR or
	 * RL type if balance factor == -2; rotateLeft for keyNode if bf of
	 * keyNode.right == 1, it's RL type; rotateRight for keyNode.right first
	 * 
	 * @param keyNode
	 */
	public AVLNode2 adjustTreeByRotation(AVLNode2 keyNode) {
		AVLNode2 newKeyNode = null;
		int bf_keyNode = keyNode.getBalanceFactor();
		if (bf_keyNode == 2) {
			if (keyNode.left.getBalanceFactor() == -1) {
				AVLNode2 node = keyNode.left.rotateLeft();
				keyNode.setLeft(node);
			}
			newKeyNode = keyNode.rotateRight();
		} else if (bf_keyNode == -2) {
			if (keyNode.right.getBalanceFactor() == 1){
				AVLNode2 node = keyNode.right.rotateLeft();
				keyNode.setRight(node);
			}
			newKeyNode = keyNode.rotateLeft();
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

}
