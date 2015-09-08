package SourcesPauli;

// URL  http://malalanayake.wordpress.com/2014/06/09/simple-linked-list-implementation-in-java/


public class ListLinked {
	/*@ invariant (\forall LinkNode n;
	@     \reach(first, LinkNode, next).has(n) == true;
	@     \reach(n.next, LinkNode, next).has(n) == false);
	@ invariant (first == null && last == null) ||
	@     (\reach(first, LinkNode, next).has(last) == true &&
	@     last.next == null);
	@*/
	
	
	public /*@ nullable @*/ LinkNode first;
	public /*@ nullable @*/ LinkNode last;
 

 
	public ListLinked() {
		// creating the first node
		this.first = new LinkNode();
		this.last = this.first;
	}
 
	public LinkNode getFirst() {
		return first;
	}
 
	public void setFirst(LinkNode first) {
		this.first = first;
	}
 
	public LinkNode getLast() {
		return last;
	}
 
	public void setLast(LinkNode last) {
		this.last = last;
	}
 
	/*@ requires true;
	  @ ensures (\exists LinkNode n;
	  @     \reach(first, LinkNode, next).has(n);
	  @     n.data == obj && n.next == null);
	  @*/
	public void add(Object obj) {
		LinkNode linkNode = new LinkNode(obj);
 
		// check whether it is the first node
		if (this.first.getData() == null) {
			this.first = linkNode;
			this.last = linkNode;
		} else {
			this.last.setNext(linkNode);
			this.last = linkNode;
		}
	}
 
	
	/*@ requires true && (\exists LinkNode n; true;
	  @      (\reach(first, LinkNode, next)).has(n) && n.data == obj);
	  @ ensures (\exists LinkNode n; true;
	  @     (\old(\reach(first, LinkNode, next)).has(n) && n.data == obj) ==>
	  @     (\reach(first, LinkNode, next).has(n) == false &&
	  @     (\forall LinkNode m; \old(\reach(first, LinkNode, next)).has(m) &&
	  @         m != n; \reach(first, LinkNode, next).has(m))));
	  @*/
	public void remove(Object obj) {
		LinkNode currentNode = first;
 
		// If the first object is removing
		if (obj.equals(first.getData())) {
			// if the one node is there
			if (first.getNext() == null) {
				this.first.setData(null);
				this.first = new LinkNode();
				this.last = this.first;
			} else {
				currentNode.setData(null);
				currentNode = currentNode.getNext();
				this.first = currentNode;
			}
 
		} else {
			// In the middle object is removing
			boolean wasDeleted = false;
			while (!wasDeleted) {
				// go for the next node
				LinkNode nextNode = currentNode.getNext();
				if (nextNode != null) {
					if (nextNode.getData().equals(obj)) {
						currentNode.setNext(nextNode.getNext());
						nextNode = null;
						wasDeleted = true;
					} else {
						currentNode = nextNode;
					}
				}
			}
 
		}
 
	}
 
}
