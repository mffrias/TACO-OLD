package edu.fiu.sort;

//@ model import org.jmlspecs.lang.*;


public class SortBug1 extends java.lang.Object {


  /*@ 
    @ requires a.length  >  0;
    @ ensures (((long)a[0])  ==  0L);
    @*/
  public static void insertionSort(long[] a) {
    long[] param_a_0;

    param_a_0 = a;
    {
      param_a_0 = ((long[])(null));
    }
  }


  public SortBug1() {
  }

}
