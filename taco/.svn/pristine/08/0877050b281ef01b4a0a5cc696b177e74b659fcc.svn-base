package qu.edu.qa;

//@ model import org.jmlspecs.lang.*;


public class Fraction extends java.lang.Object {

  public int qu_edu_qa_Fraction_num;
  public int qu_edu_qa_Fraction_denum;
  /*@ invariant this.qu_edu_qa_Fraction_denum  !=  0;
    @*/

  /*@ 
    @ requires denum  !=  0;
    @*/
  public Fraction(int num, int denum) {
    this.qu_edu_qa_Fraction_num = (byte)0;
    this.qu_edu_qa_Fraction_denum = (byte)0;
    {
      this.qu_edu_qa_Fraction_num = num;
      this.qu_edu_qa_Fraction_denum = denum;
    }
  }


  /*@ 
    @ ensures \result  ==  this.qu_edu_qa_Fraction_num;
    @*/
  public /*@ pure @*/ int getNum() {
    return this.qu_edu_qa_Fraction_num;
  }


  /*@ 
    @ ensures this.qu_edu_qa_Fraction_denum  ==  \result;
    @*/
  public /*@ pure @*/ int getDenum() {
    return this.qu_edu_qa_Fraction_denum;
  }


  /*@ 
    @ requires f1.qu_edu_qa_Fraction_denum  !=  0;
    @ requires f2.qu_edu_qa_Fraction_denum  !=  0;
    @ ensures f3.qu_edu_qa_Fraction_num  ==  \old(f1.qu_edu_qa_Fraction_num) * \old(f2.qu_edu_qa_Fraction_num);
    @ ensures f3.qu_edu_qa_Fraction_denum  ==  \old(f1.qu_edu_qa_Fraction_denum) * \old(f2.qu_edu_qa_Fraction_denum);
    @ signals (java.lang.Exception e) true;
    @*/
  public qu.edu.qa.Fraction mul(qu.edu.qa.Fraction f1, qu.edu.qa.Fraction f2, qu.edu.qa.Fraction f3) {
    int t_1;
    int t_2;

    t_1 = f1.qu_edu_qa_Fraction_num * f2.qu_edu_qa_Fraction_num;
    int var_1_n = t_1;

    t_2 = f1.qu_edu_qa_Fraction_denum * f2.qu_edu_qa_Fraction_denum;
    int var_2_d = t_2;

    f3.qu_edu_qa_Fraction_num = var_1_n;
    f3.qu_edu_qa_Fraction_denum = var_2_d;

    return f3;
  }


  /*@ 
    @ ensures i - 3.0F  ==  4.0F;
    @*/
  public float test(float i) {
    return i;
  }


  /*@ 
    @ requires f1.qu_edu_qa_Fraction_denum  !=  0;
    @ requires f2.qu_edu_qa_Fraction_denum  !=  0;
    @ ensures \result.qu_edu_qa_Fraction_num  ==  f1.qu_edu_qa_Fraction_num * f2.qu_edu_qa_Fraction_denum;
    @ ensures \result.qu_edu_qa_Fraction_denum  ==  f1.qu_edu_qa_Fraction_denum * f2.qu_edu_qa_Fraction_num;
    @*/
  public static qu.edu.qa.Fraction div(qu.edu.qa.Fraction f1, qu.edu.qa.Fraction f2, qu.edu.qa.Fraction f3) {
    f3.qu_edu_qa_Fraction_num = f1.qu_edu_qa_Fraction_num * f2.qu_edu_qa_Fraction_denum;
    f3.qu_edu_qa_Fraction_denum = f1.qu_edu_qa_Fraction_denum * f2.qu_edu_qa_Fraction_num;

    return f3;
  }


  /*@ 
    @ ensures \result.qu_edu_qa_Fraction_num  ==  f1.qu_edu_qa_Fraction_num;
    @ ensures \result.qu_edu_qa_Fraction_denum  ==  f1.qu_edu_qa_Fraction_denum * f2;
    @*/
  public static qu.edu.qa.Fraction div2(qu.edu.qa.Fraction f1, int f2) {
    qu.edu.qa.Fraction t_3;
    int t_4;

    t_4 = f1.qu_edu_qa_Fraction_denum * f2;
    t_3 = new qu.edu.qa.Fraction(f1.qu_edu_qa_Fraction_num, t_4);

    return t_3;
  }


  /*@ 
    @ ensures \result % Nb1  ==  0;
    @ ensures \result % Nb2  ==  0;
    @*/
  private static int ppcm(int Nb1, int Nb2) {
    int var_3_Produit, var_4_Reste, var_5_PPCM;

    var_3_Produit = Nb1 * Nb2;
    var_4_Reste = Nb1 % Nb2;
    boolean var_6_ws_1;

    var_6_ws_1 = var_4_Reste  !=  0;
    while (var_6_ws_1) {
      Nb1 = Nb2;
      Nb2 = var_4_Reste;
      var_4_Reste = Nb1 % Nb2;
      var_6_ws_1 = var_4_Reste  !=  0;
    }
    var_5_PPCM = var_3_Produit / Nb2;

    return var_5_PPCM;
  }


  /*@ 
    @ assignable qu_edu_qa_Fraction_num;
    @ assignable qu_edu_qa_Fraction_denum;
    @ ensures this.qu_edu_qa_Fraction_num  ==  f.qu_edu_qa_Fraction_num;
    @ ensures this.qu_edu_qa_Fraction_denum  ==  f.qu_edu_qa_Fraction_denum;
    @*/
  public void setValue(qu.edu.qa.Fraction f) {
    this.qu_edu_qa_Fraction_num = f.qu_edu_qa_Fraction_num;
    this.qu_edu_qa_Fraction_denum = f.qu_edu_qa_Fraction_denum;
  }

}
