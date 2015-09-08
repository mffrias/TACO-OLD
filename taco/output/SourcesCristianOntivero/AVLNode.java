package SourcesCristianOntivero;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class AVLNode extends java.lang.Object {

  public SourcesCristianOntivero.AVLNode SourcesCristianOntivero_AVLNode_left;
  public SourcesCristianOntivero.AVLNode SourcesCristianOntivero_AVLNode_right;
  public SourcesCristianOntivero.AVLNode SourcesCristianOntivero_AVLNode_parent;
  public int SourcesCristianOntivero_AVLNode_value;
  public int SourcesCristianOntivero_AVLNode_height;

  public AVLNode(int value) {
    this.SourcesCristianOntivero_AVLNode_left = ((SourcesCristianOntivero.AVLNode)(null));
    this.SourcesCristianOntivero_AVLNode_right = ((SourcesCristianOntivero.AVLNode)(null));
    this.SourcesCristianOntivero_AVLNode_parent = ((SourcesCristianOntivero.AVLNode)(null));
    this.SourcesCristianOntivero_AVLNode_value = (byte)0;
    this.SourcesCristianOntivero_AVLNode_height = (byte)0;
    {
      SourcesCristianOntivero.AVLNode t_35;
      SourcesCristianOntivero.AVLNode t_36;

      this.SourcesCristianOntivero_AVLNode_parent = ((SourcesCristianOntivero.AVLNode)(null));
      t_35 = this.SourcesCristianOntivero_AVLNode_parent;
      this.SourcesCristianOntivero_AVLNode_right = t_35;
      t_36 = this.SourcesCristianOntivero_AVLNode_right;
      this.SourcesCristianOntivero_AVLNode_left = t_36;
      this.SourcesCristianOntivero_AVLNode_value = value;
    }
  }


  public AVLNode(int value, SourcesCristianOntivero.AVLNode parent) {
    this.SourcesCristianOntivero_AVLNode_left = ((SourcesCristianOntivero.AVLNode)(null));
    this.SourcesCristianOntivero_AVLNode_right = ((SourcesCristianOntivero.AVLNode)(null));
    this.SourcesCristianOntivero_AVLNode_parent = ((SourcesCristianOntivero.AVLNode)(null));
    this.SourcesCristianOntivero_AVLNode_value = (byte)0;
    this.SourcesCristianOntivero_AVLNode_height = (byte)0;
    {
      this.SourcesCristianOntivero_AVLNode_value = value;
      this.SourcesCristianOntivero_AVLNode_parent = parent;
    }
  }

}
