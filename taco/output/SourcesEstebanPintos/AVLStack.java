package SourcesEstebanPintos;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class AVLStack extends java.lang.Object {

  public int SourcesEstebanPintos_AVLStack_maxSize;
  public /*@ nullable @*/ SourcesEstebanPintos.AVLNode[] SourcesEstebanPintos_AVLStack_stackArray;
  public int SourcesEstebanPintos_AVLStack_top;

  public AVLStack() {
    this.SourcesEstebanPintos_AVLStack_maxSize = (byte)0;
    this.SourcesEstebanPintos_AVLStack_top = (byte)0;
    {
    }
  }


  public AVLStack(int s) {
    this.SourcesEstebanPintos_AVLStack_maxSize = (byte)0;
    this.SourcesEstebanPintos_AVLStack_top = (byte)0;
    {
      SourcesEstebanPintos.AVLNode[] t_60;

      this.SourcesEstebanPintos_AVLStack_maxSize = s;
      t_60 = new SourcesEstebanPintos.AVLNode[this.SourcesEstebanPintos_AVLStack_maxSize];
      this.SourcesEstebanPintos_AVLStack_stackArray = t_60;
      this.SourcesEstebanPintos_AVLStack_top = -1;
    }
  }


  public void push(SourcesEstebanPintos.AVLNode j) {
    this.SourcesEstebanPintos_AVLStack_stackArray[this.SourcesEstebanPintos_AVLStack_top] = j;
  }


  public SourcesEstebanPintos.AVLNode pop() {
    SourcesEstebanPintos.AVLNode t_61;

    t_61 = this.SourcesEstebanPintos_AVLStack_stackArray[this.SourcesEstebanPintos_AVLStack_top];
    SourcesEstebanPintos.AVLNode var_15_ret = t_61;

    this.SourcesEstebanPintos_AVLStack_top = this.SourcesEstebanPintos_AVLStack_top - 1;

    return var_15_ret;
  }


  public boolean isEmpty() {
    boolean t_62;

    t_62 = this.SourcesEstebanPintos_AVLStack_top  ==  -1;

    return t_62;
  }

}
