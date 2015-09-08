package SourcesEstebanPintos;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class AVLNode extends java.lang.Object {

  public int SourcesEstebanPintos_AVLNode_iData;
  public /*@ nullable @*/ SourcesEstebanPintos.AVLNode SourcesEstebanPintos_AVLNode_leftChild;
  public /*@ nullable @*/ SourcesEstebanPintos.AVLNode SourcesEstebanPintos_AVLNode_rightChild;
  public int SourcesEstebanPintos_AVLNode_balance;
  public int SourcesEstebanPintos_AVLNode_height;

  public AVLNode() {
    this.SourcesEstebanPintos_AVLNode_iData = (byte)0;
    this.SourcesEstebanPintos_AVLNode_leftChild = ((SourcesEstebanPintos.AVLNode)(null));
    this.SourcesEstebanPintos_AVLNode_rightChild = ((SourcesEstebanPintos.AVLNode)(null));
    this.SourcesEstebanPintos_AVLNode_balance = (byte)0;
    this.SourcesEstebanPintos_AVLNode_height = (byte)0;
  }

}
