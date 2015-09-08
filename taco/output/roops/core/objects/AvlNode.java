package roops.core.objects;

//@ model import org.jmlspecs.lang.*;


public class AvlNode extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objects.AvlNode roops_core_objects_AvlNode_left;
  public /*@ nullable @*/ roops.core.objects.AvlNode roops_core_objects_AvlNode_right;
  public /*@ nullable @*/ roops.core.objects.AvlNode roops_core_objects_AvlNode_parent;
  public int roops_core_objects_AvlNode_key;
  public int roops_core_objects_AvlNode_height;

  public AvlNode() {
    this.roops_core_objects_AvlNode_left = ((roops.core.objects.AvlNode)(null));
    this.roops_core_objects_AvlNode_right = ((roops.core.objects.AvlNode)(null));
    this.roops_core_objects_AvlNode_parent = ((roops.core.objects.AvlNode)(null));
    this.roops_core_objects_AvlNode_key = (byte)0;
    this.roops_core_objects_AvlNode_height = (byte)0;
  }

}
