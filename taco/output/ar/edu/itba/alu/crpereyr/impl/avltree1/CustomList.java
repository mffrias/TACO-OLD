package ar.edu.itba.alu.crpereyr.impl.avltree1;

//@ model import org.jmlspecs.lang.*;

/** Created by cris on 7/20/14.
*/
public class CustomList extends java.lang.Object {

  java.lang.Object[] ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_store;
  int ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size;
  int ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_maxSize;

  public CustomList() {
    this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size = (byte)0;
    this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_maxSize = 64;
    {
      java.lang.Object[] t_69;

      t_69 = new java.lang.Object[this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_maxSize];
      this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_store = t_69;
      this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size = 0;
    }
  }


  public void addFirst(java.lang.Object e) {
    java.lang.Object param_e_10;

    param_e_10 = e;
    {
      int t_70;

      this.shiftAllValuesRight();
      this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_store[0] = param_e_10;
      t_70 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size;
      this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size + (byte)1;
    }
  }


  public void addLast(java.lang.Object e) {
    java.lang.Object param_e_11;

    param_e_11 = e;
    {
      int t_71;
      int t_72;

      t_71 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size - 1;
      this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_store[t_71] = param_e_11;
      t_72 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size;
      this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size + (byte)1;
    }
  }


  public boolean offerFirst(java.lang.Object e) {
    java.lang.Object param_e_12;

    param_e_12 = e;
    {
      this.addFirst(param_e_12);

      return true;
    }
  }


  public boolean offerLast(java.lang.Object e) {
    java.lang.Object param_e_13;

    param_e_13 = e;
    {
      this.addLast(param_e_13);

      return true;
    }
  }


  public java.lang.Object removeFirst() {
    {
      java.lang.Object t_73;
      int t_74;

      t_73 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_store[0];
      java.lang.Object var_13_obj = t_73;

      this.shiftAllValuesLeft();
      t_74 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size;
      this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size + (byte)-1;

      return var_13_obj;
    }
  }


  public java.lang.Object removeLast() {
    {
      int t_75;
      java.lang.Object t_76;
      int t_77;

      t_75 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size - 1;
      t_76 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_store[t_75];
      java.lang.Object var_14_obj = t_76;

      t_77 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size;
      this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size + (byte)-1;

      return var_14_obj;
    }
  }


  public java.lang.Object pollFirst() {
    {
      java.lang.Object t_78;

      t_78 = this.removeFirst();

      return t_78;
    }
  }


  public java.lang.Object pollLast() {
    {
      java.lang.Object t_79;

      t_79 = this.removeLast();

      return t_79;
    }
  }


  public java.lang.Object getFirst() {
    {
      java.lang.Object t_80;

      t_80 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_store[0];

      return t_80;
    }
  }


  public java.lang.Object getLast() {
    {
      int t_81;
      java.lang.Object t_82;

      t_81 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size - 1;
      t_82 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_store[t_81];

      return t_82;
    }
  }


  public java.lang.Object peekFirst() {
    {
      java.lang.Object t_83;

      t_83 = this.getFirst();

      return t_83;
    }
  }


  public java.lang.Object peekLast() {
    {
      java.lang.Object t_84;

      t_84 = this.getLast();

      return t_84;
    }
  }


  public boolean removeFirstOccurrence(java.lang.Object o) {
    java.lang.Object param_o_14;

    param_o_14 = o;
    {
      return false;
    }
  }


  public boolean removeLastOccurrence(java.lang.Object o) {
    java.lang.Object param_o_15;

    param_o_15 = o;
    {
      return false;
    }
  }


  public boolean add(java.lang.Object e) {
    java.lang.Object param_e_16;

    param_e_16 = e;
    {
      return false;
    }
  }


  public boolean offer(java.lang.Object e) {
    java.lang.Object param_e_17;

    param_e_17 = e;
    {
      return false;
    }
  }


  public java.lang.Object remove() {
    {
      return null;
    }
  }


  public java.lang.Object poll() {
    {
      return null;
    }
  }


  public java.lang.Object element() {
    {
      return null;
    }
  }


  public java.lang.Object peek() {
    {
      java.lang.Object t_85;

      t_85 = this.getFirst();

      return t_85;
    }
  }


  public void push(java.lang.Object e) {
    java.lang.Object param_e_18;

    param_e_18 = e;
    {
      this.addLast(param_e_18);
    }
  }


  public java.lang.Object pop() {
    {
      java.lang.Object t_86;

      t_86 = this.removeFirst();

      return t_86;
    }
  }


  public boolean remove(java.lang.Object o) {
    java.lang.Object param_o_19;

    param_o_19 = o;
    {
      return false;
    }
  }


  public boolean containsAll(java.util.Collection c) {
    java.util.Collection param_c_20;

    param_c_20 = c;
    {
      return false;
    }
  }


  public boolean addAll(java.util.Collection c) {
    java.util.Collection param_c_21;

    param_c_21 = c;
    {
      return false;
    }
  }


  public boolean retainAll(java.util.Collection c) {
    java.util.Collection param_c_22;

    param_c_22 = c;
    {
      return false;
    }
  }


  public boolean removeAll(java.util.Collection c) {
    java.util.Collection param_c_23;

    param_c_23 = c;
    {
      return false;
    }
  }


  public void clear() {
    {
    }
  }


  public boolean contains(java.lang.Object o) {
    java.lang.Object param_o_24;

    param_o_24 = o;
    {
      return false;
    }
  }


  public int size() {
    {
      return this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size;
    }
  }


  public boolean isEmpty() {
    {
      boolean t_87;

      t_87 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size  ==  0;

      return t_87;
    }
  }


  public java.util.Iterator iterator() {
    {
      return ((java.util.Iterator)(null));
    }
  }


  public java.lang.Object[] toArray() {
    {
      java.lang.Object[] t_88;

      t_88 = new java.lang.Object[0];

      return t_88;
    }
  }


  public java.lang.Object[] toArray(java.lang.Object[] a) {
    java.lang.Object[] param_a_25;

    param_a_25 = a;
    {
      return ((java.lang.Object[])(null));
    }
  }


  public java.util.Iterator descendingIterator() {
    {
      return ((java.util.Iterator)(null));
    }
  }


  private void shiftAllValuesRight() {
    {
      {
        int t_89;
        int var_15_i = 0;
        boolean var_16_ws_4;

        t_89 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size - 1;
        var_16_ws_4 = var_15_i  <  t_89;
        while (var_16_ws_4) {
          java.lang.Object t_90;
          int t_91;
          int t_92;
          int t_93;

          t_90 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_store[var_15_i];
          t_91 = var_15_i + 1;
          this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_store[t_91] = t_90;
          t_92 = var_15_i;
          var_15_i = var_15_i + (byte)1;
          t_93 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size - 1;
          var_16_ws_4 = var_15_i  <  t_93;
        }
      }

      return;
    }
  }


  private void shiftAllValuesLeft() {
    {
      {
        int t_94;
        int var_17_i = 0;
        boolean var_18_ws_5;

        t_94 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size - 1;
        var_18_ws_5 = var_17_i  <  t_94;
        while (var_18_ws_5) {
          int t_95;
          java.lang.Object t_96;
          int t_97;
          int t_98;

          t_95 = var_17_i + 1;
          t_96 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_store[t_95];
          this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_store[var_17_i] = t_96;
          t_97 = var_17_i;
          var_17_i = var_17_i + (byte)1;
          t_98 = this.ar_edu_itba_alu_crpereyr_impl_avltree1_CustomList_size - 1;
          var_18_ws_5 = var_17_i  <  t_98;
        }
      }

      return;
    }
  }

}
