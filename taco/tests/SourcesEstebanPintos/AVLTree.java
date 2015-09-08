package SourcesEstebanPintos;

//http://homepage.cs.uiowa.edu/~sriram/21/fall07/code/
public class AVLTree {
	
	/*@ invariant (\forall AVLNode n; 
	  @ \reach(root, AVLNode, rightChild + leftChild).has(n) == true; 
	  @ \reach(n.leftChild, AVLNode, leftChild + rightChild).has(n) == false && 
	  @ \reach(n.rightChild, AVLNode, leftChild + rightChild).has(n) == false &&
	  @ n.leftChild.height - n.rightChild.height < 2 && 
	  @ n.leftChild.height - n.rightChild.height > -2 && 
	  @ (\forall AVLNode nLeft; (\reach(n.leftChild, AVLNode, leftChild + rightChild).has(nLeft) == true ==> (nLeft.iData < n.iData))) &&
	  @ (\forall AVLNode nRight; (\reach(n.rightChild, AVLNode, leftChild + rightChild).has(nRight) == true ==> (nRight.iData >= n.iData)))); 
	  @ */
	
	public /*@nullable@*/ AVLNode root;
	public int size;

	public AVLTree() {
		root = null;
	}

	//BUG FOUND. SI ROOT ES NULL => NULLPOINTER
	/*@ requires true;
	  @ ensures (\exists AVLNode n; ((n.iData == key && \reach(root, AVLNode, leftChild + rightChild).has(n) == true ) ==> \result == n) &&
	  @ ((\forall AVLNode m; \reach(root, AVLNode, leftChild + rightChild).has(m) == true; m.iData != key) ==> \result == null));
	  @ signals (Exception e) true;
	  @ */
	public AVLNode find(int key) {
		AVLNode current = root;
		while (current.iData != key) {
			if (key < current.iData)
				current = current.leftChild;
			else
				current = current.rightChild;
			if (current == null)
				return null;
		}
		return current;
	}

	/*@ requires true;
	  @ ensures (\exists AVLNode n; \reach(root, AVLNode, leftChild + rightChild).has(n) == true; n.iData == id); 
	  @ signals (Exception e) false;
	  @ */
	public void insert(int id) {
		size = size + 1;

		AVLNode newNode = new AVLNode();
		newNode.iData = id;
		newNode.balance = 0;
		newNode.height = 0;

		if (root == null)
			root = newNode;
		else {
			AVLNode current = root;
			AVLNode parent = null;
			
			AVLStack S = new AVLStack(size);

			while (current != null) {
				S.push(current);
				parent = current;

				if (id < current.iData)
					current = current.leftChild;
				else
					current = current.rightChild;
			}

			if (id < parent.iData)
				parent.leftChild = newNode;
			else
				parent.rightChild = newNode;

			int leftHeight, rightHeight;
			AVLNode pathNode;
			boolean flag = true;
			while (S.isEmpty() == false && flag == true) {
				pathNode = S.pop();

				if (pathNode.leftChild == null)
					leftHeight = -1;
				else
					leftHeight = pathNode.leftChild.height;

				if (pathNode.rightChild == null)
					rightHeight = -1;
				else
					rightHeight = pathNode.rightChild.height;

				pathNode.balance = rightHeight - leftHeight;

				pathNode.height = 1 + max(leftHeight, rightHeight);

				if ((pathNode.balance < -1) || (pathNode.balance > 1)) {
					flag = false;
				}
			}

		}
	}

	/*@ requires true;
	  @ ensures true; 
	  @ signals (Exception e) false;
	  @ */
	public int max(int x, int y) {
		if (x > y)
			return x;
		return y;
	}
	
	
	public static void main(String[] args) {
		AVLTree a = new AVLTree();
		a.root = null;
		a.size = 17;
		a.insert(17);
		System.out.println("FIN");
		
	}

}