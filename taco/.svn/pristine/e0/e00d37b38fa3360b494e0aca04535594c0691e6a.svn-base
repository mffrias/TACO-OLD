package examples.treeset;

//@ model import org.jmlspecs.lang.*;

/** @SpecField blackHeight : int from this.left, this.right |
 (
		( this.left=null && this.right=null => this.blackHeight=1 ) && 
		( this.left!=null && this.right=null => ( 
		        ( ( this in this.left.*(left@+right)@-null ) => this.blackHeight=0 ) && 
		        ( ( this !in this.left.*(left@+right)@-null ) => ( 
		                ( this.left.color=true  => this.blackHeight=this.left.blackHeight +1 ) && 
		                ( this.left.color=false => this.blackHeight=this.left.blackHeight )  
		         ))
		                                        )) && 
		( this.left=null && this.right!=null => ( 
		        ( ( this in this.right.*(left@+right)@-null ) => this.blackHeight=0 ) && 
		        ( ( this !in this.right.*(left@+right)@-null ) => ( 
		                ( this.right.color=true  => this.blackHeight=this.right.blackHeight +1 ) && 
		                ( this.right.color=false => this.blackHeight=this.right.blackHeight )  
		         ))
		                                        )) &&
 
		( this.left!=null && this.right!=null => ( 
		        ( ( this in this.^(left@+right)@-null ) => this.blackHeight=0 ) && 
		        ( ( this !in this.^(left@+right)@-null ) => ( 
		                ( this.left.color=true  => this.blackHeight=this.left.blackHeight +1 ) && 
		                ( this.left.color=false => this.blackHeight=this.left.blackHeight )  
		                                        ))
		         ))                                  
 ) ;
*/
public class TreeSetEntry extends java.lang.Object {

  int examples_treeset_TreeSetEntry_key;
  /*@ nullable @*/ examples.treeset.TreeSetEntry examples_treeset_TreeSetEntry_left;
  /*@ nullable @*/ examples.treeset.TreeSetEntry examples_treeset_TreeSetEntry_right;
  /*@ nullable @*/ examples.treeset.TreeSetEntry examples_treeset_TreeSetEntry_parent;
  boolean examples_treeset_TreeSetEntry_color;

  public TreeSetEntry() {
    this.examples_treeset_TreeSetEntry_key = (byte)0;
    this.examples_treeset_TreeSetEntry_left = ((examples.treeset.TreeSetEntry)(null));
    this.examples_treeset_TreeSetEntry_right = ((examples.treeset.TreeSetEntry)(null));
    this.examples_treeset_TreeSetEntry_parent = ((examples.treeset.TreeSetEntry)(null));
    this.examples_treeset_TreeSetEntry_color = true;
    {
    }
  }


  TreeSetEntry(int key, examples.treeset.TreeSetEntry parent) {
    this.examples_treeset_TreeSetEntry_key = (byte)0;
    this.examples_treeset_TreeSetEntry_left = ((examples.treeset.TreeSetEntry)(null));
    this.examples_treeset_TreeSetEntry_right = ((examples.treeset.TreeSetEntry)(null));
    this.examples_treeset_TreeSetEntry_parent = ((examples.treeset.TreeSetEntry)(null));
    this.examples_treeset_TreeSetEntry_color = true;
    {
      this.examples_treeset_TreeSetEntry_key = key;
      this.examples_treeset_TreeSetEntry_parent = parent;
    }
  }
/** Returns the key.
 @return the key.
*/

  public int getKey() {
    return this.examples_treeset_TreeSetEntry_key;
  }


  public int hashCode() {
    return this.examples_treeset_TreeSetEntry_key;
  }

}
