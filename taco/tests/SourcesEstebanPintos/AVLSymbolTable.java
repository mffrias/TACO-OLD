package SourcesEstebanPintos;

//http://ezekiel.vancouver.wsu.edu/~cs223/lectures/avl-trees/java/
public class AVLSymbolTable {

	/*@ invariant (\forall Node n; 
	  @ \reach(root, Node, right + left).has(n) == true; 
	  @ \reach(n.left, Node, left + right).has(n) == false && 
	  @ \reach(n.right, Node, left + right).has(n) == false &&
	  @ ((n.left!=null && n.right == null) ==> n.height < 2) &&
	  @ ((n.right!=null && n.left == null) ==> n.height < 2) &&
	  @ ((n.right==null && n.left == null) ==> n.height == 0) &&
	  @ (\forall Node nLeft; (\reach(n.left, Node, left + right).has(nLeft) == true ==> (nLeft.key < n.key))) &&
	  @ (\forall Node nRight; (\reach(n.right, Node, left + right).has(nRight) == true ==> (nRight.key >= n.key)))); 
	  @ */

	public /* @nullable@ */ Node root;

	public AVLSymbolTable() {
		root = null;
	}

	/*@ requires true;
	  @ ensures true; 
	  @ signals (Exception e) false;
	  @ */
	public void insert(int key) {
		//		if (root == null) {
		//			root = new Node(key);
		//			return;
		//		}
		while (root != null){
			
			int j = 0;
			break;
			
		}
		//		AVLStack2 path = new AVLStack2();
		//		Node dad = root;
		//		boolean flag = true;
		//		while (flag == true) {
		//			if (key == dad.key) {
		//				dad.key = key;
		//				return;
		//			}
		//			path.push(dad);
		//			if (key < dad.key) {
		//				if (dad.left == null) {
		//					dad.left = new Node(key);
		//					flag = false;
		//				}
		//				if (flag == true) {
		//					dad = dad.left;
		//				}
		//			} else {
		//				if (dad.right == null) {
		//					dad.right = new Node(key);
		//					flag = false;
		//				}
		//				if (flag == true) {
		//					dad = dad.right;
		//				}
		//			}
		//		}
		//
		//		root = rebalance(root, path);
	}

	/*@ requires true;
	  @ ensures \result == true <==> (\exists Node n; n.key == key; \reach(root, Node, left + right).has(n) == true );
	  @ signals (Exception e) false;
	  @ */
	public boolean search(int key) {
		Node tree = root;
		while (tree != null)
			if (key == tree.key)
				return true;
			else if (key < tree.key)
				tree = tree.left;
			else
				tree = tree.right;
		return false;
	}

	/*@ requires true;
	  @ ensures true; 
	  @ signals (Exception e) false;
	  @ */
	public int height(Node tree) {
		if (tree == null) {
			return -1;
		} else {
			return tree.height;
		}
	}

	/*@ requires true;
	  @ ensures true; 
	  @ signals (Exception e) false;
	  @ */
	public int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	/*@ requires true;
	  @ ensures true; 
	  @ signals (Exception e) false;
	  @ */
	public Node rightRotate(Node tree) {
		Node root = tree.left;
		tree.left = root.right;
		root.right = tree;
		tree.height = 1 + max(height(tree.left), height(tree.right));
		root.height = 1 + max(height(root.left), height(root.right));
		return root;
	}

	/*@ requires true;
	  @ ensures true; 
	  @ signals (Exception e) false;
	  @ */
	public Node leftRotate(Node tree) {
		Node root = tree.right;
		tree.right = root.left;
		root.left = tree;
		tree.height = 1 + max(height(tree.left), height(tree.right));
		root.height = 1 + max(height(root.left), height(root.right));
		return root;
	}

	/*@ requires true;
	  @ ensures true; 
	  @ signals (Exception e) false;
	  @ */
	public Node rebalance(Node tree, AVLStack2 path) {
		Node aux = tree;
		while (!path.empty()) {
			Node dad = path.pop();
			int balance = height(dad.right) - height(dad.left);
			if (balance < -1) {
				Node oldDad = dad;
				if (height(dad.left.left) < height(dad.left.right))
					dad.left = leftRotate(dad.left);
				dad = rightRotate(dad);
				if (path.empty())
					aux = dad;
				else if (oldDad == path.peek().right)
					path.peek().right = dad;
				else
					path.peek().left = dad;
			} else if (balance > 1) {
				Node oldDad = dad;
				if (height(dad.right.left) > height(dad.right.right))
					dad.right = rightRotate(dad.right);
				dad = leftRotate(dad);
				if (path.empty())
					aux = dad;
				else if (oldDad == path.peek().right)
					path.peek().right = dad;
				else
					path.peek().left = dad;
			}
			dad.height = 1 + max(height(dad.left), height(dad.right));
		}
		return aux;
	}

}
