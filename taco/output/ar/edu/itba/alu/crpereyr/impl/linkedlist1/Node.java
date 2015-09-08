package ar.edu.itba.alu.crpereyr.impl.linkedlist1;

//@ model import org.jmlspecs.lang.*;


public class Node extends java.lang.Object {

  public /*@ nullable @*/ ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next;
  public /*@ nullable @*/ java.lang.Object ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_data;

  public Node() {
    this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next = ((ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node)(null));
    this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_data = ((java.lang.Object)(null));
    {
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next = ((ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node)(null));
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_data = null;
    }
  }


  public Node(java.lang.Object dataValue) {
    this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next = ((ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node)(null));
    this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_data = ((java.lang.Object)(null));
    {
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next = ((ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node)(null));
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_data = dataValue;
    }
  }


  public Node(java.lang.Object dataValue, ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node nextValue) {
    this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next = ((ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node)(null));
    this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_data = ((java.lang.Object)(null));
    {
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next = nextValue;
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_data = dataValue;
    }
  }


  public java.lang.Object getData() {
    {
      return this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_data;
    }
  }


  public void setData(java.lang.Object dataValue) {
    java.lang.Object param_dataValue_8;

    param_dataValue_8 = dataValue;
    {
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_data = param_dataValue_8;
    }
  }


  public ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node getNext() {
    {
      return this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next;
    }
  }


  public void setNext(ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node nextValue) {
    ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node param_nextValue_9;

    param_nextValue_9 = nextValue;
    {
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next = param_nextValue_9;
    }
  }

}
