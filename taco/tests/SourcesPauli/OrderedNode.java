package SourcesPauli;


// URL http://stackoverflow.com/questions/18295833/creating-binary-search-tree

/*@ nullable_by_default @*/
public class OrderedNode {
	OrderedNode /*@ nullable @*/ _left = null;
    OrderedNode /*@ nullable @*/ _right = null;
    OrderedNode /*@ nullable @*/ _parent = null;
    int _value = 0;
    
    public OrderedNode(int value,OrderedNode parent)
    {
        _value = value;
        _parent = parent;
    }

}
