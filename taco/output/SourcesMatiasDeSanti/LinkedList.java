package SourcesMatiasDeSanti;

//@ model import org.jmlspecs.lang.*;


public class LinkedList extends java.lang.Object {

  public /*@ nullable @*/ SourcesMatiasDeSanti.Node SourcesMatiasDeSanti_LinkedList_head;
  /*@ invariant (\forall SourcesMatiasDeSanti.Node n; \reach(this.SourcesMatiasDeSanti_LinkedList_head, SourcesMatiasDeSanti.Node, SourcesMatiasDeSanti_Node_next).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesMatiasDeSanti_Node_next, SourcesMatiasDeSanti.Node, SourcesMatiasDeSanti_Node_next).has(((java.lang.Object)(n)))  ==  false);
    @*/
  /*@ invariant (this.SourcesMatiasDeSanti_LinkedList_head  !=  null);
    @*/

  public LinkedList() {
    this.SourcesMatiasDeSanti_LinkedList_head = ((SourcesMatiasDeSanti.Node)(null));
    {
      SourcesMatiasDeSanti.Node t_1;

      t_1 = new SourcesMatiasDeSanti.Node(null);
      this.SourcesMatiasDeSanti_LinkedList_head = t_1;
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\exists SourcesMatiasDeSanti.Node n; n.SourcesMatiasDeSanti_Node_data  ==  d; \reach(this.SourcesMatiasDeSanti_LinkedList_head, SourcesMatiasDeSanti.Node, SourcesMatiasDeSanti_Node_next).has(((java.lang.Object)(n)))  ==  true && \reach(this.SourcesMatiasDeSanti_LinkedList_head, SourcesMatiasDeSanti.Node, SourcesMatiasDeSanti_Node_next).int_size()  ==  \old((\reach(this.SourcesMatiasDeSanti_LinkedList_head, SourcesMatiasDeSanti.Node, SourcesMatiasDeSanti_Node_next)).int_size() + 1));
    @ signals (java.lang.Exception e) false;
    @*/
  public void add(java.lang.Object d) {
    java.lang.Object param_d_0;

    param_d_0 = d;
    {
      SourcesMatiasDeSanti.Node t_2;
      SourcesMatiasDeSanti.Node t_3;

      t_2 = new SourcesMatiasDeSanti.Node(param_d_0);
      SourcesMatiasDeSanti.Node var_1_temp = t_2;
      SourcesMatiasDeSanti.Node var_2_current = this.SourcesMatiasDeSanti_LinkedList_head;
      boolean var_3_ws_1;

      t_3 = var_2_current.getNext();
      var_3_ws_1 = t_3  !=  null;
      while (var_3_ws_1) {
        SourcesMatiasDeSanti.Node t_4;
        SourcesMatiasDeSanti.Node t_5;

        t_4 = var_2_current.getNext();
        var_2_current = t_4;
        t_5 = var_2_current.getNext();
        var_3_ws_1 = t_5  !=  null;
      }
      var_2_current.setNext(var_1_temp);
    }
  }


  public java.lang.Object get(int index) {
    int param_index_1;

    param_index_1 = index;
    {
      boolean t_6;
      SourcesMatiasDeSanti.Node t_7;
      java.lang.Object t_12;

      t_6 = param_index_1  <=  0;

      if (t_6) {
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
      t_7 = this.SourcesMatiasDeSanti_LinkedList_head.getNext();
      SourcesMatiasDeSanti.Node var_4_current = t_7;

      {
        int var_5_i = 1;
        boolean var_6_ws_2;

        var_6_ws_2 = var_5_i  <  param_index_1;
        while (var_6_ws_2) {
          SourcesMatiasDeSanti.Node t_8;
          boolean t_9;
          SourcesMatiasDeSanti.Node t_10;
          int t_11;

          t_8 = var_4_current.getNext();
          t_9 = t_8  ==  null;

          if (t_9) {
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
          t_10 = var_4_current.getNext();
          var_4_current = t_10;
          t_11 = var_5_i;
          var_5_i = var_5_i + (byte)1;
          var_6_ws_2 = var_5_i  <  param_index_1;
        }
      }
      t_12 = var_4_current.getData();

      return t_12;
    }
  }


  public boolean remove(int index) {
    int param_index_2;

    param_index_2 = index;
    {
      boolean t_13;
      SourcesMatiasDeSanti.Node t_18;
      SourcesMatiasDeSanti.Node t_19;

      t_13 = param_index_2  <  1;

      if (t_13) {
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
      SourcesMatiasDeSanti.Node var_7_current = this.SourcesMatiasDeSanti_LinkedList_head;

      {
        int var_8_i = 1;
        boolean var_9_ws_3;

        var_9_ws_3 = var_8_i  <  param_index_2;
        while (var_9_ws_3) {
          SourcesMatiasDeSanti.Node t_14;
          boolean t_15;
          SourcesMatiasDeSanti.Node t_16;
          int t_17;

          t_14 = var_7_current.getNext();
          t_15 = t_14  ==  null;

          if (t_15) {
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
          t_16 = var_7_current.getNext();
          var_7_current = t_16;
          t_17 = var_8_i;
          var_8_i = var_8_i + (byte)1;
          var_9_ws_3 = var_8_i  <  param_index_2;
        }
      }
      t_18 = var_7_current.getNext();
      t_19 = t_18.getNext();
      var_7_current.setNext(t_19);

      return true;
    }
  }

}
