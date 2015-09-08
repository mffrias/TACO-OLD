package ar.edu.itba.alu.crpereyr.impl.avltree2;

public class AVLTree {
    public Node root;

    /*@
      @ invariant (\forall Node x; \reach(this.root, Node, left + right).has(x);
      @    (\reach(x.left, Node, right + left).has(x) == false) &&
      @    (\reach(x.right, Node, right + left).has(x) == false) &&
      @    ((x.left == null && x.right == null) ==> x.depth == 0) &&
      @    ((x.left == null && x.right != null) ==> (x.depth == 1 &&
      @    x.right.depth == 0)) &&
      @ 	 ((x.left != null && x.right == null) ==> (x.depth == 1 &&
      @    x.left.depth == 0)) &&
      @    ((x.left != null && x.right != null && x.left.depth > x.right.depth)
      @       ==> (x.depth == x.left.depth + 1 && x.left.depth - x.right.depth <= 1)) &&
      @    ((x.left != null && x.right != null && x.left.depth <= x.right.depth)
      @       ==> (x.depth == x.right.depth + 1 && x.right.depth - x.left.depth <= 1))
      @ );
      @
      @ invariant (\forall Node x; \reach(this.root, Node, left + right).has(x);
      @    (\forall Node y; \reach(x.left, Node, right + left).has(y) == true; y.data < x.data) &&
      @    (\forall Node y; \reach(x.right, Node, right + left).has(y) == true; x.data < y.data) );
      @*/
    public AVLTree() {
        root = null;
    }

    private int depth(Node node) {
        if (node == null)
            return 0;
        return node.getDepth();
    }

    /*@
      @ ensures \reach(this.root, Node, left + right).int_size() == \old(\reach(this.root, Node, left + right)).int_size() + 1;
      @*/
    public Node insert(int data) {
        root = insert(root, data);
        int val = balanceNumber(root);
        if (val == 1) {
            root = rotateLeft(root);
        } else if (val == -1) {
            root = rotateRight(root);
        }
        return root;
    }

    public Node insert(Node node, int data) {
        if (node == null)
            return new Node(data);
        if (node.getData() - data > 0) {
            node = new Node(node.getData(), insert(node.getLeft(), data),
                    node.getRight());
        } else if (node.getData() - data < 0) {
            node = new Node(node.getData(), node.getLeft(), insert(
                    node.getRight(), data));
        }
        int val = balanceNumber(node);
        if (val == 1) {
            node = rotateLeft(node);
        } else if (val == -1) {
            node = rotateRight(node);
        }
        return node;
    }

    private int balanceNumber(Node node) {
        int L = depth(node.getLeft());
        int R = depth(node.getRight());
        if (L - R >= 2)
            return -1;
        else if (L - R <= -2)
            return 1;
        return 0;
    }

    private Node rotateLeft(Node node) {
        Node q = node;
        Node p = q.getRight();
        Node c = q.getLeft();
        Node a = p.getLeft();
        Node b = p.getRight();
        q = new Node(q.getData(), c, a);
        p = new Node(p.getData(), q, b);
        return p;
    }

    private Node rotateRight(Node node) {
        Node q = node;
        Node p = q.getLeft();
        Node c = q.getRight();
        Node a = p.getLeft();
        Node b = p.getRight();
        q = new Node(q.getData(), b, c);
        p = new Node(p.getData(), a, q);
        return p;
    }

    /*@
	  @ ensures (\exists Node n; \reach(root, Node, left + right).has(n); n.data==data) ==> \result!=true;
	  @ ensures (\forall Node n; \reach(root, Node, left + right).has(n); n.data!=data) ==> \result==true;
  	  @*/
    public boolean search(int data) {
        Node local = root;
        while (local != null) {
            if (local.getData() - data == 0)
                return true;
            else if (local.getData() - data > 0)
                local = local.getLeft();
            else
                local = local.getRight();
        }
        return false;
    }
}


