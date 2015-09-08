package qu.edu.qa;

//@ model import org.jmlspecs.lang.*;


public class Euclid extends java.lang.Object {


  /*@ 
    @ requires true;
    @ ensures (\exists int n; 0  <  n && n  <=  n1; \result * n  ==  n1);
    @*/
  public int Euclides(int n1, int n2) {
    int t_1;

    t_1 = n1 % n2;
    int var_1_r = t_1;
    boolean var_2_ws_1;

    var_2_ws_1 = var_1_r  !=  0;
    while (var_2_ws_1) {
      n1 = n2;
      n2 = var_1_r;
      var_1_r = n1 % n2;
      var_2_ws_1 = var_1_r  !=  0;
    }

    return n2;
  }


  public Euclid() {
  }

}
