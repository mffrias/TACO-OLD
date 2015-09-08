package SourcesCristianPereyra;

//@ model import org.jmlspecs.lang.*;


public class Node extends java.lang.Object {

  public /*@ nullable @*/ SourcesCristianPereyra.Node SourcesCristianPereyra_Node_next;
  public /*@ nullable @*/ java.lang.Object SourcesCristianPereyra_Node_data;

  public Node() {
    this.SourcesCristianPereyra_Node_next = ((SourcesCristianPereyra.Node)(null));
    this.SourcesCristianPereyra_Node_data = ((java.lang.Object)(null));
    {
      this.SourcesCristianPereyra_Node_next = ((SourcesCristianPereyra.Node)(null));
      this.SourcesCristianPereyra_Node_data = null;
    }
  }


  public Node(java.lang.Object dataValue) {
    this.SourcesCristianPereyra_Node_next = ((SourcesCristianPereyra.Node)(null));
    this.SourcesCristianPereyra_Node_data = ((java.lang.Object)(null));
    {
      this.SourcesCristianPereyra_Node_next = ((SourcesCristianPereyra.Node)(null));
      this.SourcesCristianPereyra_Node_data = dataValue;
    }
  }


  public Node(java.lang.Object dataValue, SourcesCristianPereyra.Node nextValue) {
    this.SourcesCristianPereyra_Node_next = ((SourcesCristianPereyra.Node)(null));
    this.SourcesCristianPereyra_Node_data = ((java.lang.Object)(null));
    {
      this.SourcesCristianPereyra_Node_next = nextValue;
      this.SourcesCristianPereyra_Node_data = dataValue;
    }
  }


  public java.lang.Object getData() {
    {
      return this.SourcesCristianPereyra_Node_data;
    }
  }


  public void setData(java.lang.Object dataValue) {
    java.lang.Object param_dataValue_12;

    param_dataValue_12 = dataValue;
    {
      this.SourcesCristianPereyra_Node_data = param_dataValue_12;
    }
  }


  public SourcesCristianPereyra.Node getNext() {
    {
      return this.SourcesCristianPereyra_Node_next;
    }
  }


  public void setNext(SourcesCristianPereyra.Node nextValue) {
    SourcesCristianPereyra.Node param_nextValue_13;

    param_nextValue_13 = nextValue;
    {
      this.SourcesCristianPereyra_Node_next = param_nextValue_13;
    }
  }

}
