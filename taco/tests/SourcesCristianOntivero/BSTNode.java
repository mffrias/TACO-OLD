package SourcesCristianOntivero;

/*@ nullable_by_default @*/
public class BSTNode {
	public int elem;
	public BSTNode left;
	public BSTNode right;


	public BSTNode(){}

	public BSTNode(int elem){
		this.elem = elem;
		left = right = null;
	}
}
