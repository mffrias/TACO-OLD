package SourcesCristianOntivero;


public class AVLTree {
	/*@ invariant (\forall AVLNode n;
	  @		\reach(root, AVLNode, left + right).has(n) == true;
	  @		\reach(n.right, AVLNode, right + left).has(n) == false &&
	  @		\reach(n.left, AVLNode, left + right).has(n) == false);
      @
	  @ invariant (\forall AVLNode n; 
	  @		\reach(root, AVLNode, left + right).has(n) == true;
	  @		(\forall AVLNode m; \reach(n.left, AVLNode, left + right).has(m) == true; m.value <= n.value) &&
	  @		(\forall AVLNode m; \reach(n.right, AVLNode, left + right).has(m) == true; m.value > n.value));
	  @*/

	public /*@nullable@*/ AVLNode root;
	
	public AVLTree(){
		root = null;
	}
	
	/*@ requires true;
	  @ ensures (\exists AVLNode n; true; 
	  @     n.value == value ==> \result == n);
	  @*/
	public AVLNode find(int value){
		 AVLNode current = root;
	     while(current != null && current.value != value){
	    	 if(current.value < value) current = current.right;
	    	 else current = current.left;
	     }
	     return current;
	 }

	/*@
	  @ requires true;
	  @*/
	public void insert(int value){
		AVLNode current = root, parent = null;
		boolean comparison;
		if(root != null){
			while(current != null){
				comparison = current.value < value;
				parent = current;
				if(comparison) current = current.right;
				else current = current.left;
			}
			AVLNode nodeToInsert = new AVLNode(value, parent);
			if(parent.value < value) parent.right = nodeToInsert;
			else parent.left = nodeToInsert;

			int balanceFactor;
			AVLNode child;
			boolean flag = true;
			while(parent != null && flag){
				balanceFactor = height(parent.left) - height(parent.right);
				if(balanceFactor == 2){
					child = parent.left;
					if(child.left.height - child.right.height == -1){
						rotateLeft(child);
					}
					rotateRight(parent);
					flag = false;
				}else if(balanceFactor == -2){
					child = parent.right;
					if(child.left.height - child.right.height == 1){
						rotateRight(child);
					}
					rotateLeft(parent);
					flag = false;
				}
				parent = parent.parent;
			}
			while(parent != null){
				height(parent);
			}
		}
		else{
			root = new AVLNode(value, parent);
		}
	}

	public static int height(AVLNode node){
		 if(node == null) return -1;
		 node.height = 1 + max(height(node.right), height(node.left));
		 return node.height;
	}
	
	public static int max(int a, int b){
		return a > b ? a : b;
	}
	
	public void rotateRight(AVLNode node){
		AVLNode newRoot = node.left;
		node.left = newRoot.right;
		newRoot.right = node;
		if(node.parent == null){
			newRoot.parent = null;
			root = newRoot;
		}else if(node.parent.left.value == node.value){
			node.parent.left = newRoot;
		}else{
			node.parent.right = newRoot;
		}
		newRoot.parent = node.parent;
		node.parent = newRoot;
	}

	public void rotateLeft(AVLNode node){
		AVLNode newRoot = node.right;
		node.right = newRoot.left;
		newRoot.left = node;
		if(node.parent == null){
			newRoot.parent = null;
			root = newRoot;
		}else if(node.parent.left.value == node.value){
			node.parent.left = newRoot;
		}else{
			node.parent.right = newRoot;
		}
		newRoot.parent = node.parent;
		node.parent = newRoot;
	}
	
//	public static void printInOrder(AVLNode node) {
//		if (node != null) {
//			printInOrder(node.left);
//			System.out.print(node.value + " ");
//			printInOrder(node.right);
//		}
//	}
//	
//	public static void main(String args[]){
//		AVLTree t = new AVLTree();
//
//		t.insert(10);
//		t.insert(2);
//		t.insert(3);
//		t.insert(4);
//		t.insert(5);
//		t.insert(6);
//		t.insert(15);
//		t.insert(1);
//		t.insert(7);
//		t.insert(13);
//		t.insert(16);
//		t.insert(17);
//		printInOrder(t.root);
//	}
}
