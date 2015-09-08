package ar.edu.taco.skunk;

//@ model import org.jmlspecs.lang.*;


public class SList extends java.lang.Object {

  public ar.edu.taco.skunk.Node ar_edu_taco_skunk_SList_n;
  /*@ invariant (\forall ar.edu.taco.skunk.Node node; \reach(this.ar_edu_taco_skunk_SList_n, ar.edu.taco.skunk.Node, ar_edu_taco_skunk_Node_next).has(((java.lang.Object)(node)))  ==  true; \reach(node.ar_edu_taco_skunk_Node_next, ar.edu.taco.skunk.Node, ar_edu_taco_skunk_Node_next).has(((java.lang.Object)(node)))  ==  false);
    @*/

  public SList() {
    {
    }
  }


  /*@ 
    @ requires true;
    @ ensures \result  ==  true <==> (\exists ar.edu.taco.skunk.Node node; \reach(this.ar_edu_taco_skunk_SList_n, ar.edu.taco.skunk.Node, ar_edu_taco_skunk_Node_next).has(((java.lang.Object)(node)))  ==  true; node.ar_edu_taco_skunk_Node_value  ==  v);
    @*/
  public boolean hasElement(int v) {
    ar.edu.taco.skunk.Node var_1_current = this.ar_edu_taco_skunk_SList_n;
    boolean var_2_ws_1;

    var_2_ws_1 = var_1_current  !=  null;
    while (var_2_ws_1) {
      boolean t_1;

      t_1 = var_1_current.ar_edu_taco_skunk_Node_value  ==  v;

      if (t_1) {
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
      var_1_current = var_1_current.ar_edu_taco_skunk_Node_next;
      var_2_ws_1 = var_1_current  !=  null;
    }
    this.ar_edu_taco_skunk_SList_n.ar_edu_taco_skunk_Node_next = this.ar_edu_taco_skunk_SList_n;

    return false;
  }

}
