package SourcesPauli;

/*@ nullable_by_default @*/
public class ThirdAVLNode {

    public /*@ nullable @*/ ThirdAVLNode left, right;
    public int data;
    public int height;

    /* Constructor */

    public ThirdAVLNode()

    {

        left = null;

        right = null;

        data = 0;

        height = 0;

    }

    /* Constructor */

    public ThirdAVLNode(int n)

    {

        left = null;

        right = null;

        data = n;

        height = 0;

    }     


}
