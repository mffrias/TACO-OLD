package SourcesCristianOntivero;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class BinarySearchTree extends java.lang.Object {

  public SourcesCristianOntivero.BSTNode SourcesCristianOntivero_BinarySearchTree_root;
  /*@ invariant (\forall SourcesCristianOntivero.BSTNode n; \reach(this.SourcesCristianOntivero_BinarySearchTree_root, SourcesCristianOntivero.BSTNode, SourcesCristianOntivero_BSTNode_right + SourcesCristianOntivero_BSTNode_left).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesCristianOntivero_BSTNode_right, SourcesCristianOntivero.BSTNode, SourcesCristianOntivero_BSTNode_left + SourcesCristianOntivero_BSTNode_right).has(((java.lang.Object)(n)))  ==  false && \reach(n.SourcesCristianOntivero_BSTNode_left, SourcesCristianOntivero.BSTNode, SourcesCristianOntivero_BSTNode_right + SourcesCristianOntivero_BSTNode_left).has(((java.lang.Object)(n)))  ==  false);
    @*/
  /*@ invariant (\forall SourcesCristianOntivero.BSTNode n; \reach(this.SourcesCristianOntivero_BinarySearchTree_root, SourcesCristianOntivero.BSTNode, SourcesCristianOntivero_BSTNode_right + SourcesCristianOntivero_BSTNode_left).has(((java.lang.Object)(n)))  ==  true; (\forall SourcesCristianOntivero.BSTNode m; \reach(n.SourcesCristianOntivero_BSTNode_left, SourcesCristianOntivero.BSTNode, SourcesCristianOntivero_BSTNode_right + SourcesCristianOntivero_BSTNode_left).has(((java.lang.Object)(m)))  ==  true; m.SourcesCristianOntivero_BSTNode_elem  <=  n.SourcesCristianOntivero_BSTNode_elem) && (\forall SourcesCristianOntivero.BSTNode m; \reach(n.SourcesCristianOntivero_BSTNode_right, SourcesCristianOntivero.BSTNode, SourcesCristianOntivero_BSTNode_right + SourcesCristianOntivero_BSTNode_left).has(((java.lang.Object)(m)))  ==  true; m.SourcesCristianOntivero_BSTNode_elem  >  n.SourcesCristianOntivero_BSTNode_elem));
    @*/

  public BinarySearchTree() {
    this.SourcesCristianOntivero_BinarySearchTree_root = ((SourcesCristianOntivero.BSTNode)(null));
    {
      this.SourcesCristianOntivero_BinarySearchTree_root = ((SourcesCristianOntivero.BSTNode)(null));
    }
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @*/
  public void insert(int elem) {
    int param_elem_0;

    param_elem_0 = elem;
    {
      boolean t_2;
      boolean t_5;
      SourcesCristianOntivero.BSTNode var_1_current = this.SourcesCristianOntivero_BinarySearchTree_root;
      SourcesCristianOntivero.BSTNode var_2_previous = this.SourcesCristianOntivero_BinarySearchTree_root;

      t_2 = this.SourcesCristianOntivero_BinarySearchTree_root  ==  null;

      if (t_2) {
        {
          {
            {
              {
                {
                  SourcesCristianOntivero.BSTNode t_1;

                  t_1 = new SourcesCristianOntivero.BSTNode(param_elem_0);
                  this.SourcesCristianOntivero_BinarySearchTree_root = t_1;

                  return;
                }
              }
            }
          }
        }
      }
      boolean var_3_comparison;
      boolean var_4_ws_1;

      var_4_ws_1 = var_1_current  !=  null;
      while (var_4_ws_1) {
        var_3_comparison = var_1_current.SourcesCristianOntivero_BSTNode_elem  <  param_elem_0;
        var_2_previous = var_1_current;

        if (var_3_comparison) {
          {
            {
              {
                {
                  {
                    var_1_current = var_1_current.SourcesCristianOntivero_BSTNode_right;
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
                    var_1_current = var_1_current.SourcesCristianOntivero_BSTNode_left;
                  }
                }
              }
            }
          }
        }
        var_4_ws_1 = var_1_current  !=  null;
      }
      t_5 = var_2_previous.SourcesCristianOntivero_BSTNode_elem  <  param_elem_0;
      if (t_5) {
        {
          {
            {
              {
                {
                  SourcesCristianOntivero.BSTNode t_3;

                  t_3 = new SourcesCristianOntivero.BSTNode(param_elem_0);
                  var_2_previous.SourcesCristianOntivero_BSTNode_right = t_3;
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
                  SourcesCristianOntivero.BSTNode t_4;

                  t_4 = new SourcesCristianOntivero.BSTNode(param_elem_0);
                  var_2_previous.SourcesCristianOntivero_BSTNode_left = t_4;
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
    @ ensures \old(\reach(this.SourcesCristianOntivero_BinarySearchTree_root, SourcesCristianOntivero.BSTNode, SourcesCristianOntivero_BSTNode_right + SourcesCristianOntivero_BSTNode_left)).int_size()  ==  \reach(this.SourcesCristianOntivero_BinarySearchTree_root, SourcesCristianOntivero.BSTNode, SourcesCristianOntivero_BSTNode_right + SourcesCristianOntivero_BSTNode_left).int_size();
    @*/
  public boolean contains(int elem) {
    int param_elem_1;

    param_elem_1 = elem;
    {
      boolean t_6;

      t_6 = this.SourcesCristianOntivero_BinarySearchTree_root  ==  null;

      if (t_6) {
        {
          {
            {
              {
                {
                  return false;
                }
              }
            }
          }
        }
      }
      SourcesCristianOntivero.BSTNode var_5_current = this.SourcesCristianOntivero_BinarySearchTree_root;
      int var_6_comparison;
      boolean var_7_ws_2;

      var_7_ws_2 = var_5_current  !=  null;
      while (var_7_ws_2) {
        boolean t_8;

        var_6_comparison = var_5_current.SourcesCristianOntivero_BSTNode_elem - param_elem_1;
        t_8 = var_6_comparison  <  0;

        if (t_8) {
          {
            {
              {
                {
                  {
                    var_5_current = var_5_current.SourcesCristianOntivero_BSTNode_right;
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
                    boolean t_7;

                    t_7 = var_6_comparison  >  0;
                    if (t_7) {
                      {
                        {
                          {
                            {
                              {
                                var_5_current = var_5_current.SourcesCristianOntivero_BSTNode_left;
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
        var_7_ws_2 = var_5_current  !=  null;
      }

      return false;
    }
  }


  /*@ 
    @ requires (\forall SourcesCristianOntivero.BSTNode n; \reach(this.SourcesCristianOntivero_BinarySearchTree_root, SourcesCristianOntivero.BSTNode, SourcesCristianOntivero_BSTNode_right + SourcesCristianOntivero_BSTNode_left).has(((java.lang.Object)(n)))  ==  true; n.SourcesCristianOntivero_BSTNode_elem  >=  0 && n.SourcesCristianOntivero_BSTNode_elem  <  2);
    @ requires true;
    @*/
  public void delete(int elem) {
    int param_elem_2;

    param_elem_2 = elem;
    {
      boolean t_29;
      SourcesCristianOntivero.BSTNode var_8_current = this.SourcesCristianOntivero_BinarySearchTree_root;
      SourcesCristianOntivero.BSTNode var_9_previous = ((SourcesCristianOntivero.BSTNode)(null));

      t_29 = var_8_current  !=  null;
      if (t_29) {
        {
          {
            {
              {
                {
                  boolean t_9;
                  boolean t_10;
                  boolean t_11;
                  boolean t_28;
                  boolean var_10_ws_3;

                  t_10 = var_8_current  !=  null;

                  if (t_10) {
                    {
                      {
                        t_11 = var_8_current.SourcesCristianOntivero_BSTNode_elem  !=  param_elem_2;
                        if (t_11) {
                          {
                            t_9 = true;
                          }
                        } else {
                          {
                            t_9 = false;
                          }
                        }
                      }
                    }
                  } else {
                    {
                      t_9 = false;
                    }
                  }
                  var_10_ws_3 = t_9;
                  while (var_10_ws_3) {
                    boolean t_12;
                    boolean t_13;
                    boolean t_14;
                    boolean t_15;

                    var_9_previous = var_8_current;
                    t_12 = var_8_current.SourcesCristianOntivero_BSTNode_elem  >  param_elem_2;

                    if (t_12) {
                      {
                        {
                          {
                            {
                              {
                                var_8_current = var_8_current.SourcesCristianOntivero_BSTNode_left;
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
                                var_8_current = var_8_current.SourcesCristianOntivero_BSTNode_right;
                              }
                            }
                          }
                        }
                      }
                    }
                    t_14 = var_8_current  !=  null;

                    if (t_14) {
                      {
                        {
                          t_15 = var_8_current.SourcesCristianOntivero_BSTNode_elem  !=  param_elem_2;
                          if (t_15) {
                            {
                              t_13 = true;
                            }
                          } else {
                            {
                              t_13 = false;
                            }
                          }
                        }
                      }
                    } else {
                      {
                        t_13 = false;
                      }
                    }
                    var_10_ws_3 = t_13;
                  }
                  t_28 = var_8_current  !=  null;
                  if (t_28) {
                    {
                      {
                        {
                          {
                            {
                              boolean t_25;
                              boolean t_26;
                              boolean t_27;

                              t_26 = var_8_current.SourcesCristianOntivero_BSTNode_left  ==  null;

                              if (t_26) {
                                {
                                  {
                                    t_27 = var_8_current.SourcesCristianOntivero_BSTNode_right  ==  null;
                                    if (t_27) {
                                      {
                                        t_25 = true;
                                      }
                                    } else {
                                      {
                                        t_25 = false;
                                      }
                                    }
                                  }
                                }
                              } else {
                                {
                                  t_25 = false;
                                }
                              }
                              if (t_25) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          boolean t_17;

                                          t_17 = var_9_previous  ==  null;
                                          if (t_17) {
                                            {
                                              {
                                                {
                                                  {
                                                    {
                                                      this.SourcesCristianOntivero_BinarySearchTree_root = ((SourcesCristianOntivero.BSTNode)(null));
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
                                                      boolean t_16;

                                                      t_16 = var_9_previous.SourcesCristianOntivero_BSTNode_elem  >  param_elem_2;
                                                      if (t_16) {
                                                        {
                                                          {
                                                            {
                                                              {
                                                                {
                                                                  var_9_previous.SourcesCristianOntivero_BSTNode_left = ((SourcesCristianOntivero.BSTNode)(null));
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
                                                                  var_9_previous.SourcesCristianOntivero_BSTNode_right = ((SourcesCristianOntivero.BSTNode)(null));
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

                                          t_24 = var_8_current.SourcesCristianOntivero_BSTNode_left  ==  null;
                                          if (t_24) {
                                            {
                                              {
                                                {
                                                  {
                                                    {
                                                      boolean t_19;

                                                      t_19 = var_9_previous  ==  null;
                                                      if (t_19) {
                                                        {
                                                          {
                                                            {
                                                              {
                                                                {
                                                                  this.SourcesCristianOntivero_BinarySearchTree_root = var_8_current.SourcesCristianOntivero_BSTNode_right;
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

                                                                  t_18 = var_9_previous.SourcesCristianOntivero_BSTNode_elem  >  param_elem_2;
                                                                  if (t_18) {
                                                                    {
                                                                      {
                                                                        {
                                                                          {
                                                                            {
                                                                              var_9_previous.SourcesCristianOntivero_BSTNode_left = var_8_current.SourcesCristianOntivero_BSTNode_right;
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
                                                                              var_9_previous.SourcesCristianOntivero_BSTNode_right = var_8_current.SourcesCristianOntivero_BSTNode_right;
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
                                                      boolean t_23;

                                                      t_23 = var_8_current.SourcesCristianOntivero_BSTNode_right  ==  null;
                                                      if (t_23) {
                                                        {
                                                          {
                                                            {
                                                              {
                                                                {
                                                                  boolean t_21;

                                                                  t_21 = var_9_previous  ==  null;
                                                                  if (t_21) {
                                                                    {
                                                                      {
                                                                        {
                                                                          {
                                                                            {
                                                                              this.SourcesCristianOntivero_BinarySearchTree_root = var_8_current.SourcesCristianOntivero_BSTNode_left;
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

                                                                              t_20 = var_9_previous.SourcesCristianOntivero_BSTNode_elem  >  param_elem_2;
                                                                              if (t_20) {
                                                                                {
                                                                                  {
                                                                                    {
                                                                                      {
                                                                                        {
                                                                                          var_9_previous.SourcesCristianOntivero_BSTNode_left = var_8_current.SourcesCristianOntivero_BSTNode_left;
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
                                                                                          var_9_previous.SourcesCristianOntivero_BSTNode_right = var_8_current.SourcesCristianOntivero_BSTNode_left;
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
                                                                  boolean t_22;
                                                                  SourcesCristianOntivero.BSTNode var_11_inOrderSucc = var_8_current.SourcesCristianOntivero_BSTNode_right;

                                                                  var_9_previous = ((SourcesCristianOntivero.BSTNode)(null));
                                                                  boolean var_12_ws_4;

                                                                  var_12_ws_4 = var_11_inOrderSucc.SourcesCristianOntivero_BSTNode_left  !=  null;
                                                                  while (var_12_ws_4) {
                                                                    var_9_previous = var_11_inOrderSucc;
                                                                    var_11_inOrderSucc = var_11_inOrderSucc.SourcesCristianOntivero_BSTNode_left;
                                                                    var_12_ws_4 = var_11_inOrderSucc.SourcesCristianOntivero_BSTNode_left  !=  null;
                                                                  }
                                                                  var_8_current.SourcesCristianOntivero_BSTNode_elem = var_11_inOrderSucc.SourcesCristianOntivero_BSTNode_elem;
                                                                  t_22 = var_9_previous  ==  null;
                                                                  if (t_22) {
                                                                    {
                                                                      {
                                                                        {
                                                                          {
                                                                            {
                                                                              var_8_current.SourcesCristianOntivero_BSTNode_right = var_11_inOrderSucc.SourcesCristianOntivero_BSTNode_right;
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
                                                                              var_9_previous.SourcesCristianOntivero_BSTNode_left = var_11_inOrderSucc.SourcesCristianOntivero_BSTNode_right;
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
                }
              }
            }
          }
        }
      }
    }
  }

}
