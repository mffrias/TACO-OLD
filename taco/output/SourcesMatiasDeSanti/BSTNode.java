package SourcesMatiasDeSanti;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class BSTNode extends java.lang.Object {

  public int SourcesMatiasDeSanti_BSTNode_el;
  public /*@ nullable @*/ SourcesMatiasDeSanti.BSTNode SourcesMatiasDeSanti_BSTNode_left;
  public /*@ nullable @*/ SourcesMatiasDeSanti.BSTNode SourcesMatiasDeSanti_BSTNode_right;

  public BSTNode() {
    this.SourcesMatiasDeSanti_BSTNode_el = (byte)0;
    this.SourcesMatiasDeSanti_BSTNode_left = ((SourcesMatiasDeSanti.BSTNode)(null));
    this.SourcesMatiasDeSanti_BSTNode_right = ((SourcesMatiasDeSanti.BSTNode)(null));
    {
      SourcesMatiasDeSanti.BSTNode t_27;

      this.SourcesMatiasDeSanti_BSTNode_right = ((SourcesMatiasDeSanti.BSTNode)(null));
      t_27 = this.SourcesMatiasDeSanti_BSTNode_right;
      this.SourcesMatiasDeSanti_BSTNode_left = t_27;
    }
  }


  public BSTNode(int el) {
    this.SourcesMatiasDeSanti_BSTNode_el = (byte)0;
    this.SourcesMatiasDeSanti_BSTNode_left = ((SourcesMatiasDeSanti.BSTNode)(null));
    this.SourcesMatiasDeSanti_BSTNode_right = ((SourcesMatiasDeSanti.BSTNode)(null));
    {

      ;
    }
  }


  public BSTNode(int el, SourcesMatiasDeSanti.BSTNode lt, SourcesMatiasDeSanti.BSTNode rt) {
    this.SourcesMatiasDeSanti_BSTNode_el = (byte)0;
    this.SourcesMatiasDeSanti_BSTNode_left = ((SourcesMatiasDeSanti.BSTNode)(null));
    this.SourcesMatiasDeSanti_BSTNode_right = ((SourcesMatiasDeSanti.BSTNode)(null));
    {
      this.SourcesMatiasDeSanti_BSTNode_el = el;
      this.SourcesMatiasDeSanti_BSTNode_left = lt;
      this.SourcesMatiasDeSanti_BSTNode_right = rt;
    }
  }

}
