package ar.edu.taco.floatTest;

//@ model import org.jmlspecs.lang.*;


public class FloatTest extends java.lang.Object {

  int ar_edu_taco_floatTest_FloatTest_att;

  public FloatTest() {
    this.ar_edu_taco_floatTest_FloatTest_att = (byte)0;
    {
    }
  }


  /*@ 
    @ requires true;
    @ ensures \result  ==  7;
    @*/
  public int add() {
    {
      java.lang.Integer t_1;
      int t_2;
      int t_3;

      t_1 = new java.lang.Integer(7);
      java.lang.Integer var_1_i = t_1;

      t_2 = var_1_i.intValue();
      t_3 = t_2 + 1;
      int var_2_j = t_3;


      return var_2_j;
    }
  }

}
