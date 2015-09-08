package roops.core.objects;

//@ model import org.jmlspecs.lang.*;


public class AvlTree extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objects.AvlNode roops_core_objects_AvlTree_root;
  int roops_core_objects_AvlTree_size;
  /*@ invariant (\forall roops.core.objects.AvlNode n; \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n))); \reach(n.roops_core_objects_AvlNode_left, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n)))  ==  false);
    @*/
  /*@ invariant (\forall roops.core.objects.AvlNode n; \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n))); \reach(n.roops_core_objects_AvlNode_right, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n)))  ==  false);
    @*/
  /*@ invariant (\forall roops.core.objects.AvlNode n; \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n))); (\forall roops.core.objects.AvlNode m; \reach(n.roops_core_objects_AvlNode_left, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(m))); m.roops_core_objects_AvlNode_key  <  n.roops_core_objects_AvlNode_key));
    @*/
  /*@ invariant (\forall roops.core.objects.AvlNode n; \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n))); (\forall roops.core.objects.AvlNode m; \reach(n.roops_core_objects_AvlNode_right, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(m))); m.roops_core_objects_AvlNode_key  >  n.roops_core_objects_AvlNode_key));
    @*/
  /*@ invariant (\forall roops.core.objects.AvlNode n; \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n))); (n.roops_core_objects_AvlNode_left  !=  null && n.roops_core_objects_AvlNode_right  !=  null) ==> (n.roops_core_objects_AvlNode_left.roops_core_objects_AvlNode_height - n.roops_core_objects_AvlNode_right.roops_core_objects_AvlNode_height  <=  1 && n.roops_core_objects_AvlNode_left.roops_core_objects_AvlNode_height - n.roops_core_objects_AvlNode_right.roops_core_objects_AvlNode_height  >=  -1));
    @*/
  /*@ invariant (\forall roops.core.objects.AvlNode n; \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n))); (n.roops_core_objects_AvlNode_left  !=  null && n.roops_core_objects_AvlNode_right  ==  null) ==> n.roops_core_objects_AvlNode_left.roops_core_objects_AvlNode_height  <=  1);
    @*/
  /*@ invariant (\forall roops.core.objects.AvlNode n; \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n))); (n.roops_core_objects_AvlNode_left  ==  null && n.roops_core_objects_AvlNode_right  !=  null) ==> n.roops_core_objects_AvlNode_right.roops_core_objects_AvlNode_height  <=  1);
    @*/
  /*@ invariant (\forall roops.core.objects.AvlNode n; \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n))); (n.roops_core_objects_AvlNode_left  ==  null && n.roops_core_objects_AvlNode_right  ==  null) ==> n.roops_core_objects_AvlNode_height  ==  0);
    @*/
  /*@ invariant (\forall roops.core.objects.AvlNode n; \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n))); (n.roops_core_objects_AvlNode_left  !=  null && n.roops_core_objects_AvlNode_right  ==  null) ==> n.roops_core_objects_AvlNode_height  ==  n.roops_core_objects_AvlNode_left.roops_core_objects_AvlNode_height + 1);
    @*/
  /*@ invariant (\forall roops.core.objects.AvlNode n; \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n))); (n.roops_core_objects_AvlNode_left  ==  null && n.roops_core_objects_AvlNode_right  !=  null) ==> n.roops_core_objects_AvlNode_height  ==  n.roops_core_objects_AvlNode_right.roops_core_objects_AvlNode_height + 1);
    @*/
  /*@ invariant (\forall roops.core.objects.AvlNode n; \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n))); (n.roops_core_objects_AvlNode_left  !=  null && n.roops_core_objects_AvlNode_right  !=  null && n.roops_core_objects_AvlNode_left.roops_core_objects_AvlNode_height  >=  n.roops_core_objects_AvlNode_right.roops_core_objects_AvlNode_height) ==> n.roops_core_objects_AvlNode_height  ==  n.roops_core_objects_AvlNode_left.roops_core_objects_AvlNode_height + 1);
    @*/
  /*@ invariant (\forall roops.core.objects.AvlNode n; \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n))); (n.roops_core_objects_AvlNode_left  !=  null && n.roops_core_objects_AvlNode_right  !=  null && n.roops_core_objects_AvlNode_left.roops_core_objects_AvlNode_height  <  n.roops_core_objects_AvlNode_right.roops_core_objects_AvlNode_height) ==> n.roops_core_objects_AvlNode_height  ==  n.roops_core_objects_AvlNode_right.roops_core_objects_AvlNode_height + 1);
    @*/
  /*@ invariant this.roops_core_objects_AvlTree_size  ==  \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).int_size();
    @*/

  /*@ 
    @ requires this.roops_core_objects_AvlTree_root  !=  null;
    @ ensures (\forall roops.core.objects.AvlNode n; \old(\reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n)))); n.roops_core_objects_AvlNode_key  >=  \result);
    @ ensures (\exists roops.core.objects.AvlNode n; \old(\reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n)))); n.roops_core_objects_AvlNode_key  ==  \result);
    @*/
  public int findMin() {
    {
      roops.core.objects.AvlNode var_1_current = this.roops_core_objects_AvlTree_root;
      boolean var_2_ws_1;

      var_2_ws_1 = var_1_current.roops_core_objects_AvlNode_left  !=  null;
      while (var_2_ws_1) {
        var_1_current = var_1_current.roops_core_objects_AvlNode_left;
        var_2_ws_1 = var_1_current.roops_core_objects_AvlNode_left  !=  null;
      }

      return var_1_current.roops_core_objects_AvlNode_key;
    }
  }


  public void rotateRight(roops.core.objects.AvlNode node) {
    roops.core.objects.AvlNode param_node_0;

    param_node_0 = node;
    {
      boolean t_2;
      roops.core.objects.AvlNode var_3_newRoot = node.roops_core_objects_AvlNode_left;

      node.roops_core_objects_AvlNode_left = var_3_newRoot.roops_core_objects_AvlNode_right;
      var_3_newRoot.roops_core_objects_AvlNode_right = param_node_0;
      t_2 = node.roops_core_objects_AvlNode_parent  ==  null;

      if (t_2) {
        {
          {
            {
              {
                {
                  var_3_newRoot.roops_core_objects_AvlNode_parent = ((roops.core.objects.AvlNode)(null));
                  this.roops_core_objects_AvlTree_root = var_3_newRoot;
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

                  t_1 = node.roops_core_objects_AvlNode_parent.roops_core_objects_AvlNode_left.roops_core_objects_AvlNode_key  ==  node.roops_core_objects_AvlNode_key;
                  if (t_1) {
                    {
                      {
                        {
                          {
                            {
                              node.roops_core_objects_AvlNode_parent.roops_core_objects_AvlNode_left = var_3_newRoot;
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
                              node.roops_core_objects_AvlNode_parent.roops_core_objects_AvlNode_right = var_3_newRoot;
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
      var_3_newRoot.roops_core_objects_AvlNode_parent = node.roops_core_objects_AvlNode_parent;
      node.roops_core_objects_AvlNode_parent = var_3_newRoot;
    }
  }


  public void rotateLeft(roops.core.objects.AvlNode node) {
    roops.core.objects.AvlNode param_node_1;

    param_node_1 = node;
    {
      boolean t_4;
      roops.core.objects.AvlNode var_4_newRoot = node.roops_core_objects_AvlNode_right;

      node.roops_core_objects_AvlNode_right = var_4_newRoot.roops_core_objects_AvlNode_left;
      var_4_newRoot.roops_core_objects_AvlNode_left = param_node_1;
      t_4 = node.roops_core_objects_AvlNode_parent  ==  null;

      if (t_4) {
        {
          {
            {
              {
                {
                  var_4_newRoot.roops_core_objects_AvlNode_parent = ((roops.core.objects.AvlNode)(null));
                  this.roops_core_objects_AvlTree_root = var_4_newRoot;
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
                  boolean t_3;

                  t_3 = node.roops_core_objects_AvlNode_parent.roops_core_objects_AvlNode_left.roops_core_objects_AvlNode_key  ==  node.roops_core_objects_AvlNode_key;
                  if (t_3) {
                    {
                      {
                        {
                          {
                            {
                              node.roops_core_objects_AvlNode_parent.roops_core_objects_AvlNode_left = var_4_newRoot;
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
                              node.roops_core_objects_AvlNode_parent.roops_core_objects_AvlNode_right = var_4_newRoot;
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
      var_4_newRoot.roops_core_objects_AvlNode_parent = node.roops_core_objects_AvlNode_parent;
      node.roops_core_objects_AvlNode_parent = var_4_newRoot;
    }
  }


  public static int height(roops.core.objects.AvlNode node) {
    roops.core.objects.AvlNode param_node_2;

    param_node_2 = node;
    {
      boolean t_5;
      int t_6;
      int t_7;
      int t_8;
      int t_9;

      t_5 = param_node_2  ==  null;

      if (t_5) {
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
      t_6 = height(node.roops_core_objects_AvlNode_right);
      t_7 = height(node.roops_core_objects_AvlNode_left);
      t_8 = max(t_6, t_7);
      t_9 = 1 + t_8;

      return t_9;
    }
  }


  public static int max(int i1, int i2) {
    int param_i1_3;

    param_i1_3 = i1;
    int param_i2_4;

    param_i2_4 = i2;
    {
      boolean t_10;

      t_10 = param_i1_3  >=  param_i2_4;
      if (t_10) {
        {
          {
            {
              {
                {
                  return param_i1_3;
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
                  return param_i2_4;
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
    @ ensures (\forall roops.core.objects.AvlNode n; \old(\reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_left + roops_core_objects_AvlNode_right)).has(((java.lang.Object)(n)))  ==  true; \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_left + roops_core_objects_AvlNode_right).has(((java.lang.Object)(n)))  ==  true);
    @ ensures (\exists roops.core.objects.AvlNode n; ; n.roops_core_objects_AvlNode_key  ==  value && \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_right + roops_core_objects_AvlNode_left).has(((java.lang.Object)(n)))  ==  true);
    @ ensures \old(\reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_left + roops_core_objects_AvlNode_right)).int_size() + 1  ==  \reach(this.roops_core_objects_AvlTree_root, roops.core.objects.AvlNode, roops_core_objects_AvlNode_left + roops_core_objects_AvlNode_right).int_size();
    @*/
  public void insert(int value) {
    int param_value_5;

    param_value_5 = value;
    {
      boolean t_31;
      roops.core.objects.AvlNode var_5_current = this.roops_core_objects_AvlTree_root;
      roops.core.objects.AvlNode var_6_parent = ((roops.core.objects.AvlNode)(null));
      roops.core.objects.AvlNode var_7_nodeToInsert = ((roops.core.objects.AvlNode)(null));
      int var_8_comparison;

      t_31 = this.roops_core_objects_AvlTree_root  ==  null;
      if (t_31) {
        {
          {
            {
              {
                {
                  roops.core.objects.AvlNode t_11;

                  t_11 = new roops.core.objects.AvlNode();
                  this.roops_core_objects_AvlTree_root = t_11;
                  this.roops_core_objects_AvlTree_root.roops_core_objects_AvlNode_key = param_value_5;
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
                  roops.core.objects.AvlNode t_13;
                  boolean t_14;
                  boolean t_15;
                  boolean t_16;
                  boolean var_9_ws_2;

                  var_9_ws_2 = var_5_current  !=  null;
                  while (var_9_ws_2) {
                    boolean t_12;

                    var_8_comparison = var_5_current.roops_core_objects_AvlNode_key - param_value_5;
                    var_6_parent = var_5_current;
                    t_12 = var_8_comparison  <  0;

                    if (t_12) {
                      {
                        {
                          {
                            {
                              {
                                var_5_current = var_5_current.roops_core_objects_AvlNode_right;
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
                                var_5_current = var_5_current.roops_core_objects_AvlNode_left;
                              }
                            }
                          }
                        }
                      }
                    }
                    var_9_ws_2 = var_5_current  !=  null;
                  }
                  t_13 = new roops.core.objects.AvlNode();
                  var_7_nodeToInsert = t_13;
                  var_7_nodeToInsert.roops_core_objects_AvlNode_key = param_value_5;
                  var_7_nodeToInsert.roops_core_objects_AvlNode_parent = var_6_parent;
                  t_14 = var_6_parent.roops_core_objects_AvlNode_key  <  param_value_5;

                  if (t_14) {
                    {
                      {
                        {
                          {
                            {
                              var_6_parent.roops_core_objects_AvlNode_right = var_7_nodeToInsert;
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
                              var_6_parent.roops_core_objects_AvlNode_left = var_7_nodeToInsert;
                            }
                          }
                        }
                      }
                    }
                  }
                  int var_10_balanceFactor;
                  roops.core.objects.AvlNode var_11_child;
                  boolean var_12_flag = true;
                  boolean var_13_ws_3;

                  t_16 = var_6_parent  !=  null;

                  if (t_16) {
                    {
                      if (var_12_flag) {
                        {
                          t_15 = true;
                        }
                      } else {
                        {
                          t_15 = false;
                        }
                      }
                    }
                  } else {
                    {
                      t_15 = false;
                    }
                  }
                  var_13_ws_3 = t_15;
                  while (var_13_ws_3) {
                    int t_17;
                    int t_18;
                    boolean t_28;
                    boolean t_29;
                    boolean t_30;

                    t_17 = height(var_6_parent.roops_core_objects_AvlNode_left);
                    t_18 = height(var_6_parent.roops_core_objects_AvlNode_right);
                    var_10_balanceFactor = t_17 - t_18;
                    t_28 = var_10_balanceFactor  ==  2;

                    if (t_28) {
                      {
                        {
                          {
                            {
                              {
                                int t_19;
                                int t_20;
                                int t_21;
                                boolean t_22;

                                var_11_child = var_6_parent.roops_core_objects_AvlNode_left;
                                t_19 = height(var_11_child.roops_core_objects_AvlNode_left);
                                t_20 = height(var_11_child.roops_core_objects_AvlNode_right);
                                t_21 = t_19 - t_20;
                                t_22 = t_21  ==  -1;

                                if (t_22) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            this.rotateLeft(var_11_child);
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                this.rotateRight(var_6_parent);
                                var_12_flag = false;
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

                                t_27 = var_10_balanceFactor  ==  -2;
                                if (t_27) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            int t_23;
                                            int t_24;
                                            int t_25;
                                            boolean t_26;

                                            var_11_child = var_6_parent.roops_core_objects_AvlNode_right;
                                            t_23 = height(var_11_child.roops_core_objects_AvlNode_left);
                                            t_24 = height(var_11_child.roops_core_objects_AvlNode_right);
                                            t_25 = t_23 - t_24;
                                            t_26 = t_25  ==  1;

                                            if (t_26) {
                                              {
                                                {
                                                  {
                                                    {
                                                      {
                                                        this.rotateRight(var_11_child);
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            this.rotateLeft(var_6_parent);
                                            var_12_flag = false;
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
                    var_6_parent = var_6_parent.roops_core_objects_AvlNode_parent;
                    t_30 = var_6_parent  !=  null;

                    if (t_30) {
                      {
                        if (var_12_flag) {
                          {
                            t_29 = true;
                          }
                        } else {
                          {
                            t_29 = false;
                          }
                        }
                      }
                    } else {
                      {
                        t_29 = false;
                      }
                    }
                    var_13_ws_3 = t_29;
                  }
                }
              }
            }
          }
        }
      }
    }
  }


  public AvlTree() {
    this.roops_core_objects_AvlTree_root = ((roops.core.objects.AvlNode)(null));
    this.roops_core_objects_AvlTree_size = (byte)0;
  }

}
