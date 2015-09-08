package SourcesHomovoc;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class AVLNode2 extends java.lang.Object {

  public SourcesHomovoc.AVLNode2 SourcesHomovoc_AVLNode2_left;
  public SourcesHomovoc.AVLNode2 SourcesHomovoc_AVLNode2_right;
  public SourcesHomovoc.AVLNode2 SourcesHomovoc_AVLNode2_parent;
  public int SourcesHomovoc_AVLNode2_value;
  public int SourcesHomovoc_AVLNode2_height;
  public java.lang.Object SourcesHomovoc_AVLNode2_object;

  public AVLNode2() {
    this.SourcesHomovoc_AVLNode2_left = ((SourcesHomovoc.AVLNode2)(null));
    this.SourcesHomovoc_AVLNode2_right = ((SourcesHomovoc.AVLNode2)(null));
    this.SourcesHomovoc_AVLNode2_parent = ((SourcesHomovoc.AVLNode2)(null));
    this.SourcesHomovoc_AVLNode2_value = (byte)0;
    this.SourcesHomovoc_AVLNode2_height = (byte)0;
    this.SourcesHomovoc_AVLNode2_object = ((java.lang.Object)(null));
    {
    }
  }


  public AVLNode2(int value) {
    this.SourcesHomovoc_AVLNode2_left = ((SourcesHomovoc.AVLNode2)(null));
    this.SourcesHomovoc_AVLNode2_right = ((SourcesHomovoc.AVLNode2)(null));
    this.SourcesHomovoc_AVLNode2_parent = ((SourcesHomovoc.AVLNode2)(null));
    this.SourcesHomovoc_AVLNode2_value = (byte)0;
    this.SourcesHomovoc_AVLNode2_height = (byte)0;
    this.SourcesHomovoc_AVLNode2_object = ((java.lang.Object)(null));
    {
      this.SourcesHomovoc_AVLNode2_value = value;
      this.SourcesHomovoc_AVLNode2_height = 0;
    }
  }


  public AVLNode2(int value, java.lang.Object object) {
    this.SourcesHomovoc_AVLNode2_left = ((SourcesHomovoc.AVLNode2)(null));
    this.SourcesHomovoc_AVLNode2_right = ((SourcesHomovoc.AVLNode2)(null));
    this.SourcesHomovoc_AVLNode2_parent = ((SourcesHomovoc.AVLNode2)(null));
    this.SourcesHomovoc_AVLNode2_value = (byte)0;
    this.SourcesHomovoc_AVLNode2_height = (byte)0;
    this.SourcesHomovoc_AVLNode2_object = ((java.lang.Object)(null));
    {
      this.SourcesHomovoc_AVLNode2_value = value;
      this.SourcesHomovoc_AVLNode2_height = 0;
      this.SourcesHomovoc_AVLNode2_object = object;
    }
  }


  public AVLNode2(SourcesHomovoc.AVLNode2 node) {
    this.SourcesHomovoc_AVLNode2_left = ((SourcesHomovoc.AVLNode2)(null));
    this.SourcesHomovoc_AVLNode2_right = ((SourcesHomovoc.AVLNode2)(null));
    this.SourcesHomovoc_AVLNode2_parent = ((SourcesHomovoc.AVLNode2)(null));
    this.SourcesHomovoc_AVLNode2_value = (byte)0;
    this.SourcesHomovoc_AVLNode2_height = (byte)0;
    this.SourcesHomovoc_AVLNode2_object = ((java.lang.Object)(null));
    {
      this.SourcesHomovoc_AVLNode2_value = node.SourcesHomovoc_AVLNode2_value;
      this.SourcesHomovoc_AVLNode2_height = node.SourcesHomovoc_AVLNode2_height;
      this.SourcesHomovoc_AVLNode2_left = node.SourcesHomovoc_AVLNode2_left;
      this.SourcesHomovoc_AVLNode2_right = node.SourcesHomovoc_AVLNode2_right;
    }
  }


  public java.lang.Object getObject() {
    return this.SourcesHomovoc_AVLNode2_object;
  }


  public void setObject(java.lang.Object object) {
    this.SourcesHomovoc_AVLNode2_object = object;
  }


  public int getValue() {
    return this.SourcesHomovoc_AVLNode2_value;
  }


  public SourcesHomovoc.AVLNode2 getParent() {
    return this.SourcesHomovoc_AVLNode2_parent;
  }


  public SourcesHomovoc.AVLNode2 getLeft() {
    return this.SourcesHomovoc_AVLNode2_left;
  }


  public void setLeft(SourcesHomovoc.AVLNode2 left) {
    boolean t_68;

    this.SourcesHomovoc_AVLNode2_left = left;
    t_68 = left  !=  null;
    if (t_68) {
      {
        {
          {
            {
              {
                left.SourcesHomovoc_AVLNode2_parent = this;
              }
            }
          }
        }
      }
    }
  }


  public SourcesHomovoc.AVLNode2 getRight() {
    return this.SourcesHomovoc_AVLNode2_right;
  }


  public void setRight(SourcesHomovoc.AVLNode2 right) {
    boolean t_69;

    this.SourcesHomovoc_AVLNode2_right = right;
    t_69 = right  !=  null;
    if (t_69) {
      {
        {
          {
            {
              {
                right.SourcesHomovoc_AVLNode2_parent = this;
              }
            }
          }
        }
      }
    }
  }


  public int getHeight() {
    return this.SourcesHomovoc_AVLNode2_height;
  }


  public int getLevel() {
    SourcesHomovoc.AVLNode2 t_70;
    int var_27_level = 0;
    SourcesHomovoc.AVLNode2 var_28_currentNode = this;
    boolean var_29_ws_7;

    var_28_currentNode = var_28_currentNode.SourcesHomovoc_AVLNode2_parent;
    t_70 = var_28_currentNode;
    var_29_ws_7 = (t_70)  !=  null;
    while (var_29_ws_7) {
      int t_71;
      SourcesHomovoc.AVLNode2 t_72;

      t_71 = var_27_level;
      var_27_level = var_27_level + (byte)1;
      var_28_currentNode = var_28_currentNode.SourcesHomovoc_AVLNode2_parent;
      t_72 = var_28_currentNode;
      var_29_ws_7 = (t_72)  !=  null;
    }

    return var_27_level;
  }


  public int getBalanceFactor() {
    int t_73;
    int t_74;
    int t_75;

    t_73 = this.getLeftHeight();
    int var_30_leftHeight = t_73;

    t_74 = this.getRightHeight();
    int var_31_rightHeight = t_74;

    t_75 = var_30_leftHeight - var_31_rightHeight;

    return t_75;
  }


  public void insertToLeaf(SourcesHomovoc.AVLNode2 node) {
    boolean t_76;
    boolean t_77;
    boolean t_78;
    SourcesHomovoc.AVLNode2 var_32_aux = node;
    boolean var_33_found = false;
    boolean var_34_ws_8;

    t_77 = var_32_aux.SourcesHomovoc_AVLNode2_value  !=  this.SourcesHomovoc_AVLNode2_value;

    if (t_77) {
      {
        {
          t_78 = ! var_33_found;
          if (t_78) {
            {
              t_76 = true;
            }
          } else {
            {
              t_76 = false;
            }
          }
        }
      }
    } else {
      {
        t_76 = false;
      }
    }
    var_34_ws_8 = t_76;
    while (var_34_ws_8) {
      boolean t_79;
      boolean t_82;
      boolean t_83;
      boolean t_84;
      boolean t_85;

      t_79 = var_32_aux.SourcesHomovoc_AVLNode2_value  ==  this.SourcesHomovoc_AVLNode2_value;

      if (t_79) {
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
      t_82 = var_32_aux.SourcesHomovoc_AVLNode2_value  <  this.SourcesHomovoc_AVLNode2_value;

      if (t_82) {
        {
          {
            {
              {
                {
                  boolean t_80;

                  t_80 = this.SourcesHomovoc_AVLNode2_left  ==  null;
                  if (t_80) {
                    {
                      {
                        {
                          {
                            {
                              this.setLeft(var_32_aux);
                              var_33_found = true;
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
                              var_32_aux = this.SourcesHomovoc_AVLNode2_left;
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
                  boolean t_81;

                  t_81 = this.SourcesHomovoc_AVLNode2_right  ==  null;
                  if (t_81) {
                    {
                      {
                        {
                          {
                            {
                              this.setRight(node);
                              var_33_found = true;
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
                              var_32_aux = this.SourcesHomovoc_AVLNode2_right;
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
      t_84 = var_32_aux.SourcesHomovoc_AVLNode2_value  !=  this.SourcesHomovoc_AVLNode2_value;

      if (t_84) {
        {
          {
            t_85 = ! var_33_found;
            if (t_85) {
              {
                t_83 = true;
              }
            } else {
              {
                t_83 = false;
              }
            }
          }
        }
      } else {
        {
          t_83 = false;
        }
      }
      var_34_ws_8 = t_83;
    }
  }
/** rotate right change of height should be added; applies to the LL type
 situation
*/

  public SourcesHomovoc.AVLNode2 rotateRight() {
    SourcesHomovoc.AVLNode2 t_86;
    int t_87;

    t_86 = new SourcesHomovoc.AVLNode2(this);
    SourcesHomovoc.AVLNode2 var_35_newRight = t_86;

    t_87 = this.getRightHeight();
    var_35_newRight.SourcesHomovoc_AVLNode2_height = t_87 + 1;
    var_35_newRight.setLeft(this.SourcesHomovoc_AVLNode2_left.SourcesHomovoc_AVLNode2_right);
    this.SourcesHomovoc_AVLNode2_left.setRight(var_35_newRight);
    this.SourcesHomovoc_AVLNode2_left.adjustHeight();

    return this.SourcesHomovoc_AVLNode2_left;
  }
/** rotate left change of height should be added; applies to the LL type
 situation
*/

  public SourcesHomovoc.AVLNode2 rotateLeft() {
    SourcesHomovoc.AVLNode2 t_88;
    int t_89;

    t_88 = new SourcesHomovoc.AVLNode2(this);
    SourcesHomovoc.AVLNode2 var_36_newLeft = t_88;

    t_89 = this.getLeftHeight();
    var_36_newLeft.SourcesHomovoc_AVLNode2_height = t_89 + 1;
    var_36_newLeft.setRight(this.SourcesHomovoc_AVLNode2_right.SourcesHomovoc_AVLNode2_left);
    this.SourcesHomovoc_AVLNode2_right.setLeft(var_36_newLeft);
    this.SourcesHomovoc_AVLNode2_right.adjustHeight();

    return this.SourcesHomovoc_AVLNode2_right;
  }


  public void adjustHeight() {
    int t_90;
    int t_91;
    boolean t_92;

    t_90 = this.getLeftHeight();
    int var_37_leftHeight = t_90;

    t_91 = this.getRightHeight();
    int var_38_rightHeight = t_91;

    t_92 = var_37_leftHeight  >  var_38_rightHeight;
    if (t_92) {
      {
        {
          {
            {
              {
                this.SourcesHomovoc_AVLNode2_height = var_37_leftHeight + 1;
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
                this.SourcesHomovoc_AVLNode2_height = var_38_rightHeight + 1;
              }
            }
          }
        }
      }
    }
  }


  public int getLeftHeight() {
    boolean t_93;

    t_93 = this.SourcesHomovoc_AVLNode2_left  ==  null;
    if (t_93) {
      {
        {
          {
            {
              {
                return -1;
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
                return this.SourcesHomovoc_AVLNode2_left.SourcesHomovoc_AVLNode2_height;
              }
            }
          }
        }
      }
    }
  }


  public int getRightHeight() {
    boolean t_94;

    t_94 = this.SourcesHomovoc_AVLNode2_right  ==  null;
    if (t_94) {
      {
        {
          {
            {
              {
                return -1;
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
                return this.SourcesHomovoc_AVLNode2_right.SourcesHomovoc_AVLNode2_height;
              }
            }
          }
        }
      }
    }
  }


  public boolean isLeaf() {
    boolean t_95;
    boolean t_96;
    boolean t_97;

    t_96 = this.SourcesHomovoc_AVLNode2_left  ==  null;
    if (t_96) {
      {
        {
          t_97 = this.SourcesHomovoc_AVLNode2_right  ==  null;
          if (t_97) {
            {
              t_95 = true;
            }
          } else {
            {
              t_95 = false;
            }
          }
        }
      }
    } else {
      {
        t_95 = false;
      }
    }

    return t_95;
  }


  public SourcesHomovoc.AVLNode2 getLeftmost() {
    SourcesHomovoc.AVLNode2 var_39_leftmost = this;
    boolean var_40_ws_9;

    var_40_ws_9 = var_39_leftmost.SourcesHomovoc_AVLNode2_left  !=  null;
    while (var_40_ws_9) {
      var_39_leftmost = var_39_leftmost.SourcesHomovoc_AVLNode2_left;
      var_40_ws_9 = var_39_leftmost.SourcesHomovoc_AVLNode2_left  !=  null;
    }

    return var_39_leftmost;
  }


  public SourcesHomovoc.AVLNode2 getRightmost() {
    SourcesHomovoc.AVLNode2 var_41_rightmost = this;
    boolean var_42_ws_10;

    var_42_ws_10 = var_41_rightmost.SourcesHomovoc_AVLNode2_right  !=  null;
    while (var_42_ws_10) {
      var_41_rightmost = var_41_rightmost.SourcesHomovoc_AVLNode2_right;
      var_42_ws_10 = var_41_rightmost.SourcesHomovoc_AVLNode2_right  !=  null;
    }

    return var_41_rightmost;
  }

}
