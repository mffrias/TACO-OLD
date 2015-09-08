package ar.edu.taco.skunk;

//@ model import org.jmlspecs.lang.*;


public class Landing extends java.lang.Object {


  /*@ 
    @ requires true;
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  static boolean initLandingOK(float height) {
    float param_height_0;

    param_height_0 = height;
    {
      java.lang.Boolean t_1;
      boolean t_2;

      t_1 = isHeightPositive(param_height_0);
      java.lang.Boolean var_1_b = t_1;

      t_2 = var_1_b.booleanValue();

      return t_2;
    }
  }


  static java.lang.Boolean isHeightPositive(float height) {
    float param_height_1;

    param_height_1 = height;
    {
      boolean t_3;
      boolean t_4;
      java.lang.Boolean var_2_b = ((java.lang.Boolean)(null));

      t_3 = param_height_1  >  +0.0F;

      if (t_3) {
        {
          {
            {
              {
                {
                  var_2_b = Boolean.TRUE;
                }
              }
            }
          }
        }
      }
      t_4 = param_height_1  <=  +0.0F;
      if (t_4) {
        {
          {
            {
              {
                {
                  var_2_b = Boolean.FALSE;
                }
              }
            }
          }
        }
      }

      return var_2_b;
    }
  }


  /*@ 
    @ requires i1  !=  1 && i2  !=  1 && i3  !=  1 && i4  !=  1 && i5  !=  1;
    @ ensures \result  ==  false;
    @*/
  public boolean aerodynamic1(int i1, int i2, int i3, int i4, int i5) {
    int param_i1_2;

    param_i1_2 = i1;
    int param_i2_3;

    param_i2_3 = i2;
    int param_i3_4;

    param_i3_4 = i3;
    int param_i4_5;

    param_i4_5 = i4;
    int param_i5_6;

    param_i5_6 = i5;
    {
      int t_5;
      int t_6;
      int t_7;
      int t_8;
      boolean t_9;

      t_5 = param_i1_2 * param_i2_3;
      t_6 = t_5 * param_i3_4;
      t_7 = t_6 * param_i4_5;
      t_8 = t_7 * param_i5_6;
      t_9 = t_8  ==  1;
      if (t_9) {
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
      } else {
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
    }
  }


  /*@ 
    @ requires f1  >  +0.0F && f2  >  +0.0F && f1  <  10.0F && f2  <  10.0F;
    @ ensures \result  ==  f1;
    @*/
  public float testAddition(float f1, float f2) {
    float param_f1_7;

    param_f1_7 = f1;
    float param_f2_8;

    param_f2_8 = f2;
    {
      float t_10;
      float t_11;

      t_10 = param_f1_7 + param_f2_8;
      t_11 = t_10 - param_f2_8;

      return t_11;
    }
  }


  public Landing() {
  }

}
