package SourcesCristianOntivero;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class TreeNode extends java.lang.Object {

  public SourcesCristianOntivero.TreeNode SourcesCristianOntivero_TreeNode_left;
  public SourcesCristianOntivero.TreeNode SourcesCristianOntivero_TreeNode_right;
  public int SourcesCristianOntivero_TreeNode_data;

  public TreeNode() {
    this.SourcesCristianOntivero_TreeNode_left = ((SourcesCristianOntivero.TreeNode)(null));
    this.SourcesCristianOntivero_TreeNode_right = ((SourcesCristianOntivero.TreeNode)(null));
    this.SourcesCristianOntivero_TreeNode_data = (byte)0;
    {
      this.SourcesCristianOntivero_TreeNode_left = ((SourcesCristianOntivero.TreeNode)(null));
      this.SourcesCristianOntivero_TreeNode_right = ((SourcesCristianOntivero.TreeNode)(null));
      this.SourcesCristianOntivero_TreeNode_data = 0;
    }
  }


  public TreeNode(int n) {
    this.SourcesCristianOntivero_TreeNode_left = ((SourcesCristianOntivero.TreeNode)(null));
    this.SourcesCristianOntivero_TreeNode_right = ((SourcesCristianOntivero.TreeNode)(null));
    this.SourcesCristianOntivero_TreeNode_data = (byte)0;
    {
      this.SourcesCristianOntivero_TreeNode_left = ((SourcesCristianOntivero.TreeNode)(null));
      this.SourcesCristianOntivero_TreeNode_right = ((SourcesCristianOntivero.TreeNode)(null));
      this.SourcesCristianOntivero_TreeNode_data = n;
    }
  }


  public void setLeft(SourcesCristianOntivero.TreeNode n) {
    SourcesCristianOntivero.TreeNode param_n_9;

    param_n_9 = n;
    {
      this.SourcesCristianOntivero_TreeNode_left = param_n_9;
    }
  }


  public void setRight(SourcesCristianOntivero.TreeNode n) {
    SourcesCristianOntivero.TreeNode param_n_10;

    param_n_10 = n;
    {
      this.SourcesCristianOntivero_TreeNode_right = param_n_10;
    }
  }


  public SourcesCristianOntivero.TreeNode getLeft() {
    {
      return this.SourcesCristianOntivero_TreeNode_left;
    }
  }


  public SourcesCristianOntivero.TreeNode getRight() {
    {
      return this.SourcesCristianOntivero_TreeNode_right;
    }
  }


  public void setData(int d) {
    int param_d_11;

    param_d_11 = d;
    {
      this.SourcesCristianOntivero_TreeNode_data = param_d_11;
    }
  }


  public int getData() {
    {
      return this.SourcesCristianOntivero_TreeNode_data;
    }
  }

}
