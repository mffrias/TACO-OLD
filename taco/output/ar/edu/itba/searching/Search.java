package ar.edu.itba.searching;

//@ model import org.jmlspecs.lang.*;


public class Search extends java.lang.Object {

  public int[] ar_edu_itba_searching_Search_arreglo;

  /*@ 
    @ requires (\forall int j; 0  <=  j && j  <  A.length - 1; ((int)A[j])  <=  ((int)A[j + 1]));
    @ requires A.length  <=  5;
    @ ensures \result  ==  true <==> (\exists int l; 0  <=  l && l  <  A.length; ((int)A[l])  ==  value);
    @ ensures \old(A)  ==  A;
    @ signals (java.lang.Exception e) false;
    @*/
  public static boolean binSearch(int[] A, int value) {
    boolean t_1;
    int t_2;

    t_1 = A.length  ==  0;

    if (t_1) {
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
    int var_1_low = 0;

    t_2 = A.length - 1;
    int var_2_high = t_2;
    boolean var_3_ws_1;

    var_3_ws_1 = var_1_low  <=  var_2_high;
    while (var_3_ws_1) {
      int t_3;
      int t_4;
      int t_7;
      boolean t_8;

      t_3 = var_1_low + var_2_high;
      t_4 = (t_3) / 2;
      int var_4_middle = t_4;

      t_7 = A[var_4_middle];
      t_8 = value  >  t_7;

      if (t_8) {
        {
          {
            {
              {
                {
                  var_1_low = var_4_middle + 1;
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
                  int t_5;
                  boolean t_6;

                  t_5 = A[var_4_middle];
                  t_6 = value  <  t_5;
                  if (t_6) {
                    {
                      {
                        {
                          {
                            {
                              var_2_high = var_4_middle - 1;
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
                              return true;
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
      var_3_ws_1 = var_1_low  <=  var_2_high;
    }

    return false;
  }


  /*@ 
    @ requires A.length  ==  3;
    @ requires x  ==  0;
    @ requires y  ==  2;
    @ ensures \old(((int)A[0]))  ==  ((int)A[0]) && \old(((int)A[1]))  ==  ((int)A[1]) && \old(((int)A[2]))  ==  ((int)A[2]);
    @*/
  public static void swapswap(int[] A, int x, int y) {
    int t_9;

    swap(A, x, y);
    t_9 = y - 1;
    swap(A, x, t_9);
  }


  public static void swap(int[] A, int x, int y) {
    int t_10;
    int t_11;

    t_10 = A[x];
    int var_5_temp = t_10;

    t_11 = A[y];
    A[x] = t_11;
    A[y] = var_5_temp;
  }


  /*@ 
    @ requires argA.length  ==  3;
    @ requires argf  ==  0 && argl  ==  2;
    @ ensures (\forall int i; 0  <=  i && i  <  \result; ((int)argA[i])  <=  \old(((int)argA[argf])));
    @ ensures (\forall int i; \result  <  i && i  <  argA.length; \old(((int)argA[argf]))  <=  ((int)argA[i]));
    @ ensures argl  ==  \old(argl) && argf  ==  \old(argf);
    @*/
  public static int partition(int[] argA, int argf, int argl) {
    int t_12;
    int[] var_6_A = argA;
    int var_7_l = argl;
    int var_8_f = argf;

    t_12 = var_6_A[var_8_f];
    int var_9_pivot = t_12;
    boolean var_10_ws_4;

    var_10_ws_4 = var_8_f  <  var_7_l;
    while (var_10_ws_4) {
      int t_13;
      int t_15;
      boolean var_11_ws_2;

      t_13 = var_6_A[var_8_f];
      var_11_ws_2 = t_13  <  var_9_pivot;
      while (var_11_ws_2) {
        int t_14;

        var_8_f = var_8_f + 1;
        t_14 = var_6_A[var_8_f];
        var_11_ws_2 = t_14  <  var_9_pivot;
      }
      boolean var_12_ws_3;

      t_15 = var_6_A[var_7_l];
      var_12_ws_3 = t_15  >  var_9_pivot;
      while (var_12_ws_3) {
        int t_16;

        var_7_l = var_7_l - 1;
        t_16 = var_6_A[var_7_l];
        var_12_ws_3 = t_16  >  var_9_pivot;
      }
      swap(var_6_A, var_8_f, var_7_l);
      var_10_ws_4 = var_8_f  <  var_7_l;
    }

    return var_8_f;
  }


  /*@ 
    @ requires f  ==  0 && l  ==  A.length - 1;
    @ requires A.length  ==  3;
    @ requires ((int)A[0])  ==  0 && ((int)A[1])  ==  3 && ((int)A[2])  ==  2;
    @ ensures (\forall int j; 0  <=  j && j  <  A.length - 1; ((int)A[j])  <=  ((int)A[j + 1]));
    @ signals (java.lang.Exception e) false;
    @*/
  public static void quicksort(int[] A, int f, int l) {
    boolean t_19;

    t_19 = f  <  l;
    if (t_19) {
      {
        {
          {
            {
              {
                int t_17;
                int t_18;

                t_17 = partition(A, f, l);
                int var_13_pivot_index = t_17;

                quicksort(A, f, var_13_pivot_index);
                t_18 = var_13_pivot_index + 1;
                quicksort(A, t_18, l);
              }
            }
          }
        }
      }
    }
  }


  public Search() {
    {
    }
  }


  /*@ 
    @ requires i  ==  1;
    @ requires A.length  ==  0 || A.length  ==  1 || A.length  ==  2 || A.length  ==  3;
    @ ensures (\forall int j; 0  <=  j && j  <  A.length - 1; ((int)A[j])  ==  \old(((int)A[j + 1])));
    @*/
  public static void recu(int[] A, int i) {
    boolean t_23;

    t_23 = i  <  A.length;
    if (t_23) {
      {
        {
          {
            {
              {
                int t_20;
                int t_21;
                int t_22;

                t_20 = A[i];
                t_21 = i - 1;
                A[t_21] = t_20;
                t_22 = i + 1;
                recu(A, t_22);
              }
            }
          }
        }
      }
    }
  }

}
