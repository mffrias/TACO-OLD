package SourcesPauli;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class LinkNode extends java.lang.Object {

  public java.lang.Object SourcesPauli_LinkNode_data;
  public /*@ nullable @*/ SourcesPauli.LinkNode SourcesPauli_LinkNode_next;

  public LinkNode() {
    this.SourcesPauli_LinkNode_data = ((java.lang.Object)(null));
    this.SourcesPauli_LinkNode_next = ((SourcesPauli.LinkNode)(null));
    {
      this.SourcesPauli_LinkNode_data = null;
      this.SourcesPauli_LinkNode_next = ((SourcesPauli.LinkNode)(null));
    }
  }


  public LinkNode(java.lang.Object obj) {
    this.SourcesPauli_LinkNode_data = ((java.lang.Object)(null));
    this.SourcesPauli_LinkNode_next = ((SourcesPauli.LinkNode)(null));
    {
      this.SourcesPauli_LinkNode_data = obj;
      this.SourcesPauli_LinkNode_next = ((SourcesPauli.LinkNode)(null));
    }
  }


  public java.lang.Object getData() {
    {
      return this.SourcesPauli_LinkNode_data;
    }
  }


  public void setData(java.lang.Object data) {
    java.lang.Object param_data_4;

    param_data_4 = data;
    {
      this.SourcesPauli_LinkNode_data = param_data_4;
    }
  }


  public SourcesPauli.LinkNode getNext() {
    {
      return this.SourcesPauli_LinkNode_next;
    }
  }


  public void setNext(SourcesPauli.LinkNode next) {
    SourcesPauli.LinkNode param_next_5;

    param_next_5 = next;
    {
      this.SourcesPauli_LinkNode_next = param_next_5;
    }
  }

}
