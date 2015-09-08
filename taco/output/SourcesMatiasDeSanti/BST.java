package SourcesMatiasDeSanti;

//@ model import org.jmlspecs.lang.*;


public class BST extends java.lang.Object {

  public /*@ nullable @*/ SourcesMatiasDeSanti.BSTNode SourcesMatiasDeSanti_BST_root;
  /*@ invariant (\forall SourcesMatiasDeSanti.BSTNode n; \reach(this.SourcesMatiasDeSanti_BST_root, SourcesMatiasDeSanti.BSTNode, SourcesMatiasDeSanti_BSTNode_right + SourcesMatiasDeSanti_BSTNode_left).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesMatiasDeSanti_BSTNode_left, SourcesMatiasDeSanti.BSTNode, SourcesMatiasDeSanti_BSTNode_right + SourcesMatiasDeSanti_BSTNode_left).has(((java.lang.Object)(n)))  ==  false && \reach(n.SourcesMatiasDeSanti_BSTNode_right, SourcesMatiasDeSanti.BSTNode, SourcesMatiasDeSanti_BSTNode_right + SourcesMatiasDeSanti_BSTNode_left).has(((java.lang.Object)(n)))  ==  false && (\forall SourcesMatiasDeSanti.BSTNode m; \reach(n.SourcesMatiasDeSanti_BSTNode_left, SourcesMatiasDeSanti.BSTNode, SourcesMatiasDeSanti_BSTNode_right + SourcesMatiasDeSanti_BSTNode_left).has(((java.lang.Object)(m)))  ==  true; m.SourcesMatiasDeSanti_BSTNode_el  <  n.SourcesMatiasDeSanti_BSTNode_el) && (\forall SourcesMatiasDeSanti.BSTNode o; \reach(n.SourcesMatiasDeSanti_BSTNode_right, SourcesMatiasDeSanti.BSTNode, SourcesMatiasDeSanti_BSTNode_right + SourcesMatiasDeSanti_BSTNode_left).has(((java.lang.Object)(o)))  ==  true; o.SourcesMatiasDeSanti_BSTNode_el  >=  n.SourcesMatiasDeSanti_BSTNode_el));
    @*/

  public BST() {
    this.SourcesMatiasDeSanti_BST_root = ((SourcesMatiasDeSanti.BSTNode)(null));
    {
    }
  }


  public void clear() {
    {
      this.SourcesMatiasDeSanti_BST_root = ((SourcesMatiasDeSanti.BSTNode)(null));
    }
  }


  public boolean isEmpty() {
    {
      boolean t_1;

      t_1 = this.SourcesMatiasDeSanti_BST_root  ==  null;

      return t_1;
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\reach(this.SourcesMatiasDeSanti_BST_root, SourcesMatiasDeSanti.BSTNode, SourcesMatiasDeSanti_BSTNode_right + SourcesMatiasDeSanti_BSTNode_left).int_size()  ==  \old(\reach(this.SourcesMatiasDeSanti_BST_root, SourcesMatiasDeSanti.BSTNode, SourcesMatiasDeSanti_BSTNode_right + SourcesMatiasDeSanti_BSTNode_left)).int_size() + 1);
    @ signals (java.lang.Exception e) false;
    @*/
  public void insert(int el) {
    int param_el_0;

    param_el_0 = el;
    {
      boolean t_7;
      SourcesMatiasDeSanti.BSTNode var_1_p = this.SourcesMatiasDeSanti_BST_root;
      SourcesMatiasDeSanti.BSTNode var_2_prev = ((SourcesMatiasDeSanti.BSTNode)(null));
      boolean var_3_ws_1;

      var_3_ws_1 = var_1_p  !=  null;
      while (var_3_ws_1) {
        boolean t_2;

        var_2_prev = var_1_p;
        t_2 = param_el_0  <  var_1_p.SourcesMatiasDeSanti_BSTNode_el;

        if (t_2) {
          {
            {
              {
                {
                  {
                    var_1_p = var_1_p.SourcesMatiasDeSanti_BSTNode_left;
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
                    var_1_p = var_1_p.SourcesMatiasDeSanti_BSTNode_right;
                  }
                }
              }
            }
          }
        }
        var_3_ws_1 = var_1_p  !=  null;
      }
      t_7 = this.SourcesMatiasDeSanti_BST_root  ==  null;
      if (t_7) {
        {
          {
            {
              {
                {
                  SourcesMatiasDeSanti.BSTNode t_3;

                  t_3 = new SourcesMatiasDeSanti.BSTNode(param_el_0);
                  this.SourcesMatiasDeSanti_BST_root = t_3;
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
                  boolean t_6;

                  t_6 = param_el_0  <  var_2_prev.SourcesMatiasDeSanti_BSTNode_el;
                  if (t_6) {
                    {
                      {
                        {
                          {
                            {
                              SourcesMatiasDeSanti.BSTNode t_4;

                              t_4 = new SourcesMatiasDeSanti.BSTNode(param_el_0);
                              var_2_prev.SourcesMatiasDeSanti_BSTNode_left = t_4;
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
                              SourcesMatiasDeSanti.BSTNode t_5;

                              t_5 = new SourcesMatiasDeSanti.BSTNode(param_el_0);
                              var_2_prev.SourcesMatiasDeSanti_BSTNode_right = t_5;
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


  /*@ 
    @ requires el  ==  34;
    @ ensures \result  ==  true <==> (\exists SourcesMatiasDeSanti.BSTNode n; n.SourcesMatiasDeSanti_BSTNode_el  ==  el; \reach(this.SourcesMatiasDeSanti_BST_root, SourcesMatiasDeSanti.BSTNode, SourcesMatiasDeSanti_BSTNode_right + SourcesMatiasDeSanti_BSTNode_left).has(((java.lang.Object)(n)))  ==  true);
    @ signals (java.lang.Exception e) false;
    @*/
  public boolean search(int el) {
    int param_el_1;

    param_el_1 = el;
    {
      SourcesMatiasDeSanti.BSTNode var_4_p = this.SourcesMatiasDeSanti_BST_root.SourcesMatiasDeSanti_BSTNode_left;
      boolean var_5_ws_2;

      var_5_ws_2 = var_4_p  !=  null;
      while (var_5_ws_2) {
        int t_9;
        boolean t_10;

        t_9 = param_el_1 - var_4_p.SourcesMatiasDeSanti_BSTNode_el;
        t_10 = t_9  ==  0;

        if (t_10) {
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
                    boolean t_8;

                    t_8 = param_el_1  <  var_4_p.SourcesMatiasDeSanti_BSTNode_el;
                    if (t_8) {
                      {
                        {
                          {
                            {
                              {
                                var_4_p = var_4_p.SourcesMatiasDeSanti_BSTNode_left;
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
                                var_4_p = var_4_p.SourcesMatiasDeSanti_BSTNode_right;
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
        var_5_ws_2 = var_4_p  !=  null;
      }

      return false;
    }
  }


  /*@ 
    @ requires true;
    @ ensures \result  ==  true <==> (\exists SourcesMatiasDeSanti.BSTNode n; n.SourcesMatiasDeSanti_BSTNode_el  ==  element; \old(\reach(this.SourcesMatiasDeSanti_BST_root, SourcesMatiasDeSanti.BSTNode, SourcesMatiasDeSanti_BSTNode_right + SourcesMatiasDeSanti_BSTNode_left)).has(((java.lang.Object)(n)))  ==  true);
    @ signals (java.lang.Exception e) false;
    @*/
  public boolean deleteByCopying(int element) {
    int param_element_2;

    param_element_2 = element;
    {
      boolean t_11;
      boolean t_12;
      boolean t_13;
      boolean t_24;
      boolean t_25;
      boolean t_26;
      SourcesMatiasDeSanti.BSTNode var_6_node, var_7_p = this.SourcesMatiasDeSanti_BST_root, var_8_prev = ((SourcesMatiasDeSanti.BSTNode)(null));
      boolean var_9_ws_3;

      t_12 = var_7_p  !=  null;

      if (t_12) {
        {
          {
            t_13 = var_7_p.SourcesMatiasDeSanti_BSTNode_el  !=  param_element_2;
            if (t_13) {
              {
                t_11 = true;
              }
            } else {
              {
                t_11 = false;
              }
            }
          }
        }
      } else {
        {
          t_11 = false;
        }
      }
      var_9_ws_3 = t_11;
      while (var_9_ws_3) {
        boolean t_14;
        boolean t_15;
        boolean t_16;
        boolean t_17;

        var_8_prev = var_7_p;
        t_14 = param_element_2  <  var_7_p.SourcesMatiasDeSanti_BSTNode_el;

        if (t_14) {
          {
            {
              {
                {
                  {
                    var_7_p = var_7_p.SourcesMatiasDeSanti_BSTNode_left;
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
                    var_7_p = var_7_p.SourcesMatiasDeSanti_BSTNode_right;
                  }
                }
              }
            }
          }
        }
        t_16 = var_7_p  !=  null;

        if (t_16) {
          {
            {
              t_17 = var_7_p.SourcesMatiasDeSanti_BSTNode_el  !=  param_element_2;
              if (t_17) {
                {
                  t_15 = true;
                }
              } else {
                {
                  t_15 = false;
                }
              }
            }
          }
        } else {
          {
            t_15 = false;
          }
        }
        var_9_ws_3 = t_15;
      }
      var_6_node = var_7_p;
      t_25 = var_7_p  !=  null;

      if (t_25) {
        {
          {
            t_26 = var_7_p.SourcesMatiasDeSanti_BSTNode_el  ==  param_element_2;
            if (t_26) {
              {
                t_24 = true;
              }
            } else {
              {
                t_24 = false;
              }
            }
          }
        }
      } else {
        {
          t_24 = false;
        }
      }
      if (t_24) {
        {
          {
            {
              {
                {
                  boolean t_20;
                  boolean t_22;

                  t_20 = var_6_node.SourcesMatiasDeSanti_BSTNode_right  ==  null;

                  if (t_20) {
                    {
                      {
                        {
                          {
                            {
                              var_6_node = var_6_node.SourcesMatiasDeSanti_BSTNode_left;
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

                              t_19 = var_6_node.SourcesMatiasDeSanti_BSTNode_left  ==  null;
                              if (t_19) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          var_6_node = var_6_node.SourcesMatiasDeSanti_BSTNode_right;
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
                                          SourcesMatiasDeSanti.BSTNode var_10_tmp = var_6_node.SourcesMatiasDeSanti_BSTNode_left;
                                          SourcesMatiasDeSanti.BSTNode var_11_previous = var_6_node;
                                          boolean var_12_ws_4;

                                          var_12_ws_4 = var_10_tmp.SourcesMatiasDeSanti_BSTNode_right  !=  null;
                                          while (var_12_ws_4) {
                                            var_11_previous = var_10_tmp;
                                            var_10_tmp = var_10_tmp.SourcesMatiasDeSanti_BSTNode_right;
                                            var_12_ws_4 = var_10_tmp.SourcesMatiasDeSanti_BSTNode_right  !=  null;
                                          }
                                          var_6_node.SourcesMatiasDeSanti_BSTNode_el = var_10_tmp.SourcesMatiasDeSanti_BSTNode_el;
                                          t_18 = var_11_previous  ==  var_6_node;
                                          if (t_18) {
                                            {
                                              {
                                                {
                                                  {
                                                    {
                                                      var_11_previous.SourcesMatiasDeSanti_BSTNode_left = var_10_tmp.SourcesMatiasDeSanti_BSTNode_left;
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
                                                      var_11_previous.SourcesMatiasDeSanti_BSTNode_right = var_10_tmp.SourcesMatiasDeSanti_BSTNode_left;
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
                  t_22 = var_7_p  ==  this.SourcesMatiasDeSanti_BST_root;
                  if (t_22) {
                    {
                      {
                        {
                          {
                            {
                              this.SourcesMatiasDeSanti_BST_root = var_6_node;
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
                              boolean t_21;

                              t_21 = var_8_prev.SourcesMatiasDeSanti_BSTNode_left  ==  var_7_p;
                              if (t_21) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          var_8_prev.SourcesMatiasDeSanti_BSTNode_left = var_6_node;
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
                                          var_8_prev.SourcesMatiasDeSanti_BSTNode_right = var_6_node;
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

                  t_23 = this.SourcesMatiasDeSanti_BST_root  !=  null;
                  if (t_23) {
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
                  } else {
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
                }
              }
            }
          }
        }
      }

      return true;
    }
  }

}
