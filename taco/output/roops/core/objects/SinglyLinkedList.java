package roops.core.objects;

//@ model import org.jmlspecs.lang.*;


public class SinglyLinkedList extends java.lang.Object {

  public roops.core.objects.SinglyLinkedListNode roops_core_objects_SinglyLinkedList_header;
  /*@ invariant (\forall roops.core.objects.SinglyLinkedListNode n; \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); \reach(n.roops_core_objects_SinglyLinkedListNode_next, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n)))  ==  false);
    @*/

  public SinglyLinkedList() {
    {
    }
  }


  /*@ 
    @ ensures (\exists roops.core.objects.SinglyLinkedListNode n; \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); n.roops_core_objects_SinglyLinkedListNode_value  ==  value_param) <==> (\result  ==  true);
    @ signals (java.lang.RuntimeException e) false;
    @*/
  public boolean contains(/*@ nullable @*/ java.lang.Object value_param, java.lang.Object pepe1, java.lang.Object pepe2, roops.core.objects.SinglyLinkedListNode pepe3) {
    java.lang.Object param_value_param_6;

    param_value_param_6 = value_param;
    java.lang.Object param_pepe1_7;

    param_pepe1_7 = pepe1;
    java.lang.Object param_pepe2_8;

    param_pepe2_8 = pepe2;
    roops.core.objects.SinglyLinkedListNode param_pepe3_9;

    param_pepe3_9 = pepe3;
    {
      boolean t_22;
      boolean t_23;
      boolean t_24;
      roops.core.objects.SinglyLinkedListNode var_12_current;
      boolean var_13_result;

      var_12_current = this.roops_core_objects_SinglyLinkedList_header.roops_core_objects_SinglyLinkedListNode_next;
      var_13_result = false;
      boolean var_14_ws_4;

      t_23 = var_13_result  ==  false;

      if (t_23) {
        {
          {
            t_24 = var_12_current  !=  null;
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
      var_14_ws_4 = t_22;
      while (var_14_ws_4) {
        boolean t_27;
        boolean t_28;
        boolean t_29;
        boolean t_30;
        boolean t_31;
        boolean t_32;
        boolean t_33;
        boolean var_15_equalVal;

        t_28 = param_value_param_6  ==  null;

        if (t_28) {
          {
            {
              t_29 = var_12_current.roops_core_objects_SinglyLinkedListNode_value  ==  null;
              if (t_29) {
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

        if (t_27) {
          {
            {
              {
                {
                  {
                    var_15_equalVal = false;
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
                    boolean t_26;

                    t_26 = param_value_param_6  !=  null;
                    if (t_26) {
                      {
                        {
                          {
                            {
                              {
                                boolean t_25;

                                t_25 = param_value_param_6  ==  var_12_current.roops_core_objects_SinglyLinkedListNode_value;
                                if (t_25) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            var_15_equalVal = true;
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
                                            var_15_equalVal = false;
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
                                var_15_equalVal = false;
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
        t_30 = var_15_equalVal  ==  true;

        if (t_30) {
          {
            {
              {
                {
                  {
                    var_13_result = true;
                  }
                }
              }
            }
          }
        }
        var_12_current = this.roops_core_objects_SinglyLinkedList_header.roops_core_objects_SinglyLinkedListNode_next.roops_core_objects_SinglyLinkedListNode_next;
        t_32 = var_13_result  ==  false;

        if (t_32) {
          {
            {
              t_33 = var_12_current  !=  null;
              if (t_33) {
                {
                  t_31 = true;
                }
              } else {
                {
                  t_31 = false;
                }
              }
            }
          }
        } else {
          {
            t_31 = false;
          }
        }
        var_14_ws_4 = t_31;
      }

      return var_13_result;
    }
  }


  /*@ 
    @ requires index  >=  0 && index  <  \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size();
    @ ensures \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(\result)))  ==  true;
    @ ensures \reach(\result, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size()  ==  \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size() - index;
    @ signals (java.lang.RuntimeException e) false;
    @*/
  public roops.core.objects.SinglyLinkedListNode getNode(int index) {
    int param_index_10;

    param_index_10 = index;
    {
      boolean t_34;
      boolean t_35;
      boolean t_36;
      roops.core.objects.SinglyLinkedListNode var_16_current = this.roops_core_objects_SinglyLinkedList_header;
      roops.core.objects.SinglyLinkedListNode var_17_result = ((roops.core.objects.SinglyLinkedListNode)(null));
      int var_18_current_index = 0;
      boolean var_19_ws_5;

      t_35 = var_17_result  ==  null;

      if (t_35) {
        {
          {
            t_36 = var_16_current  !=  null;
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
        boolean t_37;
        boolean t_38;
        boolean t_39;
        boolean t_40;

        t_37 = param_index_10  ==  var_18_current_index;

        if (t_37) {
          {
            {
              {
                {
                  {
                    var_17_result = var_16_current;
                  }
                }
              }
            }
          }
        }
        var_18_current_index = var_18_current_index + 1;
        var_16_current = var_16_current.roops_core_objects_SinglyLinkedListNode_next;
        t_39 = var_17_result  ==  null;

        if (t_39) {
          {
            {
              t_40 = var_16_current  !=  null;
              if (t_40) {
                {
                  t_38 = true;
                }
              } else {
                {
                  t_38 = false;
                }
              }
            }
          }
        } else {
          {
            t_38 = false;
          }
        }
        var_19_ws_5 = t_38;
      }

      return var_17_result;
    }
  }


  public void insertBack(java.lang.Object arg) {
    java.lang.Object param_arg_11;

    param_arg_11 = arg;
    {
      roops.core.objects.SinglyLinkedListNode t_41;
      boolean t_42;

      t_41 = new roops.core.objects.SinglyLinkedListNode();
      roops.core.objects.SinglyLinkedListNode var_20_freshNode = t_41;

      var_20_freshNode.roops_core_objects_SinglyLinkedListNode_value = param_arg_11;
      var_20_freshNode.roops_core_objects_SinglyLinkedListNode_next = ((roops.core.objects.SinglyLinkedListNode)(null));
      t_42 = this.roops_core_objects_SinglyLinkedList_header  ==  null;
      if (t_42) {
        {
          {
            {
              {
                {
                  this.roops_core_objects_SinglyLinkedList_header = var_20_freshNode;
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
                  roops.core.objects.SinglyLinkedListNode var_21_current;

                  var_21_current = this.roops_core_objects_SinglyLinkedList_header;
                  boolean var_22_ws_6;

                  var_22_ws_6 = var_21_current.roops_core_objects_SinglyLinkedListNode_next  !=  null;
                  while (var_22_ws_6) {
                    var_21_current = var_21_current.roops_core_objects_SinglyLinkedListNode_next;
                    var_22_ws_6 = var_21_current.roops_core_objects_SinglyLinkedListNode_next  !=  null;
                  }
                  var_21_current.roops_core_objects_SinglyLinkedListNode_next = var_20_freshNode;
                }
              }
            }
          }
        }
      }
    }
  }

}
