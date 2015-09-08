package SourcesEstebanPintos;

//@ model import org.jmlspecs.lang.*;


public class AVLTree extends java.lang.Object {

  public /*@ nullable @*/ SourcesEstebanPintos.AVLNode SourcesEstebanPintos_AVLTree_root;
  public int SourcesEstebanPintos_AVLTree_size;
  /*@ invariant (\forall SourcesEstebanPintos.AVLNode n; \reach(this.SourcesEstebanPintos_AVLTree_root, SourcesEstebanPintos.AVLNode, SourcesEstebanPintos_AVLNode_leftChild + SourcesEstebanPintos_AVLNode_rightChild).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesEstebanPintos_AVLNode_leftChild, SourcesEstebanPintos.AVLNode, SourcesEstebanPintos_AVLNode_rightChild + SourcesEstebanPintos_AVLNode_leftChild).has(((java.lang.Object)(n)))  ==  false && \reach(n.SourcesEstebanPintos_AVLNode_rightChild, SourcesEstebanPintos.AVLNode, SourcesEstebanPintos_AVLNode_rightChild + SourcesEstebanPintos_AVLNode_leftChild).has(((java.lang.Object)(n)))  ==  false && n.SourcesEstebanPintos_AVLNode_leftChild.SourcesEstebanPintos_AVLNode_height - n.SourcesEstebanPintos_AVLNode_rightChild.SourcesEstebanPintos_AVLNode_height  <  2 && n.SourcesEstebanPintos_AVLNode_leftChild.SourcesEstebanPintos_AVLNode_height - n.SourcesEstebanPintos_AVLNode_rightChild.SourcesEstebanPintos_AVLNode_height  >  -2 && (\forall SourcesEstebanPintos.AVLNode nLeft; ; (\reach(n.SourcesEstebanPintos_AVLNode_leftChild, SourcesEstebanPintos.AVLNode, SourcesEstebanPintos_AVLNode_rightChild + SourcesEstebanPintos_AVLNode_leftChild).has(((java.lang.Object)(nLeft)))  ==  true ==> (nLeft.SourcesEstebanPintos_AVLNode_iData  <  n.SourcesEstebanPintos_AVLNode_iData))) && (\forall SourcesEstebanPintos.AVLNode nRight; ; (\reach(n.SourcesEstebanPintos_AVLNode_rightChild, SourcesEstebanPintos.AVLNode, SourcesEstebanPintos_AVLNode_rightChild + SourcesEstebanPintos_AVLNode_leftChild).has(((java.lang.Object)(nRight)))  ==  true ==> (nRight.SourcesEstebanPintos_AVLNode_iData  >=  n.SourcesEstebanPintos_AVLNode_iData))));
    @*/

  public AVLTree() {
    this.SourcesEstebanPintos_AVLTree_root = ((SourcesEstebanPintos.AVLNode)(null));
    this.SourcesEstebanPintos_AVLTree_size = (byte)0;
    {
      this.SourcesEstebanPintos_AVLTree_root = ((SourcesEstebanPintos.AVLNode)(null));
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\exists SourcesEstebanPintos.AVLNode n; ; ((n.SourcesEstebanPintos_AVLNode_iData  ==  key && \reach(this.SourcesEstebanPintos_AVLTree_root, SourcesEstebanPintos.AVLNode, SourcesEstebanPintos_AVLNode_rightChild + SourcesEstebanPintos_AVLNode_leftChild).has(((java.lang.Object)(n)))  ==  true) ==> \result  ==  n) && ((\forall SourcesEstebanPintos.AVLNode m; \reach(this.SourcesEstebanPintos_AVLTree_root, SourcesEstebanPintos.AVLNode, SourcesEstebanPintos_AVLNode_rightChild + SourcesEstebanPintos_AVLNode_leftChild).has(((java.lang.Object)(m)))  ==  true; m.SourcesEstebanPintos_AVLNode_iData  !=  key) ==> \result  ==  null));
    @ signals (java.lang.Exception e) true;
    @*/
  public SourcesEstebanPintos.AVLNode find(int key) {
    SourcesEstebanPintos.AVLNode var_1_current = this.SourcesEstebanPintos_AVLTree_root;
    boolean var_2_ws_1;

    var_2_ws_1 = var_1_current.SourcesEstebanPintos_AVLNode_iData  !=  key;
    while (var_2_ws_1) {
      boolean t_1;
      boolean t_2;

      t_1 = key  <  var_1_current.SourcesEstebanPintos_AVLNode_iData;

      if (t_1) {
        {
          {
            {
              {
                {
                  var_1_current = var_1_current.SourcesEstebanPintos_AVLNode_leftChild;
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
                  var_1_current = var_1_current.SourcesEstebanPintos_AVLNode_rightChild;
                }
              }
            }
          }
        }
      }
      t_2 = var_1_current  ==  null;

      if (t_2) {
        {
          {
            {
              {
                {
                  return ((SourcesEstebanPintos.AVLNode)(null));
                }
              }
            }
          }
        }
      }
      var_2_ws_1 = var_1_current.SourcesEstebanPintos_AVLNode_iData  !=  key;
    }

    return var_1_current;
  }


  /*@ 
    @ requires true;
    @ ensures (\exists SourcesEstebanPintos.AVLNode n; \reach(this.SourcesEstebanPintos_AVLTree_root, SourcesEstebanPintos.AVLNode, SourcesEstebanPintos_AVLNode_rightChild + SourcesEstebanPintos_AVLNode_leftChild).has(((java.lang.Object)(n)))  ==  true; n.SourcesEstebanPintos_AVLNode_iData  ==  id);
    @ signals (java.lang.Exception e) false;
    @*/
  public void insert(int id) {
    SourcesEstebanPintos.AVLNode t_3;
    boolean t_22;

    this.SourcesEstebanPintos_AVLTree_size = this.SourcesEstebanPintos_AVLTree_size + 1;
    t_3 = new SourcesEstebanPintos.AVLNode();
    SourcesEstebanPintos.AVLNode var_3_newNode = t_3;

    var_3_newNode.SourcesEstebanPintos_AVLNode_iData = id;
    var_3_newNode.SourcesEstebanPintos_AVLNode_balance = 0;
    var_3_newNode.SourcesEstebanPintos_AVLNode_height = 0;
    t_22 = this.SourcesEstebanPintos_AVLTree_root  ==  null;
    if (t_22) {
      {
        {
          {
            {
              {
                this.SourcesEstebanPintos_AVLTree_root = var_3_newNode;
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
                SourcesEstebanPintos.AVLStack t_4;
                boolean t_6;
                boolean t_7;
                boolean t_8;
                boolean t_9;
                boolean t_10;
                SourcesEstebanPintos.AVLNode var_4_current = this.SourcesEstebanPintos_AVLTree_root;
                SourcesEstebanPintos.AVLNode var_5_parent = ((SourcesEstebanPintos.AVLNode)(null));

                t_4 = new SourcesEstebanPintos.AVLStack(this.SourcesEstebanPintos_AVLTree_size);
                SourcesEstebanPintos.AVLStack var_6_S = t_4;
                boolean var_7_ws_2;

                var_7_ws_2 = var_4_current  !=  null;
                while (var_7_ws_2) {
                  boolean t_5;

                  var_6_S.push(var_4_current);
                  var_5_parent = var_4_current;
                  t_5 = id  <  var_4_current.SourcesEstebanPintos_AVLNode_iData;

                  if (t_5) {
                    {
                      {
                        {
                          {
                            {
                              var_4_current = var_4_current.SourcesEstebanPintos_AVLNode_leftChild;
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
                              var_4_current = var_4_current.SourcesEstebanPintos_AVLNode_rightChild;
                            }
                          }
                        }
                      }
                    }
                  }
                  var_7_ws_2 = var_4_current  !=  null;
                }
                t_6 = id  <  var_5_parent.SourcesEstebanPintos_AVLNode_iData;

                if (t_6) {
                  {
                    {
                      {
                        {
                          {
                            var_5_parent.SourcesEstebanPintos_AVLNode_leftChild = var_3_newNode;
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
                            var_5_parent.SourcesEstebanPintos_AVLNode_rightChild = var_3_newNode;
                          }
                        }
                      }
                    }
                  }
                }
                int var_8_leftHeight, var_9_rightHeight;
                SourcesEstebanPintos.AVLNode var_10_pathNode;
                boolean var_11_flag = true;
                boolean var_12_ws_3;

                t_8 = var_6_S.isEmpty();
                t_9 = t_8  ==  false;

                if (t_9) {
                  {
                    {
                      t_10 = var_11_flag  ==  true;
                      if (t_10) {
                        {
                          t_7 = true;
                        }
                      } else {
                        {
                          t_7 = false;
                        }
                      }
                    }
                  }
                } else {
                  {
                    t_7 = false;
                  }
                }
                var_12_ws_3 = t_7;
                while (var_12_ws_3) {
                  SourcesEstebanPintos.AVLNode t_11;
                  boolean t_12;
                  boolean t_13;
                  int t_14;
                  boolean t_15;
                  boolean t_16;
                  boolean t_17;
                  boolean t_18;
                  boolean t_19;
                  boolean t_20;
                  boolean t_21;

                  t_11 = var_6_S.pop();
                  var_10_pathNode = t_11;
                  t_12 = var_10_pathNode.SourcesEstebanPintos_AVLNode_leftChild  ==  null;

                  if (t_12) {
                    {
                      {
                        {
                          {
                            {
                              var_8_leftHeight = -1;
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
                              var_8_leftHeight = var_10_pathNode.SourcesEstebanPintos_AVLNode_leftChild.SourcesEstebanPintos_AVLNode_height;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_13 = var_10_pathNode.SourcesEstebanPintos_AVLNode_rightChild  ==  null;

                  if (t_13) {
                    {
                      {
                        {
                          {
                            {
                              var_9_rightHeight = -1;
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
                              var_9_rightHeight = var_10_pathNode.SourcesEstebanPintos_AVLNode_rightChild.SourcesEstebanPintos_AVLNode_height;
                            }
                          }
                        }
                      }
                    }
                  }
                  var_10_pathNode.SourcesEstebanPintos_AVLNode_balance = var_9_rightHeight - var_8_leftHeight;
                  t_14 = this.max(var_8_leftHeight, var_9_rightHeight);
                  var_10_pathNode.SourcesEstebanPintos_AVLNode_height = 1 + t_14;
                  t_16 = var_10_pathNode.SourcesEstebanPintos_AVLNode_balance  <  -1;

                  if ((t_16)) {
                    {
                      t_15 = true;
                    }
                  } else {
                    {
                      {
                        t_17 = var_10_pathNode.SourcesEstebanPintos_AVLNode_balance  >  1;
                        if ((t_17)) {
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
                  }

                  if (t_15) {
                    {
                      {
                        {
                          {
                            {
                              var_11_flag = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_19 = var_6_S.isEmpty();
                  t_20 = t_19  ==  false;

                  if (t_20) {
                    {
                      {
                        t_21 = var_11_flag  ==  true;
                        if (t_21) {
                          {
                            t_18 = true;
                          }
                        } else {
                          {
                            t_18 = false;
                          }
                        }
                      }
                    }
                  } else {
                    {
                      t_18 = false;
                    }
                  }
                  var_12_ws_3 = t_18;
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
  public int max(int x, int y) {
    boolean t_23;

    t_23 = x  >  y;
    if (t_23) {
      {
        {
          {
            {
              {
                return x;
              }
            }
          }
        }
      }
    }

    return y;
  }

}
