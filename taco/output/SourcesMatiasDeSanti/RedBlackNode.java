package SourcesMatiasDeSanti;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class RedBlackNode extends java.lang.Object {

  public int SourcesMatiasDeSanti_RedBlackNode_data;
  public SourcesMatiasDeSanti.RedBlackNode SourcesMatiasDeSanti_RedBlackNode_left;
  public SourcesMatiasDeSanti.RedBlackNode SourcesMatiasDeSanti_RedBlackNode_right;
  public SourcesMatiasDeSanti.RedBlackNode SourcesMatiasDeSanti_RedBlackNode_parent;
  public int SourcesMatiasDeSanti_RedBlackNode_color;
  public int SourcesMatiasDeSanti_RedBlackNode_blackHeight;

  public RedBlackNode() {
    this.SourcesMatiasDeSanti_RedBlackNode_data = (byte)0;
    this.SourcesMatiasDeSanti_RedBlackNode_left = ((SourcesMatiasDeSanti.RedBlackNode)(null));
    this.SourcesMatiasDeSanti_RedBlackNode_right = ((SourcesMatiasDeSanti.RedBlackNode)(null));
    this.SourcesMatiasDeSanti_RedBlackNode_parent = ((SourcesMatiasDeSanti.RedBlackNode)(null));
    this.SourcesMatiasDeSanti_RedBlackNode_color = (byte)0;
    this.SourcesMatiasDeSanti_RedBlackNode_blackHeight = 0;
    {
    }
  }
/** Sets the left child and updates its parent pointer.
 
 @param child
            the new left child
*/

  public void setLeftChild(SourcesMatiasDeSanti.RedBlackNode child) {
    boolean t_3;

    this.SourcesMatiasDeSanti_RedBlackNode_left = child;
    t_3 = child  !=  null;
    if (t_3) {
      {
        {
          {
            {
              {
                child.SourcesMatiasDeSanti_RedBlackNode_parent = this;
              }
            }
          }
        }
      }
    }
  }
/** Sets the right child and updates its parent pointer.
 
 @param child
            the new right child
*/

  public void setRightChild(SourcesMatiasDeSanti.RedBlackNode child) {
    boolean t_4;

    this.SourcesMatiasDeSanti_RedBlackNode_right = child;
    t_4 = child  !=  null;
    if (t_4) {
      {
        {
          {
            {
              {
                child.SourcesMatiasDeSanti_RedBlackNode_parent = this;
              }
            }
          }
        }
      }
    }
  }
/** Updates the parent's and replacement node's links when this node is
 replaced.
 
 @param replacement
            the node that replaces this node
*/

  public void replaceWith(SourcesMatiasDeSanti.RedBlackNode replacement) {
    boolean t_5;
    boolean t_6;

    t_5 = this.SourcesMatiasDeSanti_RedBlackNode_parent  ==  null;

    if (t_5) {
      {
        {
          {
            {
              {
                return;
              }
            }
          }
        }
      }
    }
    t_6 = this  ==  this.SourcesMatiasDeSanti_RedBlackNode_parent.SourcesMatiasDeSanti_RedBlackNode_left;
    if (t_6) {
      {
        {
          {
            {
              {
                this.SourcesMatiasDeSanti_RedBlackNode_parent.setLeftChild(replacement);
              }
            }
          }
        }
      }
    } else {
      {
        {
          {
            {
              {
                this.SourcesMatiasDeSanti_RedBlackNode_parent.setRightChild(replacement);
              }
            }
          }
        }
      }
    }
  }
/** Inserts a new node as a descendant of this node.
 
 @param newNode
            the node to insert
*/

  public void addNode(SourcesMatiasDeSanti.RedBlackNode newNode) {
    int t_7;
    boolean t_11;

    t_7 = newNode.SourcesMatiasDeSanti_RedBlackNode_data - this.SourcesMatiasDeSanti_RedBlackNode_data;
    int var_2_comp = t_7;

    t_11 = var_2_comp  <  0;
    if (t_11) {
      {
        {
          {
            {
              {
                boolean t_8;

                t_8 = this.SourcesMatiasDeSanti_RedBlackNode_left  ==  null;
                if (t_8) {
                  {
                    {
                      {
                        {
                          {
                            this.SourcesMatiasDeSanti_RedBlackNode_left = newNode;
                            this.SourcesMatiasDeSanti_RedBlackNode_left.SourcesMatiasDeSanti_RedBlackNode_parent = this;
                          }
                        }
                      }
                    }
                  }
                } else {
                  {
                    {
                      {
                        {
                          {
                            this.SourcesMatiasDeSanti_RedBlackNode_left.addNode(newNode);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    } else {
      {
        {
          {
            {
              {
                boolean t_10;

                t_10 = var_2_comp  >  0;
                if (t_10) {
                  {
                    {
                      {
                        {
                          {
                            boolean t_9;

                            t_9 = this.SourcesMatiasDeSanti_RedBlackNode_right  ==  null;
                            if (t_9) {
                              {
                                {
                                  {
                                    {
                                      {
                                        this.SourcesMatiasDeSanti_RedBlackNode_right = newNode;
                                        this.SourcesMatiasDeSanti_RedBlackNode_right.SourcesMatiasDeSanti_RedBlackNode_parent = this;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              {
                                {
                                  {
                                    {
                                      {
                                        this.SourcesMatiasDeSanti_RedBlackNode_right.addNode(newNode);
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

}
