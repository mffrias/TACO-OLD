package roops.core.objects;

//@ model import org.jmlspecs.lang.*;


public class TreeSet extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objects.TreeSetEntry roops_core_objects_TreeSet_root;
  private int roops_core_objects_TreeSet_size;
  private int roops_core_objects_TreeSet_modCount;
  boolean roops_core_objects_TreeSet_RED;
  boolean roops_core_objects_TreeSet_BLACK;
  /*@ invariant (this.roops_core_objects_TreeSet_RED  ==  false) && (this.roops_core_objects_TreeSet_BLACK  ==  true) && (this.roops_core_objects_TreeSet_root.roops_core_objects_TreeSetEntry_parent  ==  null) && (this.roops_core_objects_TreeSet_root  !=  null ==> this.roops_core_objects_TreeSet_root.roops_core_objects_TreeSetEntry_color  ==  this.roops_core_objects_TreeSet_BLACK) && (\forall roops.core.objects.TreeSetEntry n; \reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left).has(((java.lang.Object)(n))); (n.roops_core_objects_TreeSetEntry_left  !=  null ==> n.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_parent  ==  n) && (n.roops_core_objects_TreeSetEntry_right  !=  null ==> n.roops_core_objects_TreeSetEntry_right.roops_core_objects_TreeSetEntry_parent  ==  n) && (n.roops_core_objects_TreeSetEntry_parent  !=  null ==> (n.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_left  ==  n || n.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_right  ==  n)) && (\reach(n.roops_core_objects_TreeSetEntry_parent, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_parent).has(((java.lang.Object)(n)))  ==  false) && (\forall roops.core.objects.TreeSetEntry x; \reach(n.roops_core_objects_TreeSetEntry_left, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left).has(((java.lang.Object)(x))); n.roops_core_objects_TreeSetEntry_key  >  x.roops_core_objects_TreeSetEntry_key) && (\forall roops.core.objects.TreeSetEntry x; \reach(n.roops_core_objects_TreeSetEntry_right, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left).has(((java.lang.Object)(x))); x.roops_core_objects_TreeSetEntry_key  >  n.roops_core_objects_TreeSetEntry_key) && ((n.roops_core_objects_TreeSetEntry_color  ==  this.roops_core_objects_TreeSet_RED && n.roops_core_objects_TreeSetEntry_parent  !=  null) ==> n.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_color  ==  this.roops_core_objects_TreeSet_BLACK));
    @*/

  /*@ 
    @ requires true;
    @ ensures true;
    @*/
  public boolean contains(int aKey) {
    int param_aKey_0;

    param_aKey_0 = aKey;
    {
      roops.core.objects.TreeSetEntry t_1;
      boolean t_2;

      t_1 = this.getEntry(param_aKey_0);
      t_2 = t_1  !=  null;

      return t_2;
    }
  }


  private roops.core.objects.TreeSetEntry getEntry_remove(int key) {
    int param_key_1;

    param_key_1 = key;
    {
      roops.core.objects.TreeSetEntry var_1_p = this.roops_core_objects_TreeSet_root;
      boolean var_2_ws_1;

      var_2_ws_1 = var_1_p  !=  null;
      while (var_2_ws_1) {
        boolean t_4;

        t_4 = param_key_1  ==  var_1_p.roops_core_objects_TreeSetEntry_key;

        if (t_4) {
          {
            {
              {
                {
                  {
                    return var_1_p;
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

                    t_3 = param_key_1  <  var_1_p.roops_core_objects_TreeSetEntry_key;
                    if (t_3) {
                      {
                        {
                          {
                            {
                              {
                                var_1_p = var_1_p.roops_core_objects_TreeSetEntry_left;
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
                                var_1_p = var_1_p.roops_core_objects_TreeSetEntry_right;
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
        var_2_ws_1 = var_1_p  !=  null;
      }

      return ((roops.core.objects.TreeSetEntry)(null));
    }
  }


  private roops.core.objects.TreeSetEntry getEntry(int key) {
    int param_key_2;

    param_key_2 = key;
    {
      roops.core.objects.TreeSetEntry var_3_p = this.roops_core_objects_TreeSet_root;
      boolean var_4_ws_2;

      var_4_ws_2 = var_3_p  !=  null;
      while (var_4_ws_2) {
        boolean t_6;

        t_6 = param_key_2  ==  var_3_p.roops_core_objects_TreeSetEntry_key;

        if (t_6) {
          {
            {
              {
                {
                  {
                    return var_3_p;
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
                    boolean t_5;

                    t_5 = param_key_2  <  var_3_p.roops_core_objects_TreeSetEntry_key;
                    if (t_5) {
                      {
                        {
                          {
                            {
                              {
                                var_3_p = var_3_p.roops_core_objects_TreeSetEntry_left;
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
                                var_3_p = var_3_p.roops_core_objects_TreeSetEntry_right;
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
        var_4_ws_2 = var_3_p  !=  null;
      }

      return ((roops.core.objects.TreeSetEntry)(null));
    }
  }


  private void init_TreeSetEntry(roops.core.objects.TreeSetEntry entry, int new_key, roops.core.objects.TreeSetEntry new_parent) {
    roops.core.objects.TreeSetEntry param_entry_3;

    param_entry_3 = entry;
    int param_new_key_4;

    param_new_key_4 = new_key;
    roops.core.objects.TreeSetEntry param_new_parent_5;

    param_new_parent_5 = new_parent;
    {
      entry.roops_core_objects_TreeSetEntry_color = false;
      entry.roops_core_objects_TreeSetEntry_left = ((roops.core.objects.TreeSetEntry)(null));
      entry.roops_core_objects_TreeSetEntry_right = ((roops.core.objects.TreeSetEntry)(null));
      entry.roops_core_objects_TreeSetEntry_key = param_new_key_4;
      entry.roops_core_objects_TreeSetEntry_parent = param_new_parent_5;
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\exists roops.core.objects.TreeSetEntry e; \old(\reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left)).has(((java.lang.Object)(e)))  ==  true; e.roops_core_objects_TreeSetEntry_key  ==  aKey) ==> (\forall roops.core.objects.TreeSetEntry tse; \reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left).has(((java.lang.Object)(tse)))  ==  true; \old(\reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left)).has(((java.lang.Object)(tse)))  ==  true);
    @ ensures (\exists roops.core.objects.TreeSetEntry e; \old(\reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left)).has(((java.lang.Object)(e)))  ==  true; e.roops_core_objects_TreeSetEntry_key  ==  aKey) ==> (\forall roops.core.objects.TreeSetEntry tse; \old(\reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left)).has(((java.lang.Object)(tse)))  ==  true; \reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left).has(((java.lang.Object)(tse)))  ==  true);
    @ ensures (\forall roops.core.objects.TreeSetEntry e; \old(\reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left)).has(((java.lang.Object)(e)))  ==  true; e.roops_core_objects_TreeSetEntry_key  !=  aKey) ==> (\forall roops.core.objects.TreeSetEntry tse; \old(\reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left)).has(((java.lang.Object)(tse)))  ==  true; \reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left).has(((java.lang.Object)(tse)))  ==  true);
    @ ensures (\forall roops.core.objects.TreeSetEntry e; \old(\reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left)).has(((java.lang.Object)(e)))  ==  true; e.roops_core_objects_TreeSetEntry_key  !=  aKey) ==> (\forall roops.core.objects.TreeSetEntry tse; \reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left).has(((java.lang.Object)(tse)))  ==  true; \reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left).has(((java.lang.Object)(tse)))  ==  true || (\exists roops.core.objects.TreeSetEntry newEntry; \reach(this.roops_core_objects_TreeSet_root, roops.core.objects.TreeSetEntry, roops_core_objects_TreeSetEntry_right + roops_core_objects_TreeSetEntry_left).has(((java.lang.Object)(newEntry)))  ==  true; newEntry.roops_core_objects_TreeSetEntry_key  ==  aKey));
    @*/
  public void add(int aKey) {
    int param_aKey_6;

    param_aKey_6 = aKey;
    {
      boolean t_8;
      roops.core.objects.TreeSetEntry var_5_t = this.roops_core_objects_TreeSet_root;

      t_8 = var_5_t  ==  null;

      if (t_8) {
        {
          {
            {
              {
                {
                  roops.core.objects.TreeSetEntry t_7;

                  this.incrementSize();
                  t_7 = new roops.core.objects.TreeSetEntry();
                  this.roops_core_objects_TreeSet_root = t_7;
                  this.init_TreeSetEntry(this.roops_core_objects_TreeSet_root, param_aKey_6, ((roops.core.objects.TreeSetEntry)(null)));
                }
              }
            }
          }
        }
      }
      boolean var_6_ws_3;

      var_6_ws_3 = true;
      while (var_6_ws_3) {
        boolean t_13;

        t_13 = param_aKey_6  <  var_5_t.roops_core_objects_TreeSetEntry_key;

        if (t_13) {
          {
            {
              {
                {
                  {
                    boolean t_10;

                    t_10 = var_5_t.roops_core_objects_TreeSetEntry_left  !=  null;
                    if (t_10) {
                      {
                        {
                          {
                            {
                              {
                                var_5_t = var_5_t.roops_core_objects_TreeSetEntry_left;
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
                                roops.core.objects.TreeSetEntry t_9;

                                this.incrementSize();
                                t_9 = new roops.core.objects.TreeSetEntry();
                                var_5_t.roops_core_objects_TreeSetEntry_left = t_9;
                                this.init_TreeSetEntry(var_5_t.roops_core_objects_TreeSetEntry_left, param_aKey_6, var_5_t);
                                this.fixAfterInsertion(var_5_t.roops_core_objects_TreeSetEntry_left);
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
                    boolean t_12;

                    t_12 = var_5_t.roops_core_objects_TreeSetEntry_right  !=  null;
                    if (t_12) {
                      {
                        {
                          {
                            {
                              {
                                var_5_t = var_5_t.roops_core_objects_TreeSetEntry_right;
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
                                roops.core.objects.TreeSetEntry t_11;

                                this.incrementSize();
                                t_11 = new roops.core.objects.TreeSetEntry();
                                var_5_t.roops_core_objects_TreeSetEntry_right = t_11;
                                this.init_TreeSetEntry(var_5_t.roops_core_objects_TreeSetEntry_right, param_aKey_6, var_5_t);
                                this.fixAfterInsertion(var_5_t.roops_core_objects_TreeSetEntry_right);
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
        var_6_ws_3 = true;
      }
    }
  }


  private void incrementSize() {
    {
      int t_14;
      int t_15;

      t_14 = this.roops_core_objects_TreeSet_modCount;
      this.roops_core_objects_TreeSet_modCount = this.roops_core_objects_TreeSet_modCount + (byte)1;
      t_15 = this.roops_core_objects_TreeSet_size;
      this.roops_core_objects_TreeSet_size = this.roops_core_objects_TreeSet_size + (byte)1;
    }
  }
/** Balancing operations.
 Implementations of rebalancings during insertion and deletion are
 slightly different than the CLR version.  Rather than using dummy
 nilnodes, we use a set of accessors that deal properly with null.  They
 are used to avoid messiness surrounding nullness checks in the main
 algorithms.
*/

  private static boolean colorOf(roops.core.objects.TreeSetEntry p) {
    roops.core.objects.TreeSetEntry param_p_7;

    param_p_7 = p;
    {
      boolean t_16;
      boolean var_7_black = true;
      boolean var_8_result;

      t_16 = param_p_7  ==  null;
      if (t_16) {
        {
          {
            {
              {
                {
                  var_8_result = var_7_black;
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
                  var_8_result = p.roops_core_objects_TreeSetEntry_color;
                }
              }
            }
          }
        }
      }

      return var_8_result;
    }
  }


  private static roops.core.objects.TreeSetEntry parentOf(roops.core.objects.TreeSetEntry p) {
    roops.core.objects.TreeSetEntry param_p_8;

    param_p_8 = p;
    {
      boolean t_17;
      roops.core.objects.TreeSetEntry var_9_result;

      t_17 = param_p_8  ==  null;
      if (t_17) {
        {
          {
            {
              {
                {
                  var_9_result = ((roops.core.objects.TreeSetEntry)(null));
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
                  var_9_result = p.roops_core_objects_TreeSetEntry_parent;
                }
              }
            }
          }
        }
      }

      return var_9_result;
    }
  }


  private static void setColor(roops.core.objects.TreeSetEntry p, boolean c) {
    roops.core.objects.TreeSetEntry param_p_9;

    param_p_9 = p;
    boolean param_c_10;

    param_c_10 = c;
    {
      boolean t_18;

      t_18 = param_p_9  !=  null;
      if (t_18) {
        {
          {
            {
              {
                {
                  p.roops_core_objects_TreeSetEntry_color = param_c_10;
                }
              }
            }
          }
        }
      }
    }
  }


  private static roops.core.objects.TreeSetEntry leftOf(roops.core.objects.TreeSetEntry p) {
    roops.core.objects.TreeSetEntry param_p_11;

    param_p_11 = p;
    {
      boolean t_19;
      roops.core.objects.TreeSetEntry var_10_result;

      t_19 = param_p_11  ==  null;
      if (t_19) {
        {
          {
            {
              {
                {
                  var_10_result = ((roops.core.objects.TreeSetEntry)(null));
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
                  var_10_result = p.roops_core_objects_TreeSetEntry_left;
                }
              }
            }
          }
        }
      }

      return var_10_result;
    }
  }


  private static roops.core.objects.TreeSetEntry rightOf(roops.core.objects.TreeSetEntry p) {
    roops.core.objects.TreeSetEntry param_p_12;

    param_p_12 = p;
    {
      boolean t_20;
      roops.core.objects.TreeSetEntry var_11_result;

      t_20 = param_p_12  ==  null;
      if (t_20) {
        {
          {
            {
              {
                {
                  var_11_result = ((roops.core.objects.TreeSetEntry)(null));
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
                  var_11_result = p.roops_core_objects_TreeSetEntry_right;
                }
              }
            }
          }
        }
      }

      return var_11_result;
    }
  }
/** From CLR 
*/

  private void rotateLeft(roops.core.objects.TreeSetEntry p) {
    roops.core.objects.TreeSetEntry param_p_13;

    param_p_13 = p;
    {
      boolean t_21;
      boolean t_23;
      roops.core.objects.TreeSetEntry var_12_r = p.roops_core_objects_TreeSetEntry_right;

      p.roops_core_objects_TreeSetEntry_right = var_12_r.roops_core_objects_TreeSetEntry_left;
      t_21 = var_12_r.roops_core_objects_TreeSetEntry_left  !=  null;

      if (t_21) {
        {
          {
            {
              {
                {
                  var_12_r.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_parent = param_p_13;
                }
              }
            }
          }
        }
      }
      var_12_r.roops_core_objects_TreeSetEntry_parent = p.roops_core_objects_TreeSetEntry_parent;
      t_23 = p.roops_core_objects_TreeSetEntry_parent  ==  null;

      if (t_23) {
        {
          {
            {
              {
                {
                  this.roops_core_objects_TreeSet_root = var_12_r;
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

                  t_22 = p.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_left  ==  param_p_13;
                  if (t_22) {
                    {
                      {
                        {
                          {
                            {
                              p.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_left = var_12_r;
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
                              p.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_right = var_12_r;
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
      var_12_r.roops_core_objects_TreeSetEntry_left = param_p_13;
      p.roops_core_objects_TreeSetEntry_parent = var_12_r;
    }
  }
/** From CLR 
*/

  private void rotateRight(roops.core.objects.TreeSetEntry p) {
    roops.core.objects.TreeSetEntry param_p_14;

    param_p_14 = p;
    {
      boolean t_24;
      boolean t_26;
      roops.core.objects.TreeSetEntry var_13_l = p.roops_core_objects_TreeSetEntry_left;

      p.roops_core_objects_TreeSetEntry_left = var_13_l.roops_core_objects_TreeSetEntry_right;
      t_24 = var_13_l.roops_core_objects_TreeSetEntry_right  !=  null;

      if (t_24) {
        {
          {
            {
              {
                {
                  var_13_l.roops_core_objects_TreeSetEntry_right.roops_core_objects_TreeSetEntry_parent = param_p_14;
                }
              }
            }
          }
        }
      }
      var_13_l.roops_core_objects_TreeSetEntry_parent = p.roops_core_objects_TreeSetEntry_parent;
      t_26 = p.roops_core_objects_TreeSetEntry_parent  ==  null;

      if (t_26) {
        {
          {
            {
              {
                {
                  this.roops_core_objects_TreeSet_root = var_13_l;
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

                  t_25 = p.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_right  ==  param_p_14;
                  if (t_25) {
                    {
                      {
                        {
                          {
                            {
                              p.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_right = var_13_l;
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
                              p.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_left = var_13_l;
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
      var_13_l.roops_core_objects_TreeSetEntry_right = param_p_14;
      p.roops_core_objects_TreeSetEntry_parent = var_13_l;
    }
  }
/** From CLR 
*/

  private void fixAfterInsertion(final roops.core.objects.TreeSetEntry entry) {
    roops.core.objects.TreeSetEntry param_entry_15;

    param_entry_15 = entry;
    {
      boolean t_27;
      boolean t_28;
      boolean t_29;
      boolean t_30;
      boolean t_31;
      roops.core.objects.TreeSetEntry var_14_x = param_entry_15;

      var_14_x.roops_core_objects_TreeSetEntry_color = this.roops_core_objects_TreeSet_RED;
      boolean var_15_ws_4;

      t_29 = var_14_x  !=  null;

      if (t_29) {
        {
          {
            t_30 = var_14_x  !=  this.roops_core_objects_TreeSet_root;
            if (t_30) {
              {
                t_28 = true;
              }
            } else {
              {
                t_28 = false;
              }
            }
          }
        }
      } else {
        {
          t_28 = false;
        }
      }

      if (t_28) {
        {
          {
            t_31 = var_14_x.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_color  ==  this.roops_core_objects_TreeSet_RED;
            if (t_31) {
              {
                t_27 = true;
              }
            } else {
              {
                t_27 = false;
              }
            }
          }
        }
      } else {
        {
          t_27 = false;
        }
      }
      var_15_ws_4 = t_27;
      while (var_15_ws_4) {
        roops.core.objects.TreeSetEntry t_76;
        roops.core.objects.TreeSetEntry t_77;
        roops.core.objects.TreeSetEntry t_78;
        roops.core.objects.TreeSetEntry t_79;
        boolean t_80;
        boolean t_81;
        boolean t_82;
        boolean t_83;
        boolean t_84;
        boolean t_85;

        t_76 = parentOf(var_14_x);
        t_77 = parentOf(var_14_x);
        t_78 = parentOf(t_77);
        t_79 = leftOf(t_78);
        t_80 = t_76  ==  t_79;

        if (t_80) {
          {
            {
              {
                {
                  {
                    roops.core.objects.TreeSetEntry t_32;
                    roops.core.objects.TreeSetEntry t_33;
                    roops.core.objects.TreeSetEntry t_34;
                    boolean t_52;
                    boolean t_53;

                    t_32 = parentOf(var_14_x);
                    t_33 = parentOf(t_32);
                    t_34 = rightOf(t_33);
                    roops.core.objects.TreeSetEntry var_16_y = t_34;

                    t_52 = colorOf(var_16_y);
                    t_53 = t_52  ==  this.roops_core_objects_TreeSet_RED;
                    if (t_53) {
                      {
                        {
                          {
                            {
                              {
                                roops.core.objects.TreeSetEntry t_35;
                                roops.core.objects.TreeSetEntry t_36;
                                roops.core.objects.TreeSetEntry t_37;
                                roops.core.objects.TreeSetEntry t_38;
                                roops.core.objects.TreeSetEntry t_39;

                                t_35 = parentOf(var_14_x);
                                setColor(t_35, this.roops_core_objects_TreeSet_BLACK);
                                setColor(var_16_y, this.roops_core_objects_TreeSet_BLACK);
                                t_36 = parentOf(var_14_x);
                                t_37 = parentOf(t_36);
                                setColor(t_37, this.roops_core_objects_TreeSet_RED);
                                t_38 = parentOf(var_14_x);
                                t_39 = parentOf(t_38);
                                var_14_x = t_39;
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
                                roops.core.objects.TreeSetEntry t_41;
                                roops.core.objects.TreeSetEntry t_42;
                                boolean t_43;
                                roops.core.objects.TreeSetEntry t_44;
                                roops.core.objects.TreeSetEntry t_45;
                                roops.core.objects.TreeSetEntry t_46;
                                roops.core.objects.TreeSetEntry t_49;
                                roops.core.objects.TreeSetEntry t_50;
                                boolean t_51;

                                t_41 = parentOf(var_14_x);
                                t_42 = rightOf(t_41);
                                t_43 = var_14_x  ==  t_42;

                                if (t_43) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            roops.core.objects.TreeSetEntry t_40;

                                            t_40 = parentOf(var_14_x);
                                            var_14_x = t_40;
                                            this.rotateLeft(var_14_x);
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
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                t_44 = parentOf(var_14_x);
                                setColor(t_44, this.roops_core_objects_TreeSet_BLACK);
                                t_45 = parentOf(var_14_x);
                                t_46 = parentOf(t_45);
                                setColor(t_46, this.roops_core_objects_TreeSet_RED);
                                t_49 = parentOf(var_14_x);
                                t_50 = parentOf(t_49);
                                t_51 = t_50  !=  null;
                                if (t_51) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            roops.core.objects.TreeSetEntry t_47;
                                            roops.core.objects.TreeSetEntry t_48;

                                            t_47 = parentOf(var_14_x);
                                            t_48 = parentOf(t_47);
                                            this.rotateRight(t_48);
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
                    roops.core.objects.TreeSetEntry t_54;
                    roops.core.objects.TreeSetEntry t_55;
                    roops.core.objects.TreeSetEntry t_56;
                    boolean t_74;
                    boolean t_75;

                    t_54 = parentOf(var_14_x);
                    t_55 = parentOf(t_54);
                    t_56 = leftOf(t_55);
                    roops.core.objects.TreeSetEntry var_17_y = t_56;

                    t_74 = colorOf(var_17_y);
                    t_75 = t_74  ==  this.roops_core_objects_TreeSet_RED;
                    if (t_75) {
                      {
                        {
                          {
                            {
                              {
                                roops.core.objects.TreeSetEntry t_57;
                                roops.core.objects.TreeSetEntry t_58;
                                roops.core.objects.TreeSetEntry t_59;
                                roops.core.objects.TreeSetEntry t_60;
                                roops.core.objects.TreeSetEntry t_61;

                                t_57 = parentOf(var_14_x);
                                setColor(t_57, this.roops_core_objects_TreeSet_BLACK);
                                setColor(var_17_y, this.roops_core_objects_TreeSet_BLACK);
                                t_58 = parentOf(var_14_x);
                                t_59 = parentOf(t_58);
                                setColor(t_59, this.roops_core_objects_TreeSet_RED);
                                t_60 = parentOf(var_14_x);
                                t_61 = parentOf(t_60);
                                var_14_x = t_61;
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
                                roops.core.objects.TreeSetEntry t_63;
                                roops.core.objects.TreeSetEntry t_64;
                                boolean t_65;
                                roops.core.objects.TreeSetEntry t_66;
                                roops.core.objects.TreeSetEntry t_67;
                                roops.core.objects.TreeSetEntry t_68;
                                roops.core.objects.TreeSetEntry t_71;
                                roops.core.objects.TreeSetEntry t_72;
                                boolean t_73;

                                t_63 = parentOf(var_14_x);
                                t_64 = leftOf(t_63);
                                t_65 = var_14_x  ==  t_64;

                                if (t_65) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            roops.core.objects.TreeSetEntry t_62;

                                            t_62 = parentOf(var_14_x);
                                            var_14_x = t_62;
                                            this.rotateRight(var_14_x);
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
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                t_66 = parentOf(var_14_x);
                                setColor(t_66, this.roops_core_objects_TreeSet_BLACK);
                                t_67 = parentOf(var_14_x);
                                t_68 = parentOf(t_67);
                                setColor(t_68, this.roops_core_objects_TreeSet_RED);
                                t_71 = parentOf(var_14_x);
                                t_72 = parentOf(t_71);
                                t_73 = t_72  !=  null;
                                if (t_73) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            roops.core.objects.TreeSetEntry t_69;
                                            roops.core.objects.TreeSetEntry t_70;

                                            t_69 = parentOf(var_14_x);
                                            t_70 = parentOf(t_69);
                                            this.rotateLeft(t_70);
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
        t_83 = var_14_x  !=  null;

        if (t_83) {
          {
            {
              t_84 = var_14_x  !=  this.roops_core_objects_TreeSet_root;
              if (t_84) {
                {
                  t_82 = true;
                }
              } else {
                {
                  t_82 = false;
                }
              }
            }
          }
        } else {
          {
            t_82 = false;
          }
        }

        if (t_82) {
          {
            {
              t_85 = var_14_x.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_color  ==  this.roops_core_objects_TreeSet_RED;
              if (t_85) {
                {
                  t_81 = true;
                }
              } else {
                {
                  t_81 = false;
                }
              }
            }
          }
        } else {
          {
            t_81 = false;
          }
        }
        var_15_ws_4 = t_81;
      }
      this.roops_core_objects_TreeSet_root.roops_core_objects_TreeSetEntry_color = this.roops_core_objects_TreeSet_BLACK;
    }
  }


  public boolean remove(int aKey) {
    int param_aKey_16;

    param_aKey_16 = aKey;
    {
      roops.core.objects.TreeSetEntry t_86;
      boolean t_87;

      t_86 = this.getEntry_remove(param_aKey_16);
      roops.core.objects.TreeSetEntry var_18_p = t_86;

      t_87 = var_18_p  ==  null;

      if (t_87) {
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
      this.deleteEntry(var_18_p);

      return true;
    }
  }
/** Delete node p, and then rebalance the tree.
*/

  private void deleteEntry(roops.core.objects.TreeSetEntry p) {
    roops.core.objects.TreeSetEntry param_p_17;

    param_p_17 = p;
    {
      boolean t_89;
      boolean t_90;
      boolean t_91;
      boolean t_92;
      boolean t_103;

      this.decrementSize();
      t_90 = p.roops_core_objects_TreeSetEntry_left  !=  null;

      if (t_90) {
        {
          {
            t_91 = p.roops_core_objects_TreeSetEntry_right  !=  null;
            if (t_91) {
              {
                t_89 = true;
              }
            } else {
              {
                t_89 = false;
              }
            }
          }
        }
      } else {
        {
          t_89 = false;
        }
      }

      if (t_89) {
        {
          {
            {
              {
                {
                  roops.core.objects.TreeSetEntry t_88;

                  t_88 = this.successor(param_p_17);
                  roops.core.objects.TreeSetEntry var_19_s = t_88;

                  p.roops_core_objects_TreeSetEntry_key = var_19_s.roops_core_objects_TreeSetEntry_key;
                  param_p_17 = var_19_s;
                }
              }
            }
          }
        }
      }
      roops.core.objects.TreeSetEntry var_20_replacement;

      t_92 = p.roops_core_objects_TreeSetEntry_left  !=  null;

      if (t_92) {
        {
          {
            {
              {
                {
                  var_20_replacement = p.roops_core_objects_TreeSetEntry_left;
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
                  var_20_replacement = p.roops_core_objects_TreeSetEntry_right;
                }
              }
            }
          }
        }
      }
      t_103 = var_20_replacement  !=  null;
      if (t_103) {
        {
          {
            {
              {
                {
                  boolean t_94;
                  roops.core.objects.TreeSetEntry t_95;
                  roops.core.objects.TreeSetEntry t_96;
                  boolean t_97;

                  var_20_replacement.roops_core_objects_TreeSetEntry_parent = p.roops_core_objects_TreeSetEntry_parent;
                  t_94 = p.roops_core_objects_TreeSetEntry_parent  ==  null;

                  if (t_94) {
                    {
                      {
                        {
                          {
                            {
                              this.roops_core_objects_TreeSet_root = var_20_replacement;
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
                              boolean t_93;

                              t_93 = param_p_17  ==  p.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_left;
                              if (t_93) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          p.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_left = var_20_replacement;
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
                                          p.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_right = var_20_replacement;
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
                  p.roops_core_objects_TreeSetEntry_parent = ((roops.core.objects.TreeSetEntry)(null));
                  t_95 = p.roops_core_objects_TreeSetEntry_parent;
                  p.roops_core_objects_TreeSetEntry_right = t_95;
                  t_96 = p.roops_core_objects_TreeSetEntry_right;
                  p.roops_core_objects_TreeSetEntry_left = t_96;
                  t_97 = p.roops_core_objects_TreeSetEntry_color  ==  this.roops_core_objects_TreeSet_BLACK;
                  if (t_97) {
                    {
                      {
                        {
                          {
                            {
                              this.fixAfterDeletion(var_20_replacement);
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
                  boolean t_102;

                  t_102 = p.roops_core_objects_TreeSetEntry_parent  ==  null;
                  if (t_102) {
                    {
                      {
                        {
                          {
                            {
                              this.roops_core_objects_TreeSet_root = ((roops.core.objects.TreeSetEntry)(null));
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
                              boolean t_98;
                              boolean t_101;

                              t_98 = p.roops_core_objects_TreeSetEntry_color  ==  this.roops_core_objects_TreeSet_BLACK;

                              if (t_98) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          this.fixAfterDeletion(param_p_17);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              t_101 = p.roops_core_objects_TreeSetEntry_parent  !=  null;
                              if (t_101) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          boolean t_100;

                                          t_100 = param_p_17  ==  p.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_left;

                                          if (t_100) {
                                            {
                                              {
                                                {
                                                  {
                                                    {
                                                      p.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_left = ((roops.core.objects.TreeSetEntry)(null));
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
                                                      boolean t_99;

                                                      t_99 = param_p_17  ==  p.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_right;
                                                      if (t_99) {
                                                        {
                                                          {
                                                            {
                                                              {
                                                                {
                                                                  p.roops_core_objects_TreeSetEntry_parent.roops_core_objects_TreeSetEntry_right = ((roops.core.objects.TreeSetEntry)(null));
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
                                          p.roops_core_objects_TreeSetEntry_parent = ((roops.core.objects.TreeSetEntry)(null));
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
/** From CLR 
*/

  private void fixAfterDeletion(final roops.core.objects.TreeSetEntry entry) {
    roops.core.objects.TreeSetEntry param_entry_18;

    param_entry_18 = entry;
    {
      boolean t_104;
      boolean t_105;
      boolean t_106;
      boolean t_107;
      roops.core.objects.TreeSetEntry var_21_x = param_entry_18;
      boolean var_22_ws_5;

      t_105 = var_21_x  !=  this.roops_core_objects_TreeSet_root;
      t_106 = colorOf(var_21_x);

      if (t_105) {
        {
          {
            t_107 = t_106  ==  this.roops_core_objects_TreeSet_BLACK;
            if (t_107) {
              {
                t_104 = true;
              }
            } else {
              {
                t_104 = false;
              }
            }
          }
        }
      } else {
        {
          t_104 = false;
        }
      }
      var_22_ws_5 = t_104;
      while (var_22_ws_5) {
        roops.core.objects.TreeSetEntry t_162;
        roops.core.objects.TreeSetEntry t_163;
        boolean t_164;
        boolean t_165;
        boolean t_166;
        boolean t_167;
        boolean t_168;

        t_162 = parentOf(var_21_x);
        t_163 = leftOf(t_162);
        t_164 = var_21_x  ==  t_163;

        if (t_164) {
          {
            {
              {
                {
                  {
                    roops.core.objects.TreeSetEntry t_108;
                    roops.core.objects.TreeSetEntry t_109;
                    boolean t_114;
                    boolean t_115;
                    boolean t_128;
                    roops.core.objects.TreeSetEntry t_129;
                    boolean t_130;
                    boolean t_131;
                    roops.core.objects.TreeSetEntry t_132;
                    boolean t_133;
                    boolean t_134;

                    t_108 = parentOf(var_21_x);
                    t_109 = rightOf(t_108);
                    roops.core.objects.TreeSetEntry var_23_sib = t_109;

                    t_114 = colorOf(var_23_sib);
                    t_115 = t_114  ==  this.roops_core_objects_TreeSet_RED;

                    if (t_115) {
                      {
                        {
                          {
                            {
                              {
                                roops.core.objects.TreeSetEntry t_110;
                                roops.core.objects.TreeSetEntry t_111;
                                roops.core.objects.TreeSetEntry t_112;
                                roops.core.objects.TreeSetEntry t_113;

                                setColor(var_23_sib, this.roops_core_objects_TreeSet_BLACK);
                                t_110 = parentOf(var_21_x);
                                setColor(t_110, this.roops_core_objects_TreeSet_RED);
                                t_111 = parentOf(var_21_x);
                                this.rotateLeft(t_111);
                                t_112 = parentOf(var_21_x);
                                t_113 = rightOf(t_112);
                                var_23_sib = t_113;
                              }
                            }
                          }
                        }
                      }
                    }
                    t_129 = leftOf(var_23_sib);
                    t_130 = colorOf(t_129);
                    t_131 = t_130  ==  this.roops_core_objects_TreeSet_BLACK;
                    t_132 = rightOf(var_23_sib);
                    t_133 = colorOf(t_132);

                    if (t_131) {
                      {
                        {
                          t_134 = t_133  ==  this.roops_core_objects_TreeSet_BLACK;
                          if (t_134) {
                            {
                              t_128 = true;
                            }
                          } else {
                            {
                              t_128 = false;
                            }
                          }
                        }
                      }
                    } else {
                      {
                        t_128 = false;
                      }
                    }
                    if (t_128) {
                      {
                        {
                          {
                            {
                              {
                                roops.core.objects.TreeSetEntry t_116;

                                setColor(var_23_sib, this.roops_core_objects_TreeSet_RED);
                                t_116 = parentOf(var_21_x);
                                var_21_x = t_116;
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
                                roops.core.objects.TreeSetEntry t_120;
                                boolean t_121;
                                boolean t_122;
                                roops.core.objects.TreeSetEntry t_123;
                                boolean t_124;
                                roops.core.objects.TreeSetEntry t_125;
                                roops.core.objects.TreeSetEntry t_126;
                                roops.core.objects.TreeSetEntry t_127;

                                t_120 = rightOf(var_23_sib);
                                t_121 = colorOf(t_120);
                                t_122 = t_121  ==  this.roops_core_objects_TreeSet_BLACK;

                                if (t_122) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            roops.core.objects.TreeSetEntry t_117;
                                            roops.core.objects.TreeSetEntry t_118;
                                            roops.core.objects.TreeSetEntry t_119;

                                            t_117 = leftOf(var_23_sib);
                                            setColor(t_117, this.roops_core_objects_TreeSet_BLACK);
                                            setColor(var_23_sib, this.roops_core_objects_TreeSet_RED);
                                            this.rotateRight(var_23_sib);
                                            t_118 = parentOf(var_21_x);
                                            t_119 = rightOf(t_118);
                                            var_23_sib = t_119;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                t_123 = parentOf(var_21_x);
                                t_124 = colorOf(t_123);
                                setColor(var_23_sib, t_124);
                                t_125 = parentOf(var_21_x);
                                setColor(t_125, this.roops_core_objects_TreeSet_BLACK);
                                t_126 = rightOf(var_23_sib);
                                setColor(t_126, this.roops_core_objects_TreeSet_BLACK);
                                t_127 = parentOf(var_21_x);
                                this.rotateLeft(t_127);
                                var_21_x = this.roops_core_objects_TreeSet_root;
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
                    roops.core.objects.TreeSetEntry t_135;
                    roops.core.objects.TreeSetEntry t_136;
                    boolean t_141;
                    boolean t_142;
                    boolean t_155;
                    roops.core.objects.TreeSetEntry t_156;
                    boolean t_157;
                    boolean t_158;
                    roops.core.objects.TreeSetEntry t_159;
                    boolean t_160;
                    boolean t_161;

                    t_135 = parentOf(var_21_x);
                    t_136 = leftOf(t_135);
                    roops.core.objects.TreeSetEntry var_24_sib = t_136;

                    t_141 = colorOf(var_24_sib);
                    t_142 = t_141  ==  this.roops_core_objects_TreeSet_RED;

                    if (t_142) {
                      {
                        {
                          {
                            {
                              {
                                roops.core.objects.TreeSetEntry t_137;
                                roops.core.objects.TreeSetEntry t_138;
                                roops.core.objects.TreeSetEntry t_139;
                                roops.core.objects.TreeSetEntry t_140;

                                setColor(var_24_sib, this.roops_core_objects_TreeSet_BLACK);
                                t_137 = parentOf(var_21_x);
                                setColor(t_137, this.roops_core_objects_TreeSet_RED);
                                t_138 = parentOf(var_21_x);
                                this.rotateRight(t_138);
                                t_139 = parentOf(var_21_x);
                                t_140 = leftOf(t_139);
                                var_24_sib = t_140;
                              }
                            }
                          }
                        }
                      }
                    }
                    t_156 = rightOf(var_24_sib);
                    t_157 = colorOf(t_156);
                    t_158 = t_157  ==  this.roops_core_objects_TreeSet_BLACK;
                    t_159 = leftOf(var_24_sib);
                    t_160 = colorOf(t_159);

                    if (t_158) {
                      {
                        {
                          t_161 = t_160  ==  this.roops_core_objects_TreeSet_BLACK;
                          if (t_161) {
                            {
                              t_155 = true;
                            }
                          } else {
                            {
                              t_155 = false;
                            }
                          }
                        }
                      }
                    } else {
                      {
                        t_155 = false;
                      }
                    }
                    if (t_155) {
                      {
                        {
                          {
                            {
                              {
                                roops.core.objects.TreeSetEntry t_143;

                                setColor(var_24_sib, this.roops_core_objects_TreeSet_RED);
                                t_143 = parentOf(var_21_x);
                                var_21_x = t_143;
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
                                roops.core.objects.TreeSetEntry t_147;
                                boolean t_148;
                                boolean t_149;
                                roops.core.objects.TreeSetEntry t_150;
                                boolean t_151;
                                roops.core.objects.TreeSetEntry t_152;
                                roops.core.objects.TreeSetEntry t_153;
                                roops.core.objects.TreeSetEntry t_154;

                                t_147 = leftOf(var_24_sib);
                                t_148 = colorOf(t_147);
                                t_149 = t_148  ==  this.roops_core_objects_TreeSet_BLACK;

                                if (t_149) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            roops.core.objects.TreeSetEntry t_144;
                                            roops.core.objects.TreeSetEntry t_145;
                                            roops.core.objects.TreeSetEntry t_146;

                                            t_144 = rightOf(var_24_sib);
                                            setColor(t_144, this.roops_core_objects_TreeSet_BLACK);
                                            setColor(var_24_sib, this.roops_core_objects_TreeSet_RED);
                                            this.rotateLeft(var_24_sib);
                                            t_145 = parentOf(var_21_x);
                                            t_146 = leftOf(t_145);
                                            var_24_sib = t_146;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                t_150 = parentOf(var_21_x);
                                t_151 = colorOf(t_150);
                                setColor(var_24_sib, t_151);
                                t_152 = parentOf(var_21_x);
                                setColor(t_152, this.roops_core_objects_TreeSet_BLACK);
                                t_153 = leftOf(var_24_sib);
                                setColor(t_153, this.roops_core_objects_TreeSet_BLACK);
                                t_154 = parentOf(var_21_x);
                                this.rotateRight(t_154);
                                var_21_x = this.roops_core_objects_TreeSet_root;
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
        t_166 = var_21_x  !=  this.roops_core_objects_TreeSet_root;
        t_167 = colorOf(var_21_x);

        if (t_166) {
          {
            {
              t_168 = t_167  ==  this.roops_core_objects_TreeSet_BLACK;
              if (t_168) {
                {
                  t_165 = true;
                }
              } else {
                {
                  t_165 = false;
                }
              }
            }
          }
        } else {
          {
            t_165 = false;
          }
        }
        var_22_ws_5 = t_165;
      }
      setColor(var_21_x, this.roops_core_objects_TreeSet_BLACK);
    }
  }


  private void decrementSize() {
    {
      int t_169;
      int t_170;

      t_169 = this.roops_core_objects_TreeSet_modCount;
      this.roops_core_objects_TreeSet_modCount = this.roops_core_objects_TreeSet_modCount + (byte)1;
      t_170 = this.roops_core_objects_TreeSet_size;
      this.roops_core_objects_TreeSet_size = this.roops_core_objects_TreeSet_size + (byte)-1;
    }
  }


  private roops.core.objects.TreeSetEntry successor(roops.core.objects.TreeSetEntry t) {
    roops.core.objects.TreeSetEntry param_t_19;

    param_t_19 = t;
    {
      boolean t_178;

      t_178 = param_t_19  ==  null;
      if (t_178) {
        {
          {
            {
              {
                {
                  return ((roops.core.objects.TreeSetEntry)(null));
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
                  boolean t_177;

                  t_177 = t.roops_core_objects_TreeSetEntry_right  !=  null;
                  if (t_177) {
                    {
                      {
                        {
                          {
                            {
                              roops.core.objects.TreeSetEntry var_25_p = t.roops_core_objects_TreeSetEntry_right;
                              boolean var_26_ws_6;

                              var_26_ws_6 = var_25_p.roops_core_objects_TreeSetEntry_left  !=  null;
                              while (var_26_ws_6) {
                                var_25_p = var_25_p.roops_core_objects_TreeSetEntry_left;
                                var_26_ws_6 = var_25_p.roops_core_objects_TreeSetEntry_left  !=  null;
                              }

                              return var_25_p;
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
                              boolean t_171;
                              boolean t_172;
                              boolean t_173;
                              roops.core.objects.TreeSetEntry var_27_p = t.roops_core_objects_TreeSetEntry_parent;
                              roops.core.objects.TreeSetEntry var_28_ch = param_t_19;
                              boolean var_29_ws_7;

                              t_172 = var_27_p  !=  null;

                              if (t_172) {
                                {
                                  {
                                    t_173 = var_28_ch  ==  var_27_p.roops_core_objects_TreeSetEntry_right;
                                    if (t_173) {
                                      {
                                        t_171 = true;
                                      }
                                    } else {
                                      {
                                        t_171 = false;
                                      }
                                    }
                                  }
                                }
                              } else {
                                {
                                  t_171 = false;
                                }
                              }
                              var_29_ws_7 = t_171;
                              while (var_29_ws_7) {
                                boolean t_174;
                                boolean t_175;
                                boolean t_176;

                                var_28_ch = var_27_p;
                                var_27_p = var_27_p.roops_core_objects_TreeSetEntry_parent;
                                t_175 = var_27_p  !=  null;

                                if (t_175) {
                                  {
                                    {
                                      t_176 = var_28_ch  ==  var_27_p.roops_core_objects_TreeSetEntry_right;
                                      if (t_176) {
                                        {
                                          t_174 = true;
                                        }
                                      } else {
                                        {
                                          t_174 = false;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  {
                                    t_174 = false;
                                  }
                                }
                                var_29_ws_7 = t_174;
                              }

                              return var_27_p;
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


  public TreeSet() {
    this.roops_core_objects_TreeSet_root = ((roops.core.objects.TreeSetEntry)(null));
    this.roops_core_objects_TreeSet_size = 0;
    this.roops_core_objects_TreeSet_modCount = 0;
    this.roops_core_objects_TreeSet_RED = false;
    this.roops_core_objects_TreeSet_BLACK = true;
  }

}
