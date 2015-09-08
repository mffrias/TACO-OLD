package SourcesMatiasDeSanti;


//http://www.mycstutorials.com/articles/data_structures/linkedlists
/*@ nullable_by_default @*/
public class Node {
	// reference to the next node in the chain,
	// or null if there isn't one.
	public Node next;
	// data carried by this node.
	// could be of any type you need.
	public Object data;

	// Node constructor
	public Node(Object data) {
		next = null;
		this.data = data;
	}
	
	public Node() {
		// TODO Auto-generated constructor stub
	}

	// another Node constructor if we want to
	// specify the node to point to.
	public Node(Object _data, Node _next) {
		next = _next;
		data = _data;
	}

	// these methods should be self-explanatory
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}