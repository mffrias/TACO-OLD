package SourcesPauli;

/*@nullable_by_default@*/
public class LinkNode {
	public Object data;
	public /*@ nullable @*/ LinkNode next;

	public LinkNode() {
		this.data = null;
		this.next = null;
	}

	public LinkNode(Object obj) {
		this.data = obj;
		this.next = null;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public LinkNode getNext() {
		return next;
	}

	public void setNext(LinkNode next) {
		this.next = next;
	}
}
