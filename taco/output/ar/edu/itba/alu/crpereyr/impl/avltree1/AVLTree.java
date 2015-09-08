package ar.edu.itba.alu.crpereyr.impl.avltree1;

//@ model import org.jmlspecs.lang.*;


public class AVLTree extends java.lang.Object {

  public /*@ nullable @*/ ar.edu.itba.alu.crpereyr.impl.avltree1.Node ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root;
  /*@ invariant (\forall ar.edu.itba.alu.crpereyr.impl.avltree1.Node x; \reach(this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root, ar.edu.itba.alu.crpereyr.impl.avltree1.Node, ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right + ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left).has(((java.lang.Object)(x))); (\reach(x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left, ar.edu.itba.alu.crpereyr.impl.avltree1.Node, ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left + ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right).has(((java.lang.Object)(x)))  ==  false) && (\reach(x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right, ar.edu.itba.alu.crpereyr.impl.avltree1.Node, ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left + ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right).has(((java.lang.Object)(x)))  ==  false));
    @*/
  /*@ invariant (\forall ar.edu.itba.alu.crpereyr.impl.avltree1.Node x; \reach(this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root, ar.edu.itba.alu.crpereyr.impl.avltree1.Node, ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right + ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left).has(((java.lang.Object)(x))); ((x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left  ==  null && x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right  ==  null) ==> x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height  ==  0) && ((x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left  ==  null && x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right  !=  null) ==> (x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height  ==  1 && x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height  ==  0)) && ((x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left  !=  null && x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right  ==  null) ==> (x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height  ==  1 && x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height  ==  0)) && ((x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left  !=  null && x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right  !=  null && x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height  >  x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height) ==> (x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height  ==  x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height + 1)) && ((x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left  !=  null && x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right  !=  null && x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height  <=  x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height) ==> (x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height  ==  x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height + 1)));
    @*/
  /*@ invariant (\forall ar.edu.itba.alu.crpereyr.impl.avltree1.Node x; \reach(this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root, ar.edu.itba.alu.crpereyr.impl.avltree1.Node, ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right + ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left).has(((java.lang.Object)(x))); (\forall ar.edu.itba.alu.crpereyr.impl.avltree1.Node y; \reach(x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left, ar.edu.itba.alu.crpereyr.impl.avltree1.Node, ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left + ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right).has(((java.lang.Object)(y)))  ==  true; y.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key  <  x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key) && (\forall ar.edu.itba.alu.crpereyr.impl.avltree1.Node y; \reach(x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right, ar.edu.itba.alu.crpereyr.impl.avltree1.Node, ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left + ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right).has(((java.lang.Object)(y)))  ==  true; x.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key  <  y.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key));
    @*/

  public AVLTree() {
    this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root = ((ar.edu.itba.alu.crpereyr.impl.avltree1.Node)(null));
    {
      this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root = ((ar.edu.itba.alu.crpereyr.impl.avltree1.Node)(null));
    }
  }


  private static final int height(ar.edu.itba.alu.crpereyr.impl.avltree1.Node tree) {
    ar.edu.itba.alu.crpereyr.impl.avltree1.Node param_tree_0;

    param_tree_0 = tree;
    {
      int t_1;
      boolean t_2;

      t_2 = param_tree_0  ==  null;
      if (t_2) {
        {
          t_1 = -1;
        }
      } else {
        {
          t_1 = tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height;
        }
      }

      return t_1;
    }
  }


  private static final int max(int a, int b) {
    int param_a_1;

    param_a_1 = a;
    int param_b_2;

    param_b_2 = b;
    {
      int t_3;
      boolean t_4;

      t_4 = param_a_1  >  param_b_2;
      if (t_4) {
        {
          t_3 = param_a_1;
        }
      } else {
        {
          t_3 = param_b_2;
        }
      }

      return t_3;
    }
  }


  private static ar.edu.itba.alu.crpereyr.impl.avltree1.Node rightRotate(ar.edu.itba.alu.crpereyr.impl.avltree1.Node tree) {
    ar.edu.itba.alu.crpereyr.impl.avltree1.Node param_tree_3;

    param_tree_3 = tree;
    {
      int t_5;
      int t_6;
      int t_7;
      int t_8;
      int t_9;
      int t_10;
      ar.edu.itba.alu.crpereyr.impl.avltree1.Node var_1_root = tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left;

      tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left = var_1_root.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right;
      var_1_root.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right = param_tree_3;
      t_5 = height(tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left);
      t_6 = height(tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right);
      t_7 = max(t_5, t_6);
      tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height = 1 + t_7;
      t_8 = height(var_1_root.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left);
      t_9 = height(var_1_root.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right);
      t_10 = max(t_8, t_9);
      var_1_root.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height = 1 + t_10;

      return var_1_root;
    }
  }


  private static ar.edu.itba.alu.crpereyr.impl.avltree1.Node leftRotate(ar.edu.itba.alu.crpereyr.impl.avltree1.Node tree) {
    ar.edu.itba.alu.crpereyr.impl.avltree1.Node param_tree_4;

    param_tree_4 = tree;
    {
      int t_11;
      int t_12;
      int t_13;
      int t_14;
      int t_15;
      int t_16;
      ar.edu.itba.alu.crpereyr.impl.avltree1.Node var_2_root = tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right;

      tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right = var_2_root.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left;
      var_2_root.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left = param_tree_4;
      t_11 = height(tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left);
      t_12 = height(tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right);
      t_13 = max(t_11, t_12);
      tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height = 1 + t_13;
      t_14 = height(var_2_root.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left);
      t_15 = height(var_2_root.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right);
      t_16 = max(t_14, t_15);
      var_2_root.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height = 1 + t_16;

      return var_2_root;
    }
  }


  private static ar.edu.itba.alu.crpereyr.impl.avltree1.Node rebalance(ar.edu.itba.alu.crpereyr.impl.avltree1.Node tree, ar.edu.itba.alu.crpereyr.impl.avltree1.CustomList path) {
    ar.edu.itba.alu.crpereyr.impl.avltree1.Node param_tree_5;

    param_tree_5 = tree;
    ar.edu.itba.alu.crpereyr.impl.avltree1.CustomList param_path_6;

    param_path_6 = path;
    {
      boolean t_17;
      boolean var_3_ws_1;

      t_17 = param_path_6.isEmpty();
      var_3_ws_1 = ! t_17;
      while (var_3_ws_1) {
        java.lang.Object t_18;
        ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_19;
        int t_20;
        int t_21;
        int t_22;
        boolean t_50;
        int t_51;
        int t_52;
        int t_53;
        boolean t_54;

        t_18 = param_path_6.pop();
        t_19 = (ar.edu.itba.alu.crpereyr.impl.avltree1.Node)t_18;
        ar.edu.itba.alu.crpereyr.impl.avltree1.Node var_4_dad = t_19;

        t_20 = height(var_4_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right);
        t_21 = height(var_4_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left);
        t_22 = t_20 - t_21;
        int var_5_balance = t_22;

        t_50 = var_5_balance  <  -1;

        if (t_50) {
          {
            {
              {
                {
                  {
                    int t_24;
                    int t_25;
                    boolean t_26;
                    ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_27;
                    boolean t_35;
                    ar.edu.itba.alu.crpereyr.impl.avltree1.Node var_6_oldDad = var_4_dad;

                    t_24 = height(var_4_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left);
                    t_25 = height(var_4_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right);
                    t_26 = t_24  <  t_25;

                    if (t_26) {
                      {
                        {
                          {
                            {
                              {
                                ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_23;

                                t_23 = leftRotate(var_4_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left);
                                var_4_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left = t_23;
                              }
                            }
                          }
                        }
                      }
                    }
                    t_27 = rightRotate(var_4_dad);
                    var_4_dad = t_27;
                    t_35 = param_path_6.isEmpty();
                    if (t_35) {
                      {
                        {
                          {
                            {
                              {
                                param_tree_5 = var_4_dad;
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
                                java.lang.Object t_32;
                                ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_33;
                                boolean t_34;

                                t_32 = param_path_6.peek();
                                t_33 = (ar.edu.itba.alu.crpereyr.impl.avltree1.Node)t_32;
                                t_34 = var_6_oldDad  ==  (t_33).ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right;
                                if (t_34) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            java.lang.Object t_28;
                                            ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_29;

                                            t_28 = param_path_6.peek();
                                            t_29 = (ar.edu.itba.alu.crpereyr.impl.avltree1.Node)t_28;
                                            (t_29).ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right = var_4_dad;
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
                                            java.lang.Object t_30;
                                            ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_31;

                                            t_30 = param_path_6.peek();
                                            t_31 = (ar.edu.itba.alu.crpereyr.impl.avltree1.Node)t_30;
                                            (t_31).ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left = var_4_dad;
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
                    boolean t_49;

                    t_49 = var_5_balance  >  1;
                    if (t_49) {
                      {
                        {
                          {
                            {
                              {
                                int t_37;
                                int t_38;
                                boolean t_39;
                                ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_40;
                                boolean t_48;
                                ar.edu.itba.alu.crpereyr.impl.avltree1.Node var_7_oldDad = var_4_dad;

                                t_37 = height(var_4_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left);
                                t_38 = height(var_4_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right);
                                t_39 = t_37  >  t_38;

                                if (t_39) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_36;

                                            t_36 = rightRotate(var_4_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right);
                                            var_4_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right = t_36;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                t_40 = leftRotate(var_4_dad);
                                var_4_dad = t_40;
                                t_48 = param_path_6.isEmpty();
                                if (t_48) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            param_tree_5 = var_4_dad;
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
                                            java.lang.Object t_45;
                                            ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_46;
                                            boolean t_47;

                                            t_45 = param_path_6.peek();
                                            t_46 = (ar.edu.itba.alu.crpereyr.impl.avltree1.Node)t_45;
                                            t_47 = var_7_oldDad  ==  (t_46).ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right;
                                            if (t_47) {
                                              {
                                                {
                                                  {
                                                    {
                                                      {
                                                        java.lang.Object t_41;
                                                        ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_42;

                                                        t_41 = param_path_6.peek();
                                                        t_42 = (ar.edu.itba.alu.crpereyr.impl.avltree1.Node)t_41;
                                                        (t_42).ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right = var_4_dad;
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
                                                        java.lang.Object t_43;
                                                        ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_44;

                                                        t_43 = param_path_6.peek();
                                                        t_44 = (ar.edu.itba.alu.crpereyr.impl.avltree1.Node)t_43;
                                                        (t_44).ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left = var_4_dad;
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
        t_51 = height(var_4_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left);
        t_52 = height(var_4_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right);
        t_53 = max(t_51, t_52);
        var_4_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_height = 1 + t_53;
        t_54 = param_path_6.isEmpty();
        var_3_ws_1 = ! t_54;
      }

      return tree;
    }
  }


  /*@ 
    @ ensures \reach(this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root, ar.edu.itba.alu.crpereyr.impl.avltree1.Node, ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right + ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left).int_size()  ==  \old(\reach(this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root, ar.edu.itba.alu.crpereyr.impl.avltree1.Node, ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right + ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left)).int_size() + 1;
    @ ensures (\exists ar.edu.itba.alu.crpereyr.impl.avltree1.Node n; \reach(this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root, ar.edu.itba.alu.crpereyr.impl.avltree1.Node, ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right + ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left).has(((java.lang.Object)(n)))  ==  true; n.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key  ==  key);
    @*/
  public void insert(int key, java.lang.Object val) {
    int param_key_7;

    param_key_7 = key;
    java.lang.Object param_val_8;

    param_val_8 = val;
    {
      boolean t_56;
      ar.edu.itba.alu.crpereyr.impl.avltree1.CustomList t_57;

      t_56 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root  ==  null;

      if (t_56) {
        {
          {
            {
              {
                {
                  ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_55;

                  t_55 = new ar.edu.itba.alu.crpereyr.impl.avltree1.Node(param_key_7, param_val_8);
                  this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root = t_55;

                  return;
                }
              }
            }
          }
        }
      }
      t_57 = new ar.edu.itba.alu.crpereyr.impl.avltree1.CustomList();
      ar.edu.itba.alu.crpereyr.impl.avltree1.CustomList var_8_path = t_57;
      ar.edu.itba.alu.crpereyr.impl.avltree1.Node var_9_dad = this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root;
      boolean var_10_ws_2;

      var_10_ws_2 = true;
      while (var_10_ws_2) {
        boolean t_58;
        boolean t_65;

        t_58 = param_key_7  ==  var_9_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key;

        if (t_58) {
          {
            {
              {
                {
                  {
                    var_9_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key = param_key_7;
                    var_9_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_val = param_val_8;

                    return;
                  }
                }
              }
            }
          }
        }
        var_8_path.push(((java.lang.Object)(var_9_dad)));
        t_65 = param_key_7  <  var_9_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key;

        if (t_65) {
          {
            {
              {
                {
                  {
                    boolean t_61;

                    t_61 = var_9_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left  ==  null;

                    if (t_61) {
                      {
                        {
                          {
                            {
                              {
                                ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_59;
                                ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_60;

                                t_59 = new ar.edu.itba.alu.crpereyr.impl.avltree1.Node(param_key_7, param_val_8);
                                var_9_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left = t_59;
                                t_60 = rebalance(this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root, var_8_path);
                                this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root = t_60;

                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                    var_9_dad = var_9_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left;
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
                    boolean t_64;

                    t_64 = var_9_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right  ==  null;

                    if (t_64) {
                      {
                        {
                          {
                            {
                              {
                                ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_62;
                                ar.edu.itba.alu.crpereyr.impl.avltree1.Node t_63;

                                t_62 = new ar.edu.itba.alu.crpereyr.impl.avltree1.Node(param_key_7, param_val_8);
                                var_9_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right = t_62;
                                t_63 = rebalance(this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root, var_8_path);
                                this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root = t_63;

                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                    var_9_dad = var_9_dad.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right;
                  }
                }
              }
            }
          }
        }
        var_10_ws_2 = true;
      }
    }
  }


  /*@ 
    @ ensures (\exists ar.edu.itba.alu.crpereyr.impl.avltree1.Node n; \reach(this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root, ar.edu.itba.alu.crpereyr.impl.avltree1.Node, ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right + ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left).has(((java.lang.Object)(n))); n.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key  ==  key) <==> \result  !=  null;
    @ signals (java.lang.Exception e) false;
    @*/
  public java.lang.Object search(int key) {
    int param_key_9;

    param_key_9 = key;
    {
      ar.edu.itba.alu.crpereyr.impl.avltree1.Node var_11_tree = this.ar_edu_itba_alu_crpereyr_impl_avltree1_AVLTree_root;
      boolean var_12_ws_3;

      var_12_ws_3 = var_11_tree  !=  null;
      while (var_12_ws_3) {
        boolean t_67;

        t_67 = param_key_9  ==  var_11_tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key;

        if (t_67) {
          {
            {
              {
                {
                  {
                    return var_11_tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_val;
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
                    boolean t_66;

                    t_66 = param_key_9  <  var_11_tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_key;
                    if (t_66) {
                      {
                        {
                          {
                            {
                              {
                                var_11_tree = var_11_tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_left;
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
                                var_11_tree = var_11_tree.ar_edu_itba_alu_crpereyr_impl_avltree1_Node_right;
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
        var_12_ws_3 = var_11_tree  !=  null;
      }

      return null;
    }
  }

}
