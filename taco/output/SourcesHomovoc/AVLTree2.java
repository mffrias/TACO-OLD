package SourcesHomovoc;

//@ model import org.jmlspecs.lang.*;


public class AVLTree2 extends java.lang.Object {

  public /*@ nullable @*/ SourcesHomovoc.AVLNode2 SourcesHomovoc_AVLTree2_root;
  /*@ invariant (\forall SourcesHomovoc.AVLNode2 n; \reach(this.SourcesHomovoc_AVLTree2_root, SourcesHomovoc.AVLNode2, SourcesHomovoc_AVLNode2_left + SourcesHomovoc_AVLNode2_right).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesHomovoc_AVLNode2_left, SourcesHomovoc.AVLNode2, SourcesHomovoc_AVLNode2_right + SourcesHomovoc_AVLNode2_left).has(((java.lang.Object)(n)))  ==  false && \reach(n.SourcesHomovoc_AVLNode2_right, SourcesHomovoc.AVLNode2, SourcesHomovoc_AVLNode2_right + SourcesHomovoc_AVLNode2_left).has(((java.lang.Object)(n)))  ==  false && (\forall SourcesHomovoc.AVLNode2 m; \reach(n.SourcesHomovoc_AVLNode2_left, SourcesHomovoc.AVLNode2, SourcesHomovoc_AVLNode2_left + SourcesHomovoc_AVLNode2_right).has(((java.lang.Object)(m))); m.SourcesHomovoc_AVLNode2_value  <  n.SourcesHomovoc_AVLNode2_value) && (\forall SourcesHomovoc.AVLNode2 m; \reach(n.SourcesHomovoc_AVLNode2_right, SourcesHomovoc.AVLNode2, SourcesHomovoc_AVLNode2_left + SourcesHomovoc_AVLNode2_right).has(((java.lang.Object)(m))); n.SourcesHomovoc_AVLNode2_value  <  m.SourcesHomovoc_AVLNode2_value) && (n.SourcesHomovoc_AVLNode2_left  ==  null && n.SourcesHomovoc_AVLNode2_right  ==  null ==> n.SourcesHomovoc_AVLNode2_height  ==  0) && (n.SourcesHomovoc_AVLNode2_left  ==  null && n.SourcesHomovoc_AVLNode2_right  ==  null ==> n.SourcesHomovoc_AVLNode2_height  ==  0) && (n.SourcesHomovoc_AVLNode2_left  ==  null && n.SourcesHomovoc_AVLNode2_right  !=  null ==> n.SourcesHomovoc_AVLNode2_height  ==  1 && n.SourcesHomovoc_AVLNode2_right.SourcesHomovoc_AVLNode2_height  ==  0) && (n.SourcesHomovoc_AVLNode2_left  !=  null && n.SourcesHomovoc_AVLNode2_right  ==  null ==> n.SourcesHomovoc_AVLNode2_height  ==  1 && n.SourcesHomovoc_AVLNode2_left.SourcesHomovoc_AVLNode2_height  ==  0) && (n.SourcesHomovoc_AVLNode2_left  !=  null && n.SourcesHomovoc_AVLNode2_right  !=  null ==> n.SourcesHomovoc_AVLNode2_height  ==  (n.SourcesHomovoc_AVLNode2_left.SourcesHomovoc_AVLNode2_height  >  n.SourcesHomovoc_AVLNode2_right.SourcesHomovoc_AVLNode2_height ? n.SourcesHomovoc_AVLNode2_left.SourcesHomovoc_AVLNode2_height : n.SourcesHomovoc_AVLNode2_right.SourcesHomovoc_AVLNode2_height) + 1 && ((n.SourcesHomovoc_AVLNode2_left.SourcesHomovoc_AVLNode2_height  >  n.SourcesHomovoc_AVLNode2_right.SourcesHomovoc_AVLNode2_height ? n.SourcesHomovoc_AVLNode2_left.SourcesHomovoc_AVLNode2_height - n.SourcesHomovoc_AVLNode2_right.SourcesHomovoc_AVLNode2_height : n.SourcesHomovoc_AVLNode2_right.SourcesHomovoc_AVLNode2_height - n.SourcesHomovoc_AVLNode2_left.SourcesHomovoc_AVLNode2_height))  <=  1) && (n.SourcesHomovoc_AVLNode2_right  !=  null ==> n.SourcesHomovoc_AVLNode2_right.SourcesHomovoc_AVLNode2_parent  ==  n) && (n.SourcesHomovoc_AVLNode2_left  !=  null ==> n.SourcesHomovoc_AVLNode2_left.SourcesHomovoc_AVLNode2_parent  ==  n) && (n  ==  this.SourcesHomovoc_AVLTree2_root ==> n.SourcesHomovoc_AVLNode2_parent  ==  null));
    @*/

  public AVLTree2() {
    this.SourcesHomovoc_AVLTree2_root = ((SourcesHomovoc.AVLNode2)(null));
    {
    }
  }


  /*@ 
    @ requires (\forall SourcesHomovoc.AVLNode2 n; (\reach(this.SourcesHomovoc_AVLTree2_root, SourcesHomovoc.AVLNode2, SourcesHomovoc_AVLNode2_left + SourcesHomovoc_AVLNode2_right)).has(((java.lang.Object)(n))); n.SourcesHomovoc_AVLNode2_value  !=  value);
    @ ensures (\reach(this.SourcesHomovoc_AVLTree2_root, SourcesHomovoc.AVLNode2, SourcesHomovoc_AVLNode2_left + SourcesHomovoc_AVLNode2_right).int_size()  ==  \old(\reach(this.SourcesHomovoc_AVLTree2_root, SourcesHomovoc.AVLNode2, SourcesHomovoc_AVLNode2_left + SourcesHomovoc_AVLNode2_right)).int_size() + 1);
    @ signals (java.lang.Exception e) false;
    @*/
  public void insert(int value) {
    boolean t_6;

    t_6 = this.SourcesHomovoc_AVLTree2_root  ==  null;
    if (t_6) {
      {
        {
          {
            {
              {
                SourcesHomovoc.AVLNode2 t_1;

                t_1 = new SourcesHomovoc.AVLNode2(value);
                this.SourcesHomovoc_AVLTree2_root = t_1;
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
                SourcesHomovoc.AVLNode2 t_2;
                SourcesHomovoc.AVLNode2 t_3;
                boolean t_5;

                t_2 = new SourcesHomovoc.AVLNode2(value);
                SourcesHomovoc.AVLNode2 var_1_newNode = t_2;

                this.SourcesHomovoc_AVLTree2_root.insertToLeaf(var_1_newNode);
                t_3 = this.updateHeightsAndDetectKeyNode(var_1_newNode);
                SourcesHomovoc.AVLNode2 var_2_keyNode = t_3;

                t_5 = var_2_keyNode  !=  null;
                if (t_5) {
                  {
                    {
                      {
                        {
                          {
                            SourcesHomovoc.AVLNode2 t_4;

                            t_4 = this.adjustTreeByRotation(var_2_keyNode);
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
    @ requires true;
    @ ensures (\reach(this.SourcesHomovoc_AVLTree2_root, SourcesHomovoc.AVLNode2, SourcesHomovoc_AVLNode2_left + SourcesHomovoc_AVLNode2_right).int_size()  ==  \old(\reach(this.SourcesHomovoc_AVLTree2_root, SourcesHomovoc.AVLNode2, SourcesHomovoc_AVLNode2_left + SourcesHomovoc_AVLNode2_right)).int_size() - 1) <==> (\exists SourcesHomovoc.AVLNode2 n; \old(\reach(this.SourcesHomovoc_AVLTree2_root, SourcesHomovoc.AVLNode2, SourcesHomovoc_AVLNode2_left + SourcesHomovoc_AVLNode2_right)).has(((java.lang.Object)(n))); n.SourcesHomovoc_AVLNode2_value  ==  value);
    @ signals (java.lang.Exception e) false;
    @*/
  public void delete(int value) {
    SourcesHomovoc.AVLNode2 t_7;
    boolean t_11;

    t_7 = this.deleteBeforeAdjustment(value);
    SourcesHomovoc.AVLNode2 var_3_parentOfDeletedLeaf = t_7;

    t_11 = var_3_parentOfDeletedLeaf  !=  null;
    if (t_11) {
      {
        {
          {
            {
              {
                SourcesHomovoc.AVLNode2 t_8;
                boolean t_10;

                t_8 = this.detectKeyNode(var_3_parentOfDeletedLeaf);
                SourcesHomovoc.AVLNode2 var_4_keyNode = t_8;

                t_10 = var_4_keyNode  !=  null;
                if (t_10) {
                  {
                    {
                      {
                        {
                          {
                            SourcesHomovoc.AVLNode2 t_9;

                            t_9 = this.adjustTreeByRotation(var_4_keyNode);
                            SourcesHomovoc.AVLNode2 var_5_newkeyNode = t_9;

                            this.updateHeights(var_5_newkeyNode.SourcesHomovoc_AVLNode2_parent);
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


  public SourcesHomovoc.AVLNode2 detectKeyNode(SourcesHomovoc.AVLNode2 parentOfDeletedLeaf) {
    SourcesHomovoc.AVLNode2 var_6_currentNode = parentOfDeletedLeaf;
    boolean var_7_ws_1;

    var_7_ws_1 = var_6_currentNode  !=  null;
    while (var_7_ws_1) {
      int t_12;
      boolean t_13;
      boolean t_14;
      boolean t_15;

      t_12 = var_6_currentNode.getBalanceFactor();
      int var_8_bf = t_12;

      t_14 = var_8_bf  ==  2;

      if (t_14) {
        {
          t_13 = true;
        }
      } else {
        {
          {
            t_15 = var_8_bf  ==  -2;
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
      }

      if (t_13) {
        {
          {
            {
              {
                {
                  return var_6_currentNode;
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
                  var_6_currentNode = var_6_currentNode.SourcesHomovoc_AVLNode2_parent;
                }
              }
            }
          }
        }
      }
      var_7_ws_1 = var_6_currentNode  !=  null;
    }

    return ((SourcesHomovoc.AVLNode2)(null));
  }


  public SourcesHomovoc.AVLNode2 deleteBeforeAdjustment(int value) {
    boolean t_16;
    boolean t_17;
    boolean t_18;
    boolean t_33;
    SourcesHomovoc.AVLNode2 var_9_currentNode = this.SourcesHomovoc_AVLTree2_root;
    boolean var_10_found = false;
    boolean var_11_ws_2;

    t_17 = var_9_currentNode  !=  null;

    if (t_17) {
      {
        {
          t_18 = ! var_10_found;
          if (t_18) {
            {
              t_16 = true;
            }
          } else {
            {
              t_16 = false;
            }
          }
        }
      }
    } else {
      {
        t_16 = false;
      }
    }
    var_11_ws_2 = t_16;
    while (var_11_ws_2) {
      boolean t_20;
      boolean t_21;
      boolean t_22;
      boolean t_23;

      t_20 = var_9_currentNode.SourcesHomovoc_AVLNode2_value  ==  value;

      if (t_20) {
        {
          {
            {
              {
                {
                  var_10_found = true;
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

                  t_19 = value  <  var_9_currentNode.SourcesHomovoc_AVLNode2_value;
                  if (t_19) {
                    {
                      {
                        {
                          {
                            {
                              var_9_currentNode = var_9_currentNode.SourcesHomovoc_AVLNode2_left;
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
                              var_9_currentNode = var_9_currentNode.SourcesHomovoc_AVLNode2_right;
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
      t_22 = var_9_currentNode  !=  null;

      if (t_22) {
        {
          {
            t_23 = ! var_10_found;
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
      var_11_ws_2 = t_21;
    }
    t_33 = var_9_currentNode  !=  null;
    if (t_33) {
      {
        {
          {
            {
              {
                boolean t_24;
                SourcesHomovoc.AVLNode2 t_30;
                boolean t_32;
                boolean var_12_ws_3;

                t_24 = var_9_currentNode.isLeaf();
                var_12_ws_3 = ! t_24;
                while (var_12_ws_3) {
                  int t_27;
                  boolean t_28;
                  boolean t_29;
                  SourcesHomovoc.AVLNode2 var_13_replacement = ((SourcesHomovoc.AVLNode2)(null));

                  t_27 = var_9_currentNode.getBalanceFactor();
                  t_28 = t_27  <  0;

                  if (t_28) {
                    {
                      {
                        {
                          {
                            {
                              SourcesHomovoc.AVLNode2 t_25;

                              t_25 = var_9_currentNode.SourcesHomovoc_AVLNode2_right.getLeftmost();
                              var_13_replacement = t_25;
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
                              SourcesHomovoc.AVLNode2 t_26;

                              t_26 = var_9_currentNode.SourcesHomovoc_AVLNode2_left.getRightmost();
                              var_13_replacement = t_26;
                            }
                          }
                        }
                      }
                    }
                  }
                  var_9_currentNode.SourcesHomovoc_AVLNode2_value = var_13_replacement.SourcesHomovoc_AVLNode2_value;
                  var_9_currentNode = var_13_replacement;
                  t_29 = var_9_currentNode.isLeaf();
                  var_12_ws_3 = ! t_29;
                }
                t_30 = var_9_currentNode.getParent();
                SourcesHomovoc.AVLNode2 var_14_parent = t_30;

                t_32 = var_14_parent  ==  null;

                if (t_32) {
                  {
                    {
                      {
                        {
                          {
                            this.SourcesHomovoc_AVLTree2_root = ((SourcesHomovoc.AVLNode2)(null));
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

                            t_31 = var_9_currentNode  ==  var_14_parent.SourcesHomovoc_AVLNode2_left;
                            if (t_31) {
                              {
                                {
                                  {
                                    {
                                      {
                                        var_14_parent.setLeft(((SourcesHomovoc.AVLNode2)(null)));
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
                                        var_14_parent.setRight(((SourcesHomovoc.AVLNode2)(null)));
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
                this.updateHeights(var_14_parent);

                return var_14_parent;
              }
            }
          }
        }
      }
    }

    return ((SourcesHomovoc.AVLNode2)(null));
  }


  public void updateHeights(SourcesHomovoc.AVLNode2 fromParentOfDeletedLeaf) {
    SourcesHomovoc.AVLNode2 var_15_currentNode = fromParentOfDeletedLeaf;

    var_15_currentNode.adjustHeight();
    boolean var_16_ws_4;

    var_16_ws_4 = var_15_currentNode  !=  null;
    while (var_16_ws_4) {
      var_15_currentNode.adjustHeight();
      var_15_currentNode = var_15_currentNode.SourcesHomovoc_AVLNode2_parent;
      var_16_ws_4 = var_15_currentNode  !=  null;
    }
  }
/** called by insert(int) keyNode: the node closest to the newly inserted
 node where |BF|>1
 
 @param newNode
            : newly added leaf AVLNode2
 @return keyNode
*/

  public SourcesHomovoc.AVLNode2 updateHeightsAndDetectKeyNode(SourcesHomovoc.AVLNode2 newNode) {
    boolean t_34;
    boolean t_35;
    boolean t_36;
    SourcesHomovoc.AVLNode2 var_17_keyNode = ((SourcesHomovoc.AVLNode2)(null));
    boolean var_18_found = false;
    boolean var_19_ws_5;

    t_35 = newNode.SourcesHomovoc_AVLNode2_parent  !=  null;

    if (t_35) {
      {
        {
          t_36 = ! var_18_found;
          if (t_36) {
            {
              t_34 = true;
            }
          } else {
            {
              t_34 = false;
            }
          }
        }
      }
    } else {
      {
        t_34 = false;
      }
    }
    var_19_ws_5 = t_34;
    while (var_19_ws_5) {
      SourcesHomovoc.AVLNode2 t_47;
      int t_48;
      boolean t_49;
      boolean t_50;
      boolean t_51;
      boolean t_52;

      t_47 = newNode.getParent();
      t_48 = t_47.SourcesHomovoc_AVLNode2_height - newNode.SourcesHomovoc_AVLNode2_height;
      t_49 = t_48  !=  1;

      if (t_49) {
        {
          {
            {
              {
                {
                  boolean t_43;
                  SourcesHomovoc.AVLNode2 t_44;
                  int t_45;
                  SourcesHomovoc.AVLNode2 t_46;

                  t_43 = var_17_keyNode  ==  null;

                  if (t_43) {
                    {
                      {
                        {
                          {
                            {
                              SourcesHomovoc.AVLNode2 t_37;
                              int t_38;
                              boolean t_40;
                              boolean t_41;
                              boolean t_42;

                              t_37 = newNode.getParent();
                              t_38 = t_37.getBalanceFactor();
                              int var_20_bf_parent = t_38;

                              t_41 = var_20_bf_parent  >  1;

                              if (t_41) {
                                {
                                  t_40 = true;
                                }
                              } else {
                                {
                                  {
                                    t_42 = var_20_bf_parent  <  -1;
                                    if (t_42) {
                                      {
                                        t_40 = true;
                                      }
                                    } else {
                                      {
                                        t_40 = false;
                                      }
                                    }
                                  }
                                }
                              }
                              if (t_40) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          SourcesHomovoc.AVLNode2 t_39;

                                          t_39 = newNode.getParent();
                                          var_17_keyNode = t_39;
                                          var_18_found = true;
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
                  t_44 = newNode.getParent();
                  t_45 = t_44.SourcesHomovoc_AVLNode2_height;
                  t_44.SourcesHomovoc_AVLNode2_height = t_44.SourcesHomovoc_AVLNode2_height + (byte)1;
                  t_46 = newNode.getParent();
                  newNode = t_46;
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
                  var_18_found = true;
                }
              }
            }
          }
        }
      }
      t_51 = newNode.SourcesHomovoc_AVLNode2_parent  !=  null;

      if (t_51) {
        {
          {
            t_52 = ! var_18_found;
            if (t_52) {
              {
                t_50 = true;
              }
            } else {
              {
                t_50 = false;
              }
            }
          }
        }
      } else {
        {
          t_50 = false;
        }
      }
      var_19_ws_5 = t_50;
    }

    return var_17_keyNode;
  }


  /*@ 
    @ requires true;
    @ ensures (\exists SourcesHomovoc.AVLNode2 n; \reach(this.SourcesHomovoc_AVLTree2_root, SourcesHomovoc.AVLNode2, SourcesHomovoc_AVLNode2_left + SourcesHomovoc_AVLNode2_right).has(((java.lang.Object)(n))); n.SourcesHomovoc_AVLNode2_value  ==  value) <==> \result;
    @ signals (java.lang.Exception e) false;
    @*/
  public boolean lookup(int value) {
    SourcesHomovoc.AVLNode2 var_21_currentNode = this.SourcesHomovoc_AVLTree2_root;
    boolean var_22_ws_6;

    var_22_ws_6 = var_21_currentNode  !=  null;
    while (var_22_ws_6) {
      boolean t_54;

      t_54 = var_21_currentNode.SourcesHomovoc_AVLNode2_value  ==  value;

      if (t_54) {
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
                  boolean t_53;

                  t_53 = value  <  var_21_currentNode.SourcesHomovoc_AVLNode2_value;
                  if (t_53) {
                    {
                      {
                        {
                          {
                            {
                              var_21_currentNode = var_21_currentNode.SourcesHomovoc_AVLNode2_left;
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
                              var_21_currentNode = var_21_currentNode.SourcesHomovoc_AVLNode2_right;
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
      var_22_ws_6 = var_21_currentNode  !=  null;
    }

    return false;
  }
/** LL or LR type if balance factor == 2; rotateRight for keyNode if bf of
 keyNode.left == -1, it's LR type; rotateLeft for keyNode.left first RR or
 RL type if balance factor == -2; rotateLeft for keyNode if bf of
 keyNode.right == 1, it's RL type; rotateRight for keyNode.right first
 
 @param keyNode
*/

  public SourcesHomovoc.AVLNode2 adjustTreeByRotation(SourcesHomovoc.AVLNode2 keyNode) {
    int t_55;
    boolean t_65;
    boolean t_67;
    SourcesHomovoc.AVLNode2 var_23_newKeyNode = ((SourcesHomovoc.AVLNode2)(null));

    t_55 = keyNode.getBalanceFactor();
    int var_24_bf_keyNode = t_55;

    t_65 = var_24_bf_keyNode  ==  2;

    if (t_65) {
      {
        {
          {
            {
              {
                int t_57;
                boolean t_58;
                SourcesHomovoc.AVLNode2 t_59;

                t_57 = keyNode.SourcesHomovoc_AVLNode2_left.getBalanceFactor();
                t_58 = t_57  ==  -1;

                if (t_58) {
                  {
                    {
                      {
                        {
                          {
                            SourcesHomovoc.AVLNode2 t_56;

                            t_56 = keyNode.SourcesHomovoc_AVLNode2_left.rotateLeft();
                            SourcesHomovoc.AVLNode2 var_25_node = t_56;

                            keyNode.setLeft(var_25_node);
                          }
                        }
                      }
                    }
                  }
                }
                t_59 = keyNode.rotateRight();
                var_23_newKeyNode = t_59;
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

                t_64 = var_24_bf_keyNode  ==  -2;
                if (t_64) {
                  {
                    {
                      {
                        {
                          {
                            int t_61;
                            boolean t_62;
                            SourcesHomovoc.AVLNode2 t_63;

                            t_61 = keyNode.SourcesHomovoc_AVLNode2_right.getBalanceFactor();
                            t_62 = t_61  ==  1;

                            if (t_62) {
                              {
                                {
                                  {
                                    {
                                      {
                                        SourcesHomovoc.AVLNode2 t_60;

                                        t_60 = keyNode.SourcesHomovoc_AVLNode2_right.rotateLeft();
                                        SourcesHomovoc.AVLNode2 var_26_node = t_60;

                                        keyNode.setRight(var_26_node);
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            t_63 = keyNode.rotateLeft();
                            var_23_newKeyNode = t_63;
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
    t_67 = keyNode.SourcesHomovoc_AVLNode2_parent  ==  null;
    if (t_67) {
      {
        {
          {
            {
              {
                this.SourcesHomovoc_AVLTree2_root = var_23_newKeyNode;
                this.SourcesHomovoc_AVLTree2_root.SourcesHomovoc_AVLNode2_parent = ((SourcesHomovoc.AVLNode2)(null));
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

                t_66 = keyNode  ==  keyNode.SourcesHomovoc_AVLNode2_parent.SourcesHomovoc_AVLNode2_left;

                if (t_66) {
                  {
                    {
                      {
                        {
                          {
                            keyNode.SourcesHomovoc_AVLNode2_parent.setLeft(var_23_newKeyNode);
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
                            keyNode.SourcesHomovoc_AVLNode2_parent.setRight(var_23_newKeyNode);
                          }
                        }
                      }
                    }
                  }
                }
                var_23_newKeyNode.SourcesHomovoc_AVLNode2_parent.adjustHeight();
              }
            }
          }
        }
      }
    }

    return var_23_newKeyNode;
  }

}
