package SourcesEstebanPintos;

//@ model import org.jmlspecs.lang.*;


public class AVLSymbolTable extends java.lang.Object {

  public SourcesEstebanPintos.Node SourcesEstebanPintos_AVLSymbolTable_root;
  /*@ invariant (\forall SourcesEstebanPintos.Node n; \reach(this.SourcesEstebanPintos_AVLSymbolTable_root, SourcesEstebanPintos.Node, SourcesEstebanPintos_Node_left + SourcesEstebanPintos_Node_right).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesEstebanPintos_Node_left, SourcesEstebanPintos.Node, SourcesEstebanPintos_Node_right + SourcesEstebanPintos_Node_left).has(((java.lang.Object)(n)))  ==  false && \reach(n.SourcesEstebanPintos_Node_right, SourcesEstebanPintos.Node, SourcesEstebanPintos_Node_right + SourcesEstebanPintos_Node_left).has(((java.lang.Object)(n)))  ==  false && ((n.SourcesEstebanPintos_Node_left  !=  null && n.SourcesEstebanPintos_Node_right  ==  null) ==> n.SourcesEstebanPintos_Node_height  <  2) && ((n.SourcesEstebanPintos_Node_right  !=  null && n.SourcesEstebanPintos_Node_left  ==  null) ==> n.SourcesEstebanPintos_Node_height  <  2) && ((n.SourcesEstebanPintos_Node_right  ==  null && n.SourcesEstebanPintos_Node_left  ==  null) ==> n.SourcesEstebanPintos_Node_height  ==  0) && (\forall SourcesEstebanPintos.Node nLeft; ; (\reach(n.SourcesEstebanPintos_Node_left, SourcesEstebanPintos.Node, SourcesEstebanPintos_Node_right + SourcesEstebanPintos_Node_left).has(((java.lang.Object)(nLeft)))  ==  true ==> (nLeft.SourcesEstebanPintos_Node_key  <  n.SourcesEstebanPintos_Node_key))) && (\forall SourcesEstebanPintos.Node nRight; ; (\reach(n.SourcesEstebanPintos_Node_right, SourcesEstebanPintos.Node, SourcesEstebanPintos_Node_right + SourcesEstebanPintos_Node_left).has(((java.lang.Object)(nRight)))  ==  true ==> (nRight.SourcesEstebanPintos_Node_key  >=  n.SourcesEstebanPintos_Node_key))));
    @*/

  public AVLSymbolTable() {
    {
      this.SourcesEstebanPintos_AVLSymbolTable_root = ((SourcesEstebanPintos.Node)(null));
    }
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  public void insert(int key) {
    int param_key_0;

    param_key_0 = key;
    {
      boolean var_1_ws_1;

      var_1_ws_1 = this.SourcesEstebanPintos_AVLSymbolTable_root  !=  null;
      while (var_1_ws_1) {
        int var_2_j = 0;


        break;
      }
    }
  }


  /*@ 
    @ requires true;
    @ ensures \result  ==  true <==> (\exists SourcesEstebanPintos.Node n; n.SourcesEstebanPintos_Node_key  ==  key; \reach(this.SourcesEstebanPintos_AVLSymbolTable_root, SourcesEstebanPintos.Node, SourcesEstebanPintos_Node_right + SourcesEstebanPintos_Node_left).has(((java.lang.Object)(n)))  ==  true);
    @ signals (java.lang.Exception e) false;
    @*/
  public boolean search(int key) {
    int param_key_1;

    param_key_1 = key;
    {
      SourcesEstebanPintos.Node var_3_tree = this.SourcesEstebanPintos_AVLSymbolTable_root;
      boolean var_4_ws_2;

      var_4_ws_2 = var_3_tree  !=  null;
      while (var_4_ws_2) {
        boolean t_2;

        t_2 = param_key_1  ==  var_3_tree.SourcesEstebanPintos_Node_key;

        if (t_2) {
          {
            {
              {
                {
                  {
                    return true;
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
                    boolean t_1;

                    t_1 = param_key_1  <  var_3_tree.SourcesEstebanPintos_Node_key;
                    if (t_1) {
                      {
                        {
                          {
                            {
                              {
                                var_3_tree = var_3_tree.SourcesEstebanPintos_Node_left;
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
                                var_3_tree = var_3_tree.SourcesEstebanPintos_Node_right;
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
        var_4_ws_2 = var_3_tree  !=  null;
      }

      return false;
    }
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  public int height(SourcesEstebanPintos.Node tree) {
    SourcesEstebanPintos.Node param_tree_2;

    param_tree_2 = tree;
    {
      boolean t_3;

      t_3 = param_tree_2  ==  null;
      if (t_3) {
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
                  return tree.SourcesEstebanPintos_Node_height;
                }
              }
            }
          }
        }
      }
    }
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  public int max(int a, int b) {
    int param_a_3;

    param_a_3 = a;
    int param_b_4;

    param_b_4 = b;
    {
      boolean t_4;

      t_4 = param_a_3  >  param_b_4;
      if (t_4) {
        {
          {
            {
              {
                {
                  return a;
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
                  return b;
                }
              }
            }
          }
        }
      }
    }
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  public SourcesEstebanPintos.Node rightRotate(SourcesEstebanPintos.Node tree) {
    SourcesEstebanPintos.Node param_tree_5;

    param_tree_5 = tree;
    {
      int t_5;
      int t_6;
      int t_7;
      int t_8;
      int t_9;
      int t_10;
      SourcesEstebanPintos.Node var_5_root = tree.SourcesEstebanPintos_Node_left;

      tree.SourcesEstebanPintos_Node_left = var_5_root.SourcesEstebanPintos_Node_right;
      var_5_root.SourcesEstebanPintos_Node_right = param_tree_5;
      t_5 = this.height(tree.SourcesEstebanPintos_Node_left);
      t_6 = this.height(tree.SourcesEstebanPintos_Node_right);
      t_7 = this.max(t_5, t_6);
      tree.SourcesEstebanPintos_Node_height = 1 + t_7;
      t_8 = this.height(var_5_root.SourcesEstebanPintos_Node_left);
      t_9 = this.height(var_5_root.SourcesEstebanPintos_Node_right);
      t_10 = this.max(t_8, t_9);
      var_5_root.SourcesEstebanPintos_Node_height = 1 + t_10;

      return var_5_root;
    }
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  public SourcesEstebanPintos.Node leftRotate(SourcesEstebanPintos.Node tree) {
    SourcesEstebanPintos.Node param_tree_6;

    param_tree_6 = tree;
    {
      int t_11;
      int t_12;
      int t_13;
      int t_14;
      int t_15;
      int t_16;
      SourcesEstebanPintos.Node var_6_root = tree.SourcesEstebanPintos_Node_right;

      tree.SourcesEstebanPintos_Node_right = var_6_root.SourcesEstebanPintos_Node_left;
      var_6_root.SourcesEstebanPintos_Node_left = param_tree_6;
      t_11 = this.height(tree.SourcesEstebanPintos_Node_left);
      t_12 = this.height(tree.SourcesEstebanPintos_Node_right);
      t_13 = this.max(t_11, t_12);
      tree.SourcesEstebanPintos_Node_height = 1 + t_13;
      t_14 = this.height(var_6_root.SourcesEstebanPintos_Node_left);
      t_15 = this.height(var_6_root.SourcesEstebanPintos_Node_right);
      t_16 = this.max(t_14, t_15);
      var_6_root.SourcesEstebanPintos_Node_height = 1 + t_16;

      return var_6_root;
    }
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  public SourcesEstebanPintos.Node rebalance(SourcesEstebanPintos.Node tree, SourcesEstebanPintos.AVLStack2 path) {
    SourcesEstebanPintos.Node param_tree_7;

    param_tree_7 = tree;
    SourcesEstebanPintos.AVLStack2 param_path_8;

    param_path_8 = path;
    {
      boolean t_17;
      SourcesEstebanPintos.Node var_7_aux = param_tree_7;
      boolean var_8_ws_3;

      t_17 = param_path_8.empty();
      var_8_ws_3 = ! t_17;
      while (var_8_ws_3) {
        SourcesEstebanPintos.Node t_18;
        int t_19;
        int t_20;
        int t_21;
        boolean t_43;
        int t_44;
        int t_45;
        int t_46;
        boolean t_47;

        t_18 = param_path_8.pop();
        SourcesEstebanPintos.Node var_9_dad = t_18;

        t_19 = this.height(var_9_dad.SourcesEstebanPintos_Node_right);
        t_20 = this.height(var_9_dad.SourcesEstebanPintos_Node_left);
        t_21 = t_19 - t_20;
        int var_10_balance = t_21;

        t_43 = var_10_balance  <  -1;

        if (t_43) {
          {
            {
              {
                {
                  {
                    int t_23;
                    int t_24;
                    boolean t_25;
                    SourcesEstebanPintos.Node t_26;
                    boolean t_31;
                    SourcesEstebanPintos.Node var_11_oldDad = var_9_dad;

                    t_23 = this.height(var_9_dad.SourcesEstebanPintos_Node_left.SourcesEstebanPintos_Node_left);
                    t_24 = this.height(var_9_dad.SourcesEstebanPintos_Node_left.SourcesEstebanPintos_Node_right);
                    t_25 = t_23  <  t_24;

                    if (t_25) {
                      {
                        {
                          {
                            {
                              {
                                SourcesEstebanPintos.Node t_22;

                                t_22 = this.leftRotate(var_9_dad.SourcesEstebanPintos_Node_left);
                                var_9_dad.SourcesEstebanPintos_Node_left = t_22;
                              }
                            }
                          }
                        }
                      }
                    }
                    t_26 = this.rightRotate(var_9_dad);
                    var_9_dad = t_26;
                    t_31 = param_path_8.empty();
                    if (t_31) {
                      {
                        {
                          {
                            {
                              {
                                var_7_aux = var_9_dad;
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
                                SourcesEstebanPintos.Node t_29;
                                boolean t_30;

                                t_29 = param_path_8.peek();
                                t_30 = var_11_oldDad  ==  t_29.SourcesEstebanPintos_Node_right;
                                if (t_30) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            SourcesEstebanPintos.Node t_27;

                                            t_27 = param_path_8.peek();
                                            t_27.SourcesEstebanPintos_Node_right = var_9_dad;
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
                                            SourcesEstebanPintos.Node t_28;

                                            t_28 = param_path_8.peek();
                                            t_28.SourcesEstebanPintos_Node_left = var_9_dad;
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
        } else {
          {
            {
              {
                {
                  {
                    boolean t_42;

                    t_42 = var_10_balance  >  1;
                    if (t_42) {
                      {
                        {
                          {
                            {
                              {
                                int t_33;
                                int t_34;
                                boolean t_35;
                                SourcesEstebanPintos.Node t_36;
                                boolean t_41;
                                SourcesEstebanPintos.Node var_12_oldDad = var_9_dad;

                                t_33 = this.height(var_9_dad.SourcesEstebanPintos_Node_right.SourcesEstebanPintos_Node_left);
                                t_34 = this.height(var_9_dad.SourcesEstebanPintos_Node_right.SourcesEstebanPintos_Node_right);
                                t_35 = t_33  >  t_34;

                                if (t_35) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            SourcesEstebanPintos.Node t_32;

                                            t_32 = this.rightRotate(var_9_dad.SourcesEstebanPintos_Node_right);
                                            var_9_dad.SourcesEstebanPintos_Node_right = t_32;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                t_36 = this.leftRotate(var_9_dad);
                                var_9_dad = t_36;
                                t_41 = param_path_8.empty();
                                if (t_41) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            var_7_aux = var_9_dad;
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
                                            SourcesEstebanPintos.Node t_39;
                                            boolean t_40;

                                            t_39 = param_path_8.peek();
                                            t_40 = var_12_oldDad  ==  t_39.SourcesEstebanPintos_Node_right;
                                            if (t_40) {
                                              {
                                                {
                                                  {
                                                    {
                                                      {
                                                        SourcesEstebanPintos.Node t_37;

                                                        t_37 = param_path_8.peek();
                                                        t_37.SourcesEstebanPintos_Node_right = var_9_dad;
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
                                                        SourcesEstebanPintos.Node t_38;

                                                        t_38 = param_path_8.peek();
                                                        t_38.SourcesEstebanPintos_Node_left = var_9_dad;
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
              }
            }
          }
        }
        t_44 = this.height(var_9_dad.SourcesEstebanPintos_Node_left);
        t_45 = this.height(var_9_dad.SourcesEstebanPintos_Node_right);
        t_46 = this.max(t_44, t_45);
        var_9_dad.SourcesEstebanPintos_Node_height = 1 + t_46;
        t_47 = param_path_8.empty();
        var_8_ws_3 = ! t_47;
      }

      return var_7_aux;
    }
  }

}
