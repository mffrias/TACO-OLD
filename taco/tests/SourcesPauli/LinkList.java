package SourcesPauli;

// URL http://stackoverflow.com/questions/10042/how-do-i-implement-a-linked-list-in-java


public class LinkList {
	
	/*@ invariant (\forall Link n;
	@     \reach(first, Link, nextLink).has(n) == true;
	@     \reach(n.nextLink, Link, nextLink).has(n) == false);
	@*/
	
	public /*@ nullable @*/ Link first;

	    //LinkList constructor
	    public LinkList() {
		    first = null;
	    }

	    //Returns true if list is empty
	    public boolean isEmpty() {
		    return first == null;
	    }

	    //Inserts a new Link at the first of the list
		/*@ requires true;
		  @ ensures (\exists Link n;
		  @     \reach(first, Link, nextLink).has(n);
		  @     n.data1 == d1 && n.data2 == d2 && n.nextLink == null);
		  @*/
	    public void insert(int d1, int d2) {
		    Link link = new Link(d1, d2);
		    link.nextLink = first;
		    first = link;
	    }

	    //Deletes the link at the first of the list
		/*@ requires true;
		  @ ensures (\exists Link n; true;
		  @     (\forall Link m; \old(\reach(first, Link, nextLink)).has(m) &&
		  @         m != n; \reach(first, Link, nextLink).has(m)));
		  @*/
	    public Link delete() {
		    Link temp = first;
		    first = first.nextLink;
		    return temp;
	    }



	}
