package ar.edu.itba.alu.crpereyr.impl.linkedlist2;

//@ model import org.jmlspecs.lang.*;
//@ model import org.jmlspecs.models.*;


public class SinglyLinkedList extends java.lang.Object {

  public ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head;
  public int ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements;
  /*@ invariant this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements  ==  \reach(this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head, ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node, ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next).int_size();
    @*/
  /*@ invariant (\forall ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node n; \reach(this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head, ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node, ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next).has(((java.lang.Object)(n))); ! \reach(n.ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next, ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node, ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next).has(((java.lang.Object)(n))));
    @*/

  public SinglyLinkedList() {
    this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements = (byte)0;
    {
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head = ((ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node)(null));
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements = 0;
    }
  }


  public int size() {
    {
      return this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements;
    }
  }


  private void addFirst(java.lang.Object value) {
    java.lang.Object param_value_1;

    param_value_1 = value;
    {
      ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node t_14;
      int t_15;

      t_14 = new ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node(param_value_1, this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head);
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head = t_14;
      t_15 = this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements;
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements = this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements + (byte)1;
    }
  }


  private java.lang.Object getFirst() {
    {
      boolean t_16;

      t_16 = this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head  ==  null;
      if (t_16) {
        {
          {
            {
              {
                {
                  return null;
                }
              }
            }
          }
        }
      }

      return this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head.ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_data;
    }
  }


  private java.lang.Object removeFirst() {
    {
      java.lang.Object t_17;
      int t_18;

      t_17 = this.getFirst();
      java.lang.Object var_5_oldData = t_17;

      this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head = this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head.ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next;
      t_18 = this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements;
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements = this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements + (byte)-1;

      return var_5_oldData;
    }
  }


  /*@ 
    @ requires obj  !=  null;
    @ ensures this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements  ==  \old(this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements) + 1;
    @ ensures (\exists ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node n; \reach(this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head, ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node, ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next).has(((java.lang.Object)(n))); n.ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_data  ==  obj && n.ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next  ==  null);
    @*/
  public boolean add(java.lang.Object obj) {
    java.lang.Object param_obj_2;

    param_obj_2 = obj;
    {
      boolean t_19;
      ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node t_20;
      int t_21;
      java.lang.Object var_6_element = param_obj_2;

      t_19 = this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head  ==  null;

      if (t_19) {
        {
          {
            {
              {
                {
                  this.addFirst(var_6_element);

                  return true;
                }
              }
            }
          }
        }
      }
      ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node var_7_last = this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head;
      boolean var_8_ws_2;

      var_8_ws_2 = var_7_last.ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next  !=  null;
      while (var_8_ws_2) {
        var_7_last = var_7_last.ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next;
        var_8_ws_2 = var_7_last.ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next  !=  null;
      }
      t_20 = new ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node(var_6_element, ((ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node)(null)));
      var_7_last.ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next = t_20;
      t_21 = this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements;
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements = this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements + (byte)1;

      return true;
    }
  }


  /*@ 
    @ requires index  >=  0 && this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements  ==  \reach(this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head, ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node, ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next).int_size();
    @ ensures (\result  ==  true <==> (index  <  this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements && index  >=  0));
    @ ensures (\result  ==  false <==> (this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements  ==  0 || index  >=  this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements || index  <  0));
    @ ensures (\result  ==  true) ==> (\exists ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node n; \reach(\old(this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head), ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node, ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next).has(((java.lang.Object)(n))); ! \reach(this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head, ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node, ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next).has(((java.lang.Object)(n))));
    @*/
  public boolean remove(int index) {
    int param_index_3;

    param_index_3 = index;
    {
      boolean t_22;
      boolean t_23;
      boolean t_24;
      boolean t_26;
      int t_30;

      t_23 = param_index_3  <  0;

      if (t_23) {
        {
          t_22 = true;
        }
      } else {
        {
          {
            t_24 = param_index_3  >=  this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements;
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
      }

      if (t_22) {
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
      t_26 = param_index_3  ==  0;

      if (t_26) {
        {
          {
            {
              {
                {
                  java.lang.Object t_25;

                  t_25 = this.removeFirst();

                  return true;
                }
              }
            }
          }
        }
      }
      ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node var_9_nodeBefore = this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_head;

      {
        int t_27;
        int var_10_i = 0;
        boolean var_11_ws_3;

        t_27 = param_index_3 - 1;
        var_11_ws_3 = var_10_i  <  t_27;
        while (var_11_ws_3) {
          int t_28;
          int t_29;

          var_9_nodeBefore = var_9_nodeBefore.ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next;
          t_28 = var_10_i;
          var_10_i = var_10_i + (byte)1;
          t_29 = param_index_3 - 1;
          var_11_ws_3 = var_10_i  <  t_29;
        }
      }
      ar.edu.itba.alu.crpereyr.impl.linkedlist2.Node var_12_nodeToRemove = var_9_nodeBefore.ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next;

      var_9_nodeBefore.ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next = var_12_nodeToRemove.ar_edu_itba_alu_crpereyr_impl_linkedlist2_Node_next;
      t_30 = this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements;
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements = this.ar_edu_itba_alu_crpereyr_impl_linkedlist2_SinglyLinkedList_numElements + (byte)-1;

      return true;
    }
  }

}
