package SourcesEstebanPintos;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class AVLStack2 extends java.lang.Object {

  public int SourcesEstebanPintos_AVLStack2_maxSize;
  public SourcesEstebanPintos.Node[] SourcesEstebanPintos_AVLStack2_stackArray;
  public int SourcesEstebanPintos_AVLStack2_top;

  public AVLStack2() {
    this.SourcesEstebanPintos_AVLStack2_maxSize = 100;
    this.SourcesEstebanPintos_AVLStack2_top = (byte)0;
    {
      SourcesEstebanPintos.Node[] t_48;

      t_48 = new SourcesEstebanPintos.Node[this.SourcesEstebanPintos_AVLStack2_maxSize];
      this.SourcesEstebanPintos_AVLStack2_stackArray = t_48;
      this.SourcesEstebanPintos_AVLStack2_top = -1;
    }
  }


  public void push(SourcesEstebanPintos.Node j) {
    SourcesEstebanPintos.Node param_j_9;

    param_j_9 = j;
    {
      this.SourcesEstebanPintos_AVLStack2_top = this.SourcesEstebanPintos_AVLStack2_top + 1;
      this.SourcesEstebanPintos_AVLStack2_stackArray[this.SourcesEstebanPintos_AVLStack2_top] = param_j_9;
    }
  }


  public SourcesEstebanPintos.Node pop() {
    {
      SourcesEstebanPintos.Node t_49;

      t_49 = this.SourcesEstebanPintos_AVLStack2_stackArray[this.SourcesEstebanPintos_AVLStack2_top];
      SourcesEstebanPintos.Node var_13_ret = t_49;

      this.SourcesEstebanPintos_AVLStack2_top = this.SourcesEstebanPintos_AVLStack2_top - 1;

      return var_13_ret;
    }
  }


  public SourcesEstebanPintos.Node peek() {
    {
      SourcesEstebanPintos.Node t_50;

      t_50 = this.SourcesEstebanPintos_AVLStack2_stackArray[this.SourcesEstebanPintos_AVLStack2_top];

      return t_50;
    }
  }


  public boolean empty() {
    {
      boolean t_51;

      t_51 = this.SourcesEstebanPintos_AVLStack2_top  ==  -1;

      return t_51;
    }
  }

}
