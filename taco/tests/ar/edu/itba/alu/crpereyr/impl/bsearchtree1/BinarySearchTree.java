package ar.edu.itba.alu.crpereyr.impl.bsearchtree1;

// Code from: http://introcs.cs.princeton.edu/java/44st/IterativeBST.java.html
public class BinarySearchTree {

    /*@ invariant size == \reach(root, Node, left + right).int_size();
      @ invariant (\forall Node x; \reach(root, Node, left + right).has(x);
      @                            !\reach(x, Node, left).has(x) && !\reach(x, Node, left).has(x) &&
      @                            (\forall Node m; \reach(x.left, Node, left).has(m); m.key < x.key) &&
      @                            (\forall Node m; \reach(x.left, Node, right).has(m); m.key < x.key) &&
      @                            (\forall Node m; \reach(x.right, Node, left).has(m); m.key > x.key) &&
      @                            (\forall Node m; \reach(x.right, Node, right).has(m); m.key > x.key));
      @ invariant (\forall Node x; \reach(root, Node, left).has(x);
      @                            x.key < root.key);
      @ invariant (\forall Node x; \reach(root, Node, right).has(x);
      @                            x.key > root.key);
      @*/

    public Node root;          // root of BST
    public int size = 0;       // size of the bst

    /*@ requires val >= 0;
      @ ensures (\exists Node n; \reach(root, Node, left + right); n.key == key && n.val == val);
      @ ensures size == \old(size) + 1 <==> !(\exists Node n; \reach(\old(root), Node, left + right);
                                                              n.key == key && n.val == val);
      @ ensures size == \old(size) <==> (\exists Node n; \reach(\old(root), Node, left + right);
                                                         n.key == key && n.val == val);
      @ */
    public void put(int key, int val) {
        Node z = new Node(key, val);
        if (root == null) { root = z; return; }
        Node parent = null, x = root;
        while (x != null) {
            parent = x;
            int res = key - x.key;
            if      (res < 0) x = x.left;
            else if (res > 0) x = x.right;
            else { x.val = val; return; }   // overwrite duplicate
        }
        int res = key - parent.key;
        if (res < 0) parent.left  = z;
        else         parent.right = z;
        size++;
    }

    /*@
      @ ensures \result == -1 || (\exists Node n;
                                  \reach(this.root, Node, left + right).has(n);
                                  n.key == key && n.val == \result);
      @*/
    public int get(int key) {
        Node x = root;
        while (x != null) {
            int res = key - x.key;
            if      (res < 0) x = x.left;
            else if (res > 0) x = x.right;
            else return x.val;
        }
        size--;
        return -1;
    }

    /*@
      @ ensures (\result == true <==> (\exists Node n;
                                  \reach(this.root, Node, left + right).has(n);
                                  n.key == key && n.val != -1));
      @*/
    public boolean contains(int key) {
        return (get(key) != -1);
    }

}

