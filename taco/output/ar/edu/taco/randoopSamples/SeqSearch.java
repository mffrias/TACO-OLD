package ar.edu.taco.randoopSamples;

//@ model import org.jmlspecs.lang.*;


public class SeqSearch extends java.lang.Object {

  /*@ invariant true;
    @*/

  /*@ 
    @ requires sValue  >=  0;
    @ requires sValue  <  arr.length;
    @ ensures false;
    @*/
  public boolean seqSearch(int[] arr, int sValue) {
    int[] param_arr_0;

    param_arr_0 = arr;
    int param_sValue_1;

    param_sValue_1 = sValue;
    {
      {
        int t_1;
        int var_1_index = 0;
        boolean var_2_ws_1;

        t_1 = arr.length - 1;
        var_2_ws_1 = var_1_index  <  t_1;
        while (var_2_ws_1) {
          int t_2;
          boolean t_3;
          int t_4;
          int t_5;

          t_2 = param_arr_0[var_1_index];
          t_3 = t_2  ==  param_sValue_1;

          if (t_3) {
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
          t_4 = var_1_index;
          var_1_index = var_1_index + (byte)1;
          t_5 = arr.length - 1;
          var_2_ws_1 = var_1_index  <  t_5;
        }
      }

      return false;
    }
  }


  public SeqSearch() {
  }

}
