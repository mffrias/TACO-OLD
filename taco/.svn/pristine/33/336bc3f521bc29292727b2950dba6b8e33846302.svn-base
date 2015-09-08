package ar.edu.taco.stryker;

//@ model import org.jmlspecs.lang.*;


public class LightAccount extends java.lang.Object {

  private /*@ spec_public @*/ int ar_edu_taco_stryker_LightAccount_bal;
  /*@ invariant this.ar_edu_taco_stryker_LightAccount_bal  >=  0;
    @*/

  /*@ 
    @ requires amt  >=  0;
    @ assignable ar_edu_taco_stryker_LightAccount_bal;
    @ ensures this.ar_edu_taco_stryker_LightAccount_bal  ==  amt;
    @*/
  public LightAccount(int amt) {
    this.ar_edu_taco_stryker_LightAccount_bal = (byte)0;
    {
      this.ar_edu_taco_stryker_LightAccount_bal = amt;
    }
  }


  public LightAccount() {
    this.ar_edu_taco_stryker_LightAccount_bal = (byte)0;
    {
      this.ar_edu_taco_stryker_LightAccount_bal = 0;
    }
  }


  /*@ 
    @ requires amt  >  0 && amt  <=  this.ar_edu_taco_stryker_LightAccount_bal;
    @ assignable ar_edu_taco_stryker_LightAccount_bal;
    @ ensures amt  ==  5;
    @ signals (java.lang.RuntimeException e) true;
    @*/
  public void withdraw(int amt) {
    boolean t_2;

    t_2 = amt  !=  5;
    if (t_2) {
      {
        {
          {
            {
              {
                java.lang.RuntimeException t_1;

                t_1 = new java.lang.RuntimeException();
                throw t_1;
              }
            }
          }
        }
      }
    }
  }


  /*@ 
    @ ensures \result  ==  this.ar_edu_taco_stryker_LightAccount_bal;
    @*/
  public /*@ pure @*/ int balance() {
    return this.ar_edu_taco_stryker_LightAccount_bal;
  }

}
