package SourcesEstebanPintos;

/*@nullable_by_default@*/
public class AVLNode {
	public int iData;
	public /*@nullable@*/ AVLNode leftChild;
	public /*@nullable@*/ AVLNode rightChild;

	public int balance;
	public int height;

}