package SourcesCristianPereyra;

//@ model import org.jmlspecs.models.*;


// Base code taken from:
// http://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/



 
public class SinglyLinkedList {
	
	
	/*@ invariant (\forall Node n; \reach(head, Node, next).has(n); \reach(n.next, Node, next).has(n) == false); 
	  @ invariant listCount == \reach(head, Node, next).int_size() - 1;
	  @*/

	
    // reference to the head node.
    public /*@nullable@*/ Node head;
    public int listCount;
 
    // LinkedList constructor
    public SinglyLinkedList() {
        // this is an empty list, so the reference to the head node
        // is set to a new node with no data
        head = new Node(null);
        listCount = 0;
    }
 
    public void add(Object data)
    // appends the specified element to the end of this list.
    {
        Node crunchifyTemp = new Node(data);
        Node crunchifyCurrent = head;
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
        Node crunchifyTemp = new Node(data);
        Node crunchifyCurrent = head;
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
 
        Node crunchifyCurrent = head.getNext();
        for (int i = 1; i < index; i++) {
            if (crunchifyCurrent.getNext() == null)
                return null;
 
            crunchifyCurrent = crunchifyCurrent.getNext();
        }
        return crunchifyCurrent.getData();
    }
 
    
    /*@ requires 1 <= index && index <= listCount;
      @ ensures listCount == \old(listCount) - 1;
      @*/
    public boolean remove(int index)
    // removes the element at the specified position in this list.
    {
        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;
 
        Node crunchifyCurrent = head;
        for (int i = 1; i < index; i++) {
            if (crunchifyCurrent.getNext() == null)
                return false;
 
            crunchifyCurrent = crunchifyCurrent.getNext();
        }
        crunchifyCurrent.setNext(crunchifyCurrent.getNext().getNext());
        listCount = listCount - 1; // decrement the number of elements variable
        return true;
    }
 
    public int size()
    // returns the number of elements in this list.
    {
        return listCount;
    }
 
}