package roops.core.objects;

//@ model import org.jmlspecs.lang.*;


public class TreeSetEntry extends java.lang.Object {

  public int roops_core_objects_TreeSetEntry_key;
  public /*@ nullable @*/ roops.core.objects.TreeSetEntry roops_core_objects_TreeSetEntry_parent;
  public boolean roops_core_objects_TreeSetEntry_color;
  public /*@ nullable @*/ roops.core.objects.TreeSetEntry roops_core_objects_TreeSetEntry_left;
  public /*@ nullable @*/ roops.core.objects.TreeSetEntry roops_core_objects_TreeSetEntry_right;

  /*@ public model int roops_core_objects_TreeSetEntry_blackHeight;
    @*/
  /*@ represents roops_core_objects_TreeSetEntry_blackHeight \such_that ((this.roops_core_objects_TreeSetEntry_left  ==  null && this.roops_core_objects_TreeSetEntry_right  ==  null) ==> (this.roops_core_objects_TreeSetEntry_blackHeight  ==  1)) && (this.roops_core_objects_TreeSetEntry_left  !=  null && this.roops_core_objects_TreeSetEntry_right  ==  null ==> ((this.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_color  ==  false) && (this.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_blackHeight  ==  1) && (this.roops_core_objects_TreeSetEntry_blackHeight  ==  1))) && (this.roops_core_objects_TreeSetEntry_left  ==  null && this.roops_core_objects_TreeSetEntry_right  !=  null ==> ((this.roops_core_objects_TreeSetEntry_right.roops_core_objects_TreeSetEntry_color  ==  false) && (this.roops_core_objects_TreeSetEntry_right.roops_core_objects_TreeSetEntry_blackHeight  ==  1) && (this.roops_core_objects_TreeSetEntry_blackHeight  ==  1))) && (this.roops_core_objects_TreeSetEntry_left  !=  null && this.roops_core_objects_TreeSetEntry_right  !=  null && this.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_color  ==  false && this.roops_core_objects_TreeSetEntry_right.roops_core_objects_TreeSetEntry_color  ==  false ==> ((this.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_blackHeight  ==  this.roops_core_objects_TreeSetEntry_right.roops_core_objects_TreeSetEntry_blackHeight) && (this.roops_core_objects_TreeSetEntry_blackHeight  ==  this.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_blackHeight))) && (this.roops_core_objects_TreeSetEntry_left  !=  null && this.roops_core_objects_TreeSetEntry_right  !=  null && this.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_color  ==  true && this.roops_core_objects_TreeSetEntry_right.roops_core_objects_TreeSetEntry_color  ==  true ==> ((this.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_blackHeight  ==  this.roops_core_objects_TreeSetEntry_right.roops_core_objects_TreeSetEntry_blackHeight) && (this.roops_core_objects_TreeSetEntry_blackHeight  ==  this.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_blackHeight + 1))) && (this.roops_core_objects_TreeSetEntry_left  !=  null && this.roops_core_objects_TreeSetEntry_right  !=  null && this.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_color  ==  false && this.roops_core_objects_TreeSetEntry_right.roops_core_objects_TreeSetEntry_color  ==  true ==> ((this.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_blackHeight  ==  this.roops_core_objects_TreeSetEntry_right.roops_core_objects_TreeSetEntry_blackHeight + 1) && (this.roops_core_objects_TreeSetEntry_blackHeight  ==  this.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_blackHeight))) && (this.roops_core_objects_TreeSetEntry_left  !=  null && this.roops_core_objects_TreeSetEntry_right  !=  null && this.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_color  ==  true && this.roops_core_objects_TreeSetEntry_right.roops_core_objects_TreeSetEntry_color  ==  false ==> ((this.roops_core_objects_TreeSetEntry_right.roops_core_objects_TreeSetEntry_blackHeight  ==  this.roops_core_objects_TreeSetEntry_left.roops_core_objects_TreeSetEntry_blackHeight + 1) && (this.roops_core_objects_TreeSetEntry_blackHeight  ==  this.roops_core_objects_TreeSetEntry_right.roops_core_objects_TreeSetEntry_blackHeight)));
    @*/

  public TreeSetEntry() {
    this.roops_core_objects_TreeSetEntry_key = (byte)0;
    this.roops_core_objects_TreeSetEntry_parent = ((roops.core.objects.TreeSetEntry)(null));
    this.roops_core_objects_TreeSetEntry_color = false;
    this.roops_core_objects_TreeSetEntry_left = ((roops.core.objects.TreeSetEntry)(null));
    this.roops_core_objects_TreeSetEntry_right = ((roops.core.objects.TreeSetEntry)(null));
    {
    }
  }

}
