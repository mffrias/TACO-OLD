package ar.edu.taco.skunk;

//@ model import org.jmlspecs.lang.*;


public class Landing extends java.lang.Object {


  static java.lang.Boolean isHeightPositive(float height) {
    boolean t_1;
    boolean t_2;
    java.lang.Boolean var_1_b = ((java.lang.Boolean)(null));

    t_1 = height  >  +0.0F;

    if (t_1) {
      {
        {
          {
            {
              {
                var_1_b = Boolean.TRUE;
              }
            }
          }
        }
      }
    }
    t_2 = height  <=  +0.0F;
    if (t_2) {
      {
        {
          {
            {
              {
                var_1_b = Boolean.FALSE;
              }
            }
          }
        }
      }
    }

    return var_1_b;
  }


  /*@ 
    @ requires true;
    @ ensures true;
    @ signals (java.lang.Exception e) false;
    @*/
  static boolean initLandingOK(float height) {
    java.lang.Boolean t_3;
    boolean t_4;

    t_3 = isHeightPositive(height);
    java.lang.Boolean var_2_b = t_3;

    t_4 = var_2_b.booleanValue();

    return t_4;
  }


  /*@ 
    @ requires i1  !=  1 && i2  !=  1 && i3  !=  1 && i4  !=  1 && i5  !=  1;
    @ ensures \result  ==  false;
    @*/
  public boolean aerodynamic1(int i1, int i2, int i3, int i4, int i5) {
    int t_5;
    int t_6;
    int t_7;
    int t_8;
    boolean t_9;

    t_5 = i1 * i2;
    t_6 = t_5 * i3;
    t_7 = t_6 * i4;
    t_8 = t_7 * i5;
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


  /*@ 
    @ requires true;
    @ ensures \result  ==  true;
    @ signals (java.lang.RuntimeException e) false;
    @*/
  public static boolean testDivZero(int i1, int i2, int i3) {
    int t_10;

    t_10 = i2 / i3;
    i2 = i1 / (t_10);

    return true;
  }


  public Landing() {
  }

}
