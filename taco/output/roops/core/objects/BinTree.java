package roops.core.objects;

//@ model import org.jmlspecs.lang.*;


public class BinTree extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objects.BinTreeNode roops_core_objects_BinTree_root;
  public int roops_core_objects_BinTree_size;
  /*@ invariant (\forall roops.core.objects.BinTreeNode n; \reach(this.roops_core_objects_BinTree_root, roops.core.objects.BinTreeNode, roops_core_objects_BinTreeNode_right + roops_core_objects_BinTreeNode_left).has(((java.lang.Object)(n)))  ==  true; \reach(n.roops_core_objects_BinTreeNode_right, roops.core.objects.BinTreeNode, roops_core_objects_BinTreeNode_left + roops_core_objects_BinTreeNode_right).has(((java.lang.Object)(n)))  ==  false && \reach(n.roops_core_objects_BinTreeNode_left, roops.core.objects.BinTreeNode, roops_core_objects_BinTreeNode_right + roops_core_objects_BinTreeNode_left).has(((java.lang.Object)(n)))  ==  false);
    @*/
  /*@ invariant (\forall roops.core.objects.BinTreeNode n; \reach(this.roops_core_objects_BinTree_root, roops.core.objects.BinTreeNode, roops_core_objects_BinTreeNode_right + roops_core_objects_BinTreeNode_left).has(((java.lang.Object)(n)))  ==  true; (\forall roops.core.objects.BinTreeNode m; \reach(n.roops_core_objects_BinTreeNode_left, roops.core.objects.BinTreeNode, roops_core_objects_BinTreeNode_right + roops_core_objects_BinTreeNode_left).has(((java.lang.Object)(m)))  ==  true; m.roops_core_objects_BinTreeNode_key  <=  n.roops_core_objects_BinTreeNode_key) && (\forall roops.core.objects.BinTreeNode m; \reach(n.roops_core_objects_BinTreeNode_right, roops.core.objects.BinTreeNode, roops_core_objects_BinTreeNode_right + roops_core_objects_BinTreeNode_left).has(((java.lang.Object)(m)))  ==  true; m.roops_core_objects_BinTreeNode_key  >  n.roops_core_objects_BinTreeNode_key));
    @*/
  /*@ invariant this.roops_core_objects_BinTree_size  ==  \reach(this.roops_core_objects_BinTree_root, roops.core.objects.BinTreeNode, roops_core_objects_BinTreeNode_right + roops_core_objects_BinTreeNode_left).int_size();
    @*/
  /*@ invariant (\forall roops.core.objects.BinTreeNode n; \reach(this.roops_core_objects_BinTree_root, roops.core.objects.BinTreeNode, roops_core_objects_BinTreeNode_right + roops_core_objects_BinTreeNode_left).has(((java.lang.Object)(n)))  ==  true; (n.roops_core_objects_BinTreeNode_left  !=  null ==> n.roops_core_objects_BinTreeNode_left.roops_core_objects_BinTreeNode_parent  ==  n) && (n.roops_core_objects_BinTreeNode_right  !=  null ==> n.roops_core_objects_BinTreeNode_right.roops_core_objects_BinTreeNode_parent  ==  n));
    @*/

  /*@ 
    @ requires true;
    @ ensures (\exists roops.core.objects.BinTreeNode n; \old(\reach(this.roops_core_objects_BinTree_root, roops.core.objects.BinTreeNode, roops_core_objects_BinTreeNode_right + roops_core_objects_BinTreeNode_left)).has(((java.lang.Object)(n)))  ==  true; n.roops_core_objects_BinTreeNode_key  ==  k) ==> this.roops_core_objects_BinTree_size  ==  \old(this.roops_core_objects_BinTree_size);
    @ ensures (\forall roops.core.objects.BinTreeNode n; \old(\reach(this.roops_core_objects_BinTree_root, roops.core.objects.BinTreeNode, roops_core_objects_BinTreeNode_right + roops_core_objects_BinTreeNode_left)).has(((java.lang.Object)(n)))  ==  true; n.roops_core_objects_BinTreeNode_key  !=  k) ==> this.roops_core_objects_BinTree_size  ==  \old(this.roops_core_objects_BinTree_size) + 1;
    @*/
  boolean insert(int k) {
    int param_k_0;

    param_k_0 = k;
    {
      roops.core.objects.BinTreeNode t_3;
      boolean t_5;
      roops.core.objects.BinTreeNode var_1_y = ((roops.core.objects.BinTreeNode)(null));
      roops.core.objects.BinTreeNode var_2_x = this.roops_core_objects_BinTree_root;
      boolean var_3_ws_1;

      var_3_ws_1 = var_2_x.roops_core_objects_BinTreeNode_left  !=  null;
      while (var_3_ws_1) {
        boolean t_2;

        var_1_y = var_2_x;
        t_2 = param_k_0  <  var_2_x.roops_core_objects_BinTreeNode_key;

        if (t_2) {
          {
            {
              {
                {
                  {
                    var_2_x = var_2_x.roops_core_objects_BinTreeNode_left;
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

                    t_1 = param_k_0  >  var_2_x.roops_core_objects_BinTreeNode_key;
                    if (t_1) {
                      {
                        {
                          {
                            {
                              {
                                var_2_x = var_2_x.roops_core_objects_BinTreeNode_right;
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
        var_3_ws_1 = var_2_x.roops_core_objects_BinTreeNode_left  !=  null;
      }
      t_3 = new roops.core.objects.BinTreeNode();
      var_2_x = t_3;
      var_2_x.roops_core_objects_BinTreeNode_key = param_k_0;
      t_5 = var_1_y  ==  null;

      if (t_5) {
        {
          {
            {
              {
                {
                  this.roops_core_objects_BinTree_root = var_2_x;
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
                  boolean t_4;

                  t_4 = param_k_0  <  var_1_y.roops_core_objects_BinTreeNode_key;
                  if (t_4) {
                    {
                      {
                        {
                          {
                            {
                              var_1_y.roops_core_objects_BinTreeNode_left = var_2_x;
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
                              var_1_y.roops_core_objects_BinTreeNode_right = var_2_x;
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
      var_2_x.roops_core_objects_BinTreeNode_parent = var_1_y;
      this.roops_core_objects_BinTree_size += 1;

      return true;
    }
  }


  public BinTree() {
    this.roops_core_objects_BinTree_root = ((roops.core.objects.BinTreeNode)(null));
    this.roops_core_objects_BinTree_size = (byte)0;
  }

}
