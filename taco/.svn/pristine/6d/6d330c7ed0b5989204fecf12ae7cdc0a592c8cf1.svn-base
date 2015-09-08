package roops.core.objects;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class SinglyLinkedList extends java.lang.Object {

  public roops.core.objects.SinglyLinkedListNode roops_core_objects_SinglyLinkedList_header;
  /*@ invariant (\forall roops.core.objects.SinglyLinkedListNode n; \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); \reach(n.roops_core_objects_SinglyLinkedListNode_next, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n)))  ==  false);
    @*/

  public SinglyLinkedList() {
    this.roops_core_objects_SinglyLinkedList_header = ((roops.core.objects.SinglyLinkedListNode)(null));
    {
    }
  }


  /*@ 
    @ requires \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size()  ==  100;
    @ ensures \result  ==  false;
    @*/
  public boolean showInstance() {
    return true;
  }


  /*@ 
    @ ensures (\exists roops.core.objects.SinglyLinkedListNode n; \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); n.roops_core_objects_SinglyLinkedListNode_value  ==  value_param) <==> (\result  ==  true);
    @ signals (java.lang.RuntimeException e) false;
    @*/
  public boolean contains(/*@ nullable @*/ java.lang.Object value_param) {
    boolean t_85;
    boolean t_86;
    boolean t_87;
    roops.core.objects.SinglyLinkedListNode var_41_current;
    boolean var_42_result;

    var_41_current = this.roops_core_objects_SinglyLinkedList_header.roops_core_objects_SinglyLinkedListNode_next;
    var_42_result = false;
    boolean var_43_ws_13;

    t_86 = var_42_result  ==  false;
    t_87 = var_41_current  !=  null;

    if (t_86) {
      {
        if (t_87) {
          {
            t_85 = true;
          }
        } else {
          {
            t_85 = false;
          }
        }
      }
    } else {
      {
        t_85 = false;
      }
    }
    var_43_ws_13 = t_85;
    while (var_43_ws_13) {
      boolean t_90;
      boolean t_91;
      boolean t_92;
      boolean t_93;
      boolean t_94;
      boolean t_95;
      boolean t_96;
      boolean var_44_equalVal;

      t_91 = value_param  ==  null;
      t_92 = var_41_current.roops_core_objects_SinglyLinkedListNode_value  ==  null;

      if (t_91) {
        {
          if (t_92) {
            {
              t_90 = true;
            }
          } else {
            {
              t_90 = false;
            }
          }
        }
      } else {
        {
          t_90 = false;
        }
      }

      if (t_90) {
        {
          {
            {
              {
                {
                  var_44_equalVal = false;
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
                  boolean t_89;

                  t_89 = value_param  !=  null;
                  if (t_89) {
                    {
                      {
                        {
                          {
                            {
                              boolean t_88;

                              t_88 = value_param  ==  var_41_current.roops_core_objects_SinglyLinkedListNode_value;
                              if (t_88) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          var_44_equalVal = true;
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
                                          var_44_equalVal = false;
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
                              var_44_equalVal = false;
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
      t_93 = var_44_equalVal  ==  true;

      if (t_93) {
        {
          {
            {
              {
                {
                  var_42_result = true;
                }
              }
            }
          }
        }
      }
      var_41_current = var_41_current.roops_core_objects_SinglyLinkedListNode_next.roops_core_objects_SinglyLinkedListNode_next;
      t_95 = var_42_result  ==  false;
      t_96 = var_41_current  !=  null;

      if (t_95) {
        {
          if (t_96) {
            {
              t_94 = true;
            }
          } else {
            {
              t_94 = false;
            }
          }
        }
      } else {
        {
          t_94 = false;
        }
      }
      var_43_ws_13 = t_94;
    }

    return var_42_result;
  }


  /*@ 
    @ requires index  >=  0 && index  <  \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size();
    @ ensures \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(\result)))  ==  true;
    @ ensures \reach(\result, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size()  ==  \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size() - index;
    @ signals (java.lang.Exception e) false;
    @*/
  public roops.core.objects.SinglyLinkedListNode getNode(int index) {
    boolean t_97;
    boolean t_98;
    boolean t_99;
    roops.core.objects.SinglyLinkedListNode var_45_current = this.roops_core_objects_SinglyLinkedList_header;
    roops.core.objects.SinglyLinkedListNode var_46_result = ((roops.core.objects.SinglyLinkedListNode)(null));
    int var_47_current_index = 0;
    boolean var_48_ws_14;

    t_98 = var_46_result  ==  null;
    t_99 = var_45_current  !=  null;

    if (t_98) {
      {
        if (t_99) {
          {
            t_97 = true;
          }
        } else {
          {
            t_97 = false;
          }
        }
      }
    } else {
      {
        t_97 = false;
      }
    }
    var_48_ws_14 = t_97;
    while (var_48_ws_14) {
      boolean t_100;
      boolean t_101;
      boolean t_102;
      boolean t_103;

      t_100 = index  ==  var_47_current_index;

      if (t_100) {
        {
          {
            {
              {
                {
                  var_46_result = var_45_current;
                }
              }
            }
          }
        }
      }
      var_47_current_index = var_47_current_index + 1;
      var_45_current = var_45_current.roops_core_objects_SinglyLinkedListNode_next;
      t_102 = var_46_result  ==  null;
      t_103 = var_45_current  !=  null;

      if (t_102) {
        {
          if (t_103) {
            {
              t_101 = true;
            }
          } else {
            {
              t_101 = false;
            }
          }
        }
      } else {
        {
          t_101 = false;
        }
      }
      var_48_ws_14 = t_101;
    }

    return var_46_result;
  }


  /*@ 
    @ requires freshNode  !=  null;
    @ requires \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(freshNode)))  ==  false;
    @ ensures \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size()  ==  \old(\reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next)).int_size() + 1;
    @ ensures (\forall roops.core.objects.SinglyLinkedListNode n; \old(\reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next)).has(((java.lang.Object)(n))); \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n)))  ==  true);
    @ ensures (\exists roops.core.objects.SinglyLinkedListNode n; \reach(this.roops_core_objects_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); n.roops_core_objects_SinglyLinkedListNode_next  ==  null && n.roops_core_objects_SinglyLinkedListNode_value  ==  data);
    @ signals (java.lang.Exception e) false;
    @*/
  void insertBack(java.lang.Object data, roops.core.objects.SinglyLinkedListNode freshNode) {
    boolean t_104;

    freshNode.roops_core_objects_SinglyLinkedListNode_value = data;
    freshNode.roops_core_objects_SinglyLinkedListNode_next = ((roops.core.objects.SinglyLinkedListNode)(null));
    t_104 = this.roops_core_objects_SinglyLinkedList_header  ==  null;
    if (t_104) {
      {
        {
          {
            {
              {
                this.roops_core_objects_SinglyLinkedList_header = freshNode;
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
                roops.core.objects.SinglyLinkedListNode var_49_current = this.roops_core_objects_SinglyLinkedList_header;
                boolean var_50_ws_15;

                var_50_ws_15 = var_49_current.roops_core_objects_SinglyLinkedListNode_next  !=  null;
                while (var_50_ws_15) {
                  var_49_current = var_49_current.roops_core_objects_SinglyLinkedListNode_next;
                  var_50_ws_15 = var_49_current.roops_core_objects_SinglyLinkedListNode_next  !=  null;
                }
                var_49_current.roops_core_objects_SinglyLinkedListNode_next = freshNode;
              }
            }
          }
        }
      }
    }
  }

}
