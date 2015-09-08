package ar.edu.itba.alu.crpereyr.impl.bsearchtree2;

// Code taken from: http://www.faqs.org/docs/javap/c11/s4.html
public class BinarySearchTree {

    /*@ invariant size == \reach(root, Node, left + right).int_size();
      @ invariant (\forall Node x; \reach(root, Node, left + right).has(x);
      @                            !\reach(x, Node, left).has(x) && !\reach(x, Node, left).has(x) &&
      @                            (\forall Node m; \reach(x.left, Node, left).has(m); m.item < x.item) &&
      @                            (\forall Node m; \reach(x.left, Node, right).has(m); m.item < x.item) &&
      @                            (\forall Node m; \reach(x.right, Node, left).has(m); m.item > x.item) &&
      @                            (\forall Node m; \reach(x.right, Node, right).has(m); m.item > x.item));
      @ invariant (\forall Node x; \reach(root, Node, left).has(x);
      @                            x.item < root.item);
      @ invariant (\forall Node x; \reach(root, Node, right).has(x);
      @                            x.item > root.item);
      @*/

    Node root;
    int size;

    /*@
      @ ensures (\result == true <==> (\exists Node n;
                                  \reach(this.root, Node, left + right).has(n);
                                  n.item == item));
      @*/
    boolean contains(int item) {
        Node runner;  // For "running" down the tree.
        runner = root;    // Start at the root node.
        while (true) {
            if (runner == null) {
                return false;
            } else
            if ( item == runner.item ) {
                // We've found the item.
                return true;
            }
            else if ( item < runner.item ) {
                // If the item occurs, it must be in the left subtree,
                // So, advance the runner down one level to the left.
                runner = runner.left;
            }
            else {
                // If the item occurs, it must be in the right subtree.
                // So, advance the runner down one level to the right.
                runner = runner.right;
            }
        }  // end while
        // return false;
    } // end contains();


    /*@
      @ ensures (\exists Node n; \reach(root, Node, left + right).has(n); n.item == newItem);
      @ ensures size == \old(size) + 1 <==> !(\exists Node n; \reach(\old(root), Node, left + right).has(n);
                                                              n.item == newItem );
      @ ensures size == \old(size) <==> (\exists Node n; \reach(\old(root), Node, left + right).has(n);
                                                         n.item == newItem);
     */
    boolean insert(int newItem) {
        // Add the item to the binary sort tree to which the global
        // variable "root" refers.  (Note that root can't be passed as
        // a parameter to this routine because the value of root might
        // change, and a change in the value of a formal parameter does
        // not change the actual parameter.)
        if ( root == null ) {
            // The tree is empty.  Set root to point to a new node
            // containing the new item.
            root = new Node( newItem );
            size++;
            return true;
        }
        Node runner; // Runs down the tree to find a place for newItem.
        runner = root;   // Start at the root.
        while (true) {
            if ( newItem < runner.item ) {
                // Since the new item is less than the item in runner,
                // it belongs in the left subtree of runner.  If there
                // is an open space at runner.left, add a node there.
                // Otherwise, advance runner down one level to the left.
                if ( runner.left == null ) {
                    runner.left = new Node( newItem );
                    size++;
                    return true;  // New item has been added to the tree.
                }
                else
                    runner = runner.left;
            }
            else {
                // Since the new item is greater than or equal to the
                // item in runner, it belongs in the right subtree of
                // runner.  If there is an open space at runner.right,
                // add a new node there.  Otherwise, advance runner
                // down one level to the right.
                if ( runner.right == null ) {
                    runner.right = new Node( newItem );
                    size++;
                    return true;  // New item has been added to the tree.
                }
                else
                    runner = runner.right;
            }
        } // end while
    }  // end insert()
}
