package SourcesPauli;

//URL http://stackoverflow.com/questions/10042/how-do-i-implement-a-linked-list-in-java

/*@nullable_by_default@*/
public class Link {
	 public int data1;
	    public int data2;
	    public /*@ nullable @*/ Link nextLink;

	    //Link constructor
	    public Link(int d1, int d2) {
		    data1 = d1;
		    data2 = d2;
	    }

	}