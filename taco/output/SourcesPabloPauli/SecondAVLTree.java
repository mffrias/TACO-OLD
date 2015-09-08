package SourcesPabloPauli;

//@ model import org.jmlspecs.lang.*;


public class SecondAVLTree extends java.lang.Object {

  public /*@ nullable @*/ SourcesPabloPauli.SecondAVLNode SourcesPabloPauli_SecondAVLTree_root;
  /*@ invariant (\forall SourcesPabloPauli.SecondAVLNode n; \reach(this.SourcesPabloPauli_SecondAVLTree_root, SourcesPabloPauli.SecondAVLNode, SourcesPabloPauli_SecondAVLNode_right + SourcesPabloPauli_SecondAVLNode_left).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesPabloPauli_SecondAVLNode_right, SourcesPabloPauli.SecondAVLNode, SourcesPabloPauli_SecondAVLNode_left + SourcesPabloPauli_SecondAVLNode_right).has(((java.lang.Object)(n)))  ==  false && \reach(n.SourcesPabloPauli_SecondAVLNode_left, SourcesPabloPauli.SecondAVLNode, SourcesPabloPauli_SecondAVLNode_right + SourcesPabloPauli_SecondAVLNode_left).has(((java.lang.Object)(n)))  ==  false);
    @*/
  /*@ invariant (\forall SourcesPabloPauli.SecondAVLNode n; ; n.SourcesPabloPauli_SecondAVLNode_right  ==  null || n.SourcesPabloPauli_SecondAVLNode_right.SourcesPabloPauli_SecondAVLNode_value  >  n.SourcesPabloPauli_SecondAVLNode_value && n.SourcesPabloPauli_SecondAVLNode_left  ==  null || n.SourcesPabloPauli_SecondAVLNode_left.SourcesPabloPauli_SecondAVLNode_value  <=  n.SourcesPabloPauli_SecondAVLNode_value);
    @*/

  /*@ 
    @ requires true;
    @ ensures true;
    @*/
  public SourcesPabloPauli.SecondAVLNode lookup(int value) {
    int param_value_0;

    param_value_0 = value;
    {
      SourcesPabloPauli.SecondAVLNode var_1_currentNode = this.SourcesPabloPauli_SecondAVLTree_root;
      boolean var_2_ws_1;

      var_2_ws_1 = var_1_currentNode  !=  null;
      while (var_2_ws_1) {
        boolean t_3;

        t_3 = var_1_currentNode.SourcesPabloPauli_SecondAVLNode_value  ==  param_value_0;

        if (t_3) {
          {
            {
              {
                {
                  {
                    return var_1_currentNode;
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
                    SourcesPabloPauli.SecondAVLNode t_1;
                    boolean t_2;

                    t_2 = param_value_0  <  var_1_currentNode.SourcesPabloPauli_SecondAVLNode_value;

                    if (t_2) {
                      {
                        t_1 = var_1_currentNode.SourcesPabloPauli_SecondAVLNode_left;
                      }
                    } else {
                      {
                        t_1 = var_1_currentNode.SourcesPabloPauli_SecondAVLNode_right;
                      }
                    }
                    var_1_currentNode = t_1;
                  }
                }
              }
            }
          }
        }
        var_2_ws_1 = var_1_currentNode  !=  null;
      }

      return ((SourcesPabloPauli.SecondAVLNode)(null));
    }
  }
/** LL or LR type if balance factor == 2; rotateRight for keyNode if bf of
 keyNode.left == -1, it's LR type; rotateLeft for keyNode.left first RR or
 RL type if balance factor == -2; rotateLeft for keyNode if bf of
 keyNode.right == 1, it's RL type; rotateRight for keyNode.right first
 @param keyNode
*/

  public SourcesPabloPauli.SecondAVLNode adjustTreeByRotation(SourcesPabloPauli.SecondAVLNode keyNode) throws java.lang.Exception {
    SourcesPabloPauli.SecondAVLNode param_keyNode_1;

    param_keyNode_1 = keyNode;
    {
      int t_4;
      boolean t_15;
      boolean t_17;
      SourcesPabloPauli.SecondAVLNode var_3_newKeyNode = ((SourcesPabloPauli.SecondAVLNode)(null));

      t_4 = param_keyNode_1.getBalanceFactor();
      int var_4_bf_keyNode = t_4;

      t_15 = var_4_bf_keyNode  ==  2;

      if (t_15) {
        {
          {
            {
              {
                {
                  int t_6;
                  boolean t_7;
                  SourcesPabloPauli.SecondAVLNode t_8;

                  t_6 = keyNode.SourcesPabloPauli_SecondAVLNode_left.getBalanceFactor();
                  t_7 = t_6  ==  -1;

                  if (t_7) {
                    {
                      {
                        {
                          {
                            {
                              SourcesPabloPauli.SecondAVLNode t_5;

                              t_5 = keyNode.SourcesPabloPauli_SecondAVLNode_left.rotateLeft();
                              param_keyNode_1.setLeft(t_5);
                            }
                          }
                        }
                      }
                    }
                  }
                  t_8 = param_keyNode_1.rotateRight();
                  var_3_newKeyNode = t_8;
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
                  boolean t_14;

                  t_14 = var_4_bf_keyNode  ==  -2;
                  if (t_14) {
                    {
                      {
                        {
                          {
                            {
                              int t_10;
                              boolean t_11;
                              SourcesPabloPauli.SecondAVLNode t_12;

                              t_10 = keyNode.SourcesPabloPauli_SecondAVLNode_right.getBalanceFactor();
                              t_11 = t_10  ==  1;

                              if (t_11) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          SourcesPabloPauli.SecondAVLNode t_9;

                                          t_9 = keyNode.SourcesPabloPauli_SecondAVLNode_right.rotateRight();
                                          param_keyNode_1.setRight(t_9);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              t_12 = param_keyNode_1.rotateLeft();
                              var_3_newKeyNode = t_12;
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
                              java.lang.Exception t_13;

                              t_13 = new java.lang.Exception();
                              throw t_13;
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
      t_17 = keyNode.SourcesPabloPauli_SecondAVLNode_parent  ==  null;
      if (t_17) {
        {
          {
            {
              {
                {
                  this.SourcesPabloPauli_SecondAVLTree_root = var_3_newKeyNode;
                  this.SourcesPabloPauli_SecondAVLTree_root.SourcesPabloPauli_SecondAVLNode_parent = ((SourcesPabloPauli.SecondAVLNode)(null));
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

                  t_16 = param_keyNode_1  ==  keyNode.SourcesPabloPauli_SecondAVLNode_parent.SourcesPabloPauli_SecondAVLNode_left;

                  if (t_16) {
                    {
                      {
                        {
                          {
                            {
                              keyNode.SourcesPabloPauli_SecondAVLNode_parent.setLeft(var_3_newKeyNode);
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
                              keyNode.SourcesPabloPauli_SecondAVLNode_parent.setRight(var_3_newKeyNode);
                            }
                          }
                        }
                      }
                    }
                  }
                  var_3_newKeyNode.SourcesPabloPauli_SecondAVLNode_parent.adjustHeight();
                }
              }
            }
          }
        }
      }

      return var_3_newKeyNode;
    }
  }


  public SecondAVLTree() {
    this.SourcesPabloPauli_SecondAVLTree_root = ((SourcesPabloPauli.SecondAVLNode)(null));
  }

}
