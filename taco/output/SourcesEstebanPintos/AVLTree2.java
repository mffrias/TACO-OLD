package SourcesEstebanPintos;

//@ model import org.jmlspecs.lang.*;


public class AVLTree2 extends java.lang.Object {

  public /*@ nullable @*/ SourcesEstebanPintos.AVLNode2 SourcesEstebanPintos_AVLTree2_root;
  /*@ invariant (\forall SourcesEstebanPintos.AVLNode2 n; \reach(this.SourcesEstebanPintos_AVLTree2_root, SourcesEstebanPintos.AVLNode2, SourcesEstebanPintos_AVLNode2_left + SourcesEstebanPintos_AVLNode2_right).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesEstebanPintos_AVLNode2_left, SourcesEstebanPintos.AVLNode2, SourcesEstebanPintos_AVLNode2_right + SourcesEstebanPintos_AVLNode2_left).has(((java.lang.Object)(n)))  ==  false && \reach(n.SourcesEstebanPintos_AVLNode2_right, SourcesEstebanPintos.AVLNode2, SourcesEstebanPintos_AVLNode2_right + SourcesEstebanPintos_AVLNode2_left).has(((java.lang.Object)(n)))  ==  false && ((n.SourcesEstebanPintos_AVLNode2_left  !=  null && n.SourcesEstebanPintos_AVLNode2_right  ==  null) ==> n.SourcesEstebanPintos_AVLNode2_height  <  2) && ((n.SourcesEstebanPintos_AVLNode2_right  !=  null && n.SourcesEstebanPintos_AVLNode2_left  ==  null) ==> n.SourcesEstebanPintos_AVLNode2_height  <  2) && ((n.SourcesEstebanPintos_AVLNode2_right  ==  null && n.SourcesEstebanPintos_AVLNode2_left  ==  null) ==> n.SourcesEstebanPintos_AVLNode2_height  ==  0) && (\forall SourcesEstebanPintos.AVLNode2 nLeft; ; (\reach(n.SourcesEstebanPintos_AVLNode2_left, SourcesEstebanPintos.AVLNode2, SourcesEstebanPintos_AVLNode2_right + SourcesEstebanPintos_AVLNode2_left).has(((java.lang.Object)(nLeft)))  ==  true ==> (nLeft.SourcesEstebanPintos_AVLNode2_value  <  n.SourcesEstebanPintos_AVLNode2_value))) && (\forall SourcesEstebanPintos.AVLNode2 nRight; ; (\reach(n.SourcesEstebanPintos_AVLNode2_right, SourcesEstebanPintos.AVLNode2, SourcesEstebanPintos_AVLNode2_right + SourcesEstebanPintos_AVLNode2_left).has(((java.lang.Object)(nRight)))  ==  true ==> (nRight.SourcesEstebanPintos_AVLNode2_value  >=  n.SourcesEstebanPintos_AVLNode2_value))));
    @*/

  /*@ 
    @ requires true;
    @ ensures (\exists SourcesEstebanPintos.AVLNode2 n; \reach(this.SourcesEstebanPintos_AVLTree2_root, SourcesEstebanPintos.AVLNode2, SourcesEstebanPintos_AVLNode2_right + SourcesEstebanPintos_AVLNode2_left).has(((java.lang.Object)(n)))  ==  true; n.SourcesEstebanPintos_AVLNode2_value  ==  value);
    @ signals (java.lang.Exception e) false;
    @*/
  public void insert(int value) {
    boolean t_5;

    t_5 = this.SourcesEstebanPintos_AVLTree2_root  ==  null;
    if (t_5) {
      {
        {
          {
            {
              {
                this.SourcesEstebanPintos_AVLTree2_root = this.SourcesEstebanPintos_AVLTree2_root.SourcesEstebanPintos_AVLNode2_left;
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
                SourcesEstebanPintos.AVLNode2 t_1;
                SourcesEstebanPintos.AVLNode2 t_2;
                boolean t_4;

                t_1 = new SourcesEstebanPintos.AVLNode2(value);
                SourcesEstebanPintos.AVLNode2 var_1_newNode = t_1;

                this.SourcesEstebanPintos_AVLTree2_root.insertToLeaf(var_1_newNode);
                t_2 = this.updateHeightsAndDetectKeyNode(var_1_newNode);
                SourcesEstebanPintos.AVLNode2 var_2_keyNode = t_2;

                t_4 = var_2_keyNode  !=  null;
                if (t_4) {
                  {
                    {
                      {
                        {
                          {
                            SourcesEstebanPintos.AVLNode2 t_3;

                            t_3 = this.adjustTreeByRotation(var_2_keyNode);
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
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  public void delete(SourcesEstebanPintos.AVLNode2 node) {
    SourcesEstebanPintos.AVLNode2 t_6;
    boolean t_10;
    int var_3_value = node.SourcesEstebanPintos_AVLNode2_value;

    t_6 = this.deleteBeforeAdjustment(var_3_value);
    SourcesEstebanPintos.AVLNode2 var_4_parentOfDeletedLeaf = t_6;

    t_10 = var_4_parentOfDeletedLeaf  !=  null;
    if (t_10) {
      {
        {
          {
            {
              {
                SourcesEstebanPintos.AVLNode2 t_7;
                boolean t_9;

                t_7 = this.detectKeyNode(var_4_parentOfDeletedLeaf);
                SourcesEstebanPintos.AVLNode2 var_5_keyNode = t_7;

                t_9 = var_5_keyNode  !=  null;
                if (t_9) {
                  {
                    {
                      {
                        {
                          {
                            SourcesEstebanPintos.AVLNode2 t_8;

                            t_8 = this.adjustTreeByRotation(var_5_keyNode);
                            SourcesEstebanPintos.AVLNode2 var_6_newkeyNode = t_8;

                            this.updateHeights(var_6_newkeyNode.SourcesEstebanPintos_AVLNode2_parent);
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

                ;
              }
            }
          }
        }
      }
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\exists SourcesEstebanPintos.AVLNode2 n; ; ((n.SourcesEstebanPintos_AVLNode2_value  ==  value && \reach(this.SourcesEstebanPintos_AVLTree2_root, SourcesEstebanPintos.AVLNode2, SourcesEstebanPintos_AVLNode2_right + SourcesEstebanPintos_AVLNode2_left).has(((java.lang.Object)(n)))  ==  true) ==> \result  ==  n) && ((\forall SourcesEstebanPintos.AVLNode2 m; \reach(this.SourcesEstebanPintos_AVLTree2_root, SourcesEstebanPintos.AVLNode2, SourcesEstebanPintos_AVLNode2_right + SourcesEstebanPintos_AVLNode2_left).has(((java.lang.Object)(m)))  ==  true; m.SourcesEstebanPintos_AVLNode2_value  !=  value) ==> \result  ==  null));
    @ signals (java.lang.Exception e) false;
    @*/
  public SourcesEstebanPintos.AVLNode2 lookup(int value) {
    SourcesEstebanPintos.AVLNode2 var_7_currentNode = this.SourcesEstebanPintos_AVLTree2_root;
    boolean var_8_ws_1;

    var_8_ws_1 = var_7_currentNode  !=  null;
    while (var_8_ws_1) {
      boolean t_12;

      t_12 = var_7_currentNode.SourcesEstebanPintos_AVLNode2_value  ==  value;

      if (t_12) {
        {
          {
            {
              {
                {
                  return var_7_currentNode;
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
                  boolean t_11;

                  t_11 = value  <  var_7_currentNode.SourcesEstebanPintos_AVLNode2_value;
                  if (t_11) {
                    {
                      {
                        {
                          {
                            {
                              var_7_currentNode = var_7_currentNode.SourcesEstebanPintos_AVLNode2_left;
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
                              var_7_currentNode = var_7_currentNode.SourcesEstebanPintos_AVLNode2_right;
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
      var_8_ws_1 = var_7_currentNode  !=  null;
    }

    return ((SourcesEstebanPintos.AVLNode2)(null));
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  public SourcesEstebanPintos.AVLNode2 detectKeyNode(SourcesEstebanPintos.AVLNode2 parentOfDeletedLeaf) {
    SourcesEstebanPintos.AVLNode2 var_9_currentNode = parentOfDeletedLeaf;
    boolean var_10_ws_2;

    var_10_ws_2 = var_9_currentNode  !=  null;
    while (var_10_ws_2) {
      int t_13;
      boolean t_14;
      boolean t_15;
      boolean t_16;

      t_13 = var_9_currentNode.getBalanceFactor();
      int var_11_bf = t_13;

      t_15 = var_11_bf  ==  2;

      if (t_15) {
        {
          t_14 = true;
        }
      } else {
        {
          {
            t_16 = var_11_bf  ==  -2;
            if (t_16) {
              {
                t_14 = true;
              }
            } else {
              {
                t_14 = false;
              }
            }
          }
        }
      }

      if (t_14) {
        {
          {
            {
              {
                {
                  return var_9_currentNode;
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
                  var_9_currentNode = var_9_currentNode.SourcesEstebanPintos_AVLNode2_parent;
                }
              }
            }
          }
        }
      }
      var_10_ws_2 = var_9_currentNode  !=  null;
    }

    return ((SourcesEstebanPintos.AVLNode2)(null));
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  public SourcesEstebanPintos.AVLNode2 deleteBeforeAdjustment(int value) {
    boolean t_17;
    boolean t_18;
    boolean t_19;
    boolean t_34;
    SourcesEstebanPintos.AVLNode2 var_12_currentNode = this.SourcesEstebanPintos_AVLTree2_root;
    boolean var_13_flag = true;
    boolean var_14_ws_3;

    t_18 = var_12_currentNode  !=  null;

    if (t_18) {
      {
        {
          t_19 = var_13_flag  ==  true;
          if (t_19) {
            {
              t_17 = true;
            }
          } else {
            {
              t_17 = false;
            }
          }
        }
      }
    } else {
      {
        t_17 = false;
      }
    }
    var_14_ws_3 = t_17;
    while (var_14_ws_3) {
      boolean t_21;
      boolean t_22;
      boolean t_23;
      boolean t_24;

      t_21 = var_12_currentNode.SourcesEstebanPintos_AVLNode2_value  ==  value;

      if (t_21) {
        {
          {
            {
              {
                {
                  var_13_flag = false;
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

                  t_20 = value  <  var_12_currentNode.SourcesEstebanPintos_AVLNode2_value;
                  if (t_20) {
                    {
                      {
                        {
                          {
                            {
                              var_12_currentNode = var_12_currentNode.SourcesEstebanPintos_AVLNode2_left;
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
                              var_12_currentNode = var_12_currentNode.SourcesEstebanPintos_AVLNode2_right;
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
      t_23 = var_12_currentNode  !=  null;

      if (t_23) {
        {
          {
            t_24 = var_13_flag  ==  true;
            if (t_24) {
              {
                t_22 = true;
              }
            } else {
              {
                t_22 = false;
              }
            }
          }
        }
      } else {
        {
          t_22 = false;
        }
      }
      var_14_ws_3 = t_22;
    }
    t_34 = var_12_currentNode  !=  null;
    if (t_34) {
      {
        {
          {
            {
              {
                boolean t_25;
                SourcesEstebanPintos.AVLNode2 t_31;
                boolean t_33;
                SourcesEstebanPintos.AVLNode2 var_15_replacement = ((SourcesEstebanPintos.AVLNode2)(null));
                boolean var_16_ws_4;

                t_25 = var_12_currentNode.isLeaf();
                var_16_ws_4 = ! t_25;
                while (var_16_ws_4) {
                  int t_28;
                  boolean t_29;
                  boolean t_30;

                  t_28 = var_12_currentNode.getBalanceFactor();
                  t_29 = t_28  <  0;

                  if (t_29) {
                    {
                      {
                        {
                          {
                            {
                              SourcesEstebanPintos.AVLNode2 t_26;

                              t_26 = var_12_currentNode.SourcesEstebanPintos_AVLNode2_right.getLeftmost();
                              var_15_replacement = t_26;
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
                              SourcesEstebanPintos.AVLNode2 t_27;

                              t_27 = var_12_currentNode.SourcesEstebanPintos_AVLNode2_left.getRightmost();
                              var_15_replacement = t_27;
                            }
                          }
                        }
                      }
                    }
                  }
                  var_12_currentNode.SourcesEstebanPintos_AVLNode2_value = var_15_replacement.SourcesEstebanPintos_AVLNode2_value;
                  var_12_currentNode = var_15_replacement;
                  t_30 = var_12_currentNode.isLeaf();
                  var_16_ws_4 = ! t_30;
                }
                t_31 = var_12_currentNode.getParent();
                SourcesEstebanPintos.AVLNode2 var_17_parent = t_31;

                t_33 = var_17_parent  ==  null;

                if (t_33) {
                  {
                    {
                      {
                        {
                          {
                            this.SourcesEstebanPintos_AVLTree2_root = ((SourcesEstebanPintos.AVLNode2)(null));
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
                            boolean t_32;

                            t_32 = var_12_currentNode  ==  var_17_parent.SourcesEstebanPintos_AVLNode2_left;
                            if (t_32) {
                              {
                                {
                                  {
                                    {
                                      {
                                        var_17_parent.setLeft(((SourcesEstebanPintos.AVLNode2)(null)));
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
                                        var_17_parent.setRight(((SourcesEstebanPintos.AVLNode2)(null)));
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
                this.updateHeights(var_17_parent);

                return var_17_parent;
              }
            }
          }
        }
      }
    }

    return ((SourcesEstebanPintos.AVLNode2)(null));
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  public void updateHeights(SourcesEstebanPintos.AVLNode2 fromParentOfDeletedLeaf) {
    SourcesEstebanPintos.AVLNode2 var_18_currentNode = fromParentOfDeletedLeaf;

    var_18_currentNode.adjustHeight();
    boolean var_19_ws_5;

    var_19_ws_5 = var_18_currentNode  !=  null;
    while (var_19_ws_5) {
      var_18_currentNode.adjustHeight();
      var_18_currentNode = var_18_currentNode.SourcesEstebanPintos_AVLNode2_parent;
      var_19_ws_5 = var_18_currentNode  !=  null;
    }
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  public SourcesEstebanPintos.AVLNode2 updateHeightsAndDetectKeyNode(SourcesEstebanPintos.AVLNode2 newNode) {
    boolean t_35;
    boolean t_36;
    boolean t_37;
    SourcesEstebanPintos.AVLNode2 var_20_keyNode = ((SourcesEstebanPintos.AVLNode2)(null));
    boolean var_21_flag = true;
    boolean var_22_ws_6;

    t_36 = newNode.SourcesEstebanPintos_AVLNode2_parent  !=  null;

    if (t_36) {
      {
        {
          t_37 = var_21_flag  ==  true;
          if (t_37) {
            {
              t_35 = true;
            }
          } else {
            {
              t_35 = false;
            }
          }
        }
      }
    } else {
      {
        t_35 = false;
      }
    }
    var_22_ws_6 = t_35;
    while (var_22_ws_6) {
      SourcesEstebanPintos.AVLNode2 t_49;
      int t_50;
      boolean t_51;
      boolean t_52;
      boolean t_53;
      boolean t_54;

      t_49 = newNode.getParent();
      t_50 = t_49.SourcesEstebanPintos_AVLNode2_height - newNode.SourcesEstebanPintos_AVLNode2_height;
      t_51 = t_50  !=  1;

      if (t_51) {
        {
          {
            {
              {
                {
                  boolean t_44;
                  boolean t_48;

                  t_44 = var_20_keyNode  ==  null;

                  if (t_44) {
                    {
                      {
                        {
                          {
                            {
                              SourcesEstebanPintos.AVLNode2 t_38;
                              int t_39;
                              boolean t_41;
                              boolean t_42;
                              boolean t_43;

                              t_38 = newNode.getParent();
                              t_39 = t_38.getBalanceFactor();
                              int var_23_bf_parent = t_39;

                              t_42 = var_23_bf_parent  >  1;

                              if (t_42) {
                                {
                                  t_41 = true;
                                }
                              } else {
                                {
                                  {
                                    t_43 = var_23_bf_parent  <  -1;
                                    if (t_43) {
                                      {
                                        t_41 = true;
                                      }
                                    } else {
                                      {
                                        t_41 = false;
                                      }
                                    }
                                  }
                                }
                              }
                              if (t_41) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          SourcesEstebanPintos.AVLNode2 t_40;

                                          t_40 = newNode.getParent();
                                          var_20_keyNode = t_40;
                                          var_21_flag = false;
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
                  t_48 = var_21_flag  ==  true;
                  if (t_48) {
                    {
                      {
                        {
                          {
                            {
                              SourcesEstebanPintos.AVLNode2 t_45;
                              int t_46;
                              SourcesEstebanPintos.AVLNode2 t_47;

                              t_45 = newNode.getParent();
                              t_46 = t_45.SourcesEstebanPintos_AVLNode2_height;
                              t_45.SourcesEstebanPintos_AVLNode2_height = t_45.SourcesEstebanPintos_AVLNode2_height + (byte)1;
                              t_47 = newNode.getParent();
                              newNode = t_47;
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
                  var_21_flag = false;
                }
              }
            }
          }
        }
      }

      ;
      t_53 = newNode.SourcesEstebanPintos_AVLNode2_parent  !=  null;

      if (t_53) {
        {
          {
            t_54 = var_21_flag  ==  true;
            if (t_54) {
              {
                t_52 = true;
              }
            } else {
              {
                t_52 = false;
              }
            }
          }
        }
      } else {
        {
          t_52 = false;
        }
      }
      var_22_ws_6 = t_52;
    }

    return var_20_keyNode;
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  public SourcesEstebanPintos.AVLNode2 adjustTreeByRotation(SourcesEstebanPintos.AVLNode2 keyNode) {
    int t_55;
    boolean t_65;
    boolean t_67;
    SourcesEstebanPintos.AVLNode2 var_24_newKeyNode = ((SourcesEstebanPintos.AVLNode2)(null));

    t_55 = keyNode.getBalanceFactor();
    int var_25_bf_keyNode = t_55;

    t_65 = var_25_bf_keyNode  ==  2;

    if (t_65) {
      {
        {
          {
            {
              {
                int t_57;
                boolean t_58;
                SourcesEstebanPintos.AVLNode2 t_59;

                t_57 = keyNode.SourcesEstebanPintos_AVLNode2_left.getBalanceFactor();
                t_58 = t_57  ==  -1;

                if (t_58) {
                  {
                    {
                      {
                        {
                          {
                            SourcesEstebanPintos.AVLNode2 t_56;

                            t_56 = keyNode.SourcesEstebanPintos_AVLNode2_left.rotateLeft();
                            keyNode.setLeft(t_56);
                          }
                        }
                      }
                    }
                  }
                }
                t_59 = keyNode.rotateRight();
                var_24_newKeyNode = t_59;
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

                t_64 = var_25_bf_keyNode  ==  -2;
                if (t_64) {
                  {
                    {
                      {
                        {
                          {
                            int t_61;
                            boolean t_62;
                            SourcesEstebanPintos.AVLNode2 t_63;

                            t_61 = keyNode.SourcesEstebanPintos_AVLNode2_right.getBalanceFactor();
                            t_62 = t_61  ==  1;

                            if (t_62) {
                              {
                                {
                                  {
                                    {
                                      {
                                        SourcesEstebanPintos.AVLNode2 t_60;

                                        t_60 = keyNode.SourcesEstebanPintos_AVLNode2_right.rotateRight();
                                        keyNode.setRight(t_60);
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            t_63 = keyNode.rotateLeft();
                            var_24_newKeyNode = t_63;
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
                            return ((SourcesEstebanPintos.AVLNode2)(null));
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
    t_67 = keyNode.SourcesEstebanPintos_AVLNode2_parent  ==  null;
    if (t_67) {
      {
        {
          {
            {
              {
                this.SourcesEstebanPintos_AVLTree2_root = var_24_newKeyNode;
                this.SourcesEstebanPintos_AVLTree2_root.SourcesEstebanPintos_AVLNode2_parent = ((SourcesEstebanPintos.AVLNode2)(null));
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

                t_66 = keyNode  ==  keyNode.SourcesEstebanPintos_AVLNode2_parent.SourcesEstebanPintos_AVLNode2_left;

                if (t_66) {
                  {
                    {
                      {
                        {
                          {
                            keyNode.SourcesEstebanPintos_AVLNode2_parent.setLeft(var_24_newKeyNode);
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
                            keyNode.SourcesEstebanPintos_AVLNode2_parent.setRight(var_24_newKeyNode);
                          }
                        }
                      }
                    }
                  }
                }
                var_24_newKeyNode.SourcesEstebanPintos_AVLNode2_parent.adjustHeight();
              }
            }
          }
        }
      }
    }

    return var_24_newKeyNode;
  }


  public AVLTree2() {
    this.SourcesEstebanPintos_AVLTree2_root = ((SourcesEstebanPintos.AVLNode2)(null));
  }

}
