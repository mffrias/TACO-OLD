package SourcesCristianPereyra;

//@ model import org.jmlspecs.lang.*;
//@ model import org.jmlspecs.models.*;


public class SinglyLinkedList extends java.lang.Object {

  public /*@ nullable @*/ SourcesCristianPereyra.Node SourcesCristianPereyra_SinglyLinkedList_head;
  public int SourcesCristianPereyra_SinglyLinkedList_listCount;
  /*@ invariant (\forall SourcesCristianPereyra.Node n; \reach(this.SourcesCristianPereyra_SinglyLinkedList_head, SourcesCristianPereyra.Node, SourcesCristianPereyra_Node_next).has(((java.lang.Object)(n))); \reach(n.SourcesCristianPereyra_Node_next, SourcesCristianPereyra.Node, SourcesCristianPereyra_Node_next).has(((java.lang.Object)(n)))  ==  false);
    @*/
  /*@ invariant this.SourcesCristianPereyra_SinglyLinkedList_listCount  ==  \reach(this.SourcesCristianPereyra_SinglyLinkedList_head, SourcesCristianPereyra.Node, SourcesCristianPereyra_Node_next).int_size() - 1;
    @*/

  public SinglyLinkedList() {
    this.SourcesCristianPereyra_SinglyLinkedList_head = ((SourcesCristianPereyra.Node)(null));
    this.SourcesCristianPereyra_SinglyLinkedList_listCount = (byte)0;
    {
      SourcesCristianPereyra.Node t_37;

      t_37 = new SourcesCristianPereyra.Node(null);
      this.SourcesCristianPereyra_SinglyLinkedList_head = t_37;
      this.SourcesCristianPereyra_SinglyLinkedList_listCount = 0;
    }
  }


  public void add(java.lang.Object data) {
    java.lang.Object param_data_7;

    param_data_7 = data;
    {
      SourcesCristianPereyra.Node t_38;
      SourcesCristianPereyra.Node t_39;
      int t_42;

      t_38 = new SourcesCristianPereyra.Node(param_data_7);
      SourcesCristianPereyra.Node var_14_crunchifyTemp = t_38;
      SourcesCristianPereyra.Node var_15_crunchifyCurrent = this.SourcesCristianPereyra_SinglyLinkedList_head;
      boolean var_16_ws_5;

      t_39 = var_15_crunchifyCurrent.getNext();
      var_16_ws_5 = t_39  !=  null;
      while (var_16_ws_5) {
        SourcesCristianPereyra.Node t_40;
        SourcesCristianPereyra.Node t_41;

        t_40 = var_15_crunchifyCurrent.getNext();
        var_15_crunchifyCurrent = t_40;
        t_41 = var_15_crunchifyCurrent.getNext();
        var_16_ws_5 = t_41  !=  null;
      }
      var_15_crunchifyCurrent.setNext(var_14_crunchifyTemp);
      t_42 = this.SourcesCristianPereyra_SinglyLinkedList_listCount;
      this.SourcesCristianPereyra_SinglyLinkedList_listCount = this.SourcesCristianPereyra_SinglyLinkedList_listCount + (byte)1;
    }
  }


  public void add(java.lang.Object data, int index) {
    java.lang.Object param_data_8;

    param_data_8 = data;
    int param_index_9;

    param_index_9 = index;
    {
      SourcesCristianPereyra.Node t_43;
      SourcesCristianPereyra.Node t_54;
      int t_55;

      t_43 = new SourcesCristianPereyra.Node(param_data_8);
      SourcesCristianPereyra.Node var_17_crunchifyTemp = t_43;
      SourcesCristianPereyra.Node var_18_crunchifyCurrent = this.SourcesCristianPereyra_SinglyLinkedList_head;

      {
        boolean t_44;
        boolean t_45;
        SourcesCristianPereyra.Node t_46;
        boolean t_47;
        int var_19_i = 1;
        boolean var_20_ws_6;

        t_45 = var_19_i  <  param_index_9;
        t_46 = var_18_crunchifyCurrent.getNext();

        if (t_45) {
          {
            {
              t_47 = t_46  !=  null;
              if (t_47) {
                {
                  t_44 = true;
                }
              } else {
                {
                  t_44 = false;
                }
              }
            }
          }
        } else {
          {
            t_44 = false;
          }
        }
        var_20_ws_6 = t_44;
        while (var_20_ws_6) {
          SourcesCristianPereyra.Node t_48;
          int t_49;
          boolean t_50;
          boolean t_51;
          SourcesCristianPereyra.Node t_52;
          boolean t_53;

          t_48 = var_18_crunchifyCurrent.getNext();
          var_18_crunchifyCurrent = t_48;
          t_49 = var_19_i;
          var_19_i = var_19_i + (byte)1;
          t_51 = var_19_i  <  param_index_9;
          t_52 = var_18_crunchifyCurrent.getNext();

          if (t_51) {
            {
              {
                t_53 = t_52  !=  null;
                if (t_53) {
                  {
                    t_50 = true;
                  }
                } else {
                  {
                    t_50 = false;
                  }
                }
              }
            }
          } else {
            {
              t_50 = false;
            }
          }
          var_20_ws_6 = t_50;
        }
      }
      t_54 = var_18_crunchifyCurrent.getNext();
      var_17_crunchifyTemp.setNext(t_54);
      var_18_crunchifyCurrent.setNext(var_17_crunchifyTemp);
      t_55 = this.SourcesCristianPereyra_SinglyLinkedList_listCount;
      this.SourcesCristianPereyra_SinglyLinkedList_listCount = this.SourcesCristianPereyra_SinglyLinkedList_listCount + (byte)1;
    }
  }


  public java.lang.Object get(int index) {
    int param_index_10;

    param_index_10 = index;
    {
      boolean t_56;
      SourcesCristianPereyra.Node t_57;
      java.lang.Object t_62;

      t_56 = param_index_10  <=  0;

      if (t_56) {
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
      t_57 = this.SourcesCristianPereyra_SinglyLinkedList_head.getNext();
      SourcesCristianPereyra.Node var_21_crunchifyCurrent = t_57;

      {
        int var_22_i = 1;
        boolean var_23_ws_7;

        var_23_ws_7 = var_22_i  <  param_index_10;
        while (var_23_ws_7) {
          SourcesCristianPereyra.Node t_58;
          boolean t_59;
          SourcesCristianPereyra.Node t_60;
          int t_61;

          t_58 = var_21_crunchifyCurrent.getNext();
          t_59 = t_58  ==  null;

          if (t_59) {
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
          t_60 = var_21_crunchifyCurrent.getNext();
          var_21_crunchifyCurrent = t_60;
          t_61 = var_22_i;
          var_22_i = var_22_i + (byte)1;
          var_23_ws_7 = var_22_i  <  param_index_10;
        }
      }
      t_62 = var_21_crunchifyCurrent.getData();

      return t_62;
    }
  }


  /*@ 
    @ requires 1  <=  index && index  <=  this.SourcesCristianPereyra_SinglyLinkedList_listCount;
    @ ensures this.SourcesCristianPereyra_SinglyLinkedList_listCount  ==  \old(this.SourcesCristianPereyra_SinglyLinkedList_listCount) - 1;
    @*/
  public boolean remove(int index) {
    int param_index_11;

    param_index_11 = index;
    {
      boolean t_63;
      boolean t_64;
      int t_65;
      boolean t_66;
      SourcesCristianPereyra.Node t_71;
      SourcesCristianPereyra.Node t_72;

      t_64 = param_index_11  <  1;
      t_65 = this.size();

      if (t_64) {
        {
          t_63 = true;
        }
      } else {
        {
          {
            t_66 = param_index_11  >  t_65;
            if (t_66) {
              {
                t_63 = true;
              }
            } else {
              {
                t_63 = false;
              }
            }
          }
        }
      }

      if (t_63) {
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
      SourcesCristianPereyra.Node var_24_crunchifyCurrent = this.SourcesCristianPereyra_SinglyLinkedList_head;

      {
        int var_25_i = 1;
        boolean var_26_ws_8;

        var_26_ws_8 = var_25_i  <  param_index_11;
        while (var_26_ws_8) {
          SourcesCristianPereyra.Node t_67;
          boolean t_68;
          SourcesCristianPereyra.Node t_69;
          int t_70;

          t_67 = var_24_crunchifyCurrent.getNext();
          t_68 = t_67  ==  null;

          if (t_68) {
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
          t_69 = var_24_crunchifyCurrent.getNext();
          var_24_crunchifyCurrent = t_69;
          t_70 = var_25_i;
          var_25_i = var_25_i + (byte)1;
          var_26_ws_8 = var_25_i  <  param_index_11;
        }
      }
      t_71 = var_24_crunchifyCurrent.getNext();
      t_72 = t_71.getNext();
      var_24_crunchifyCurrent.setNext(t_72);
      this.SourcesCristianPereyra_SinglyLinkedList_listCount = this.SourcesCristianPereyra_SinglyLinkedList_listCount - 1;

      return true;
    }
  }


  public int size() {
    {
      return this.SourcesCristianPereyra_SinglyLinkedList_listCount;
    }
  }

}
