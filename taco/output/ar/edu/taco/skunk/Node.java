package ar.edu.taco.skunk;

//@ model import org.jmlspecs.lang.*;


public class Node extends java.lang.Object {

  public int ar_edu_taco_skunk_Node_value;
  public /*@ nullable @*/ ar.edu.taco.skunk.Node ar_edu_taco_skunk_Node_next;

  public Node(int value) {
    this.ar_edu_taco_skunk_Node_value = (byte)0;
    this.ar_edu_taco_skunk_Node_next = ((ar.edu.taco.skunk.Node)(null));
    {
      this.ar_edu_taco_skunk_Node_value = value;
      this.ar_edu_taco_skunk_Node_next = ((ar.edu.taco.skunk.Node)(null));
    }
  }

}
