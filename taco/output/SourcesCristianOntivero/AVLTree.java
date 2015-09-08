package SourcesCristianOntivero;

//@ model import org.jmlspecs.lang.*;


public class AVLTree extends java.lang.Object {

  public /*@ nullable @*/ SourcesCristianOntivero.AVLNode SourcesCristianOntivero_AVLTree_root;
  /*@ invariant (\forall SourcesCristianOntivero.AVLNode n; \reach(this.SourcesCristianOntivero_AVLTree_root, SourcesCristianOntivero.AVLNode, SourcesCristianOntivero_AVLNode_right + SourcesCristianOntivero_AVLNode_left).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesCristianOntivero_AVLNode_right, SourcesCristianOntivero.AVLNode, SourcesCristianOntivero_AVLNode_left + SourcesCristianOntivero_AVLNode_right).has(((java.lang.Object)(n)))  ==  false && \reach(n.SourcesCristianOntivero_AVLNode_left, SourcesCristianOntivero.AVLNode, SourcesCristianOntivero_AVLNode_right + SourcesCristianOntivero_AVLNode_left).has(((java.lang.Object)(n)))  ==  false);
    @*/
  /*@ invariant (\forall SourcesCristianOntivero.AVLNode n; \reach(this.SourcesCristianOntivero_AVLTree_root, SourcesCristianOntivero.AVLNode, SourcesCristianOntivero_AVLNode_right + SourcesCristianOntivero_AVLNode_left).has(((java.lang.Object)(n)))  ==  true; (\forall SourcesCristianOntivero.AVLNode m; \reach(n.SourcesCristianOntivero_AVLNode_left, SourcesCristianOntivero.AVLNode, SourcesCristianOntivero_AVLNode_right + SourcesCristianOntivero_AVLNode_left).has(((java.lang.Object)(m)))  ==  true; m.SourcesCristianOntivero_AVLNode_value  <=  n.SourcesCristianOntivero_AVLNode_value) && (\forall SourcesCristianOntivero.AVLNode m; \reach(n.SourcesCristianOntivero_AVLNode_right, SourcesCristianOntivero.AVLNode, SourcesCristianOntivero_AVLNode_right + SourcesCristianOntivero_AVLNode_left).has(((java.lang.Object)(m)))  ==  true; m.SourcesCristianOntivero_AVLNode_value  >  n.SourcesCristianOntivero_AVLNode_value));
    @*/

  public AVLTree() {
    this.SourcesCristianOntivero_AVLTree_root = ((SourcesCristianOntivero.AVLNode)(null));
    {
      this.SourcesCristianOntivero_AVLTree_root = ((SourcesCristianOntivero.AVLNode)(null));
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\exists SourcesCristianOntivero.AVLNode n; true; n.SourcesCristianOntivero_AVLNode_value  ==  value ==> \result  ==  n);
    @*/
  public SourcesCristianOntivero.AVLNode find(int value) {
    int param_value_0;

    param_value_0 = value;
    {
      boolean t_1;
      boolean t_2;
      boolean t_3;
      SourcesCristianOntivero.AVLNode var_1_current = this.SourcesCristianOntivero_AVLTree_root;
      boolean var_2_ws_1;

      t_2 = var_1_current  !=  null;

      if (t_2) {
        {
          {
            t_3 = var_1_current.SourcesCristianOntivero_AVLNode_value  !=  param_value_0;
            if (t_3) {
              {
                t_1 = true;
              }
            } else {
              {
                t_1 = false;
              }
            }
          }
        }
      } else {
        {
          t_1 = false;
        }
      }
      var_2_ws_1 = t_1;
      while (var_2_ws_1) {
        boolean t_4;
        boolean t_5;
        boolean t_6;
        boolean t_7;

        t_4 = var_1_current.SourcesCristianOntivero_AVLNode_value  <  param_value_0;

        if (t_4) {
          {
            {
              {
                {
                  {
                    var_1_current = var_1_current.SourcesCristianOntivero_AVLNode_right;
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
                    var_1_current = var_1_current.SourcesCristianOntivero_AVLNode_left;
                  }
                }
              }
            }
          }
        }
        t_6 = var_1_current  !=  null;

        if (t_6) {
          {
            {
              t_7 = var_1_current.SourcesCristianOntivero_AVLNode_value  !=  param_value_0;
              if (t_7) {
                {
                  t_5 = true;
                }
              } else {
                {
                  t_5 = false;
                }
              }
            }
          }
        } else {
          {
            t_5 = false;
          }
        }
        var_2_ws_1 = t_5;
      }

      return var_1_current;
    }
  }


  /*@ 
    @ requires true;
    @*/
  public void insert(int value) {
    int param_value_1;

    param_value_1 = value;
    {
      boolean t_24;
      SourcesCristianOntivero.AVLNode var_3_current = this.SourcesCristianOntivero_AVLTree_root, var_4_parent = ((SourcesCristianOntivero.AVLNode)(null));
      boolean var_5_comparison;

      t_24 = this.SourcesCristianOntivero_AVLTree_root  !=  null;
      if (t_24) {
        {
          {
            {
              {
                {
                  SourcesCristianOntivero.AVLNode t_8;
                  boolean t_9;
                  boolean t_10;
                  boolean t_11;
                  boolean var_6_ws_2;

                  var_6_ws_2 = var_3_current  !=  null;
                  while (var_6_ws_2) {
                    var_5_comparison = var_3_current.SourcesCristianOntivero_AVLNode_value  <  param_value_1;
                    var_4_parent = var_3_current;

                    if (var_5_comparison) {
                      {
                        {
                          {
                            {
                              {
                                var_3_current = var_3_current.SourcesCristianOntivero_AVLNode_right;
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
                                var_3_current = var_3_current.SourcesCristianOntivero_AVLNode_left;
                              }
                            }
                          }
                        }
                      }
                    }
                    var_6_ws_2 = var_3_current  !=  null;
                  }
                  t_8 = new SourcesCristianOntivero.AVLNode(param_value_1, var_4_parent);
                  SourcesCristianOntivero.AVLNode var_7_nodeToInsert = t_8;

                  t_9 = var_4_parent.SourcesCristianOntivero_AVLNode_value  <  param_value_1;

                  if (t_9) {
                    {
                      {
                        {
                          {
                            {
                              var_4_parent.SourcesCristianOntivero_AVLNode_right = var_7_nodeToInsert;
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
                              var_4_parent.SourcesCristianOntivero_AVLNode_left = var_7_nodeToInsert;
                            }
                          }
                        }
                      }
                    }
                  }
                  int var_8_balanceFactor;
                  SourcesCristianOntivero.AVLNode var_9_child;
                  boolean var_10_flag = true;
                  boolean var_11_ws_3;

                  t_11 = var_4_parent  !=  null;

                  if (t_11) {
                    {
                      if (var_10_flag) {
                        {
                          t_10 = true;
                        }
                      } else {
                        {
                          t_10 = false;
                        }
                      }
                    }
                  } else {
                    {
                      t_10 = false;
                    }
                  }
                  var_11_ws_3 = t_10;
                  while (var_11_ws_3) {
                    int t_12;
                    int t_13;
                    boolean t_19;
                    boolean t_20;
                    boolean t_21;

                    t_12 = height(var_4_parent.SourcesCristianOntivero_AVLNode_left);
                    t_13 = height(var_4_parent.SourcesCristianOntivero_AVLNode_right);
                    var_8_balanceFactor = t_12 - t_13;
                    t_19 = var_8_balanceFactor  ==  2;

                    if (t_19) {
                      {
                        {
                          {
                            {
                              {
                                int t_14;
                                boolean t_15;

                                var_9_child = var_4_parent.SourcesCristianOntivero_AVLNode_left;
                                t_14 = var_9_child.SourcesCristianOntivero_AVLNode_left.SourcesCristianOntivero_AVLNode_height - var_9_child.SourcesCristianOntivero_AVLNode_right.SourcesCristianOntivero_AVLNode_height;
                                t_15 = t_14  ==  -1;

                                if (t_15) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            this.rotateLeft(var_9_child);
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                this.rotateRight(var_4_parent);
                                var_10_flag = false;
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
                                boolean t_18;

                                t_18 = var_8_balanceFactor  ==  -2;
                                if (t_18) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            int t_16;
                                            boolean t_17;

                                            var_9_child = var_4_parent.SourcesCristianOntivero_AVLNode_right;
                                            t_16 = var_9_child.SourcesCristianOntivero_AVLNode_left.SourcesCristianOntivero_AVLNode_height - var_9_child.SourcesCristianOntivero_AVLNode_right.SourcesCristianOntivero_AVLNode_height;
                                            t_17 = t_16  ==  1;

                                            if (t_17) {
                                              {
                                                {
                                                  {
                                                    {
                                                      {
                                                        this.rotateRight(var_9_child);
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            this.rotateLeft(var_4_parent);
                                            var_10_flag = false;
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
                    var_4_parent = var_4_parent.SourcesCristianOntivero_AVLNode_parent;
                    t_21 = var_4_parent  !=  null;

                    if (t_21) {
                      {
                        if (var_10_flag) {
                          {
                            t_20 = true;
                          }
                        } else {
                          {
                            t_20 = false;
                          }
                        }
                      }
                    } else {
                      {
                        t_20 = false;
                      }
                    }
                    var_11_ws_3 = t_20;
                  }
                  boolean var_12_ws_4;

                  var_12_ws_4 = var_4_parent  !=  null;
                  while (var_12_ws_4) {
                    int t_22;

                    t_22 = height(var_4_parent);
                    var_12_ws_4 = var_4_parent  !=  null;
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
                  SourcesCristianOntivero.AVLNode t_23;

                  t_23 = new SourcesCristianOntivero.AVLNode(param_value_1, var_4_parent);
                  this.SourcesCristianOntivero_AVLTree_root = t_23;
                }
              }
            }
          }
        }
      }
    }
  }


  public static int height(SourcesCristianOntivero.AVLNode node) {
    SourcesCristianOntivero.AVLNode param_node_2;

    param_node_2 = node;
    {
      boolean t_25;
      int t_26;
      int t_27;
      int t_28;

      t_25 = param_node_2  ==  null;

      if (t_25) {
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
      t_26 = height(node.SourcesCristianOntivero_AVLNode_right);
      t_27 = height(node.SourcesCristianOntivero_AVLNode_left);
      t_28 = max(t_26, t_27);
      node.SourcesCristianOntivero_AVLNode_height = 1 + t_28;

      return node.SourcesCristianOntivero_AVLNode_height;
    }
  }


  public static int max(int a, int b) {
    int param_a_3;

    param_a_3 = a;
    int param_b_4;

    param_b_4 = b;
    {
      int t_29;
      boolean t_30;

      t_30 = param_a_3  >  param_b_4;
      if (t_30) {
        {
          t_29 = param_a_3;
        }
      } else {
        {
          t_29 = param_b_4;
        }
      }

      return t_29;
    }
  }


  public void rotateRight(SourcesCristianOntivero.AVLNode node) {
    SourcesCristianOntivero.AVLNode param_node_5;

    param_node_5 = node;
    {
      boolean t_32;
      SourcesCristianOntivero.AVLNode var_13_newRoot = node.SourcesCristianOntivero_AVLNode_left;

      node.SourcesCristianOntivero_AVLNode_left = var_13_newRoot.SourcesCristianOntivero_AVLNode_right;
      var_13_newRoot.SourcesCristianOntivero_AVLNode_right = param_node_5;
      t_32 = node.SourcesCristianOntivero_AVLNode_parent  ==  null;

      if (t_32) {
        {
          {
            {
              {
                {
                  var_13_newRoot.SourcesCristianOntivero_AVLNode_parent = ((SourcesCristianOntivero.AVLNode)(null));
                  this.SourcesCristianOntivero_AVLTree_root = var_13_newRoot;
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
                  boolean t_31;

                  t_31 = node.SourcesCristianOntivero_AVLNode_parent.SourcesCristianOntivero_AVLNode_left.SourcesCristianOntivero_AVLNode_value  ==  node.SourcesCristianOntivero_AVLNode_value;
                  if (t_31) {
                    {
                      {
                        {
                          {
                            {
                              node.SourcesCristianOntivero_AVLNode_parent.SourcesCristianOntivero_AVLNode_left = var_13_newRoot;
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
                              node.SourcesCristianOntivero_AVLNode_parent.SourcesCristianOntivero_AVLNode_right = var_13_newRoot;
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
      var_13_newRoot.SourcesCristianOntivero_AVLNode_parent = node.SourcesCristianOntivero_AVLNode_parent;
      node.SourcesCristianOntivero_AVLNode_parent = var_13_newRoot;
    }
  }


  public void rotateLeft(SourcesCristianOntivero.AVLNode node) {
    SourcesCristianOntivero.AVLNode param_node_6;

    param_node_6 = node;
    {
      boolean t_34;
      SourcesCristianOntivero.AVLNode var_14_newRoot = node.SourcesCristianOntivero_AVLNode_right;

      node.SourcesCristianOntivero_AVLNode_right = var_14_newRoot.SourcesCristianOntivero_AVLNode_left;
      var_14_newRoot.SourcesCristianOntivero_AVLNode_left = param_node_6;
      t_34 = node.SourcesCristianOntivero_AVLNode_parent  ==  null;

      if (t_34) {
        {
          {
            {
              {
                {
                  var_14_newRoot.SourcesCristianOntivero_AVLNode_parent = ((SourcesCristianOntivero.AVLNode)(null));
                  this.SourcesCristianOntivero_AVLTree_root = var_14_newRoot;
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
                  boolean t_33;

                  t_33 = node.SourcesCristianOntivero_AVLNode_parent.SourcesCristianOntivero_AVLNode_left.SourcesCristianOntivero_AVLNode_value  ==  node.SourcesCristianOntivero_AVLNode_value;
                  if (t_33) {
                    {
                      {
                        {
                          {
                            {
                              node.SourcesCristianOntivero_AVLNode_parent.SourcesCristianOntivero_AVLNode_left = var_14_newRoot;
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
                              node.SourcesCristianOntivero_AVLNode_parent.SourcesCristianOntivero_AVLNode_right = var_14_newRoot;
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
      var_14_newRoot.SourcesCristianOntivero_AVLNode_parent = node.SourcesCristianOntivero_AVLNode_parent;
      node.SourcesCristianOntivero_AVLNode_parent = var_14_newRoot;
    }
  }

}
