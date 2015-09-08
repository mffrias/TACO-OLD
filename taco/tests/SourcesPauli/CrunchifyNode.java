package SourcesPauli;


/*@nullable_by_default@*/
public class CrunchifyNode {
	
	// reference to the next node in the chain,
    // or null if there isn't one.
	public /*@ nullable @*/ CrunchifyNode next;
    // data carried by this node.
    // could be of any type you need.
    public  Object data;

    // Node constructor
    public CrunchifyNode(Object dataValue) {
        next = null;
        data = dataValue;
    }

    // another Node constructor if we want to
    // specify the node to point to.
    public CrunchifyNode(Object dataValue, CrunchifyNode nextValue) {
        next = nextValue;
        data = dataValue;
    }

    // these methods should be self-explanatory
    public Object getData() {
        return data;
    }

    public void setData(Object dataValue) {
        data = dataValue;
    }

    public CrunchifyNode getNext() {
        return next;
    }

    public void setNext(CrunchifyNode nextValue) {
        next = nextValue;
    }

}
