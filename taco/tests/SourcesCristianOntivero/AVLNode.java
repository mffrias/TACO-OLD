package SourcesCristianOntivero;

/*@ nullable_by_default @*/
public class AVLNode {
	 public AVLNode left, right, parent; 
	 public int value;
	 public int height;

	 public AVLNode(int value) {
		 left = right = parent = null;
		 this.value = value;
	 }
	 
	 public AVLNode(int value, AVLNode parent){
		 this.value = value;
		 this.parent = parent;
	 }
}

