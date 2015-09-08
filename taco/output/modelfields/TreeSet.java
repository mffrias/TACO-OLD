package modelfields;

//@ model import org.jmlspecs.lang.*;


public class TreeSet extends java.lang.Object {

  public /*@ nullable @*/ modelfields.TreeSetEntry modelfields_TreeSet_root;
  public int modelfields_TreeSet_size;
  public int modelfields_TreeSet_modCount;
  boolean modelfields_TreeSet_RED;
  boolean modelfields_TreeSet_BLACK;
  /*@ invariant (this.modelfields_TreeSet_RED  ==  false) && (this.modelfields_TreeSet_BLACK  ==  true) && (this.modelfields_TreeSet_root.modelfields_TreeSetEntry_parent  ==  null) && (this.modelfields_TreeSet_root  !=  null ==> this.modelfields_TreeSet_root.modelfields_TreeSetEntry_color  ==  this.modelfields_TreeSet_BLACK) && (\forall modelfields.TreeSetEntry n; \reach(this.modelfields_TreeSet_root, modelfields.TreeSetEntry, modelfields_TreeSetEntry_right + modelfields_TreeSetEntry_left).has(((java.lang.Object)(n))); (n.modelfields_TreeSetEntry_left  !=  null ==> n.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_parent  ==  n) && (n.modelfields_TreeSetEntry_right  !=  null ==> n.modelfields_TreeSetEntry_right.modelfields_TreeSetEntry_parent  ==  n) && (n.modelfields_TreeSetEntry_parent  !=  null ==> (n.modelfields_TreeSetEntry_parent.modelfields_TreeSetEntry_left  ==  n || n.modelfields_TreeSetEntry_parent.modelfields_TreeSetEntry_right  ==  n)) && (\reach(n.modelfields_TreeSetEntry_parent, modelfields.TreeSetEntry, modelfields_TreeSetEntry_parent).has(((java.lang.Object)(n)))  ==  false) && (\forall modelfields.TreeSetEntry x; \reach(n.modelfields_TreeSetEntry_left, modelfields.TreeSetEntry, modelfields_TreeSetEntry_right + modelfields_TreeSetEntry_left).has(((java.lang.Object)(x))); n.modelfields_TreeSetEntry_key  >  x.modelfields_TreeSetEntry_key) && (\forall modelfields.TreeSetEntry x; \reach(n.modelfields_TreeSetEntry_right, modelfields.TreeSetEntry, modelfields_TreeSetEntry_right + modelfields_TreeSetEntry_left).has(((java.lang.Object)(x))); x.modelfields_TreeSetEntry_key  >  n.modelfields_TreeSetEntry_key) && ((n.modelfields_TreeSetEntry_color  ==  this.modelfields_TreeSet_RED && n.modelfields_TreeSetEntry_parent  !=  null) ==> n.modelfields_TreeSetEntry_parent.modelfields_TreeSetEntry_color  ==  this.modelfields_TreeSet_BLACK));
    @*/
  /*@ invariant this.modelfields_TreeSet_size  ==  \reach(this.modelfields_TreeSet_root, modelfields.TreeSetEntry, modelfields_TreeSetEntry_right + modelfields_TreeSetEntry_left).int_size();
    @*/

  /*@ 
    @ requires this.modelfields_TreeSet_root  !=  null;
    @ ensures \result  ==  true <==> (\exists modelfields.TreeSetEntry e; \reach(this.modelfields_TreeSet_root, modelfields.TreeSetEntry, modelfields_TreeSetEntry_right + modelfields_TreeSetEntry_left).has(((java.lang.Object)(e))); e.modelfields_TreeSetEntry_key  ==  value);
    @ ensures (\forall modelfields.TreeSetEntry e; \reach(this.modelfields_TreeSet_root, modelfields.TreeSetEntry, modelfields_TreeSetEntry_right + modelfields_TreeSetEntry_left).has(((java.lang.Object)(e))); e.modelfields_TreeSetEntry_left  ==  \old(e.modelfields_TreeSetEntry_left) && e.modelfields_TreeSetEntry_right  ==  \old(e.modelfields_TreeSetEntry_right) && e.modelfields_TreeSetEntry_color  ==  \old(e.modelfields_TreeSetEntry_color) && e.modelfields_TreeSetEntry_key  ==  \old(e.modelfields_TreeSetEntry_key));
    @ signals (java.lang.Exception e) false;
    @*/
  public boolean contains(int value) {
    int param_value_0;

    param_value_0 = value;
    {
      modelfields.TreeSetEntry var_1_p = this.modelfields_TreeSet_root;
      boolean var_2_ws_1;

      var_2_ws_1 = var_1_p  !=  null;

      /*@ decreasing \reach(this.modelfields_TreeSet_root, modelfields.TreeSetEntry, modelfields_TreeSetEntry_right + modelfields_TreeSetEntry_left).int_size();
        @*/
      while (var_2_ws_1) {
        boolean t_2;

        t_2 = value  ==  var_1_p.modelfields_TreeSetEntry_key;

        if (t_2) {
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
                    boolean t_1;

                    t_1 = value  <  var_1_p.modelfields_TreeSetEntry_key;
                    if (t_1) {
                      {
                        {
                          {
                            {
                              {
                                var_1_p = var_1_p.modelfields_TreeSetEntry_left;
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
                                var_1_p = var_1_p.modelfields_TreeSetEntry_right;
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

      return false;
    }
  }


  private modelfields.TreeSetEntry getEntry(int key) {
    int param_key_1;

    param_key_1 = key;
    {
      modelfields.TreeSetEntry var_3_p = this.modelfields_TreeSet_root;
      boolean var_4_ws_2;

      var_4_ws_2 = var_3_p  !=  null;
      while (var_4_ws_2) {
        boolean t_4;

        t_4 = param_key_1  ==  var_3_p.modelfields_TreeSetEntry_key;

        if (t_4) {
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
                    boolean t_3;

                    t_3 = param_key_1  <  var_3_p.modelfields_TreeSetEntry_key;
                    if (t_3) {
                      {
                        {
                          {
                            {
                              {
                                var_3_p = var_3_p.modelfields_TreeSetEntry_left;
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
                                var_3_p = var_3_p.modelfields_TreeSetEntry_right;
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

      return ((modelfields.TreeSetEntry)(null));
    }
  }


  public TreeSet() {
    this.modelfields_TreeSet_root = ((modelfields.TreeSetEntry)(null));
    this.modelfields_TreeSet_size = 0;
    this.modelfields_TreeSet_modCount = 0;
    this.modelfields_TreeSet_RED = false;
    this.modelfields_TreeSet_BLACK = true;
  }

}
