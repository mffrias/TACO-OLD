package SourcesPauli;
public class AVLTree {
	/*@ invariant (\forall AVLNode n;
		\reach(root, AVLNode, left + right).has(n) == true;
		\reach(n.right, AVLNode, right + left).has(n) == false &&
		\reach(n.left, AVLNode, left + right).has(n) == false);
	  @*/
	/*@ invariant (\forall AVLNode n; n.right == null || n.right.value > n.value 
	  		&& n.left == null || n.left.value < n.value);
	  @*/
    /*@ invariant (\forall AVLNode n;
    @     \reach(root, AVLNode, left + right).has(n) == true;
    @     (\forall AVLNode m; \reach(n.left, AVLNode, left + right).has(m) == true; m.value < n.value) &&
    @     (\forall AVLNode m; \reach(n.right, AVLNode, left + right).has(m) == true; m.value > n.value));
    @ invariant (\forall AVLNode n;
    @     \reach(root, AVLNode, left + right).has(n) == true;
    @     n.left.height < n.right.height ==> n.height == n.right.height + 1);
    @ invariant (\forall AVLNode n;
    @     \reach(root, AVLNode, left + right).has(n) == true;
    @     n.left.height >= n.right.height ==> n.height == n.left.height + 1);
    @ invariant (\forall AVLNode n;
    @     \reach(root, AVLNode, left + right).has(n) == true;
    @     (n.left != null && n.right != null ==>
    @     n.left.height - n.right.height < 2 && n.left.height -n.right.height > -2) &&
    @     (n.left == null && n.right == null ==> n.height == 0) &&
    @     (n.left == null && n.right != null ==> -n.right.height > -2) &&
    @     (n.left != null && n.right == null ==> n.left.height < 2));
    @ invariant root.parent == null;
    @ invariant (\forall AVLNode n;
    @     \reach(root, AVLNode, left + right).has(n) == true;
    @     (n.right != null ==> n.right.parent == n) &&
    @     (n.left != null ==> n.left.parent == n));
    @*/
	
	public /*@ nullable @*/ AVLNode root;
	public int size;
	
	public AVLTree(){
		root = null;
		size = 0;
	}
	
	/*@ requires true;
	  @ ensures \old(size) == size;
	  @*/
	public AVLNode find(int value){
		 AVLNode current = root;
		 int comparison = current.value - value;
	     while(current != null && comparison != 0){
	    	 comparison = current.value - value;
	    	 if(comparison < 0) current = current.right;
	    	 else current = current.left;
	     }
	     return current;
	 }

	/*@
	  @ requires true;
	  @ ensures (\forall AVLNode n;
	    	\old(\reach(root, AVLNode, right + left)).has(n) == true;
	        \reach(root, AVLNode, right + left).has(n) == true);
	  @ ensures (\exists AVLNode n;
	   		n.value == value && 
	   		\reach(root, AVLNode, left + right).has(n) == true);
	  @ ensures \old(\reach(root, AVLNode, right + left)).int_size() ==
	   		\reach(root, AVLNode, right + left).int_size() + 1;
	  @*/
	public void insert(int value){
		AVLNode current = root, parent = null, nodeToInsert = null;
		int comparison;
		if(root == null){
			root = new AVLNode(value, parent);
			size++;
			return;
		}
		while(current != null){
			comparison = current.value - value;
			parent = current;
			if(comparison < 0) current = current.right;
            else current = current.left;
		}
		nodeToInsert = new AVLNode(value, parent);
		if(parent.value < value) parent.right = nodeToInsert;
		else parent.left = nodeToInsert;
		int balanceFactor;
		AVLNode child;
		boolean flag = true;
		while(parent != null && flag){
			balanceFactor = height(parent.left) - height(parent.right);
			if(balanceFactor == 2){
				child = parent.left;
				if(height(child.left) - height(child.right) == -1){
					rotateLeft(child);
				}
				rotateRight(parent);
				flag = false;  // Originalmente usaba break pero taco no lo tiene implementado
			}else if(balanceFactor == -2){
				child = parent.right;
				if(height(child.left) - height(child.right) == 1){
					rotateRight(child);
				}
				rotateLeft(parent);
				flag = false;
			}
			parent = parent.parent;
		}
	}

	public static int height(AVLNode node){
		 if(node == null) return -1;
		 return 1 + max(height(node.right), height(node.left));
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


}
