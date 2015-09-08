package SourcesEstebanPintos;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class AVLNode2 extends java.lang.Object {

  public /*@ nullable @*/ SourcesEstebanPintos.AVLNode2 SourcesEstebanPintos_AVLNode2_left;
  public /*@ nullable @*/ SourcesEstebanPintos.AVLNode2 SourcesEstebanPintos_AVLNode2_right;
  public /*@ nullable @*/ SourcesEstebanPintos.AVLNode2 SourcesEstebanPintos_AVLNode2_parent;
  public int SourcesEstebanPintos_AVLNode2_value;
  public int SourcesEstebanPintos_AVLNode2_height;

  public AVLNode2() {
    this.SourcesEstebanPintos_AVLNode2_left = ((SourcesEstebanPintos.AVLNode2)(null));
    this.SourcesEstebanPintos_AVLNode2_right = ((SourcesEstebanPintos.AVLNode2)(null));
    this.SourcesEstebanPintos_AVLNode2_parent = ((SourcesEstebanPintos.AVLNode2)(null));
    this.SourcesEstebanPintos_AVLNode2_value = (byte)0;
    this.SourcesEstebanPintos_AVLNode2_height = (byte)0;
    {
    }
  }


  public AVLNode2(int value) {
    this.SourcesEstebanPintos_AVLNode2_left = ((SourcesEstebanPintos.AVLNode2)(null));
    this.SourcesEstebanPintos_AVLNode2_right = ((SourcesEstebanPintos.AVLNode2)(null));
    this.SourcesEstebanPintos_AVLNode2_parent = ((SourcesEstebanPintos.AVLNode2)(null));
    this.SourcesEstebanPintos_AVLNode2_value = (byte)0;
    this.SourcesEstebanPintos_AVLNode2_height = (byte)0;
    {
      this.SourcesEstebanPintos_AVLNode2_value = value;
      this.SourcesEstebanPintos_AVLNode2_height = 0;
      this.SourcesEstebanPintos_AVLNode2_left = ((SourcesEstebanPintos.AVLNode2)(null));
      this.SourcesEstebanPintos_AVLNode2_right = ((SourcesEstebanPintos.AVLNode2)(null));
    }
  }


  public AVLNode2(SourcesEstebanPintos.AVLNode2 node) {
    this.SourcesEstebanPintos_AVLNode2_left = ((SourcesEstebanPintos.AVLNode2)(null));
    this.SourcesEstebanPintos_AVLNode2_right = ((SourcesEstebanPintos.AVLNode2)(null));
    this.SourcesEstebanPintos_AVLNode2_parent = ((SourcesEstebanPintos.AVLNode2)(null));
    this.SourcesEstebanPintos_AVLNode2_value = (byte)0;
    this.SourcesEstebanPintos_AVLNode2_height = (byte)0;
    {
      this.SourcesEstebanPintos_AVLNode2_value = node.SourcesEstebanPintos_AVLNode2_value;
      this.SourcesEstebanPintos_AVLNode2_height = node.SourcesEstebanPintos_AVLNode2_height;
      this.SourcesEstebanPintos_AVLNode2_left = node.SourcesEstebanPintos_AVLNode2_left;
      this.SourcesEstebanPintos_AVLNode2_right = node.SourcesEstebanPintos_AVLNode2_right;
    }
  }


  public int getValue() {
    return this.SourcesEstebanPintos_AVLNode2_value;
  }


  public SourcesEstebanPintos.AVLNode2 getParent() {
    return this.SourcesEstebanPintos_AVLNode2_parent;
  }


  public SourcesEstebanPintos.AVLNode2 getLeft() {
    return this.SourcesEstebanPintos_AVLNode2_left;
  }


  public void setLeft(SourcesEstebanPintos.AVLNode2 left) {
    boolean t_68;

    this.SourcesEstebanPintos_AVLNode2_left = left;
    t_68 = left  !=  null;
    if (t_68) {
      {
        {
          {
            {
              {
                left.SourcesEstebanPintos_AVLNode2_parent = this;
              }
            }
          }
        }
      }
    }
  }


  public SourcesEstebanPintos.AVLNode2 getRight() {
    return this.SourcesEstebanPintos_AVLNode2_right;
  }


  public void setRight(SourcesEstebanPintos.AVLNode2 right) {
    boolean t_69;

    this.SourcesEstebanPintos_AVLNode2_right = right;
    t_69 = right  !=  null;
    if (t_69) {
      {
        {
          {
            {
              {
                right.SourcesEstebanPintos_AVLNode2_parent = this;
              }
            }
          }
        }
      }
    }
  }


  public int getHeight() {
    return this.SourcesEstebanPintos_AVLNode2_height;
  }


  public int getLevel() {
    SourcesEstebanPintos.AVLNode2 t_70;
    int var_26_level = 0;
    SourcesEstebanPintos.AVLNode2 var_27_currentNode = this;
    boolean var_28_ws_7;

    var_27_currentNode = var_27_currentNode.SourcesEstebanPintos_AVLNode2_parent;
    t_70 = var_27_currentNode;
    var_28_ws_7 = (t_70)  !=  null;
    while (var_28_ws_7) {
      SourcesEstebanPintos.AVLNode2 t_71;

      var_26_level = var_26_level + 1;
      var_27_currentNode = var_27_currentNode.SourcesEstebanPintos_AVLNode2_parent;
      t_71 = var_27_currentNode;
      var_28_ws_7 = (t_71)  !=  null;
    }

    return var_26_level;
  }


  public int getBalanceFactor() {
    int t_72;
    int t_73;
    int t_74;

    t_72 = this.getLeftHeight();
    int var_29_leftHeight = t_72;

    t_73 = this.getRightHeight();
    int var_30_rightHeight = t_73;

    t_74 = var_29_leftHeight - var_30_rightHeight;

    return t_74;
  }


  public void insertToLeaf(SourcesEstebanPintos.AVLNode2 node) {
    boolean t_78;

    t_78 = node.SourcesEstebanPintos_AVLNode2_value  ==  this.SourcesEstebanPintos_AVLNode2_value;
    if (t_78) {
      {
        {
          {
            {
              {

                ;
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
                boolean t_77;

                t_77 = node.SourcesEstebanPintos_AVLNode2_value  <  this.SourcesEstebanPintos_AVLNode2_value;
                if (t_77) {
                  {
                    {
                      {
                        {
                          {
                            boolean t_75;

                            t_75 = this.SourcesEstebanPintos_AVLNode2_left  ==  null;
                            if (t_75) {
                              {
                                {
                                  {
                                    {
                                      {
                                        this.setLeft(node);
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
                                        this.SourcesEstebanPintos_AVLNode2_left.insertToLeaf(node);
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
                            boolean t_76;

                            t_76 = this.SourcesEstebanPintos_AVLNode2_right  ==  null;
                            if (t_76) {
                              {
                                {
                                  {
                                    {
                                      {
                                        this.setRight(node);
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
                                        this.SourcesEstebanPintos_AVLNode2_right.insertToLeaf(node);
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


  public SourcesEstebanPintos.AVLNode2 rotateRight() {
    SourcesEstebanPintos.AVLNode2 t_79;
    int t_80;

    t_79 = new SourcesEstebanPintos.AVLNode2(this);
    SourcesEstebanPintos.AVLNode2 var_31_newRight = t_79;

    t_80 = this.getRightHeight();
    var_31_newRight.SourcesEstebanPintos_AVLNode2_height = t_80 + 1;
    var_31_newRight.setLeft(this.SourcesEstebanPintos_AVLNode2_left.SourcesEstebanPintos_AVLNode2_right);
    this.SourcesEstebanPintos_AVLNode2_left.setRight(var_31_newRight);
    this.SourcesEstebanPintos_AVLNode2_left.adjustHeight();

    return this.SourcesEstebanPintos_AVLNode2_left;
  }


  public SourcesEstebanPintos.AVLNode2 rotateLeft() {
    SourcesEstebanPintos.AVLNode2 t_81;
    int t_82;

    t_81 = new SourcesEstebanPintos.AVLNode2(this);
    SourcesEstebanPintos.AVLNode2 var_32_newLeft = t_81;

    t_82 = this.getLeftHeight();
    var_32_newLeft.SourcesEstebanPintos_AVLNode2_height = t_82 + 1;
    var_32_newLeft.setRight(this.SourcesEstebanPintos_AVLNode2_right.SourcesEstebanPintos_AVLNode2_left);
    this.SourcesEstebanPintos_AVLNode2_right.setLeft(var_32_newLeft);
    this.SourcesEstebanPintos_AVLNode2_right.adjustHeight();

    return this.SourcesEstebanPintos_AVLNode2_right;
  }


  public void adjustHeight() {
    int t_83;
    int t_84;
    boolean t_85;

    t_83 = this.getLeftHeight();
    int var_33_leftHeight = t_83;

    t_84 = this.getRightHeight();
    int var_34_rightHeight = t_84;

    t_85 = var_33_leftHeight  >  var_34_rightHeight;
    if (t_85) {
      {
        {
          {
            {
              {
                this.SourcesEstebanPintos_AVLNode2_height = var_33_leftHeight + 1;
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
                this.SourcesEstebanPintos_AVLNode2_height = var_34_rightHeight + 1;
              }
            }
          }
        }
      }
    }
  }


  public int getLeftHeight() {
    int t_86;
    boolean t_87;

    t_87 = this.SourcesEstebanPintos_AVLNode2_left  ==  null;
    if (t_87) {
      {
        t_86 = -1;
      }
    } else {
      {
        t_86 = this.SourcesEstebanPintos_AVLNode2_left.SourcesEstebanPintos_AVLNode2_height;
      }
    }

    return t_86;
  }


  public int getRightHeight() {
    int t_88;
    boolean t_89;

    t_89 = this.SourcesEstebanPintos_AVLNode2_right  ==  null;
    if (t_89) {
      {
        t_88 = -1;
      }
    } else {
      {
        t_88 = this.SourcesEstebanPintos_AVLNode2_right.SourcesEstebanPintos_AVLNode2_height;
      }
    }

    return t_88;
  }


  public boolean isLeaf() {
    boolean t_90;
    boolean t_91;
    boolean t_92;

    t_91 = this.SourcesEstebanPintos_AVLNode2_left  ==  null;
    if (t_91) {
      {
        {
          t_92 = this.SourcesEstebanPintos_AVLNode2_right  ==  null;
          if (t_92) {
            {
              t_90 = true;
            }
          } else {
            {
              t_90 = false;
            }
          }
        }
      }
    } else {
      {
        t_90 = false;
      }
    }

    return t_90;
  }


  public SourcesEstebanPintos.AVLNode2 getLeftmost() {
    SourcesEstebanPintos.AVLNode2 var_35_leftmost = this;
    boolean var_36_ws_8;

    var_36_ws_8 = var_35_leftmost.SourcesEstebanPintos_AVLNode2_left  !=  null;
    while (var_36_ws_8) {
      var_35_leftmost = var_35_leftmost.SourcesEstebanPintos_AVLNode2_left;
      var_36_ws_8 = var_35_leftmost.SourcesEstebanPintos_AVLNode2_left  !=  null;
    }

    return var_35_leftmost;
  }


  public SourcesEstebanPintos.AVLNode2 getRightmost() {
    SourcesEstebanPintos.AVLNode2 var_37_rightmost = this;
    boolean var_38_ws_9;

    var_38_ws_9 = var_37_rightmost.SourcesEstebanPintos_AVLNode2_right  !=  null;
    while (var_38_ws_9) {
      var_37_rightmost = var_37_rightmost.SourcesEstebanPintos_AVLNode2_right;
      var_38_ws_9 = var_37_rightmost.SourcesEstebanPintos_AVLNode2_right  !=  null;
    }

    return var_37_rightmost;
  }

}
