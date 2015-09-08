package ar.edu.itba.alu.crpereyr.impl.linkedlist1;

//@ model import org.jmlspecs.lang.*;
//@ model import org.jmlspecs.models.*;


public class SinglyLinkedList extends java.lang.Object {

  public /*@ nullable @*/ ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_head;
  public int ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount;
  /*@ invariant this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount  ==  \reach(this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_head, ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node, ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next).int_size() - 1;
    @*/
  /*@ invariant (\forall ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node n; \reach(this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_head, ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node, ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next).has(((java.lang.Object)(n))); ! \reach(n.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next, ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node, ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next).has(((java.lang.Object)(n))));
    @*/

  public SinglyLinkedList() {
    this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_head = ((ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node)(null));
    this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount = (byte)0;
    {
      ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node t_24;

      t_24 = new ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node(null);
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_head = t_24;
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount = 0;
    }
  }


  /*@ 
    @ requires data  !=  null;
    @ ensures this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount  ==  \old(this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount) + 1;
    @ ensures (\exists ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node n; \reach(this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_head, ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node, ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next).has(((java.lang.Object)(n))); n.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_data  ==  data && n.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next  ==  null);
    @*/
  public int add(java.lang.Object data) {
    java.lang.Object param_data_5;

    param_data_5 = data;
    {
      ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node t_25;
      ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node t_26;
      int t_29;

      t_25 = new ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node(param_data_5);
      ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node var_10_crunchifyTemp = t_25;
      ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node var_11_crunchifyCurrent = this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_head;
      boolean var_12_ws_4;

      t_26 = var_11_crunchifyCurrent.getNext();
      var_12_ws_4 = t_26  !=  null;
      while (var_12_ws_4) {
        ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node t_27;
        ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node t_28;

        t_27 = var_11_crunchifyCurrent.getNext();
        var_11_crunchifyCurrent = t_27;
        t_28 = var_11_crunchifyCurrent.getNext();
        var_12_ws_4 = t_28  !=  null;
      }
      var_11_crunchifyCurrent.setNext(var_10_crunchifyTemp);
      t_29 = this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount;
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount = this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount + (byte)1;

      return this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount;
    }
  }


  /*@ 
    @ requires index  >=  1 && index  <  \reach(this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_head, ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node, ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next).int_size();
    @ ensures \result  ==  null || (\exists ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node n; \reach(this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_head, ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node, ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_next).has(((java.lang.Object)(n))); n.ar_edu_itba_alu_crpereyr_impl_linkedlist1_Node_data  ==  \result);
    @*/
  public /*@ nullable @*/ java.lang.Object get(int index) {
    int param_index_6;

    param_index_6 = index;
    {
      boolean t_30;
      ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node t_31;
      java.lang.Object t_36;

      t_30 = param_index_6  <=  0;

      if (t_30) {
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
      t_31 = this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_head.getNext();
      ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node var_13_crunchifyCurrent = t_31;

      {
        int var_14_i = 1;
        boolean var_15_ws_5;

        var_15_ws_5 = var_14_i  <  param_index_6;
        while (var_15_ws_5) {
          ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node t_32;
          boolean t_33;
          ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node t_34;
          int t_35;

          t_32 = var_13_crunchifyCurrent.getNext();
          t_33 = t_32  ==  null;

          if (t_33) {
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
          t_34 = var_13_crunchifyCurrent.getNext();
          var_13_crunchifyCurrent = t_34;
          t_35 = var_14_i;
          var_14_i = var_14_i + (byte)1;
          var_15_ws_5 = var_14_i  <  param_index_6;
        }
      }
      t_36 = var_13_crunchifyCurrent.getData();

      return t_36;
    }
  }


  /*@ 
    @ ensures (\result  ==  true <==> (index  >=  1 && index  <=  this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount));
    @*/
  public boolean remove(int index) {
    int param_index_7;

    param_index_7 = index;
    {
      boolean t_37;
      boolean t_38;
      boolean t_39;
      ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node t_44;
      ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node t_45;
      int t_46;

      t_38 = param_index_7  <  1;

      if (t_38) {
        {
          t_37 = true;
        }
      } else {
        {
          {
            t_39 = param_index_7  >  this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount;
            if (t_39) {
              {
                t_37 = true;
              }
            } else {
              {
                t_37 = false;
              }
            }
          }
        }
      }

      if (t_37) {
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
      ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node var_16_crunchifyCurrent = this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_head;

      {
        int var_17_i = 1;
        boolean var_18_ws_6;

        var_18_ws_6 = var_17_i  <  param_index_7;
        while (var_18_ws_6) {
          ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node t_40;
          boolean t_41;
          ar.edu.itba.alu.crpereyr.impl.linkedlist1.Node t_42;
          int t_43;

          t_40 = var_16_crunchifyCurrent.getNext();
          t_41 = t_40  ==  null;

          if (t_41) {
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
          t_42 = var_16_crunchifyCurrent.getNext();
          var_16_crunchifyCurrent = t_42;
          t_43 = var_17_i;
          var_17_i = var_17_i + (byte)1;
          var_18_ws_6 = var_17_i  <  param_index_7;
        }
      }
      t_44 = var_16_crunchifyCurrent.getNext();
      t_45 = t_44.getNext();
      var_16_crunchifyCurrent.setNext(t_45);
      t_46 = this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount;
      this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount = this.ar_edu_itba_alu_crpereyr_impl_linkedlist1_SinglyLinkedList_listCount + (byte)-1;

      return true;
    }
  }

}
