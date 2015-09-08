package ejercicios;

/*@nullable_by_default@*/
public class AVLNode {
	 public AVLNode left;
	 public AVLNode right;
	 public AVLNode parent;
	 public int value;

	 public AVLNode(int value) {
		 left = right = parent = null;
		 this.value = value;
	 }
	 
	 public AVLNode(int value, AVLNode parent){
		 this.value = value;
		 this.parent = parent;
	 }
	
}

