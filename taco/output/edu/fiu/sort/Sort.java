package edu.fiu.sort;

//@ model import org.jmlspecs.lang.*;


public class Sort extends java.lang.Object {


  /*@ 
    @ requires true;
    @ ensures (\forall int i; 0  <=  i && i  <  a.length - 1; ((int)a[i])  <=  ((int)a[i - 1]));
    @*/
  public static void insertionSort(int[] a) {
    int[] param_a_0;

    param_a_0 = a;
    {
      param_a_0 = ((int[])(null));
    }
  }


  public Sort() {
  }

}
