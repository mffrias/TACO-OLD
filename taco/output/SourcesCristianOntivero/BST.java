package SourcesCristianOntivero;

//@ model import org.jmlspecs.lang.*;


public class BST extends java.lang.Object {

  public /*@ nullable @*/ SourcesCristianOntivero.TreeNode SourcesCristianOntivero_BST_root;
  /*@ invariant (\forall SourcesCristianOntivero.TreeNode n; \reach(this.SourcesCristianOntivero_BST_root, SourcesCristianOntivero.TreeNode, SourcesCristianOntivero_TreeNode_right + SourcesCristianOntivero_TreeNode_left).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesCristianOntivero_TreeNode_right, SourcesCristianOntivero.TreeNode, SourcesCristianOntivero_TreeNode_left + SourcesCristianOntivero_TreeNode_right).has(((java.lang.Object)(n)))  ==  false && \reach(n.SourcesCristianOntivero_TreeNode_left, SourcesCristianOntivero.TreeNode, SourcesCristianOntivero_TreeNode_right + SourcesCristianOntivero_TreeNode_left).has(((java.lang.Object)(n)))  ==  false);
    @*/
  /*@ invariant (\forall SourcesCristianOntivero.TreeNode n; \reach(this.SourcesCristianOntivero_BST_root, SourcesCristianOntivero.TreeNode, SourcesCristianOntivero_TreeNode_right + SourcesCristianOntivero_TreeNode_left).has(((java.lang.Object)(n)))  ==  true; (\forall SourcesCristianOntivero.TreeNode m; \reach(n.SourcesCristianOntivero_TreeNode_left, SourcesCristianOntivero.TreeNode, SourcesCristianOntivero_TreeNode_right + SourcesCristianOntivero_TreeNode_left).has(((java.lang.Object)(m)))  ==  true; m.SourcesCristianOntivero_TreeNode_data  <=  n.SourcesCristianOntivero_TreeNode_data) && (\forall SourcesCristianOntivero.TreeNode m; \reach(n.SourcesCristianOntivero_TreeNode_right, SourcesCristianOntivero.TreeNode, SourcesCristianOntivero_TreeNode_right + SourcesCristianOntivero_TreeNode_left).has(((java.lang.Object)(m)))  ==  true; m.SourcesCristianOntivero_TreeNode_data  >  n.SourcesCristianOntivero_TreeNode_data));
    @*/

  public BST() {
    this.SourcesCristianOntivero_BST_root = ((SourcesCristianOntivero.TreeNode)(null));
    {
      this.SourcesCristianOntivero_BST_root = ((SourcesCristianOntivero.TreeNode)(null));
    }
  }


  public boolean isEmpty() {
    {
      boolean t_1;

      t_1 = this.SourcesCristianOntivero_BST_root  ==  null;

      return t_1;
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\exists SourcesCristianOntivero.TreeNode n; \reach(this.SourcesCristianOntivero_BST_root, SourcesCristianOntivero.TreeNode, SourcesCristianOntivero_TreeNode_right + SourcesCristianOntivero_TreeNode_left).has(((java.lang.Object)(n)))  ==  true; n.SourcesCristianOntivero_TreeNode_data  ==  data);
    @*/
  public int insert(int data) {
    int param_data_0;

    param_data_0 = data;
    {
      int var_1_data2 = 0;
      boolean var_2_dws_1;


      do {
        boolean t_2;

        t_2 = data  >  0;

        if (t_2) {
          {
            {
              {
                {
                  {
                    int var_3_a = 7;

                    var_3_a = 9;
                  }
                }
              }
            }
          }
        }
        var_2_dws_1 = data  >  0;
      }while (var_2_dws_1);

      return data;
    }
  }


  public SourcesCristianOntivero.TreeNode insertRec(SourcesCristianOntivero.TreeNode node, int data) {
    SourcesCristianOntivero.TreeNode param_node_1;

    param_node_1 = node;
    int param_data_2;

    param_data_2 = data;
    {
      boolean t_8;

      t_8 = param_node_1  ==  null;
      if (t_8) {
        {
          {
            {
              {
                {
                  SourcesCristianOntivero.TreeNode t_3;

                  t_3 = new SourcesCristianOntivero.TreeNode(param_data_2);
                  param_node_1 = t_3;
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
                  int t_6;
                  boolean t_7;

                  t_6 = param_node_1.getData();
                  t_7 = param_data_2  <=  t_6;
                  if (t_7) {
                    {
                      {
                        {
                          {
                            {
                              SourcesCristianOntivero.TreeNode t_4;

                              t_4 = this.insertRec(node.SourcesCristianOntivero_TreeNode_left, param_data_2);
                              node.SourcesCristianOntivero_TreeNode_left = t_4;
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
                              SourcesCristianOntivero.TreeNode t_5;

                              t_5 = this.insertRec(node.SourcesCristianOntivero_TreeNode_right, param_data_2);
                              node.SourcesCristianOntivero_TreeNode_right = t_5;
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

      return node;
    }
  }


  public void delete(int k) {
    int param_k_3;

    param_k_3 = k;
    {
      boolean t_10;
      boolean t_11;
      boolean t_12;
      boolean t_13;

      t_11 = this.isEmpty();
      t_12 = ! t_11;

      if (t_12) {
        {
          {
            t_13 = this.search(param_k_3);
            if (t_13) {
              {
                t_10 = true;
              }
            } else {
              {
                t_10 = false;
              }
            }
          }
        }
      } else {
        {
          t_10 = false;
        }
      }
      if (t_10) {
        {
          {
            {
              {
                {
                  SourcesCristianOntivero.TreeNode t_9;

                  t_9 = this.deleteRec(this.SourcesCristianOntivero_BST_root, param_k_3);
                  this.SourcesCristianOntivero_BST_root = t_9;
                }
              }
            }
          }
        }
      }
    }
  }


  private SourcesCristianOntivero.TreeNode deleteRec(SourcesCristianOntivero.TreeNode root, int k) {
    SourcesCristianOntivero.TreeNode param_root_4;

    param_root_4 = root;
    int param_k_5;

    param_k_5 = k;
    {
      int t_24;
      boolean t_25;
      int t_30;
      boolean t_31;
      SourcesCristianOntivero.TreeNode var_4_p, var_5_p2, var_6_n;

      t_24 = param_root_4.getData();
      t_25 = t_24  ==  param_k_5;

      if (t_25) {
        {
          {
            {
              {
                {
                  SourcesCristianOntivero.TreeNode t_14;
                  SourcesCristianOntivero.TreeNode t_15;
                  boolean t_21;
                  boolean t_22;
                  boolean t_23;
                  SourcesCristianOntivero.TreeNode var_7_lt, var_8_rt;

                  t_14 = param_root_4.getLeft();
                  var_7_lt = t_14;
                  t_15 = param_root_4.getRight();
                  var_8_rt = t_15;
                  t_22 = var_7_lt  ==  null;

                  if (t_22) {
                    {
                      {
                        t_23 = var_8_rt  ==  null;
                        if (t_23) {
                          {
                            t_21 = true;
                          }
                        } else {
                          {
                            t_21 = false;
                          }
                        }
                      }
                    }
                  } else {
                    {
                      t_21 = false;
                    }
                  }
                  if (t_21) {
                    {
                      {
                        {
                          {
                            {
                              return ((SourcesCristianOntivero.TreeNode)(null));
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
                              boolean t_20;

                              t_20 = var_7_lt  ==  null;
                              if (t_20) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          var_4_p = var_8_rt;

                                          return var_4_p;
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
                                          boolean t_19;

                                          t_19 = var_8_rt  ==  null;
                                          if (t_19) {
                                            {
                                              {
                                                {
                                                  {
                                                    {
                                                      var_4_p = var_7_lt;

                                                      return var_4_p;
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
                                                      SourcesCristianOntivero.TreeNode t_16;

                                                      var_5_p2 = var_8_rt;
                                                      var_4_p = var_8_rt;
                                                      boolean var_9_ws_1;

                                                      t_16 = var_4_p.getLeft();
                                                      var_9_ws_1 = t_16  !=  null;
                                                      while (var_9_ws_1) {
                                                        SourcesCristianOntivero.TreeNode t_17;
                                                        SourcesCristianOntivero.TreeNode t_18;

                                                        t_17 = var_4_p.getLeft();
                                                        var_4_p = t_17;
                                                        t_18 = var_4_p.getLeft();
                                                        var_9_ws_1 = t_18  !=  null;
                                                      }
                                                      var_4_p.setLeft(var_7_lt);

                                                      return var_5_p2;
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
      t_30 = param_root_4.getData();
      t_31 = param_k_5  <  t_30;
      if (t_31) {
        {
          {
            {
              {
                {
                  SourcesCristianOntivero.TreeNode t_26;
                  SourcesCristianOntivero.TreeNode t_27;

                  t_26 = param_root_4.getLeft();
                  t_27 = this.deleteRec(t_26, param_k_5);
                  var_6_n = t_27;
                  param_root_4.setLeft(var_6_n);
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
                  SourcesCristianOntivero.TreeNode t_28;
                  SourcesCristianOntivero.TreeNode t_29;

                  t_28 = param_root_4.getRight();
                  t_29 = this.deleteRec(t_28, param_k_5);
                  var_6_n = t_29;
                  param_root_4.setRight(var_6_n);
                }
              }
            }
          }
        }
      }

      return root;
    }
  }


  public boolean search(int val) {
    int param_val_6;

    param_val_6 = val;
    {
      boolean t_32;

      t_32 = this.searchRec(this.SourcesCristianOntivero_BST_root, param_val_6);

      return t_32;
    }
  }


  private boolean searchRec(SourcesCristianOntivero.TreeNode r, int val) {
    SourcesCristianOntivero.TreeNode param_r_7;

    param_r_7 = r;
    int param_val_8;

    param_val_8 = val;
    {
      boolean t_33;
      boolean t_34;
      boolean t_35;
      boolean var_10_found = false;
      boolean var_11_ws_2;

      t_34 = param_r_7  !=  null;

      if (t_34) {
        {
          {
            t_35 = ! var_10_found;
            if (t_35) {
              {
                t_33 = true;
              }
            } else {
              {
                t_33 = false;
              }
            }
          }
        }
      } else {
        {
          t_33 = false;
        }
      }
      var_11_ws_2 = t_33;
      while (var_11_ws_2) {
        int t_36;
        boolean t_40;
        boolean t_41;
        boolean t_42;
        boolean t_43;
        boolean t_44;

        t_36 = param_r_7.getData();
        int var_12_rval = t_36;

        t_40 = param_val_8  <  var_12_rval;

        if (t_40) {
          {
            {
              {
                {
                  {
                    SourcesCristianOntivero.TreeNode t_37;

                    t_37 = param_r_7.getLeft();
                    param_r_7 = t_37;
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
                    boolean t_39;

                    t_39 = param_val_8  >  var_12_rval;
                    if (t_39) {
                      {
                        {
                          {
                            {
                              {
                                SourcesCristianOntivero.TreeNode t_38;

                                t_38 = param_r_7.getRight();
                                param_r_7 = t_38;
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
                                return true;
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
        t_41 = this.searchRec(param_r_7, param_val_8);
        var_10_found = t_41;
        t_43 = param_r_7  !=  null;

        if (t_43) {
          {
            {
              t_44 = ! var_10_found;
              if (t_44) {
                {
                  t_42 = true;
                }
              } else {
                {
                  t_42 = false;
                }
              }
            }
          }
        } else {
          {
            t_42 = false;
          }
        }
        var_11_ws_2 = t_42;
      }

      return var_10_found;
    }
  }

}
