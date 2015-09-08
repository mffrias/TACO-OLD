package SourcesPauli;


// URL   http://www.sanfoundry.com/java-program-implement-avl-tree/

public class ThirdAVLTree {

	/*@ invariant (\forall ThirdAVLNode n;
	@\reach(root, ThirdAVLNode, left + right).has(n) == true;
	@\reach(n.right, ThirdAVLNode, right + left).has(n) == false &&
	@\reach(n.left, ThirdAVLNode, left + right).has(n) == false);
  	@*/
	/*@ invariant (\forall ThirdAVLNode n; n.right == null || n.right.data > n.data 
  	@	&& n.left == null || n.left.data <= n.data);
  	@*/
	/*@ invariant (\forall ThirdAVLNode n;
    @     \reach(root, ThirdAVLNode, left + right).has(n) == true;
    @     (\forall ThirdAVLNode m; \reach(n.left, ThirdAVLNode, left + right).has(m) == true; m.data <= n.data) &&
    @     (\forall ThirdAVLNode m; \reach(n.right, ThirdAVLNode, left + right).has(m) == true; m.data > n.data));
    @ invariant (\forall ThirdAVLNode n;
    @     \reach(root, ThirdAVLNode, left + right).has(n) == true;
    @     n.left.height < n.right.height ==> n.height == n.right.height + 1);
    @ invariant (\forall ThirdAVLNode n;
    @     \reach(root, ThirdAVLNode, left + right).has(n) == true;
    @     n.left.height >= n.right.height ==> n.height == n.left.height + 1);
    @ invariant (\forall ThirdAVLNode n;
    @     \reach(root, ThirdAVLNode, left + right).has(n) == true;
    @     (n.left != null && n.right != null ==>
    @     n.left.height - n.right.height < 2 && n.left.height -n.right.height > -2) &&
    @     (n.left == null && n.right == null ==> n.height == 0) &&
    @     (n.left == null && n.right != null ==> -n.right.height > -2) &&
    @     (n.left != null && n.right == null ==> n.left.height < 2));
    @*/

	     public /*@ nullable @*/ ThirdAVLNode root;     

	     public ThirdAVLTree()
	     {
	         root = null;
	     }

	     /* Function to check if tree is empty */
	     public boolean isEmpty()
	     {
	         return root == null;
	     }

	     /* Make the tree logically empty */
	     public void makeEmpty()
	     {
	         root = null;
	     }

	     
			/*@
		  @ requires true;
		  @ ensures (\forall ThirdAVLNode n;
		    	\old(\reach(root, ThirdAVLNode, right + left)).has(n) == true;
		        \reach(root, ThirdAVLNode, right + left).has(n) == true);
		  @ ensures (\exists ThirdAVLNode n;
		   		n.data == data && 
		   		\reach(root, ThirdAVLNode, left + right).has(n) == true);
		  @*/
	     public void insert(int data)
	     {
	         root = insert(data, root);
	     }

	     /* Function to get height of node */
	     public int height(ThirdAVLNode t )
	     {
	         return t == null ? -1 : t.height;
	     }

	     /* Function to max of left/right node */
	     public int max(int lhs, int rhs)
	     {
	         return lhs > rhs ? lhs : rhs;
	     }

	     /* Function to insert data recursively */
	     public ThirdAVLNode insert(int x, ThirdAVLNode t)
	     {
	         if (t == null)
	             t = new ThirdAVLNode(x);
	         else if (x < t.data)
	         {
	             t.left = insert( x, t.left );
	             if( height( t.left ) - height( t.right ) == 2 )
	                 if( x < t.left.data )
	                     t = rotateWithLeftChild( t );
	                 else
	                     t = doubleWithLeftChild( t );
	         }
	         else if( x > t.data )
	         {
	             t.right = insert( x, t.right );
	             if( height( t.right ) - height( t.left ) == 2 )
	                 if( x > t.right.data)
	                     t = rotateWithRightChild( t );
	                 else
	                     t = doubleWithRightChild( t );
	         }
	         else
	           ;  // Duplicate; do nothing
	         t.height = max( height( t.left ), height( t.right ) ) + 1;
	         return t;
	     }

	     /* Rotate binary tree node with left child */     
	     public ThirdAVLNode rotateWithLeftChild(ThirdAVLNode k2)
	     {
	    	 ThirdAVLNode k1 = k2.left;
	         k2.left = k1.right;
	         k1.right = k2;
	         k2.height = max( height( k2.left ), height( k2.right ) ) + 1;
	         k1.height = max( height( k1.left ), k2.height ) + 1;
	         return k1;
	     }

	     /* Rotate binary tree node with right child */
	     public ThirdAVLNode rotateWithRightChild(ThirdAVLNode k1)
	     {
	    	 ThirdAVLNode k2 = k1.right;
	         k1.right = k2.left;
	         k2.left = k1;
	         k1.height = max( height( k1.left ), height( k1.right ) ) + 1;
	         k2.height = max( height( k2.right ), k1.height ) + 1;
	         return k2;
	     }

	     /**
	      * Double rotate binary tree node: first left child
	      * with its right child; then node k3 with new left child */
	     public ThirdAVLNode doubleWithLeftChild(ThirdAVLNode k3)
	     {
	         k3.left = rotateWithRightChild( k3.left );
	         return rotateWithLeftChild( k3 );
	     }
	     
	     /**
	      * Double rotate binary tree node: first right child
	      * with its left child; then node k1 with new right child */      
	     public ThirdAVLNode doubleWithRightChild(ThirdAVLNode k1)
	     {
	         k1.right = rotateWithLeftChild( k1.right );
	         return rotateWithRightChild( k1 );
	     }    

	     /* Functions to count number of nodes */
	     public int countNodes()
	     {
	         return countNodes(root);
	     }

	     public int countNodes(ThirdAVLNode r)
	     {
	         if (r == null)
	             return 0;
	         else
	         {
	             int l = 1;
	             l += countNodes(r.left);
	             l += countNodes(r.right);
	             return l;
	         }
	     }

	     /* Functions to search for an element */

		/*@ requires true;
		  @ ensures true;
		  @*/
	     public boolean search(int val)
	     {
	         return search(root, val);
	     }

	     public boolean search(ThirdAVLNode r, int val)
	     {
	         boolean found = false;
	         boolean flag = true;
	         while ((r != null) && !found && flag)
	         {
	             int rval = r.data;
	             if (val < rval)
	                 r = r.left;
	             else if (val > rval)
	                 r = r.right;
	             else
	             {
	                 found = true;
	                 flag = false;
	             }
	             found = search(r, val);
	         }
	         return found;
	     }

	     /* Function for inorder traversal */
	     public void inorder()
	     {
	         inorder(root);
	     }

	     public void inorder(ThirdAVLNode r)
	     {
	         if (r != null)
	         {
	             inorder(r.left);
	             inorder(r.right);
	         }
	     }

	     /* Function for preorder traversal */
	     public void preorder()
	     {
	         preorder(root);
	     }

	     public void preorder(ThirdAVLNode r)
	     {
	         if (r != null)
	         {
	             preorder(r.left);             
	             preorder(r.right);
	         }
	     }

	     /* Function for postorder traversal */
	     public void postorder()
	     {
	         postorder(root);
	     }

	     public void postorder(ThirdAVLNode r)
	     {
	         if (r != null)
	         {
	             postorder(r.left);             
	             postorder(r.right);
	         }
	     }     	 
}
