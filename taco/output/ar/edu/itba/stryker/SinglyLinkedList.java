package ar.edu.itba.stryker;

//@ model import org.jmlspecs.lang.*;


public class SinglyLinkedList extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objects.SinglyLinkedListNode ar_edu_itba_stryker_SinglyLinkedList_header;
  /*@ invariant (\forall roops.core.objects.SinglyLinkedListNode n; \reach(this.ar_edu_itba_stryker_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); \reach(n.roops_core_objects_SinglyLinkedListNode_next, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n)))  ==  false);
    @*/

  public SinglyLinkedList() {
    this.ar_edu_itba_stryker_SinglyLinkedList_header = ((roops.core.objects.SinglyLinkedListNode)(null));
    {
    }
  }


  /*@ 
    @ requires \reach(this.ar_edu_itba_stryker_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size()  ==  100;
    @ ensures \result  ==  false;
    @*/
  public boolean showInstance() {
    return true;
  }


  /*@ 
    @ ensures \result  ==  true;
    @ signals (java.lang.Exception e) false;
    @*/
  public boolean contains(/*@ nullable @*/ java.lang.Object value_param) {
    roops.core.objects.SinglyLinkedListNode var_1_current;

    var_1_current = this.ar_edu_itba_stryker_SinglyLinkedList_header;
    var_1_current.roops_core_objects_SinglyLinkedListNode_next = var_1_current.roops_core_objects_SinglyLinkedListNode_next.roops_core_objects_SinglyLinkedListNode_next;

    return true;
  }


  /*@ 
    @ requires index  >=  0 && index  <  \reach(this.ar_edu_itba_stryker_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size();
    @ ensures \reach(this.ar_edu_itba_stryker_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(\result)))  ==  true;
    @ ensures \reach(\result, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size()  ==  \reach(this.ar_edu_itba_stryker_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size() - index;
    @ signals (java.lang.Exception e) false;
    @*/
  public roops.core.objects.SinglyLinkedListNode getNode(int index) {
    boolean t_1;
    boolean t_2;
    boolean t_3;
    roops.core.objects.SinglyLinkedListNode var_2_current = this.ar_edu_itba_stryker_SinglyLinkedList_header;
    roops.core.objects.SinglyLinkedListNode var_3_result = ((roops.core.objects.SinglyLinkedListNode)(null));
    int var_4_current_index = 0;
    boolean var_5_ws_1;

    t_2 = var_3_result  ==  null;
    t_3 = var_2_current  !=  null;

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
    var_5_ws_1 = t_1;
    while (var_5_ws_1) {
      boolean t_4;
      boolean t_5;
      boolean t_6;
      boolean t_7;

      t_4 = index  ==  var_4_current_index;

      if (t_4) {
        {
          {
            {
              {
                {
                  var_3_result = var_2_current;
                }
              }
            }
          }
        }
      }
      var_4_current_index = var_4_current_index + 1;
      var_2_current = var_2_current.roops_core_objects_SinglyLinkedListNode_next;
      t_6 = var_3_result  ==  null;
      t_7 = var_2_current  !=  null;

      if (t_6) {
        {
          if (t_7) {
            {
              t_5 = true;
            }
          } else {
            {
              t_5 = false;
            }
          }
        }
      } else {
        {
          t_5 = false;
        }
      }
      var_5_ws_1 = t_5;
    }

    return var_3_result;
  }


  /*@ 
    @ requires freshNode  !=  null;
    @ requires \reach(this.ar_edu_itba_stryker_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(freshNode)))  ==  false;
    @ ensures \reach(this.ar_edu_itba_stryker_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size()  ==  \old(\reach(this.ar_edu_itba_stryker_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next)).int_size() + 1;
    @ ensures (\forall roops.core.objects.SinglyLinkedListNode n; \old(\reach(this.ar_edu_itba_stryker_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next)).has(((java.lang.Object)(n))); \reach(this.ar_edu_itba_stryker_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n)))  ==  true);
    @ ensures (\exists roops.core.objects.SinglyLinkedListNode n; \reach(this.ar_edu_itba_stryker_SinglyLinkedList_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); n.roops_core_objects_SinglyLinkedListNode_next  ==  null && n.roops_core_objects_SinglyLinkedListNode_value  ==  data);
    @ signals (java.lang.Exception e) false;
    @*/
  void insertBack(java.lang.Object data, roops.core.objects.SinglyLinkedListNode freshNode) {
    boolean t_8;

    freshNode.roops_core_objects_SinglyLinkedListNode_value = data;
    freshNode.roops_core_objects_SinglyLinkedListNode_next = ((roops.core.objects.SinglyLinkedListNode)(null));
    t_8 = this.ar_edu_itba_stryker_SinglyLinkedList_header  ==  null;
    if (t_8) {
      {
        {
          {
            {
              {
                this.ar_edu_itba_stryker_SinglyLinkedList_header = freshNode;
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
                roops.core.objects.SinglyLinkedListNode var_6_current = this.ar_edu_itba_stryker_SinglyLinkedList_header;
                boolean var_7_ws_2;

                var_7_ws_2 = var_6_current.roops_core_objects_SinglyLinkedListNode_next  !=  null;
                while (var_7_ws_2) {
                  var_6_current = var_6_current.roops_core_objects_SinglyLinkedListNode_next;
                  var_7_ws_2 = var_6_current.roops_core_objects_SinglyLinkedListNode_next  !=  null;
                }
                var_6_current.roops_core_objects_SinglyLinkedListNode_next = freshNode;
              }
            }
          }
        }
      }
    }
  }


  public static void main(java.lang.String[] args) {
    ar.edu.itba.stryker.SinglyLinkedList t_9;
    roops.core.objects.SinglyLinkedListNode t_10;
    boolean t_11;

    t_9 = new ar.edu.itba.stryker.SinglyLinkedList();
    ar.edu.itba.stryker.SinglyLinkedList var_8_list = t_9;

    t_10 = new roops.core.objects.SinglyLinkedListNode();
    var_8_list.ar_edu_itba_stryker_SinglyLinkedList_header = t_10;
    t_11 = var_8_list.contains(null);
  }

}
