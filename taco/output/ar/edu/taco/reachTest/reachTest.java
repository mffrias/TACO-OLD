package ar.edu.taco.reachTest;

//@ model import org.jmlspecs.lang.*;


public class reachTest extends java.lang.Object {

  public ar.edu.taco.reachTest.reachTest ar_edu_taco_reachTest_reachTest_field1;
  public ar.edu.taco.reachTest.reachTest ar_edu_taco_reachTest_reachTest_field2;
  /*@ invariant (\forall ar.edu.taco.reachTest.reachTest n; \reach(this, ar.edu.taco.reachTest.reachTest, ar_edu_taco_reachTest_reachTest_field1).has(((java.lang.Object)(n)))  ==  true; \reach(n.ar_edu_taco_reachTest_reachTest_field1, ar.edu.taco.reachTest.reachTest, ar_edu_taco_reachTest_reachTest_field1).has(((java.lang.Object)(n)))  ==  false && \reach(n.ar_edu_taco_reachTest_reachTest_field2, ar.edu.taco.reachTest.reachTest, ar_edu_taco_reachTest_reachTest_field2).has(((java.lang.Object)(n)))  ==  false);
    @*/
  /*@ invariant \reach(this, ar.edu.taco.reachTest.reachTest, ar_edu_taco_reachTest_reachTest_field2 + ar_edu_taco_reachTest_reachTest_field1).has(((java.lang.Object)(this)))  ==  true;
    @*/

  /*@ 
    @ requires true;
    @ ensures true;
    @*/
  public void testReachMethod() {
  }


  public reachTest() {
  }

}
