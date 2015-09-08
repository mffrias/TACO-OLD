package SourcesMatiasDeSanti;

public class BST {
	
	/*@ 
	  @ invariant  (\forall BSTNode n; 
	  @				\reach(root, BSTNode, left + right).has(n) == true; 
	  @			    \reach(n.left, BSTNode, left + right).has(n) == false && 
	  @				\reach(n.right, BSTNode, left + right).has(n) == false &&
	  @				(\forall BSTNode m; \reach(n.left, BSTNode, left + right).has(m) == true; m.el < n.el) &&
	  @				(\forall BSTNode o; \reach(n.right, BSTNode, left + right).has(o) == true; o.el >= n.el));
	  @*/
	public /*@ nullable @*/ BSTNode root = null;

	public BST() {
	}

	public void clear() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	/*@
	  @ requires true;
	  @ ensures (\reach(root, BSTNode, left + right).int_size() == \old(\reach(root, BSTNode, left + right)).int_size() + 1); 
	  @ signals (Exception e) false;
	  @*/
	public void insert(int el) {
		BSTNode p = root;
		BSTNode prev = null;
		while (p != null) { // find a place for inserting new node;
			prev = p;
			if (el < p.el) {
				p = p.left;
			} else {
				p = p.right;
			}
		}
		if (root == null) { // tree is empty;
			root = new BSTNode(el);
		} else if (el < prev.el) {
			prev.left = new BSTNode(el);
		} else {
			prev.right = new BSTNode(el);
		}
	}

	/*@
	  @ requires el == 17*2;
	  @ ensures \result == true <==> (\exists BSTNode n; n.el == el; \reach(root, BSTNode, left + right).has(n) == true); 
	  @ signals (Exception e) false;
	  @*/
	public boolean search(int el) {
		BSTNode p = root.left;
		while (p != null) {
			if (el - p.el == 0) {
				return true;
			} else if (el < p.el) {
				p = p.left;
			} else {
				p = p.right;
			}
		}
		return false;
	}

	/*@
	  @ requires true;
	  @ ensures \result == true <==> (\exists BSTNode n; n.el == element; \old(\reach(root, BSTNode, left + right)).has(n) == true); 
	  @ signals (Exception e) false;
	  @*/
	public boolean deleteByCopying(int element) {
		BSTNode node, p = root, prev = null;
		while (p != null && p.el != element) { // find the node p
			prev = p; // with element el;
			if (element < p.el)
				p = p.left;
			else
				p = p.right;
		}
		node = p;
		if (p != null && p.el == element) {
			if (node.right == null) // node has no right child;
				node = node.left;
			else if (node.left == null) // no left child for node;
				node = node.right;
			else {
				BSTNode tmp = node.left; // node has both children;
				BSTNode previous = node; // 1.
				while (tmp.right != null) { // 2. find the rightmost
					previous = tmp; // position in the
					tmp = tmp.right; // left subtree of node;
				}
				node.el = tmp.el; // 3. overwrite the reference
									// to the element being deleted;
				if (previous == node) // if node's left child's
					previous.left = tmp.left; // right subtree is null;
				else
					previous.right = tmp.left; // 4.
			}
			if (p == root) {
				root = node;
			} else if (prev.left == p) {
				prev.left = node;
			} else {
				prev.right = node;
			}
		} else if (root != null) {
			return false;
		} else {
			return false;
		}
		return true;
	}

}