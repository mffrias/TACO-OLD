package modelfields;

//@ model import org.jmlspecs.lang.*;


public class TreeSetEntry extends java.lang.Object {

  public int modelfields_TreeSetEntry_key;
  public /*@ nullable @*/ modelfields.TreeSetEntry modelfields_TreeSetEntry_parent;
  public boolean modelfields_TreeSetEntry_color;
  public /*@ nullable @*/ modelfields.TreeSetEntry modelfields_TreeSetEntry_left;
  public /*@ nullable @*/ modelfields.TreeSetEntry modelfields_TreeSetEntry_right;

  /*@ public model int modelfields_TreeSetEntry_blackHeight;
    @*/
  /*@ represents modelfields_TreeSetEntry_blackHeight \such_that ((this.modelfields_TreeSetEntry_left  ==  null && this.modelfields_TreeSetEntry_right  ==  null) ==> (this.modelfields_TreeSetEntry_blackHeight  ==  1)) && (this.modelfields_TreeSetEntry_left  !=  null && this.modelfields_TreeSetEntry_right  ==  null ==> ((this.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_color  ==  false) && (this.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_blackHeight  ==  1) && (this.modelfields_TreeSetEntry_blackHeight  ==  1))) && (this.modelfields_TreeSetEntry_left  ==  null && this.modelfields_TreeSetEntry_right  !=  null ==> ((this.modelfields_TreeSetEntry_right.modelfields_TreeSetEntry_color  ==  false) && (this.modelfields_TreeSetEntry_right.modelfields_TreeSetEntry_blackHeight  ==  1) && (this.modelfields_TreeSetEntry_blackHeight  ==  1))) && (this.modelfields_TreeSetEntry_left  !=  null && this.modelfields_TreeSetEntry_right  !=  null && this.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_color  ==  false && this.modelfields_TreeSetEntry_right.modelfields_TreeSetEntry_color  ==  false ==> ((this.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_blackHeight  ==  this.modelfields_TreeSetEntry_right.modelfields_TreeSetEntry_blackHeight) && (this.modelfields_TreeSetEntry_blackHeight  ==  this.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_blackHeight))) && (this.modelfields_TreeSetEntry_left  !=  null && this.modelfields_TreeSetEntry_right  !=  null && this.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_color  ==  true && this.modelfields_TreeSetEntry_right.modelfields_TreeSetEntry_color  ==  true ==> ((this.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_blackHeight  ==  this.modelfields_TreeSetEntry_right.modelfields_TreeSetEntry_blackHeight) && (this.modelfields_TreeSetEntry_blackHeight  ==  this.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_blackHeight + 1))) && (this.modelfields_TreeSetEntry_left  !=  null && this.modelfields_TreeSetEntry_right  !=  null && this.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_color  ==  false && this.modelfields_TreeSetEntry_right.modelfields_TreeSetEntry_color  ==  true ==> ((this.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_blackHeight  ==  this.modelfields_TreeSetEntry_right.modelfields_TreeSetEntry_blackHeight + 1) && (this.modelfields_TreeSetEntry_blackHeight  ==  this.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_blackHeight))) && (this.modelfields_TreeSetEntry_left  !=  null && this.modelfields_TreeSetEntry_right  !=  null && this.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_color  ==  true && this.modelfields_TreeSetEntry_right.modelfields_TreeSetEntry_color  ==  false ==> ((this.modelfields_TreeSetEntry_right.modelfields_TreeSetEntry_blackHeight  ==  this.modelfields_TreeSetEntry_left.modelfields_TreeSetEntry_blackHeight + 1) && (this.modelfields_TreeSetEntry_blackHeight  ==  this.modelfields_TreeSetEntry_right.modelfields_TreeSetEntry_blackHeight)));
    @*/

  public TreeSetEntry() {
    this.modelfields_TreeSetEntry_key = (byte)0;
    this.modelfields_TreeSetEntry_parent = ((modelfields.TreeSetEntry)(null));
    this.modelfields_TreeSetEntry_color = false;
    this.modelfields_TreeSetEntry_left = ((modelfields.TreeSetEntry)(null));
    this.modelfields_TreeSetEntry_right = ((modelfields.TreeSetEntry)(null));
    {
    }
  }

}
