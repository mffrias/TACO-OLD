package ar.edu.taco.skunk;

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

  public /*@ nullable @*/ ar.edu.taco.skunk.TreeSetEntry ar_edu_taco_skunk_TreeSetEntry_left;
  public /*@ nullable @*/ ar.edu.taco.skunk.TreeSetEntry ar_edu_taco_skunk_TreeSetEntry_right;
  public /*@ nullable @*/ ar.edu.taco.skunk.TreeSetEntry ar_edu_taco_skunk_TreeSetEntry_parent;
  public int ar_edu_taco_skunk_TreeSetEntry_key;
  public int ar_edu_taco_skunk_TreeSetEntry_color;

  public TreeSetEntry() {
    this.ar_edu_taco_skunk_TreeSetEntry_left = ((ar.edu.taco.skunk.TreeSetEntry)(null));
    this.ar_edu_taco_skunk_TreeSetEntry_right = ((ar.edu.taco.skunk.TreeSetEntry)(null));
    this.ar_edu_taco_skunk_TreeSetEntry_parent = ((ar.edu.taco.skunk.TreeSetEntry)(null));
    this.ar_edu_taco_skunk_TreeSetEntry_key = (byte)0;
    this.ar_edu_taco_skunk_TreeSetEntry_color = (byte)0;
    {
    }
  }

}
