package roops.core.objects.avltree.base;

//@ model import org.jmlspecs.lang.*;

/** A JML annotated version of class kiasan.examples.avltree.AvlTree
*/
public class AvlTree extends java.lang.Object {

  public roops.core.objects.avltree.base.AvlNode roops_core_objects_avltree_base_AvlTree_root;
  public int roops_core_objects_avltree_base_AvlTree_size;
  /*@ invariant (\forall roops.core.objects.avltree.base.AvlNode x; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(x))); (\reach(x.roops_core_objects_avltree_base_AvlNode_left, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_left + roops_core_objects_avltree_base_AvlNode_right).has(((java.lang.Object)(x)))  ==  false) && (\reach(x.roops_core_objects_avltree_base_AvlNode_right, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_left + roops_core_objects_avltree_base_AvlNode_right).has(((java.lang.Object)(x)))  ==  false));
    @*/
  /*@ invariant (\forall roops.core.objects.avltree.base.AvlNode x; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(x))); (x.roops_core_objects_avltree_base_AvlNode_left  ==  null && x.roops_core_objects_avltree_base_AvlNode_right  ==  null) ==> x.roops_core_objects_avltree_base_AvlNode_height  ==  0);
    @*/
  /*@ invariant (\forall roops.core.objects.avltree.base.AvlNode x; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(x))); (x.roops_core_objects_avltree_base_AvlNode_left  ==  null && x.roops_core_objects_avltree_base_AvlNode_right  !=  null) ==> (x.roops_core_objects_avltree_base_AvlNode_height  ==  1 && x.roops_core_objects_avltree_base_AvlNode_right.roops_core_objects_avltree_base_AvlNode_height  ==  0));
    @*/
  /*@ invariant (\forall roops.core.objects.avltree.base.AvlNode x; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(x))); (x.roops_core_objects_avltree_base_AvlNode_left  !=  null && x.roops_core_objects_avltree_base_AvlNode_right  ==  null) ==> (x.roops_core_objects_avltree_base_AvlNode_height  ==  1 && x.roops_core_objects_avltree_base_AvlNode_left.roops_core_objects_avltree_base_AvlNode_height  ==  0));
    @*/
  /*@ invariant (\forall roops.core.objects.avltree.base.AvlNode x; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(x))); (x.roops_core_objects_avltree_base_AvlNode_left  !=  null && x.roops_core_objects_avltree_base_AvlNode_right  !=  null && x.roops_core_objects_avltree_base_AvlNode_left.roops_core_objects_avltree_base_AvlNode_height  >  x.roops_core_objects_avltree_base_AvlNode_right.roops_core_objects_avltree_base_AvlNode_height) ==> (x.roops_core_objects_avltree_base_AvlNode_height  ==  x.roops_core_objects_avltree_base_AvlNode_left.roops_core_objects_avltree_base_AvlNode_height + 1 && x.roops_core_objects_avltree_base_AvlNode_left.roops_core_objects_avltree_base_AvlNode_height - x.roops_core_objects_avltree_base_AvlNode_right.roops_core_objects_avltree_base_AvlNode_height  <=  1));
    @*/
  /*@ invariant (\forall roops.core.objects.avltree.base.AvlNode x; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(x))); (x.roops_core_objects_avltree_base_AvlNode_left  !=  null && x.roops_core_objects_avltree_base_AvlNode_right  !=  null && x.roops_core_objects_avltree_base_AvlNode_left.roops_core_objects_avltree_base_AvlNode_height  <=  x.roops_core_objects_avltree_base_AvlNode_right.roops_core_objects_avltree_base_AvlNode_height) ==> (x.roops_core_objects_avltree_base_AvlNode_height  ==  x.roops_core_objects_avltree_base_AvlNode_right.roops_core_objects_avltree_base_AvlNode_height + 1 && x.roops_core_objects_avltree_base_AvlNode_right.roops_core_objects_avltree_base_AvlNode_height - x.roops_core_objects_avltree_base_AvlNode_left.roops_core_objects_avltree_base_AvlNode_height  <=  1));
    @*/
  /*@ invariant (\forall roops.core.objects.avltree.base.AvlNode x; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(x))); (\forall roops.core.objects.avltree.base.AvlNode y; \reach(x.roops_core_objects_avltree_base_AvlNode_left, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_left + roops_core_objects_avltree_base_AvlNode_right).has(((java.lang.Object)(y)))  ==  true; y.roops_core_objects_avltree_base_AvlNode_element  <  x.roops_core_objects_avltree_base_AvlNode_element) && (\forall roops.core.objects.avltree.base.AvlNode y; \reach(x.roops_core_objects_avltree_base_AvlNode_right, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_left + roops_core_objects_avltree_base_AvlNode_right).has(((java.lang.Object)(y)))  ==  true; x.roops_core_objects_avltree_base_AvlNode_element  <  y.roops_core_objects_avltree_base_AvlNode_element));
    @*/
  /*@ invariant this.roops_core_objects_avltree_base_AvlTree_size  ==  \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).int_size();
    @*/

  public AvlTree() {
    this.roops_core_objects_avltree_base_AvlTree_size = (byte)0;
    {
    }
  }


  /*@ 
    @ ensures (\exists roops.core.objects.avltree.base.AvlNode n; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(n))); n.roops_core_objects_avltree_base_AvlNode_element  ==  x) ==> (\reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(\result))) && \result.roops_core_objects_avltree_base_AvlNode_element  ==  x);
    @ ensures (\forall roops.core.objects.avltree.base.AvlNode n; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(n))); n.roops_core_objects_avltree_base_AvlNode_element  !=  x) ==> \result  ==  null;
    @ signals (java.lang.Exception e) false;
    @*/
  public /*@ nullable @*/ roops.core.objects.avltree.base.AvlNode find(int x) {
    int param_x_0;

    param_x_0 = x;
    {
      roops.core.objects.avltree.base.AvlNode var_1_n = this.roops_core_objects_avltree_base_AvlTree_root;
      boolean var_2_ws_1;

      var_2_ws_1 = var_1_n  !=  null;
      while (var_2_ws_1) {
        boolean t_2;

        t_2 = param_x_0  <  var_1_n.roops_core_objects_avltree_base_AvlNode_element;

        if (t_2) {
          {
            {
              {
                {
                  {
                    var_1_n = var_1_n.roops_core_objects_avltree_base_AvlNode_left;
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

                    t_1 = param_x_0  >  var_1_n.roops_core_objects_avltree_base_AvlNode_element;
                    if (t_1) {
                      {
                        {
                          {
                            {
                              {
                                var_1_n = var_1_n.roops_core_objects_avltree_base_AvlNode_right;
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
                                return var_1_n;
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
        var_2_ws_1 = var_1_n  !=  null;
      }

      return ((roops.core.objects.avltree.base.AvlNode)(null));
    }
  }


  /*@ 
    @ requires this.roops_core_objects_avltree_base_AvlTree_root  !=  null;
    @ ensures (\exists roops.core.objects.avltree.base.AvlNode min_node; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(min_node))); min_node.roops_core_objects_avltree_base_AvlNode_element  ==  \result && (\forall roops.core.objects.avltree.base.AvlNode node; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(node))); \result  <=  node.roops_core_objects_avltree_base_AvlNode_element));
    @ signals (java.lang.Exception e) false;
    @*/
  public int findMin() {
    {
      roops.core.objects.avltree.base.AvlNode var_3_n = this.roops_core_objects_avltree_base_AvlTree_root;
      boolean var_4_ws_2;

      var_4_ws_2 = var_3_n.roops_core_objects_avltree_base_AvlNode_left  !=  null;
      while (var_4_ws_2) {
        var_3_n = var_3_n.roops_core_objects_avltree_base_AvlNode_left;
        var_4_ws_2 = var_3_n.roops_core_objects_avltree_base_AvlNode_left  !=  null;
      }

      return var_3_n.roops_core_objects_avltree_base_AvlNode_element;
    }
  }


  /*@ 
    @ requires true;
    @ ensures \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).int_size()  ==  0 ==> \result  ==  -1;
    @ ensures \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).int_size()  >  0 ==> (\exists roops.core.objects.avltree.base.AvlNode max_node; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(max_node))); max_node.roops_core_objects_avltree_base_AvlNode_element  ==  \result && (\forall roops.core.objects.avltree.base.AvlNode node; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(node))); \result  >=  node.roops_core_objects_avltree_base_AvlNode_element));
    @ signals (java.lang.Exception e) false;
    @*/
  public int findMax() {
    {
      boolean t_3;
      roops.core.objects.avltree.base.AvlNode var_5_n = this.roops_core_objects_avltree_base_AvlTree_root;

      t_3 = var_5_n  ==  null;

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
      }
      boolean var_6_ws_3;

      var_6_ws_3 = var_5_n.roops_core_objects_avltree_base_AvlNode_right  !=  null;
      while (var_6_ws_3) {
        var_5_n = var_5_n.roops_core_objects_avltree_base_AvlNode_right;
        var_6_ws_3 = var_5_n.roops_core_objects_avltree_base_AvlNode_right  !=  null;
      }

      return var_5_n.roops_core_objects_avltree_base_AvlNode_element;
    }
  }


  /*@ 
    @ requires true;
    @ requires (\forall roops.core.objects.avltree.base.AvlNode n; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(n)))  ==  true; n.roops_core_objects_avltree_base_AvlNode_element  !=  x);
    @ ensures (\exists roops.core.objects.avltree.base.AvlNode n; \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).has(((java.lang.Object)(n)))  ==  true; n.roops_core_objects_avltree_base_AvlNode_element  ==  x);
    @ ensures \reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left).int_size()  ==  \old(\reach(this.roops_core_objects_avltree_base_AvlTree_root, roops.core.objects.avltree.base.AvlNode, roops_core_objects_avltree_base_AvlNode_right + roops_core_objects_avltree_base_AvlNode_left)).int_size() + 1;
    @ signals (java.lang.Exception e) false;
    @*/
  public void insert(int x) {
    int param_x_1;

    param_x_1 = x;
    {
      roops.core.objects.avltree.base.AvlNode t_4;
      boolean t_6;
      int t_7;

      t_4 = new roops.core.objects.avltree.base.AvlNode();
      roops.core.objects.avltree.base.AvlNode var_7_n = t_4;

      var_7_n.roops_core_objects_avltree_base_AvlNode_element = param_x_1;
      t_6 = this.roops_core_objects_avltree_base_AvlTree_root  ==  null;

      if (t_6) {
        {
          {
            {
              {
                {
                  this.roops_core_objects_avltree_base_AvlTree_root = var_7_n;
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
                  roops.core.objects.avltree.base.AvlNode t_5;

                  t_5 = this.privateInsert(this.roops_core_objects_avltree_base_AvlTree_root, var_7_n);
                  this.roops_core_objects_avltree_base_AvlTree_root = t_5;
                }
              }
            }
          }
        }
      }
      t_7 = this.roops_core_objects_avltree_base_AvlTree_size;
      this.roops_core_objects_avltree_base_AvlTree_size = this.roops_core_objects_avltree_base_AvlTree_size + (byte)1;
    }
  }


  public roops.core.objects.avltree.base.AvlNode privateInsert(/*@ nullable @*/ roops.core.objects.avltree.base.AvlNode n, roops.core.objects.avltree.base.AvlNode aux) {
    roops.core.objects.avltree.base.AvlNode param_n_2;

    param_n_2 = n;
    roops.core.objects.avltree.base.AvlNode param_aux_3;

    param_aux_3 = aux;
    {
      boolean t_26;
      int t_27;
      int t_28;
      int t_29;

      t_26 = param_n_2  ==  null;

      if (t_26) {
        {
          {
            {
              {
                {
                  param_n_2 = param_aux_3;
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
                  boolean t_25;

                  t_25 = aux.roops_core_objects_avltree_base_AvlNode_element  <  n.roops_core_objects_avltree_base_AvlNode_element;
                  if (t_25) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objects.avltree.base.AvlNode t_8;
                              int t_12;
                              int t_13;
                              int t_14;
                              boolean t_15;

                              t_8 = this.privateInsert(n.roops_core_objects_avltree_base_AvlNode_left, param_aux_3);
                              n.roops_core_objects_avltree_base_AvlNode_left = t_8;
                              t_12 = roops.core.objects.avltree.base.AvlTree.height(n.roops_core_objects_avltree_base_AvlNode_left);
                              t_13 = roops.core.objects.avltree.base.AvlTree.height(n.roops_core_objects_avltree_base_AvlNode_right);
                              t_14 = t_12 - t_13;
                              t_15 = t_14  ==  2;
                              if (t_15) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          boolean t_11;

                                          t_11 = aux.roops_core_objects_avltree_base_AvlNode_element  <  n.roops_core_objects_avltree_base_AvlNode_left.roops_core_objects_avltree_base_AvlNode_element;
                                          if (t_11) {
                                            {
                                              {
                                                {
                                                  {
                                                    {
                                                      roops.core.objects.avltree.base.AvlNode t_9;

                                                      t_9 = roops.core.objects.avltree.base.AvlTree.rotateWithLeftChild(param_n_2);
                                                      param_n_2 = t_9;
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
                                                      roops.core.objects.avltree.base.AvlNode t_10;

                                                      t_10 = roops.core.objects.avltree.base.AvlTree.doubleWithLeftChild(param_n_2);
                                                      param_n_2 = t_10;
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
                              boolean t_24;

                              t_24 = aux.roops_core_objects_avltree_base_AvlNode_element  >  n.roops_core_objects_avltree_base_AvlNode_element;
                              if (t_24) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          roops.core.objects.avltree.base.AvlNode t_16;
                                          int t_20;
                                          int t_21;
                                          int t_22;
                                          boolean t_23;

                                          t_16 = this.privateInsert(n.roops_core_objects_avltree_base_AvlNode_right, param_aux_3);
                                          n.roops_core_objects_avltree_base_AvlNode_right = t_16;
                                          t_20 = roops.core.objects.avltree.base.AvlTree.height(n.roops_core_objects_avltree_base_AvlNode_right);
                                          t_21 = roops.core.objects.avltree.base.AvlTree.height(n.roops_core_objects_avltree_base_AvlNode_left);
                                          t_22 = t_20 - t_21;
                                          t_23 = t_22  ==  2;
                                          if (t_23) {
                                            {
                                              {
                                                {
                                                  {
                                                    {
                                                      boolean t_19;

                                                      t_19 = aux.roops_core_objects_avltree_base_AvlNode_element  >  n.roops_core_objects_avltree_base_AvlNode_right.roops_core_objects_avltree_base_AvlNode_element;
                                                      if (t_19) {
                                                        {
                                                          {
                                                            {
                                                              {
                                                                {
                                                                  roops.core.objects.avltree.base.AvlNode t_17;

                                                                  t_17 = roops.core.objects.avltree.base.AvlTree.rotateWithRightChild(param_n_2);
                                                                  param_n_2 = t_17;
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
                                                                  roops.core.objects.avltree.base.AvlNode t_18;

                                                                  t_18 = roops.core.objects.avltree.base.AvlTree.doubleWithRightChild(param_n_2);
                                                                  param_n_2 = t_18;
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
                }
              }
            }
          }
        }
      }
      t_27 = roops.core.objects.avltree.base.AvlTree.height(n.roops_core_objects_avltree_base_AvlNode_left);
      t_28 = roops.core.objects.avltree.base.AvlTree.height(n.roops_core_objects_avltree_base_AvlNode_right);
      t_29 = roops.core.objects.avltree.base.AvlTree.max(t_27, t_28);
      n.roops_core_objects_avltree_base_AvlNode_height = t_29 + 1;

      return param_n_2;
    }
  }


  private static roops.core.objects.avltree.base.AvlNode doubleWithLeftChild(roops.core.objects.avltree.base.AvlNode k3) {
    roops.core.objects.avltree.base.AvlNode param_k3_4;

    param_k3_4 = k3;
    {
      roops.core.objects.avltree.base.AvlNode t_30;
      roops.core.objects.avltree.base.AvlNode t_31;

      t_30 = roops.core.objects.avltree.base.AvlTree.rotateWithRightChild(k3.roops_core_objects_avltree_base_AvlNode_left);
      k3.roops_core_objects_avltree_base_AvlNode_left = t_30;
      t_31 = roops.core.objects.avltree.base.AvlTree.rotateWithLeftChild(param_k3_4);

      return t_31;
    }
  }


  private static roops.core.objects.avltree.base.AvlNode doubleWithRightChild(roops.core.objects.avltree.base.AvlNode k1) {
    roops.core.objects.avltree.base.AvlNode param_k1_5;

    param_k1_5 = k1;
    {
      roops.core.objects.avltree.base.AvlNode t_32;
      roops.core.objects.avltree.base.AvlNode t_33;

      t_32 = roops.core.objects.avltree.base.AvlTree.rotateWithLeftChild(k1.roops_core_objects_avltree_base_AvlNode_right);
      k1.roops_core_objects_avltree_base_AvlNode_right = t_32;
      t_33 = roops.core.objects.avltree.base.AvlTree.rotateWithRightChild(param_k1_5);

      return t_33;
    }
  }


  /*@ 
    @ assignable \nothing;
    @*/
  private static int height(roops.core.objects.avltree.base.AvlNode t) {
    roops.core.objects.avltree.base.AvlNode param_t_6;

    param_t_6 = t;
    {
      int t_34;
      boolean t_35;

      t_35 = param_t_6  ==  null;
      if (t_35) {
        {
          t_34 = -1;
        }
      } else {
        {
          t_34 = t.roops_core_objects_avltree_base_AvlNode_height;
        }
      }

      return t_34;
    }
  }


  /*@ 
    @ assignable \nothing;
    @*/
  private static int max(int lhs, int rhs) {
    int param_lhs_7;

    param_lhs_7 = lhs;
    int param_rhs_8;

    param_rhs_8 = rhs;
    {
      int t_36;
      boolean t_37;

      t_37 = param_lhs_7  >  param_rhs_8;
      if (t_37) {
        {
          t_36 = param_lhs_7;
        }
      } else {
        {
          t_36 = param_rhs_8;
        }
      }

      return t_36;
    }
  }


  private static roops.core.objects.avltree.base.AvlNode rotateWithLeftChild(roops.core.objects.avltree.base.AvlNode k2) {
    roops.core.objects.avltree.base.AvlNode param_k2_9;

    param_k2_9 = k2;
    {
      int t_38;
      int t_39;
      int t_40;
      int t_41;
      int t_42;
      final roops.core.objects.avltree.base.AvlNode var_8_k1 = k2.roops_core_objects_avltree_base_AvlNode_left;

      k2.roops_core_objects_avltree_base_AvlNode_left = var_8_k1.roops_core_objects_avltree_base_AvlNode_right;
      var_8_k1.roops_core_objects_avltree_base_AvlNode_right = param_k2_9;
      t_38 = roops.core.objects.avltree.base.AvlTree.height(k2.roops_core_objects_avltree_base_AvlNode_left);
      t_39 = roops.core.objects.avltree.base.AvlTree.height(k2.roops_core_objects_avltree_base_AvlNode_right);
      t_40 = roops.core.objects.avltree.base.AvlTree.max(t_38, t_39);
      k2.roops_core_objects_avltree_base_AvlNode_height = t_40 + 1;
      t_41 = roops.core.objects.avltree.base.AvlTree.height(var_8_k1.roops_core_objects_avltree_base_AvlNode_left);
      t_42 = roops.core.objects.avltree.base.AvlTree.max(t_41, k2.roops_core_objects_avltree_base_AvlNode_height);
      var_8_k1.roops_core_objects_avltree_base_AvlNode_height = t_42 + 1;

      return var_8_k1;
    }
  }


  private static roops.core.objects.avltree.base.AvlNode rotateWithRightChild(roops.core.objects.avltree.base.AvlNode k1) {
    roops.core.objects.avltree.base.AvlNode param_k1_10;

    param_k1_10 = k1;
    {
      int t_43;
      int t_44;
      int t_45;
      int t_46;
      int t_47;
      final roops.core.objects.avltree.base.AvlNode var_9_k2 = k1.roops_core_objects_avltree_base_AvlNode_right;

      k1.roops_core_objects_avltree_base_AvlNode_right = var_9_k2.roops_core_objects_avltree_base_AvlNode_left;
      var_9_k2.roops_core_objects_avltree_base_AvlNode_left = param_k1_10;
      t_43 = roops.core.objects.avltree.base.AvlTree.height(k1.roops_core_objects_avltree_base_AvlNode_left);
      t_44 = roops.core.objects.avltree.base.AvlTree.height(k1.roops_core_objects_avltree_base_AvlNode_right);
      t_45 = roops.core.objects.avltree.base.AvlTree.max(t_43, t_44);
      k1.roops_core_objects_avltree_base_AvlNode_height = t_45 + 1;
      t_46 = roops.core.objects.avltree.base.AvlTree.height(var_9_k2.roops_core_objects_avltree_base_AvlNode_right);
      t_47 = roops.core.objects.avltree.base.AvlTree.max(t_46, k1.roops_core_objects_avltree_base_AvlNode_height);
      var_9_k2.roops_core_objects_avltree_base_AvlNode_height = t_47 + 1;

      return var_9_k2;
    }
  }


  public static void main(java.lang.String[] args) {
    java.lang.String[] param_args_11;

    param_args_11 = args;
    {
      roops.core.objects.avltree.base.AvlTree t_48;
      roops.core.objects.avltree.base.AvlNode t_49;

      t_48 = new roops.core.objects.avltree.base.AvlTree();
      roops.core.objects.avltree.base.AvlTree var_10_t = t_48;

      t_49 = new roops.core.objects.avltree.base.AvlNode();
      roops.core.objects.avltree.base.AvlNode var_11_n = t_49;

      var_11_n.roops_core_objects_avltree_base_AvlNode_element = 3;
      var_10_t.roops_core_objects_avltree_base_AvlTree_root = var_11_n;
      var_10_t.roops_core_objects_avltree_base_AvlTree_size = 1;
      var_10_t.insert(6);
    }
  }

}
