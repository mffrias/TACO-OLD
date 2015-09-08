package SourcesPauli;

/*@ nullable_by_default @*/
public class BSTNode {
	public int elem;
	public /*@ nullable @*/ BSTNode left;
	public /*@ nullable @*/ BSTNode right;


	public BSTNode(){}

	public BSTNode(int elem){
		this.elem = elem;
		left = right = null;
	}
}
