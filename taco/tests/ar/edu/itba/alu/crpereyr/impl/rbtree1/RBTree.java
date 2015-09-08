package ar.edu.itba.alu.crpereyr.impl.rbtree1;

/**
 * Created by cris on 7/13/14.
 */
public class RBTree {

    private static final int RED = 0;
    private static final int BLACK = 1;

    public static int COLOR_BLACK = 0;
    public static int COLOR_RED = 8;

    public Node root;

	/*@

	  @ invariant root!=null ==> root.parent == null;
	  @ invariant root!=null ==> root.color  == BLACK;

	  @ invariant (\forall Node n ; \reach(root, Node, left  + right).has(n) ;
	  @
	  @            ( n.left != null  ==> n.left.parent == n ) &&
	  @            ( n.right != null ==> n.right.parent == n ) &&
	  @            ( n.parent != null ==> ( n.parent.left==n || n.parent.right==n ) ) &&
	  @            ( ( n.color == RED && n.parent != null ) ==> n.parent.color == BLACK ) &&
	  @
	  @            ( !\reach(n.parent,Node,parent).has(n) ) &&
	  @
	  @            (\forall Node x ; \reach(n.left, Node, left).has(x) ;  x.key < n.key ) &&
	  @
	  @            (\forall Node x ; \reach(n.right, Node, left).has(x) ;  x.key > n.key ) &&
	  @
	  @            ( ( n.left!=null && n.right==null ) ==> (
	  @			      ( n.left.color==RED )
	  @			   )) &&
      @            ( ( n.left==null && n.right!=null ) ==>  (
	  @			      ( n.right.color==RED )
	  @			   ))
	  @
	  @           );
	  @*/

    public RBTree() {
        root = null;
    }


    /*@
      @ ensures (\result != -1) <==> (\exists Node node ; \reach(root, Node, left  + right).has(node) && node.key==key ) ;
      @*/
    public int lookup(int key) {
        Node n = lookupNode(key);
        return n == null ? -1 : n.value;
    }

    private void rotateLeft(Node n) {
        Node r = n.right;
        replaceNode(n, r);
        n.right = r.left;
        if (r.left != null) {
            r.left.parent = n;
        }
        r.left = n;
        n.parent = r;
    }

    private void rotateRight(Node n) {
        Node l = n.left;
        replaceNode(n, l);
        n.left = l.right;
        if (l.right != null) {
            l.right.parent = n;
        }
        l.right = n;
        n.parent = l;
    }

    private void replaceNode(Node oldn, Node newn) {
        if (oldn.parent == null) {
            root = newn;
        } else {
            if (oldn == oldn.parent.left)
                oldn.parent.left = newn;
            else
                oldn.parent.right = newn;
        }
        if (newn != null) {
            newn.parent = oldn.parent;
        }
    }


    /*@
      @ assignable \everything;
      @ ensures (\forall Node node ;
      @               \reach(root, Node, left  + right).has(node) <==> ( \old(\reach(root, Node, left  + right)).has(node) || node.key==key )
      @         );
      @*/
    public void insert(int key, int value) {
        Node insertedNode = new Node(key, value, COLOR_RED, null, null);
        if (root == null) {
            root = insertedNode;
        } else {
            Node n = root;
            while (true) {
                int compResult = key -  n.key;
                if (compResult == 0) {
                    n.value = value;
                    return;
                } else if (compResult < 0) {
                    if (n.left == null) {
                        n.left = insertedNode;
                        break;
                    } else {
                        n = n.left;
                    }
                } else {
                    assert compResult > 0;
                    if (n.right == null) {
                        n.right = insertedNode;
                        break;
                    } else {
                        n = n.right;
                    }
                }
            }
            insertedNode.parent = n;
        }
        insertCase1(insertedNode);
    }

    private static Node maximumNode(Node n) {
        assert n != null;
        while (n.right != null) {
            n = n.right;
        }
        return n;
    }

    private void insertCase1(Node n) {
        if (n.parent == null)
            n.color = COLOR_BLACK;
        else
            insertCase2(n);
    }

    private Node lookupNode(int key) {
        Node n = root;
        while (n != null) {
            int compResult = key - n.key;
            if (compResult == 0) {
                return n;
            } else if (compResult < 0) {
                n = n.left;
            } else {
                assert compResult > 0;
                n = n.right;
            }
        }
        return n;
    }

    private void insertCase2(Node n) {
        if (nodeColor(n.parent) == COLOR_BLACK)
            return; // Tree is still valid
        else
            insertCase3(n);
    }

    void insertCase3(Node n) {
        if (nodeColor(n.uncle()) == COLOR_RED) {
            n.parent.color = COLOR_BLACK;
            n.uncle().color = COLOR_BLACK;
            n.grandparent().color = COLOR_RED;
            insertCase1(n.grandparent());
        } else {
            insertCase4(n);
        }
    }

    void insertCase4(Node n) {
        if (n == n.parent.right && n.parent == n.grandparent().left) {
            rotateLeft(n.parent);
            n = n.left;
        } else if (n == n.parent.left && n.parent == n.grandparent().right) {
            rotateRight(n.parent);
            n = n.right;
        }
        insertCase5(n);
    }

    void insertCase5(Node n) {
        n.parent.color = COLOR_BLACK;
        n.grandparent().color = COLOR_RED;
        if (n == n.parent.left && n.parent == n.grandparent().left) {
            rotateRight(n.grandparent());
        } else {
            assert n == n.parent.right && n.parent == n.grandparent().right;
            rotateLeft(n.grandparent());
        }
    }

    private static int nodeColor(Node n) {
        return n == null ? COLOR_BLACK : n.color;
    }
}
