package ejercicios;

//@ model import org.jmlspecs.lang.*;


public class AVLTree extends java.lang.Object {

  public /*@ nullable @*/ ejercicios.AVLNode ejercicios_AVLTree_root;
  /*@ invariant (\forall ejercicios.AVLNode n; \reach(this.ejercicios_AVLTree_root, ejercicios.AVLNode, ejercicios_AVLNode_right + ejercicios_AVLNode_left).has(((java.lang.Object)(n)))  ==  true; \reach(n.ejercicios_AVLNode_right, ejercicios.AVLNode, ejercicios_AVLNode_left + ejercicios_AVLNode_right).has(((java.lang.Object)(n)))  ==  false && \reach(n.ejercicios_AVLNode_left, ejercicios.AVLNode, ejercicios_AVLNode_right + ejercicios_AVLNode_left).has(((java.lang.Object)(n)))  ==  false);
    @*/
  /*@ invariant (\forall ejercicios.AVLNode n; \reach(this.ejercicios_AVLTree_root, ejercicios.AVLNode, ejercicios_AVLNode_right + ejercicios_AVLNode_left).has(((java.lang.Object)(n)))  ==  true; (n.ejercicios_AVLNode_right  !=  null ==> n.ejercicios_AVLNode_right.ejercicios_AVLNode_value  >  n.ejercicios_AVLNode_value) && (n.ejercicios_AVLNode_left  !=  null ==> n.ejercicios_AVLNode_left.ejercicios_AVLNode_value  <=  n.ejercicios_AVLNode_value));
    @*/

  public AVLTree() {
    this.ejercicios_AVLTree_root = ((ejercicios.AVLNode)(null));
    {
      this.ejercicios_AVLTree_root = ((ejercicios.AVLNode)(null));
    }
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @*/
  public ejercicios.AVLNode find(int value) {
    int t_1;
    boolean t_2;
    boolean t_3;
    boolean t_4;
    ejercicios.AVLNode var_1_current = this.ejercicios_AVLTree_root;

    t_1 = var_1_current.ejercicios_AVLNode_value - value;
    int var_2_comparison = t_1;
    boolean var_3_ws_1;

    t_3 = var_1_current  !=  null;
    t_4 = var_2_comparison  !=  0;

    if (t_3) {
      {
        if (t_4) {
          {
            t_2 = true;
          }
        } else {
          {
            t_2 = false;
          }
        }
      }
    } else {
      {
        t_2 = false;
      }
    }
    var_3_ws_1 = t_2;
    while (var_3_ws_1) {
      boolean t_5;
      boolean t_6;
      boolean t_7;
      boolean t_8;

      var_2_comparison = var_1_current.ejercicios_AVLNode_value - value;
      t_5 = var_2_comparison  <  0;

      if (t_5) {
        {
          {
            {
              {
                {
                  var_1_current = var_1_current.ejercicios_AVLNode_right;
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
                  var_1_current = var_1_current.ejercicios_AVLNode_left;
                }
              }
            }
          }
        }
      }
      t_7 = var_1_current  !=  null;
      t_8 = var_2_comparison  !=  0;

      if (t_7) {
        {
          if (t_8) {
            {
              t_6 = true;
            }
          } else {
            {
              t_6 = false;
            }
          }
        }
      } else {
        {
          t_6 = false;
        }
      }
      var_3_ws_1 = t_6;
    }

    return var_1_current;
  }


  /*@ 
    @ requires true;
    @ ensures (\forall ejercicios.AVLNode n; \old(\reach(this.ejercicios_AVLTree_root, ejercicios.AVLNode, ejercicios_AVLNode_left + ejercicios_AVLNode_right)).has(((java.lang.Object)(n)))  ==  true; \reach(this.ejercicios_AVLTree_root, ejercicios.AVLNode, ejercicios_AVLNode_left + ejercicios_AVLNode_right).has(((java.lang.Object)(n)))  ==  true);
    @ ensures (\exists ejercicios.AVLNode n; ; n.ejercicios_AVLNode_value  ==  value && \reach(this.ejercicios_AVLTree_root, ejercicios.AVLNode, ejercicios_AVLNode_right + ejercicios_AVLNode_left).has(((java.lang.Object)(n)))  ==  true);
    @ ensures \old(\reach(this.ejercicios_AVLTree_root, ejercicios.AVLNode, ejercicios_AVLNode_left + ejercicios_AVLNode_right)).int_size() + 1  ==  \reach(this.ejercicios_AVLTree_root, ejercicios.AVLNode, ejercicios_AVLNode_left + ejercicios_AVLNode_right).int_size();
    @*/
  public void insert(int value) {
    boolean t_10;
    ejercicios.AVLNode t_12;
    boolean t_13;
    boolean t_14;
    boolean t_15;
    ejercicios.AVLNode var_4_current = this.ejercicios_AVLTree_root, var_5_parent = ((ejercicios.AVLNode)(null)), var_6_nodeToInsert = ((ejercicios.AVLNode)(null));
    int var_7_comparison;

    t_10 = this.ejercicios_AVLTree_root  ==  null;

    if (t_10) {
      {
        {
          {
            {
              {
                ejercicios.AVLNode t_9;

                t_9 = new ejercicios.AVLNode(value, var_5_parent);
                this.ejercicios_AVLTree_root = t_9;

                return;
              }
            }
          }
        }
      }
    }
    boolean var_8_ws_2;

    var_8_ws_2 = var_4_current  !=  null;
    while (var_8_ws_2) {
      boolean t_11;

      var_7_comparison = var_4_current.ejercicios_AVLNode_value - value;
      var_5_parent = var_4_current;
      t_11 = var_7_comparison  <  0;

      if (t_11) {
        {
          {
            {
              {
                {
                  var_4_current = var_4_current.ejercicios_AVLNode_right;
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
                  var_4_current = var_4_current.ejercicios_AVLNode_left;
                }
              }
            }
          }
        }
      }
      var_8_ws_2 = var_4_current  !=  null;
    }
    t_12 = new ejercicios.AVLNode(value, var_5_parent);
    var_6_nodeToInsert = t_12;
    t_13 = var_5_parent.ejercicios_AVLNode_value  <  value;

    if (t_13) {
      {
        {
          {
            {
              {
                var_5_parent.ejercicios_AVLNode_right = var_6_nodeToInsert;
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
                var_5_parent.ejercicios_AVLNode_left = var_6_nodeToInsert;
              }
            }
          }
        }
      }
    }
    int var_9_balanceFactor;
    ejercicios.AVLNode var_10_child;
    boolean var_11_flag = true;
    boolean var_12_ws_3;

    t_15 = var_5_parent  !=  null;

    if (t_15) {
      {
        if (var_11_flag) {
          {
            t_14 = true;
          }
        } else {
          {
            t_14 = false;
          }
        }
      }
    } else {
      {
        t_14 = false;
      }
    }
    var_12_ws_3 = t_14;
    while (var_12_ws_3) {
      int t_16;
      int t_17;
      boolean t_27;
      boolean t_28;
      boolean t_29;

      t_16 = height(var_5_parent.ejercicios_AVLNode_left);
      t_17 = height(var_5_parent.ejercicios_AVLNode_right);
      var_9_balanceFactor = t_16 - t_17;
      t_27 = var_9_balanceFactor  ==  2;

      if (t_27) {
        {
          {
            {
              {
                {
                  int t_18;
                  int t_19;
                  int t_20;
                  boolean t_21;

                  var_10_child = var_5_parent.ejercicios_AVLNode_left;
                  t_18 = height(var_10_child.ejercicios_AVLNode_left);
                  t_19 = height(var_10_child.ejercicios_AVLNode_right);
                  t_20 = t_18 - t_19;
                  t_21 = t_20  ==  -1;

                  if (t_21) {
                    {
                      {
                        {
                          {
                            {
                              this.rotateLeft(var_10_child);
                            }
                          }
                        }
                      }
                    }
                  }
                  this.rotateRight(var_5_parent);
                  var_11_flag = false;
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
                  boolean t_26;

                  t_26 = var_9_balanceFactor  ==  -2;
                  if (t_26) {
                    {
                      {
                        {
                          {
                            {
                              int t_22;
                              int t_23;
                              int t_24;
                              boolean t_25;

                              var_10_child = var_5_parent.ejercicios_AVLNode_right;
                              t_22 = height(var_10_child.ejercicios_AVLNode_left);
                              t_23 = height(var_10_child.ejercicios_AVLNode_right);
                              t_24 = t_22 - t_23;
                              t_25 = t_24  ==  1;

                              if (t_25) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          this.rotateRight(var_10_child);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              this.rotateLeft(var_5_parent);
                              var_11_flag = false;
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
      var_5_parent = var_5_parent.ejercicios_AVLNode_parent;
      t_29 = var_5_parent  !=  null;

      if (t_29) {
        {
          if (var_11_flag) {
            {
              t_28 = true;
            }
          } else {
            {
              t_28 = false;
            }
          }
        }
      } else {
        {
          t_28 = false;
        }
      }
      var_12_ws_3 = t_28;
    }
  }


  public static int max(int i1, int i2) {
    boolean t_30;

    t_30 = i1  >=  i2;
    if (t_30) {
      {
        {
          {
            {
              {
                return i1;
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
                return i2;
              }
            }
          }
        }
      }
    }
  }


  public static int height(ejercicios.AVLNode node) {
    boolean t_31;
    int t_32;
    int t_33;
    int t_34;
    int t_35;

    t_31 = node  ==  null;

    if (t_31) {
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
    }
    t_32 = height(node.ejercicios_AVLNode_right);
    t_33 = height(node.ejercicios_AVLNode_left);
    t_34 = max(t_32, t_33);
    t_35 = 1 + t_34;

    return t_35;
  }


  public void rotateRight(ejercicios.AVLNode node) {
    boolean t_37;
    ejercicios.AVLNode var_13_newRoot = node.ejercicios_AVLNode_left;

    node.ejercicios_AVLNode_left = var_13_newRoot.ejercicios_AVLNode_right;
    var_13_newRoot.ejercicios_AVLNode_right = node;
    t_37 = node.ejercicios_AVLNode_parent  ==  null;

    if (t_37) {
      {
        {
          {
            {
              {
                var_13_newRoot.ejercicios_AVLNode_parent = ((ejercicios.AVLNode)(null));
                this.ejercicios_AVLTree_root = var_13_newRoot;
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
                boolean t_36;

                t_36 = node.ejercicios_AVLNode_parent.ejercicios_AVLNode_left.ejercicios_AVLNode_value  ==  node.ejercicios_AVLNode_value;
                if (t_36) {
                  {
                    {
                      {
                        {
                          {
                            node.ejercicios_AVLNode_parent.ejercicios_AVLNode_left = var_13_newRoot;
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
                            node.ejercicios_AVLNode_parent.ejercicios_AVLNode_right = var_13_newRoot;
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
    var_13_newRoot.ejercicios_AVLNode_parent = node.ejercicios_AVLNode_parent;
    node.ejercicios_AVLNode_parent = var_13_newRoot;
  }


  public void rotateLeft(ejercicios.AVLNode node) {
    boolean t_39;
    ejercicios.AVLNode var_14_newRoot = node.ejercicios_AVLNode_right;

    node.ejercicios_AVLNode_right = var_14_newRoot.ejercicios_AVLNode_left;
    var_14_newRoot.ejercicios_AVLNode_left = node;
    t_39 = node.ejercicios_AVLNode_parent  ==  null;

    if (t_39) {
      {
        {
          {
            {
              {
                var_14_newRoot.ejercicios_AVLNode_parent = ((ejercicios.AVLNode)(null));
                this.ejercicios_AVLTree_root = var_14_newRoot;
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
                boolean t_38;

                t_38 = node.ejercicios_AVLNode_parent.ejercicios_AVLNode_left.ejercicios_AVLNode_value  ==  node.ejercicios_AVLNode_value;
                if (t_38) {
                  {
                    {
                      {
                        {
                          {
                            node.ejercicios_AVLNode_parent.ejercicios_AVLNode_left = var_14_newRoot;
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
                            node.ejercicios_AVLNode_parent.ejercicios_AVLNode_right = var_14_newRoot;
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
    var_14_newRoot.ejercicios_AVLNode_parent = node.ejercicios_AVLNode_parent;
    node.ejercicios_AVLNode_parent = var_14_newRoot;
  }

}
