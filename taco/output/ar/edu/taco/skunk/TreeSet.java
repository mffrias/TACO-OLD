package ar.edu.taco.skunk;

//@ model import org.jmlspecs.lang.*;


public class TreeSet extends java.lang.Object {

  public final int ar_edu_taco_skunk_TreeSet_RED;
  public final int ar_edu_taco_skunk_TreeSet_BLACK;
  public /*@ nullable @*/ ar.edu.taco.skunk.TreeSetEntry ar_edu_taco_skunk_TreeSet_root;
  public int ar_edu_taco_skunk_TreeSet_size;
  /*@ invariant (this.ar_edu_taco_skunk_TreeSet_RED  ==  0) && (this.ar_edu_taco_skunk_TreeSet_BLACK  ==  1) && (this.ar_edu_taco_skunk_TreeSet_root.ar_edu_taco_skunk_TreeSetEntry_parent  ==  null);
    @*/

  /*@ 
    @ requires true;
    @ ensures false;
    @*/
  public void generateInput() {
  }


  public TreeSet(ar.edu.taco.skunk.TreeSetEntry r, char c) {
    this.ar_edu_taco_skunk_TreeSet_RED = 0;
    this.ar_edu_taco_skunk_TreeSet_BLACK = 1;
    this.ar_edu_taco_skunk_TreeSet_root = ((ar.edu.taco.skunk.TreeSetEntry)(null));
    this.ar_edu_taco_skunk_TreeSet_size = 0;
    {
      this.ar_edu_taco_skunk_TreeSet_root = r;
      this.ar_edu_taco_skunk_TreeSet_size = 1;
    }
  }

}
