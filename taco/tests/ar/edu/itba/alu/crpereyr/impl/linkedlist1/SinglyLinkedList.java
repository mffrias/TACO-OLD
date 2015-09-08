package ar.edu.itba.alu.crpereyr.impl.linkedlist1;

//@ model import org.jmlspecs.models.*;


// Base code taken from:
// http://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/

public class SinglyLinkedList {
    // reference to the head node.
    public /*@ nullable @*/ Node head;
    public int listCount;

    /*@ invariant listCount == \reach(head, Node, next).int_size() - 1;
      @ invariant (\forall Node n; \reach(this.head, Node, next).has(n); !\reach(n.next, Node, next).has(n));
      @*/
    public SinglyLinkedList() {
        head = new Node(null);
        listCount = 0;
    }

    /*@ requires data != null;
      @ ensures listCount == \old(listCount) + 1;
      @ ensures (\exists Node n; \reach(this.head, Node, next).has(n); n.data == data && n.next == null);
      @*/
    public int add(Object data)
    {
        Node crunchifyTemp = new Node(data);
        Node crunchifyCurrent = head;
        while (crunchifyCurrent.getNext() != null) {
            crunchifyCurrent = crunchifyCurrent.getNext();
        }
        crunchifyCurrent.setNext(crunchifyTemp);
        listCount++;// increment the number of elements variable
        return listCount;
    }

    /*@ requires index >= 1 && index < \reach(this.head, Node, next).int_size();
      @ ensures \result == null || (\exists Node n; \reach(this.head, Node, next).has(n); n.data == \result);
      @*/
    public /*@ nullable @*/ Object get(int index)
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

    /*@ 
      @ ensures (\result == true <==> (index >= 1 && index <= listCount)); 
//      @         (\result == false <==> (index > listCount  || index < 1));
//      @ ensures (\result == true) ==> (\exists Node n; \old(\reach(this.head, Node, next)).has(n);
//      @  !\reach(this.head, Node, next).has(n)
//      @ );
      @*/
    public boolean remove(int index)
    {
        if (index < 1 || index > listCount)
            return false;

        Node crunchifyCurrent = head;
        for (int i = 1; i < index; i++) {
            if (crunchifyCurrent.getNext() == null)
                return false;

            crunchifyCurrent = crunchifyCurrent.getNext();
        }
        crunchifyCurrent.setNext(crunchifyCurrent.getNext().getNext());
        listCount--;
        return true;
    }
}