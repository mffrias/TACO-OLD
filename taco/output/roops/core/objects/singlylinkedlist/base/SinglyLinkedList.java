package roops.core.objects.singlylinkedlist.base;

//@ model import org.jmlspecs.lang.*;


public class SinglyLinkedList extends java.lang.Object {

  public roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode roops_core_objects_singlylinkedlist_base_SinglyLinkedList_header;
  /*@ invariant (\forall roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode n; \reach(this.roops_core_objects_singlylinkedlist_base_SinglyLinkedList_header, roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode, roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); \reach(n.roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next, roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode, roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next).has(((java.lang.Object)(n)))  ==  false);
    @*/

  public SinglyLinkedList() {
    {
    }
  }


  /*@ 
    @ requires value_param  ==  null;
    @ ensures (\exists roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode n; \reach(this.roops_core_objects_singlylinkedlist_base_SinglyLinkedList_header, roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode, roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); n.roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_value  ==  value_param) <==> (\result  ==  true);
    @ signals (java.lang.RuntimeException e) false;
    @*/
  public boolean contains(/*@ nullable @*/ java.lang.Object value_param) {
    java.lang.Object param_value_param_0;

    param_value_param_0 = value_param;
    {
      boolean t_1;
      boolean t_2;
      boolean t_3;
      roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode var_1_current;
      boolean var_2_result;

      var_1_current = this.roops_core_objects_singlylinkedlist_base_SinglyLinkedList_header.roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next;
      var_2_result = false;
      boolean var_3_ws_1;

      t_2 = var_2_result  ==  false;

      if (t_2) {
        {
          {
            t_3 = var_1_current  !=  null;
            if (t_3) {
              {
                t_1 = true;
              }
            } else {
              {
                t_1 = false;
              }
            }
          }
        }
      } else {
        {
          t_1 = false;
        }
      }
      var_3_ws_1 = t_1;
      while (var_3_ws_1) {
        boolean t_6;
        boolean t_7;
        boolean t_8;
        boolean t_9;
        boolean t_10;
        boolean t_11;
        boolean t_12;
        boolean var_4_equalVal;

        t_7 = param_value_param_0  ==  null;

        if (t_7) {
          {
            {
              t_8 = var_1_current.roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_value  ==  null;
              if (t_8) {
                {
                  t_6 = true;
                }
              } else {
                {
                  t_6 = false;
                }
              }
            }
          }
        } else {
          {
            t_6 = false;
          }
        }

        if (t_6) {
          {
            {
              {
                {
                  {
                    var_4_equalVal = true;
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

                    t_5 = param_value_param_0  !=  null;
                    if (t_5) {
                      {
                        {
                          {
                            {
                              {
                                boolean t_4;

                                t_4 = param_value_param_0  ==  var_1_current.roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_value;
                                if (t_4) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            var_4_equalVal = true;
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
                                            var_4_equalVal = false;
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
                                var_4_equalVal = false;
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
        t_9 = var_4_equalVal  ==  true;

        if (t_9) {
          {
            {
              {
                {
                  {
                    var_2_result = true;
                  }
                }
              }
            }
          }
        }
        var_1_current = var_1_current.roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next;
        t_11 = var_2_result  ==  false;

        if (t_11) {
          {
            {
              t_12 = var_1_current  !=  null;
              if (t_12) {
                {
                  t_10 = true;
                }
              } else {
                {
                  t_10 = false;
                }
              }
            }
          }
        } else {
          {
            t_10 = false;
          }
        }
        var_3_ws_1 = t_10;
      }

      return var_2_result;
    }
  }


  /*@ 
    @ requires index  >=  0 && index  <  \reach(this.roops_core_objects_singlylinkedlist_base_SinglyLinkedList_header, roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode, roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next).int_size();
    @ ensures \reach(this.roops_core_objects_singlylinkedlist_base_SinglyLinkedList_header, roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode, roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next).has(((java.lang.Object)(\result)))  ==  true;
    @ ensures \reach(\result, roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode, roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next).int_size()  ==  \reach(this.roops_core_objects_singlylinkedlist_base_SinglyLinkedList_header, roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode, roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next).int_size() - index;
    @ signals (java.lang.RuntimeException e) false;
    @*/
  public roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode getNode(int index) {
    int param_index_1;

    param_index_1 = index;
    {
      boolean t_13;
      boolean t_14;
      boolean t_15;
      roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode var_5_current = this.roops_core_objects_singlylinkedlist_base_SinglyLinkedList_header;
      roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode var_6_result = ((roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode)(null));
      int var_7_current_index = 0;
      boolean var_8_ws_2;

      t_14 = var_6_result  ==  null;

      if (t_14) {
        {
          {
            t_15 = var_5_current  !=  null;
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
      var_8_ws_2 = t_13;
      while (var_8_ws_2) {
        boolean t_16;
        boolean t_17;
        boolean t_18;
        boolean t_19;

        t_16 = param_index_1  ==  var_7_current_index;

        if (t_16) {
          {
            {
              {
                {
                  {
                    var_6_result = var_5_current;
                  }
                }
              }
            }
          }
        }
        var_7_current_index = var_7_current_index + 1;
        var_5_current = var_5_current.roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next;
        t_18 = var_6_result  ==  null;

        if (t_18) {
          {
            {
              t_19 = var_5_current  !=  null;
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
        var_8_ws_2 = t_17;
      }

      return var_6_result;
    }
  }


  public void insertBack(java.lang.Object arg) {
    java.lang.Object param_arg_2;

    param_arg_2 = arg;
    {
      roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode t_20;
      boolean t_21;

      t_20 = new roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode();
      roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode var_9_freshNode = t_20;

      var_9_freshNode.roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_value = param_arg_2;
      var_9_freshNode.roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next = ((roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode)(null));
      t_21 = this.roops_core_objects_singlylinkedlist_base_SinglyLinkedList_header  ==  null;
      if (t_21) {
        {
          {
            {
              {
                {
                  this.roops_core_objects_singlylinkedlist_base_SinglyLinkedList_header = var_9_freshNode;
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
                  roops.core.objects.singlylinkedlist.base.SinglyLinkedListNode var_10_current;

                  var_10_current = this.roops_core_objects_singlylinkedlist_base_SinglyLinkedList_header;
                  boolean var_11_ws_3;

                  var_11_ws_3 = var_10_current.roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next  !=  null;
                  while (var_11_ws_3) {
                    var_10_current = var_10_current.roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next;
                    var_11_ws_3 = var_10_current.roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next  !=  null;
                  }
                  var_10_current.roops_core_objects_singlylinkedlist_base_SinglyLinkedListNode_next = var_9_freshNode;
                }
              }
            }
          }
        }
      }
    }
  }

}
