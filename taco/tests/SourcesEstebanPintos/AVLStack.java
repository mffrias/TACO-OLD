package SourcesEstebanPintos;

/*@nullable_by_default@*/
public class AVLStack {
	public int maxSize;
	public /*@nullable@*/ AVLNode[] stackArray;
	public int top;
	
	public AVLStack() {
	}

	public AVLStack(int s) {
		maxSize = s;
		stackArray = new AVLNode[maxSize];
		top = -1;
	}

	public void push(AVLNode j) {
		stackArray[top] = j;
	}

	public AVLNode pop() {
		AVLNode ret = stackArray[top];
		top = top - 1;
		return ret;
	}


	public boolean isEmpty() {
		return top == -1;
	}

}
