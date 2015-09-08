package SourcesEstebanPintos;

/*@nullable_by_default@*/
public class Node {
	public int key;
	public int height;
	public Node left;
	public Node right;

	public Node(int k) {
		key = k;
		height = 0;
		left = null;
		right = null;
	}
	
//	public Node(){}	

}
