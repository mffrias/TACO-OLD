package SourcesPauli;

// URL   http://www.sanfoundry.com/java-program-implement-red-black-tree/

/*@nullable_by_default@*/
public class RedBlackNode {
	
	public /*@ nullable @*/ RedBlackNode left, right;
	public int element;
	public int color;

    /* Constructor */
    public RedBlackNode(int theElement)
    {
        this( theElement, null, null );
    } 

    /* Constructor */
    public RedBlackNode(int theElement, RedBlackNode lt, RedBlackNode rt)

    {
        left = lt;
        right = rt;
        element = theElement;
        color = 1;
    }    
}
