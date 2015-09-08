package SourcesEstebanPintos;

/*@nullable_by_default@*/
public class AVLStack2 {
	public int maxSize = 100;
	public  Node[] stackArray;
	public int top;
	
	public AVLStack2() {
		stackArray = new Node[maxSize];
		top = -1;
	}

	public void push(Node j) {
		top = top + 1;
		stackArray[top] = j;
	}

	public Node pop() {
		Node ret = stackArray[top];
		top = top - 1;
		return ret;
	}
	
	public Node peek() {
		return stackArray[top];
	}


	public boolean empty() {
		return top == -1;
	}

}
