package ar.edu.itba.alu.crpereyr.impl.avltree1;

// Code from: http://ezekiel.vancouver.wsu.edu/~cs223/lectures/avl-trees/java/AVLSymbolTable.java
public class AVLTree {

    //
    // Root of AVL tree.
    //
    public /*@nullable@*/ Node root;


  /*@
	@ invariant (\forall Node x; \reach(this.root, Node, left + right).has(x);
	@    (\reach(x.left, Node, right + left).has(x) == false) &&
	@    (\reach(x.right, Node, right + left).has(x) == false));
	@
	@ invariant (\forall Node x; \reach(this.root, Node, left + right).has(x);
	@    ((x.left == null && x.right == null) ==> x.height == 0) &&
	@    ((x.left == null && x.right != null) ==> (x.height == 1 && x.right.height == 0)) &&
	@ 	 ((x.left != null && x.right == null) ==> (x.height == 1 && x.left.height == 0)) &&
	@    ((x.left != null && x.right != null && x.left.height > x.right.height)
	@       ==> (x.height == x.left.height + 1)) &&
	@    ((x.left != null && x.right != null && x.left.height <= x.right.height)
	@       ==> (x.height == x.right.height + 1))
	@ );
	@
	@ invariant (\forall Node x; \reach(this.root, Node, left + right).has(x);
	@    (\forall Node y; \reach(x.left, Node, right + left).has(y) == true; y.key < x.key) &&
	@    (\forall Node y; \reach(x.right, Node, right + left).has(y) == true; x.key < y.key) );
	@*/

    //
    // Construct empty AVL tree.
    //
    public AVLTree() {root = null;}

    //
    // Helper function to return cached height of tree
    // and handle to special case where tree == null.
    //
    private final static int height(Node tree) {
        return (tree == null) ? -1 : tree.height;
    }

    private final static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    //
    // Right BST rotation while updating cached heights.
    // Returns new root of rotated tree.
    //
    private static Node rightRotate(Node tree) {
        Node root = tree.left;
        tree.left = root.right;
        root.right = tree;
        tree.height = 1 + max(height(tree.left), height(tree.right));
        root.height = 1 + max(height(root.left), height(root.right));
        return root;
    }

    //
    // Left BST rotation while updating cached heights.
    // Returns new root of rotated tree.
    //
    private static Node leftRotate(Node tree) {
        Node root = tree.right;
        tree.right = root.left;
        root.left = tree;
        tree.height = 1 + max(height(tree.left), height(tree.right));
        root.height = 1 + max(height(root.left), height(root.right));
        return root;
    }

    //
    // Helper function that performs necessary rotations to
    // restore the AVL balance condition.
    // Rotations are performed along the given path from
    // some interior node back to the root.
    //
    private static Node rebalance(Node tree, CustomList path) {
        while (!path.isEmpty()) {
            Node dad = (Node) path.pop();
            int balance = height(dad.right) - height(dad.left);
            if (balance < -1) {
                Node oldDad = dad;
                if (height(dad.left.left) < height(dad.left.right))
                    dad.left = leftRotate(dad.left);
                dad = rightRotate(dad);
                if (path.isEmpty())
                    tree = dad;
                else if (oldDad == ((Node)path.peek()).right)
                    ((Node)path.peek()).right = dad;
                else
                    ((Node)path.peek()).left = dad;
            } else if (balance > 1) {
                Node oldDad = dad;
                if (height(dad.right.left) > height(dad.right.right))
                    dad.right = rightRotate(dad.right);
                dad = leftRotate(dad);
                if (path.isEmpty())
                    tree = dad;
                else if (oldDad == ((Node)path.peek()).right)
                    ((Node)path.peek()).right = dad;
                else
                    ((Node)path.peek()).left = dad;
            }
            dad.height = 1 + max(height(dad.left), height(dad.right));
        }
        return tree;
    }

    //
    // Iterative insertion into AVL tree.
    // Performs leave insertion in first phase, and
    // then perform necessary rotations along the path
    // from the parent of the new leaf to the root.
    //
    /*@
      @ ensures \reach(this.root, Node, left + right).int_size() == \old(\reach(this.root, Node, left + right)).int_size() + 1;
      @ ensures (\exists Node n; \reach(this.root, Node, left+right).has(n) == true; n.key == key);
      @*/
    public void insert(int key, Object val) {
        //
        // Special case: empty tree.
        //
        if (root == null) {
            root = new Node(key, val);
            return;
        }

        //
        // Iterative leaf insertion while saving
        // the path from root to inserted leaf's parent.
        //
        CustomList path = new CustomList();
        Node dad = root;
        while (true) {
            if (key == dad.key) {
                dad.key = key;  // replace payload
                dad.val = val;
                return;         // done (no rotations needed)
            }
            path.push(dad);
            if (key < dad.key) {
                if (dad.left == null) {
                    dad.left = new Node(key, val);
                    root = rebalance(root, path);
                    return;
                }
                dad = dad.left;
            } else {
                if (dad.right == null) {
                    dad.right = new Node(key, val);
                    root = rebalance(root, path);
                    return;
                }
                dad = dad.right;
            }
        }
    }

    //
    // Iterative search of BST for node with given key.
    //
    /*@
	  @ ensures (\exists Node n; \reach(root, Node, left + right).has(n); n.key==key) <==> \result!=null;
	  @ signals (Exception e) false;
  	  @*/
    public Object search(int key) {
        Node tree = root;
        while (tree != null)
            if (key == tree.key)
                return tree.val;   // found
            else if (key < tree.key)
                tree = tree.left;
            else
                tree = tree.right;
        return null;  // not found
    }
}
