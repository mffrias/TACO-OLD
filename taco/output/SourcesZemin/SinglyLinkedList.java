package SourcesZemin;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class SinglyLinkedList extends java.lang.Object {

  public roops.core.objects.SinglyLinkedListNode SourcesZemin_SinglyLinkedList_header;
  /*@ invariant (\forall roops.core.objects.SinglyLinkedListNode n; \reach(this.SourcesZemin_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); \reach(n.roops_core_objects_SinglyLinkedListNode_next, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n)))  ==  false);
    @*/

  public SinglyLinkedList() {
    this.SourcesZemin_SinglyLinkedList_header = ((roops.core.objects.SinglyLinkedListNode)(null));
    {
    }
  }


  /*@ 
    @ requires \reach(this.SourcesZemin_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size()  ==  100;
    @ ensures \result  ==  false;
    @*/
  public boolean showInstance() {
    return true;
  }


  /*@ 
    @ ensures (\exists roops.core.objects.SinglyLinkedListNode n; \reach(this.SourcesZemin_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); n.roops_core_objects_SinglyLinkedListNode_value  ==  value_param) <==> (\result  ==  true);
    @ signals (java.lang.Exception e) false;
    @*/
  public boolean contains(/*@ nullable @*/ java.lang.Object value_param) {
    boolean t_1;
    boolean t_2;
    boolean t_3;
    roops.core.objects.SinglyLinkedListNode var_1_current;
    boolean var_2_result;

    var_1_current = this.SourcesZemin_SinglyLinkedList_header;
    var_2_result = false;
    boolean var_3_ws_1;

    t_2 = var_2_result  ==  false;
    t_3 = var_1_current  !=  null;

    if (t_2) {
      {
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
    } else {
      {
        t_1 = false;
      }
    }
    var_3_ws_1 = t_1;
    while (var_3_ws_1) {
      boolean t_7;
      boolean t_8;
      boolean t_9;
      boolean t_10;
      boolean t_11;
      boolean t_12;
      boolean t_13;
      boolean var_4_equalVal;

      t_8 = value_param  ==  null;
      t_9 = var_1_current.roops_core_objects_SinglyLinkedListNode_value  ==  null;

      if (t_8) {
        {
          if (t_9) {
            {
              t_7 = true;
            }
          } else {
            {
              t_7 = false;
            }
          }
        }
      } else {
        {
          t_7 = false;
        }
      }

      if (t_7) {
        {
          {
            {
              {
                {
                  boolean t_4;

                  t_4 = this.showInstance();
                  var_4_equalVal = t_4;
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

                  t_6 = value_param  !=  null;
                  if (t_6) {
                    {
                      {
                        {
                          {
                            {
                              boolean t_5;

                              t_5 = value_param  ==  var_1_current.roops_core_objects_SinglyLinkedListNode_value;
                              if (t_5) {
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
      t_10 = var_4_equalVal  ==  true;

      if (t_10) {
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
      var_1_current = this.SourcesZemin_SinglyLinkedList_header.roops_core_objects_SinglyLinkedListNode_next;
      t_12 = var_2_result  ==  false;
      t_13 = var_1_current  !=  null;

      if (t_12) {
        {
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
      } else {
        {
          t_11 = false;
        }
      }
      var_3_ws_1 = t_11;
    }

    return var_2_result;
  }


  /*@ 
    @ requires index  >=  0 && index  <  \reach(this.SourcesZemin_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size();
    @ ensures \reach(this.SourcesZemin_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(\result)))  ==  true;
    @ ensures \reach(\result, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size()  ==  \reach(this.SourcesZemin_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size() - index;
    @ signals (java.lang.Exception e) false;
    @*/
  public roops.core.objects.SinglyLinkedListNode getNode(int index) {
    boolean t_14;
    boolean t_15;
    boolean t_16;
    roops.core.objects.SinglyLinkedListNode var_5_current = this.SourcesZemin_SinglyLinkedList_header;
    roops.core.objects.SinglyLinkedListNode var_6_result = ((roops.core.objects.SinglyLinkedListNode)(null));
    int var_7_current_index = 0;
    boolean var_8_ws_2;

    t_15 = var_6_result  ==  null;
    t_16 = var_5_current  !=  null;

    if (t_15) {
      {
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
    } else {
      {
        t_14 = false;
      }
    }
    var_8_ws_2 = t_14;
    while (var_8_ws_2) {
      boolean t_17;
      boolean t_18;
      boolean t_19;
      boolean t_20;

      t_17 = index  ==  var_7_current_index;

      if (t_17) {
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
      var_5_current = var_5_current.roops_core_objects_SinglyLinkedListNode_next;
      t_19 = var_6_result  ==  null;
      t_20 = var_5_current  !=  null;

      if (t_19) {
        {
          if (t_20) {
            {
              t_18 = true;
            }
          } else {
            {
              t_18 = false;
            }
          }
        }
      } else {
        {
          t_18 = false;
        }
      }
      var_8_ws_2 = t_18;
    }

    return var_6_result;
  }


  /*@ 
    @ requires freshNode  !=  null;
    @ requires \reach(this.SourcesZemin_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(freshNode)))  ==  false;
    @ ensures \reach(this.SourcesZemin_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size()  ==  \old(\reach(this.SourcesZemin_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next)).int_size() + 1;
    @ ensures (\forall roops.core.objects.SinglyLinkedListNode n; \old(\reach(this.SourcesZemin_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next)).has(((java.lang.Object)(n))); \reach(this.SourcesZemin_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n)))  ==  true);
    @ ensures (\exists roops.core.objects.SinglyLinkedListNode n; \reach(this.SourcesZemin_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); n.roops_core_objects_SinglyLinkedListNode_next  ==  null && n.roops_core_objects_SinglyLinkedListNode_value  ==  data);
    @ signals (java.lang.Exception e) false;
    @*/
  void insertBack(java.lang.Object data, roops.core.objects.SinglyLinkedListNode freshNode) {
    boolean t_21;

    freshNode.roops_core_objects_SinglyLinkedListNode_value = data;
    freshNode.roops_core_objects_SinglyLinkedListNode_next = ((roops.core.objects.SinglyLinkedListNode)(null));
    t_21 = this.SourcesZemin_SinglyLinkedList_header  ==  null;
    if (t_21) {
      {
        {
          {
            {
              {
                this.SourcesZemin_SinglyLinkedList_header = freshNode;
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
                roops.core.objects.SinglyLinkedListNode var_9_current = this.SourcesZemin_SinglyLinkedList_header;
                boolean var_10_ws_3;

                var_10_ws_3 = var_9_current.roops_core_objects_SinglyLinkedListNode_next  !=  null;
                while (var_10_ws_3) {
                  var_9_current = var_9_current.roops_core_objects_SinglyLinkedListNode_next;
                  var_10_ws_3 = var_9_current.roops_core_objects_SinglyLinkedListNode_next  !=  null;
                }
                var_9_current.roops_core_objects_SinglyLinkedListNode_next = freshNode;
              }
            }
          }
        }
      }
    }
  }

}
