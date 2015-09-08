package modelfields;

public class TreeSetEntry {


	  public int key;
	  public /*@ nullable @*/ TreeSetEntry parent;
	  public boolean color;
	  public /*@ nullable @*/ TreeSetEntry left;
	  public /*@ nullable @*/ TreeSetEntry right;

	/*@ public model int blackHeight;
	  @ represents blackHeight \such_that ((this.left  ==  null && this.right  ==  null) ==> (this.blackHeight  ==  1)) && (this.left  !=  null && this.right  ==  null ==> ((this.left.color  ==  false) && (this.left.blackHeight  ==  1) && (this.blackHeight  ==  1))) && (this.left  ==  null && this.right  !=  null ==> ((this.right.color  ==  false) && (this.right.blackHeight  ==  1) && (this.blackHeight  ==  1))) && (this.left  !=  null && this.right  !=  null && this.left.color  ==  false && this.right.color  ==  false ==> ((this.left.blackHeight  ==  this.right.blackHeight) && (this.blackHeight  ==  this.left.blackHeight))) && (this.left  !=  null && this.right  !=  null && this.left.color  ==  true && this.right.color  ==  true ==> ((this.left.blackHeight  ==  this.right.blackHeight) && (this.blackHeight  ==  this.left.blackHeight + 1))) && (this.left  !=  null && this.right  !=  null && this.left.color  ==  false && this.right.color  ==  true ==> ((this.left.blackHeight  ==  this.right.blackHeight + 1) && (this.blackHeight  ==  this.left.blackHeight))) && (this.left  !=  null && this.right  !=  null && this.left.color  ==  true && this.right.color  ==  false ==> ((this.right.blackHeight  ==  this.left.blackHeight + 1) && (this.blackHeight  ==  this.right.blackHeight)));
	  @*/

	  public TreeSetEntry() {
	  }
	  
}
