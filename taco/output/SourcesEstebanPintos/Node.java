package SourcesEstebanPintos;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class Node extends java.lang.Object {

  public int SourcesEstebanPintos_Node_key;
  public int SourcesEstebanPintos_Node_height;
  public SourcesEstebanPintos.Node SourcesEstebanPintos_Node_left;
  public SourcesEstebanPintos.Node SourcesEstebanPintos_Node_right;

  public Node(int k) {
    this.SourcesEstebanPintos_Node_key = (byte)0;
    this.SourcesEstebanPintos_Node_height = (byte)0;
    this.SourcesEstebanPintos_Node_left = ((SourcesEstebanPintos.Node)(null));
    this.SourcesEstebanPintos_Node_right = ((SourcesEstebanPintos.Node)(null));
    {
      this.SourcesEstebanPintos_Node_key = k;
      this.SourcesEstebanPintos_Node_height = 0;
      this.SourcesEstebanPintos_Node_left = ((SourcesEstebanPintos.Node)(null));
      this.SourcesEstebanPintos_Node_right = ((SourcesEstebanPintos.Node)(null));
    }
  }

}
