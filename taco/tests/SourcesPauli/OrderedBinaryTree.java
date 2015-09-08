package SourcesPauli;

// URL http://stackoverflow.com/questions/18295833/creating-binary-search-tree

public class OrderedBinaryTree {
	
	 /*@ invariant (\forall BSTNode n; \reach(root, BSTNode, left + right).has(n) == true;
	  @ \reach(n.right, BSTNode, right + left).has(n) == false &&
	  @ \reach(n.left, BSTNode, left + right).has(n) == false); 
	  @*/
	
	/*@ invariant (\forall BSTNode n; 
	  @ n.right == null || n.right.elem > n.elem && 
	  @ n.left == null || n.left.elem <= n.elem);
	@*/

	public int _elementsPresent = 0;
	public /*@ nullable @*/ OrderedNode _root = null;
	public int [] _values = null;

	    public void put(int value)
	    {
	        boolean valueInserted = false;
	        OrderedNode temp = _root;
	        while(!valueInserted)
	        {
	            if(_root == null)
	            {
	                _root = new OrderedNode(value,null);
	                break;
	            }
	            else if(value == temp._value)
	            {
	                System.out.println("the entered value is already present");
	                return;
	            }
	            else if(value<=temp._value)
	            {
	                if(temp._left == null)
	                {
	                    temp._left = new OrderedNode(value,temp);
	                    break;
	                }
	                else
	                {
	                    temp = temp._left;
	                }
	            }
	            else
	            {
	                if(temp._right == null)
	                {
	                    temp._right = new OrderedNode(value,temp);
	                    break;
	                }
	                else
	                {
	                    temp = temp._right;
	                }
	            }
	        }
	        _elementsPresent++;
	    }
}