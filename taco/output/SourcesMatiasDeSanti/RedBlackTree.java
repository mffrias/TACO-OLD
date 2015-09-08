package SourcesMatiasDeSanti;

//@ model import org.jmlspecs.lang.*;


public class RedBlackTree extends java.lang.Object {

  public SourcesMatiasDeSanti.RedBlackNode SourcesMatiasDeSanti_RedBlackTree_root;
  /*@ invariant this.SourcesMatiasDeSanti_RedBlackTree_root  !=  null ==> this.SourcesMatiasDeSanti_RedBlackTree_root.SourcesMatiasDeSanti_RedBlackNode_parent  ==  null;
    @*/
  /*@ invariant this.SourcesMatiasDeSanti_RedBlackTree_root  !=  null ==> this.SourcesMatiasDeSanti_RedBlackTree_root.SourcesMatiasDeSanti_RedBlackNode_color  ==  1;
    @*/
  /*@ invariant (\forall SourcesMatiasDeSanti.RedBlackNode n; \reach(this.SourcesMatiasDeSanti_RedBlackTree_root, SourcesMatiasDeSanti.RedBlackNode, SourcesMatiasDeSanti_RedBlackNode_parent + SourcesMatiasDeSanti_RedBlackNode_left + SourcesMatiasDeSanti_RedBlackNode_right).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesMatiasDeSanti_RedBlackNode_left, SourcesMatiasDeSanti.RedBlackNode, SourcesMatiasDeSanti_RedBlackNode_right + SourcesMatiasDeSanti_RedBlackNode_left).has(((java.lang.Object)(n)))  ==  false && \reach(n.SourcesMatiasDeSanti_RedBlackNode_right, SourcesMatiasDeSanti.RedBlackNode, SourcesMatiasDeSanti_RedBlackNode_right + SourcesMatiasDeSanti_RedBlackNode_left).has(((java.lang.Object)(n)))  ==  false && (n.SourcesMatiasDeSanti_RedBlackNode_left  !=  null ==> n.SourcesMatiasDeSanti_RedBlackNode_left.SourcesMatiasDeSanti_RedBlackNode_parent  ==  n) && (n.SourcesMatiasDeSanti_RedBlackNode_right  !=  null ==> n.SourcesMatiasDeSanti_RedBlackNode_right.SourcesMatiasDeSanti_RedBlackNode_parent  ==  n) && (\forall SourcesMatiasDeSanti.RedBlackNode m; \reach(n.SourcesMatiasDeSanti_RedBlackNode_left, SourcesMatiasDeSanti.RedBlackNode, SourcesMatiasDeSanti_RedBlackNode_right + SourcesMatiasDeSanti_RedBlackNode_left).has(((java.lang.Object)(m)))  ==  true; m.SourcesMatiasDeSanti_RedBlackNode_data  <  n.SourcesMatiasDeSanti_RedBlackNode_data) && (\forall SourcesMatiasDeSanti.RedBlackNode m; \reach(n.SourcesMatiasDeSanti_RedBlackNode_right, SourcesMatiasDeSanti.RedBlackNode, SourcesMatiasDeSanti_RedBlackNode_right + SourcesMatiasDeSanti_RedBlackNode_left).has(((java.lang.Object)(m)))  ==  true; m.SourcesMatiasDeSanti_RedBlackNode_data  >  n.SourcesMatiasDeSanti_RedBlackNode_data) && ((n.SourcesMatiasDeSanti_RedBlackNode_right  !=  null || n.SourcesMatiasDeSanti_RedBlackNode_left  !=  null) ==> n.SourcesMatiasDeSanti_RedBlackNode_right  !=  n.SourcesMatiasDeSanti_RedBlackNode_left) && ((n.SourcesMatiasDeSanti_RedBlackNode_left  ==  null && n.SourcesMatiasDeSanti_RedBlackNode_right  ==  null && n.SourcesMatiasDeSanti_RedBlackNode_color  ==  1) ==> n.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  1) && ((n.SourcesMatiasDeSanti_RedBlackNode_left  ==  null && n.SourcesMatiasDeSanti_RedBlackNode_right  ==  null && n.SourcesMatiasDeSanti_RedBlackNode_color  ==  0) ==> n.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  0) && ((n.SourcesMatiasDeSanti_RedBlackNode_left  !=  null && n.SourcesMatiasDeSanti_RedBlackNode_right  ==  null && n.SourcesMatiasDeSanti_RedBlackNode_color  ==  1) ==> (n.SourcesMatiasDeSanti_RedBlackNode_left.SourcesMatiasDeSanti_RedBlackNode_color  ==  0 && n.SourcesMatiasDeSanti_RedBlackNode_left.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  0 && n.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  1)) && ((n.SourcesMatiasDeSanti_RedBlackNode_left  !=  null && n.SourcesMatiasDeSanti_RedBlackNode_right  ==  null && n.SourcesMatiasDeSanti_RedBlackNode_color  ==  0) ==> (n.SourcesMatiasDeSanti_RedBlackNode_left.SourcesMatiasDeSanti_RedBlackNode_color  ==  0 && n.SourcesMatiasDeSanti_RedBlackNode_left.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  0 && n.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  0)) && ((n.SourcesMatiasDeSanti_RedBlackNode_left  ==  null && n.SourcesMatiasDeSanti_RedBlackNode_right  !=  null && n.SourcesMatiasDeSanti_RedBlackNode_color  ==  1) ==> (n.SourcesMatiasDeSanti_RedBlackNode_right.SourcesMatiasDeSanti_RedBlackNode_color  ==  0 && n.SourcesMatiasDeSanti_RedBlackNode_right.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  0 && n.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  1)) && ((n.SourcesMatiasDeSanti_RedBlackNode_left  ==  null && n.SourcesMatiasDeSanti_RedBlackNode_right  !=  null && n.SourcesMatiasDeSanti_RedBlackNode_color  ==  0) ==> (n.SourcesMatiasDeSanti_RedBlackNode_right.SourcesMatiasDeSanti_RedBlackNode_color  ==  0 && n.SourcesMatiasDeSanti_RedBlackNode_right.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  0 && n.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  0)) && ((n.SourcesMatiasDeSanti_RedBlackNode_left  !=  null && n.SourcesMatiasDeSanti_RedBlackNode_right  !=  null && n.SourcesMatiasDeSanti_RedBlackNode_color  ==  1 && n.SourcesMatiasDeSanti_RedBlackNode_right.SourcesMatiasDeSanti_RedBlackNode_blackHeight  >=  n.SourcesMatiasDeSanti_RedBlackNode_left.SourcesMatiasDeSanti_RedBlackNode_blackHeight) ==> n.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  n.SourcesMatiasDeSanti_RedBlackNode_right.SourcesMatiasDeSanti_RedBlackNode_blackHeight + 1) && ((n.SourcesMatiasDeSanti_RedBlackNode_left  !=  null && n.SourcesMatiasDeSanti_RedBlackNode_right  !=  null && n.SourcesMatiasDeSanti_RedBlackNode_color  ==  1 && n.SourcesMatiasDeSanti_RedBlackNode_right.SourcesMatiasDeSanti_RedBlackNode_blackHeight  <  n.SourcesMatiasDeSanti_RedBlackNode_left.SourcesMatiasDeSanti_RedBlackNode_blackHeight) ==> n.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  n.SourcesMatiasDeSanti_RedBlackNode_left.SourcesMatiasDeSanti_RedBlackNode_blackHeight + 1) && ((n.SourcesMatiasDeSanti_RedBlackNode_left  !=  null && n.SourcesMatiasDeSanti_RedBlackNode_right  !=  null && n.SourcesMatiasDeSanti_RedBlackNode_color  ==  0 && n.SourcesMatiasDeSanti_RedBlackNode_right.SourcesMatiasDeSanti_RedBlackNode_blackHeight  >=  n.SourcesMatiasDeSanti_RedBlackNode_left.SourcesMatiasDeSanti_RedBlackNode_blackHeight) ==> n.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  n.SourcesMatiasDeSanti_RedBlackNode_right.SourcesMatiasDeSanti_RedBlackNode_blackHeight) && ((n.SourcesMatiasDeSanti_RedBlackNode_left  !=  null && n.SourcesMatiasDeSanti_RedBlackNode_right  !=  null && n.SourcesMatiasDeSanti_RedBlackNode_color  ==  0 && n.SourcesMatiasDeSanti_RedBlackNode_right.SourcesMatiasDeSanti_RedBlackNode_blackHeight  <  n.SourcesMatiasDeSanti_RedBlackNode_left.SourcesMatiasDeSanti_RedBlackNode_blackHeight) ==> n.SourcesMatiasDeSanti_RedBlackNode_blackHeight  ==  n.SourcesMatiasDeSanti_RedBlackNode_left.SourcesMatiasDeSanti_RedBlackNode_blackHeight) && ((n.SourcesMatiasDeSanti_RedBlackNode_color  ==  0 && n.SourcesMatiasDeSanti_RedBlackNode_left  !=  null) ==> (n.SourcesMatiasDeSanti_RedBlackNode_left.SourcesMatiasDeSanti_RedBlackNode_color  ==  1)) && ((n.SourcesMatiasDeSanti_RedBlackNode_color  ==  0 && n.SourcesMatiasDeSanti_RedBlackNode_right  !=  null) ==> (n.SourcesMatiasDeSanti_RedBlackNode_right.SourcesMatiasDeSanti_RedBlackNode_color  ==  1)));
    @*/

  public RedBlackTree() {
    {
      this.SourcesMatiasDeSanti_RedBlackTree_root = ((SourcesMatiasDeSanti.RedBlackNode)(null));
    }
  }
/** Inserts a new node into the tree.
 
 @param obj
            the object to insert
*/

  /*@ 
    @ requires true;
    @ ensures (\forall SourcesMatiasDeSanti.RedBlackNode rbn; \reach(this.SourcesMatiasDeSanti_RedBlackTree_root, SourcesMatiasDeSanti.RedBlackNode, SourcesMatiasDeSanti_RedBlackNode_right + SourcesMatiasDeSanti_RedBlackNode_left).has(((java.lang.Object)(rbn))); rbn.SourcesMatiasDeSanti_RedBlackNode_left  ==  null);
    @ signals (java.util.NoSuchElementException e) false;
    @*/
  public void add(/*@ nullable @*/ SourcesMatiasDeSanti.RedBlackTree t, int obj) {
    boolean var_1_flag = true;

    if (true) {
      {
        {
          {
            {
              {
                int t_1;

                t_1 = obj;
                obj = obj + (byte)1;
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
                int t_2;

                t_2 = obj;
                obj = obj + (byte)-1;
              }
            }
          }
        }
      }
    }
  }

}
