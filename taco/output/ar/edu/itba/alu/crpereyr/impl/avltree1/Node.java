package ar.edu.itba.alu.crpereyr.impl.avltree1;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class Node extends java.lang.Object {

  public int ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key;
  public java.lang.Object ar_edu_itba_alu_crpereyr_impl_avltree1_Node_val;
  public int ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height;
  public ar.edu.itba.alu.crpereyr.impl.avltree1.Node ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left;
  public ar.edu.itba.alu.crpereyr.impl.avltree1.Node ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right;

  public Node(int k, java.lang.Object v) {
    this.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key = (byte)0;
    this.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_val = ((java.lang.Object)(null));
    this.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height = (byte)0;
    this.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left = ((ar.edu.itba.alu.crpereyr.impl.avltree1.Node)(null));
    this.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right = ((ar.edu.itba.alu.crpereyr.impl.avltree1.Node)(null));
    {
      ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_68;

      this.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key = k;
      this.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_val = v;
      this.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height = 0;
      this.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right = ((ar.edu.itba.alu.crpereyr.impl.avltree1.Node)(null));
      t_68 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right;
      this.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left = t_68;
    }
  }

}
