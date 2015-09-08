package SourcesPauli;


//URL  http://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/



public class CrunchifyLinkedList {
	
	/*@ invariant (\forall CrunchifyNode n;
	@     \reach(head, CrunchifyNode, next).has(n) == true;
	@     \reach(n.next, CrunchifyNode, next).has(n) == false);
	@*/
	
	
	// reference to the head node.
    public /*@ nullable @*/ CrunchifyNode head;
    public int listCount;
 
    // LinkedList constructor
    public CrunchifyLinkedList() {
        // this is an empty list, so the reference to the head node
        // is set to a new node with no data
        head = new CrunchifyNode(null);
        listCount = 0;
    }
 
	/*@ requires true;
	  @ ensures (\exists CrunchifyNode n;
	  @     \reach(head, CrunchifyNode, next).has(n);
	  @     n.data == data && n.next == null);
	  @*/
    public void add(Object data)
    // appends the specified element to the end of this list.
    {
    	CrunchifyNode crunchifyTemp = new CrunchifyNode(data);
    	CrunchifyNode crunchifyCurrent = head;
        // starting at the head node, crawl to the end of the list
        while (crunchifyCurrent.getNext() != null) {
            crunchifyCurrent = crunchifyCurrent.getNext();
        }
        // the last node's "next" reference set to our new node
        crunchifyCurrent.setNext(crunchifyTemp);
        listCount++;// increment the number of elements variable
    }
 
    public void add(Object data, int index)
    // inserts the specified element at the specified position in this list
    {
    	CrunchifyNode crunchifyTemp = new CrunchifyNode(data);
    	CrunchifyNode crunchifyCurrent = head;
        // crawl to the requested index or the last element in the list,
        // whichever comes first
        for (int i = 1; i < index && crunchifyCurrent.getNext() != null; i++) {
            crunchifyCurrent = crunchifyCurrent.getNext();
        }
        // set the new node's next-node reference to this node's next-node
        // reference
        crunchifyTemp.setNext(crunchifyCurrent.getNext());
        // now set this node's next-node reference to the new node
        crunchifyCurrent.setNext(crunchifyTemp);
        listCount++;// increment the number of elements variable
    }
 
    public Object get(int index)
    // returns the element at the specified position in this list.
    {
        // index must be 1 or higher
        if (index <= 0)
            return null;
 
        CrunchifyNode crunchifyCurrent = head.getNext();
        for (int i = 1; i < index; i++) {
            if (crunchifyCurrent.getNext() == null)
                return null;
 
            crunchifyCurrent = crunchifyCurrent.getNext();
        }
        return crunchifyCurrent.getData();
    }
 
    
	/*@ requires true;
	  @ ensures (\exists CrunchifyNode n; true;
	  @     (\forall CrunchifyNode m; \old(\reach(head, CrunchifyNode, next)).has(m) &&
	  @         m != n; \reach(head, CrunchifyNode, next).has(m)));
	  @*/
    public boolean remove(int index)
    // removes the element at the specified position in this list.
    {
        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;
 
        CrunchifyNode crunchifyCurrent = head;
        for (int i = 1; i < index; i++) {
            if (crunchifyCurrent.getNext() == null)
                return false;
 
            crunchifyCurrent = crunchifyCurrent.getNext();
        }
        crunchifyCurrent.setNext(crunchifyCurrent.getNext().getNext());
        listCount--; // decrement the number of elements variable
        return true;
    }
 
    public int size()
    // returns the number of elements in this list.
    {
        return listCount;
    }

}
