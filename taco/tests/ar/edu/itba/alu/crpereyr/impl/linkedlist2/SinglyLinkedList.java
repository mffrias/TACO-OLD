package ar.edu.itba.alu.crpereyr.impl.linkedlist2;

//@ model import org.jmlspecs.models.*;


// Base code taken from:
// http://www.cs.cmu.edu/~mrmiller/15-121/Lectures/23/SinglyLinkedList.java

public class SinglyLinkedList {
    public Node head;
    public int numElements;

    /*@ invariant numElements == \reach(this.head, Node, next).int_size();
      @ invariant (\forall Node n; \reach(this.head, Node, next).has(n); !\reach(n.next, Node, next).has(n));
      @*/
    public SinglyLinkedList() {
        head = null;
        numElements = 0;
    }

    public int size() {
        return numElements;
    }

    private void addFirst(Object value) {
        head = new Node(value, head);
        numElements++;
    }

    private Object getFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    private Object removeFirst() {
        Object oldData = getFirst();
        head = head.next;

        numElements--;
        return oldData;
    }

    /*@ requires obj != null;
      @ ensures numElements == \old(numElements) + 1;
      @ ensures (\exists Node n; \reach(this.head, Node, next).has(n); n.data == obj && n.next == null);
      @*/
    public boolean add(Object obj) {
        Object element = obj;

        if (head == null) {
            addFirst(element);
            return true;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new Node(element, null);
        numElements++;
        return true;
    }

    /*@ requires index>=0 &&
      @          numElements==\reach(this.head, Node, next).int_size();
      @ ensures (\result == true <==> (index < numElements && index >= 0));
      @ ensures (\result == false <==> (numElements == 0 || index >= numElements || index < 0));
      @ ensures (\result == true) ==> (\exists Node n; \reach(\old(this.head), Node, next).has(n);
      @  !\reach(this.head, Node, next).has(n)
      @ );
      @*/
    public boolean remove(int index) {
        if (index < 0 || index >= numElements) {
            return false;
        }

        if (index == 0) {
            removeFirst();
            return true;
        }

        Node nodeBefore = head;
        for (int i = 0; i < index-1; i++) {
            nodeBefore = nodeBefore.next;
        }
        Node nodeToRemove = nodeBefore.next;
        nodeBefore.next = nodeToRemove.next;
        numElements--;
        return true;
    }


}