package SourcesPabloPauli;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class SecondAVLNode extends java.lang.Object {

  public /*@ nullable @*/ SourcesPabloPauli.SecondAVLNode SourcesPabloPauli_SecondAVLNode_left;
  public /*@ nullable @*/ SourcesPabloPauli.SecondAVLNode SourcesPabloPauli_SecondAVLNode_right;
  public /*@ nullable @*/ SourcesPabloPauli.SecondAVLNode SourcesPabloPauli_SecondAVLNode_parent;
  public int SourcesPabloPauli_SecondAVLNode_value;
  public int SourcesPabloPauli_SecondAVLNode_height;
  public java.lang.Object SourcesPabloPauli_SecondAVLNode_object;

  public SecondAVLNode(int value) {
    this.SourcesPabloPauli_SecondAVLNode_left = ((SourcesPabloPauli.SecondAVLNode)(null));
    this.SourcesPabloPauli_SecondAVLNode_right = ((SourcesPabloPauli.SecondAVLNode)(null));
    this.SourcesPabloPauli_SecondAVLNode_parent = ((SourcesPabloPauli.SecondAVLNode)(null));
    this.SourcesPabloPauli_SecondAVLNode_value = (byte)0;
    this.SourcesPabloPauli_SecondAVLNode_height = (byte)0;
    this.SourcesPabloPauli_SecondAVLNode_object = ((java.lang.Object)(null));
    {
      this.SourcesPabloPauli_SecondAVLNode_value = value;
      this.SourcesPabloPauli_SecondAVLNode_height = 0;
    }
  }


  public SecondAVLNode(int value, java.lang.Object object) {
    this.SourcesPabloPauli_SecondAVLNode_left = ((SourcesPabloPauli.SecondAVLNode)(null));
    this.SourcesPabloPauli_SecondAVLNode_right = ((SourcesPabloPauli.SecondAVLNode)(null));
    this.SourcesPabloPauli_SecondAVLNode_parent = ((SourcesPabloPauli.SecondAVLNode)(null));
    this.SourcesPabloPauli_SecondAVLNode_value = (byte)0;
    this.SourcesPabloPauli_SecondAVLNode_height = (byte)0;
    this.SourcesPabloPauli_SecondAVLNode_object = ((java.lang.Object)(null));
    {
      this.SourcesPabloPauli_SecondAVLNode_value = value;
      this.SourcesPabloPauli_SecondAVLNode_height = 0;
      this.SourcesPabloPauli_SecondAVLNode_object = object;
    }
  }


  public SecondAVLNode(SourcesPabloPauli.SecondAVLNode node) {
    this.SourcesPabloPauli_SecondAVLNode_left = ((SourcesPabloPauli.SecondAVLNode)(null));
    this.SourcesPabloPauli_SecondAVLNode_right = ((SourcesPabloPauli.SecondAVLNode)(null));
    this.SourcesPabloPauli_SecondAVLNode_parent = ((SourcesPabloPauli.SecondAVLNode)(null));
    this.SourcesPabloPauli_SecondAVLNode_value = (byte)0;
    this.SourcesPabloPauli_SecondAVLNode_height = (byte)0;
    this.SourcesPabloPauli_SecondAVLNode_object = ((java.lang.Object)(null));
    {
      this.SourcesPabloPauli_SecondAVLNode_value = node.SourcesPabloPauli_SecondAVLNode_value;
      this.SourcesPabloPauli_SecondAVLNode_height = node.SourcesPabloPauli_SecondAVLNode_height;
      this.SourcesPabloPauli_SecondAVLNode_left = node.SourcesPabloPauli_SecondAVLNode_left;
      this.SourcesPabloPauli_SecondAVLNode_right = node.SourcesPabloPauli_SecondAVLNode_right;
    }
  }


  public java.lang.Object getObject() {
    {
      return this.SourcesPabloPauli_SecondAVLNode_object;
    }
  }


  public void setObject(java.lang.Object object) {
    java.lang.Object param_object_2;

    param_object_2 = object;
    {
      this.SourcesPabloPauli_SecondAVLNode_object = param_object_2;
    }
  }


  public int getValue() {
    {
      return this.SourcesPabloPauli_SecondAVLNode_value;
    }
  }


  public SourcesPabloPauli.SecondAVLNode getParent() {
    {
      return this.SourcesPabloPauli_SecondAVLNode_parent;
    }
  }


  public SourcesPabloPauli.SecondAVLNode getLeft() {
    {
      return this.SourcesPabloPauli_SecondAVLNode_left;
    }
  }


  public void setLeft(SourcesPabloPauli.SecondAVLNode left) {
    SourcesPabloPauli.SecondAVLNode param_left_3;

    param_left_3 = left;
    {
      boolean t_18;

      this.SourcesPabloPauli_SecondAVLNode_left = param_left_3;
      t_18 = param_left_3  !=  null;
      if (t_18) {
        {
          {
            {
              {
                {
                  left.SourcesPabloPauli_SecondAVLNode_parent = this;
                }
              }
            }
          }
        }
      }
    }
  }


  public SourcesPabloPauli.SecondAVLNode getRight() {
    {
      return this.SourcesPabloPauli_SecondAVLNode_right;
    }
  }


  public void setRight(SourcesPabloPauli.SecondAVLNode right) {
    SourcesPabloPauli.SecondAVLNode param_right_4;

    param_right_4 = right;
    {
      boolean t_19;

      this.SourcesPabloPauli_SecondAVLNode_right = param_right_4;
      t_19 = param_right_4  !=  null;
      if (t_19) {
        {
          {
            {
              {
                {
                  right.SourcesPabloPauli_SecondAVLNode_parent = this;
                }
              }
            }
          }
        }
      }
    }
  }


  public int getHeight() {
    {
      return this.SourcesPabloPauli_SecondAVLNode_height;
    }
  }


  public int getLevel() {
    {
      SourcesPabloPauli.SecondAVLNode t_20;
      int var_5_level = 0;
      SourcesPabloPauli.SecondAVLNode var_6_currentNode = this;
      boolean var_7_ws_2;

      var_6_currentNode = var_6_currentNode.SourcesPabloPauli_SecondAVLNode_parent;
      t_20 = var_6_currentNode;
      var_7_ws_2 = t_20  !=  null;
      while (var_7_ws_2) {
        int t_21;
        SourcesPabloPauli.SecondAVLNode t_22;

        t_21 = var_5_level;
        var_5_level = var_5_level + (byte)1;
        var_6_currentNode = var_6_currentNode.SourcesPabloPauli_SecondAVLNode_parent;
        t_22 = var_6_currentNode;
        var_7_ws_2 = t_22  !=  null;
      }

      return var_5_level;
    }
  }


  public int getBalanceFactor() {
    {
      int t_23;
      int t_24;
      int t_25;

      t_23 = this.getLeftHeight();
      int var_8_leftHeight = t_23;

      t_24 = this.getRightHeight();
      int var_9_rightHeight = t_24;

      t_25 = var_8_leftHeight - var_9_rightHeight;

      return t_25;
    }
  }


  public void insertToLeaf(SourcesPabloPauli.SecondAVLNode node) {
    SourcesPabloPauli.SecondAVLNode param_node_5;

    param_node_5 = node;
    {
      boolean t_29;

      t_29 = node.SourcesPabloPauli_SecondAVLNode_value  ==  this.SourcesPabloPauli_SecondAVLNode_value;
      if (t_29) {
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
      } else {
        {
          {
            {
              {
                {
                  boolean t_28;

                  t_28 = node.SourcesPabloPauli_SecondAVLNode_value  <  this.SourcesPabloPauli_SecondAVLNode_value;
                  if (t_28) {
                    {
                      {
                        {
                          {
                            {
                              boolean t_26;

                              t_26 = this.SourcesPabloPauli_SecondAVLNode_left  ==  null;
                              if (t_26) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          this.setLeft(param_node_5);
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
                                          this.SourcesPabloPauli_SecondAVLNode_left.insertToLeaf(param_node_5);
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
                              boolean t_27;

                              t_27 = this.SourcesPabloPauli_SecondAVLNode_right  ==  null;
                              if (t_27) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          this.setRight(param_node_5);
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
                                          this.SourcesPabloPauli_SecondAVLNode_right.insertToLeaf(param_node_5);
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
/**rotate right
 change of height should be added;
 applies to the LL type situation
*/

  public SourcesPabloPauli.SecondAVLNode rotateRight() {
    {
      SourcesPabloPauli.SecondAVLNode t_30;
      int t_31;

      t_30 = new SourcesPabloPauli.SecondAVLNode(this);
      SourcesPabloPauli.SecondAVLNode var_10_newRight = t_30;

      t_31 = this.getRightHeight();
      var_10_newRight.SourcesPabloPauli_SecondAVLNode_height = t_31 + 1;
      var_10_newRight.setLeft(this.SourcesPabloPauli_SecondAVLNode_left.SourcesPabloPauli_SecondAVLNode_right);
      this.SourcesPabloPauli_SecondAVLNode_left.setRight(var_10_newRight);
      this.SourcesPabloPauli_SecondAVLNode_left.adjustHeight();

      return this.SourcesPabloPauli_SecondAVLNode_left;
    }
  }
/** rotate left
 change of height should be added;
 applies to the LL type situation
*/

  public SourcesPabloPauli.SecondAVLNode rotateLeft() {
    {
      SourcesPabloPauli.SecondAVLNode t_32;
      int t_33;

      t_32 = new SourcesPabloPauli.SecondAVLNode(this);
      SourcesPabloPauli.SecondAVLNode var_11_newLeft = t_32;

      t_33 = this.getLeftHeight();
      var_11_newLeft.SourcesPabloPauli_SecondAVLNode_height = t_33 + 1;
      var_11_newLeft.setRight(this.SourcesPabloPauli_SecondAVLNode_right.SourcesPabloPauli_SecondAVLNode_left);
      this.SourcesPabloPauli_SecondAVLNode_right.setLeft(var_11_newLeft);
      this.SourcesPabloPauli_SecondAVLNode_right.adjustHeight();

      return this.SourcesPabloPauli_SecondAVLNode_right;
    }
  }


  public void adjustHeight() {
    {
      int t_34;
      int t_35;
      int t_36;
      boolean t_37;
      int t_38;
      int t_39;

      t_34 = this.getLeftHeight();
      int var_12_leftHeight = t_34;

      t_35 = this.getRightHeight();
      int var_13_rightHeight = t_35;

      t_37 = var_12_leftHeight  >  var_13_rightHeight;
      t_38 = var_12_leftHeight + 1;
      t_39 = var_13_rightHeight + 1;

      if (t_37) {
        {
          t_36 = t_38;
        }
      } else {
        {
          t_36 = t_39;
        }
      }
      this.SourcesPabloPauli_SecondAVLNode_height = t_36;
    }
  }


  public int getLeftHeight() {
    {
      int t_40;
      boolean t_41;

      t_41 = this.SourcesPabloPauli_SecondAVLNode_left  ==  null;
      if (t_41) {
        {
          t_40 = -1;
        }
      } else {
        {
          t_40 = this.SourcesPabloPauli_SecondAVLNode_left.SourcesPabloPauli_SecondAVLNode_height;
        }
      }

      return t_40;
    }
  }


  public int getRightHeight() {
    {
      int t_42;
      boolean t_43;

      t_43 = this.SourcesPabloPauli_SecondAVLNode_right  ==  null;
      if (t_43) {
        {
          t_42 = -1;
        }
      } else {
        {
          t_42 = this.SourcesPabloPauli_SecondAVLNode_right.SourcesPabloPauli_SecondAVLNode_height;
        }
      }

      return t_42;
    }
  }


  public boolean isLeaf() {
    {
      boolean t_44;
      boolean t_45;
      boolean t_46;

      t_45 = this.SourcesPabloPauli_SecondAVLNode_left  ==  null;
      if (t_45) {
        {
          {
            t_46 = this.SourcesPabloPauli_SecondAVLNode_right  ==  null;
            if (t_46) {
              {
                t_44 = true;
              }
            } else {
              {
                t_44 = false;
              }
            }
          }
        }
      } else {
        {
          t_44 = false;
        }
      }

      return t_44;
    }
  }


  public SourcesPabloPauli.SecondAVLNode getLeftmost() {
    {
      SourcesPabloPauli.SecondAVLNode var_14_leftmost = this;
      boolean var_15_ws_3;

      var_15_ws_3 = var_14_leftmost.SourcesPabloPauli_SecondAVLNode_left  !=  null;
      while (var_15_ws_3) {
        var_14_leftmost = var_14_leftmost.SourcesPabloPauli_SecondAVLNode_left;
        var_15_ws_3 = var_14_leftmost.SourcesPabloPauli_SecondAVLNode_left  !=  null;
      }

      return var_14_leftmost;
    }
  }


  public SourcesPabloPauli.SecondAVLNode getRightmost() {
    {
      SourcesPabloPauli.SecondAVLNode var_16_rightmost = this;
      boolean var_17_ws_4;

      var_17_ws_4 = var_16_rightmost.SourcesPabloPauli_SecondAVLNode_right  !=  null;
      while (var_17_ws_4) {
        var_16_rightmost = var_16_rightmost.SourcesPabloPauli_SecondAVLNode_right;
        var_17_ws_4 = var_16_rightmost.SourcesPabloPauli_SecondAVLNode_right  !=  null;
      }

      return var_16_rightmost;
    }
  }

}
