package SourcesMatiasDeSanti;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class Node extends java.lang.Object {

  public SourcesMatiasDeSanti.Node SourcesMatiasDeSanti_Node_next;
  public java.lang.Object SourcesMatiasDeSanti_Node_data;

  public Node(java.lang.Object data) {
    this.SourcesMatiasDeSanti_Node_next = ((SourcesMatiasDeSanti.Node)(null));
    this.SourcesMatiasDeSanti_Node_data = ((java.lang.Object)(null));
    {
      this.SourcesMatiasDeSanti_Node_next = ((SourcesMatiasDeSanti.Node)(null));
      this.SourcesMatiasDeSanti_Node_data = data;
    }
  }


  public Node() {
    this.SourcesMatiasDeSanti_Node_next = ((SourcesMatiasDeSanti.Node)(null));
    this.SourcesMatiasDeSanti_Node_data = ((java.lang.Object)(null));
    {
    }
  }


  public Node(java.lang.Object _data, SourcesMatiasDeSanti.Node _next) {
    this.SourcesMatiasDeSanti_Node_next = ((SourcesMatiasDeSanti.Node)(null));
    this.SourcesMatiasDeSanti_Node_data = ((java.lang.Object)(null));
    {
      this.SourcesMatiasDeSanti_Node_next = _next;
      this.SourcesMatiasDeSanti_Node_data = _data;
    }
  }


  public java.lang.Object getData() {
    {
      return this.SourcesMatiasDeSanti_Node_data;
    }
  }


  public void setData(java.lang.Object data) {
    java.lang.Object param_data_3;

    param_data_3 = data;
    {
      this.SourcesMatiasDeSanti_Node_data = param_data_3;
    }
  }


  public SourcesMatiasDeSanti.Node getNext() {
    {
      return this.SourcesMatiasDeSanti_Node_next;
    }
  }


  public void setNext(SourcesMatiasDeSanti.Node next) {
    SourcesMatiasDeSanti.Node param_next_4;

    param_next_4 = next;
    {
      this.SourcesMatiasDeSanti_Node_next = param_next_4;
    }
  }

}
