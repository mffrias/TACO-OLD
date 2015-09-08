package ar.edu.itba.materia.avl;

//@ model import org.jmlspecs.lang.*;


public class AvlNode extends java.lang.Object {

  public /*@ nullable @*/ ar.edu.itba.materia.avl.AvlNode ar_edu_itba_materia_avl_AvlNode_left;
  public /*@ nullable @*/ ar.edu.itba.materia.avl.AvlNode ar_edu_itba_materia_avl_AvlNode_right;
  public /*@ nullable @*/ ar.edu.itba.materia.avl.AvlNode ar_edu_itba_materia_avl_AvlNode_parent;
  public int ar_edu_itba_materia_avl_AvlNode_key;
  public int ar_edu_itba_materia_avl_AvlNode_height;

  public AvlNode() {
    this.ar_edu_itba_materia_avl_AvlNode_left = ((ar.edu.itba.materia.avl.AvlNode)(null));
    this.ar_edu_itba_materia_avl_AvlNode_right = ((ar.edu.itba.materia.avl.AvlNode)(null));
    this.ar_edu_itba_materia_avl_AvlNode_parent = ((ar.edu.itba.materia.avl.AvlNode)(null));
    this.ar_edu_itba_materia_avl_AvlNode_key = (byte)0;
    this.ar_edu_itba_materia_avl_AvlNode_height = (byte)0;
  }

}
