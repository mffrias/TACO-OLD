package ejercicios;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class AVLNode extends java.lang.Object {

  public ejercicios.AVLNode ejercicios_AVLNode_left;
  public ejercicios.AVLNode ejercicios_AVLNode_right;
  public ejercicios.AVLNode ejercicios_AVLNode_parent;
  public int ejercicios_AVLNode_value;

  public AVLNode(int value) {
    this.ejercicios_AVLNode_left = ((ejercicios.AVLNode)(null));
    this.ejercicios_AVLNode_right = ((ejercicios.AVLNode)(null));
    this.ejercicios_AVLNode_parent = ((ejercicios.AVLNode)(null));
    this.ejercicios_AVLNode_value = (byte)0;
    {
      ejercicios.AVLNode t_40;
      ejercicios.AVLNode t_41;

      this.ejercicios_AVLNode_parent = ((ejercicios.AVLNode)(null));
      t_40 = this.ejercicios_AVLNode_parent;
      this.ejercicios_AVLNode_right = t_40;
      t_41 = this.ejercicios_AVLNode_right;
      this.ejercicios_AVLNode_left = t_41;
      this.ejercicios_AVLNode_value = value;
    }
  }


  public AVLNode(int value, ejercicios.AVLNode parent) {
    this.ejercicios_AVLNode_left = ((ejercicios.AVLNode)(null));
    this.ejercicios_AVLNode_right = ((ejercicios.AVLNode)(null));
    this.ejercicios_AVLNode_parent = ((ejercicios.AVLNode)(null));
    this.ejercicios_AVLNode_value = (byte)0;
    {
      this.ejercicios_AVLNode_value = value;
      this.ejercicios_AVLNode_parent = parent;
    }
  }

}
