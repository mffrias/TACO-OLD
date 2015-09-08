package SourcesMatiasDeSanti;

//http://www.mycstutorials.com/articles/data_structures/linkedlists
public class LinkedList {
	// reference to the head node.
	public /*@ nullable @*/ Node head;

	/*@ 
	  @ invariant  (\forall Node n; 
	  @				\reach(head, Node, next).has(n) == true; 
	  @			    \reach(n.next, Node, next).has(n) == false);
	  @ invariant (head != null);
	  @*/
	public LinkedList() {
		// this is an empty list, so the reference to the head node
		// is set to a new node with no data
		head = new Node(null);
	}

	/*@ requires true;
	  @ ensures (\exists Node n; n.data == d; \reach(head, Node, next).has(n) == true &&
	   \reach(head, Node, next).int_size() == \old((\reach(head, Node, next)).int_size() + 1));
	  @ signals (Exception e) false;
	  @*/
	public void add(Object d)
	// post: appends the specified element to the end of this list.
	{
		Node temp = new Node(d);
		Node current = head;
		// starting at the head node, crawl to the end of the list
		while (current.getNext() != null) {
			current = current.getNext();
		}
		// the last node's "next" reference set to our new node
		current.setNext(temp);
	}

	public Object get(int index)
	// post: returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index <= 0)
			return null;

		Node current = head.getNext();
		for (int i = 1; i < index; i++) {
			if (current.getNext() == null)
				return null;

			current = current.getNext();
		}
		return current.getData();
	}

	public boolean remove(int index)
	// post: removes the element at the specified position in this list.
	{
		// if the index is out of range, exit
		if (index < 1)
			return false;

		Node current = head;
		for (int i = 1; i < index; i++) {
			if (current.getNext() == null)
				return false;

			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		return true;
	}
	
	
//	public static void main(String[] args) {
//		LinkedList l = new LinkedList();
//		Node d_n1 = new Node();
//		Node n2 = new Node();
//		Node n3 = new Node();
//		Node n4 = new Node();
//		l.head = d_n1;
//		d_n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = null;
//		d_n1.data = n4;
//		n2.data = n2;
//		n3.data = n2;
//		n4.data = n4;
//		l.add(d_n1);
//		System.out.println("ACA");
//
//	}
}