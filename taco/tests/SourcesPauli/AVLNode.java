package SourcesPauli;

/*@ nullable_by_default @*/
public class AVLNode {
	 public /*@ nullable @*/ AVLNode left; 
	 public /*@ nullable @*/ AVLNode right;
	 public /*@ nullable @*/ AVLNode parent;
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
	 
	 public void recalculateHeight(){
		 
	 }
	
}
