package SourcesPabloPauli;

/*@ nullable_by_default @*/
public class SecondAVLNode {
	
	
	public /*@ nullable @*/ SecondAVLNode left, right, parent;
	 public int value, height;
	 public Object object; //enable the AVLTree to store additional info
	  
	 public SecondAVLNode(int value){
	  this.value = value;
	  this.height = 0;
	 }
	  
	 public SecondAVLNode(int value, Object object){
	  this.value = value;
	  this.height = 0;
	  this.object = object;
	 }
	  
	 public SecondAVLNode(SecondAVLNode node){
	  this.value = node.value;
	  this.height = node.height;
	  this.left = node.left;
	  this.right = node.right;
	 }
	  
	 public Object getObject() {
	  return object;
	 }
	 
	 public void setObject(Object object) {
	  this.object = object;
	 }
	  
	 public int getValue(){
	  return value;
	 }
	  
	 public SecondAVLNode getParent() {
	  return parent;
	 }
	  
	 public SecondAVLNode getLeft() {
	  return left;
	 }
	  
	 public void setLeft(SecondAVLNode left){
	  this.left = left;
	  if (left != null)
	   left.parent = this;
	 }
	  
	 public SecondAVLNode getRight() {
	  return right;
	 }
	  
	 public void setRight(SecondAVLNode right){
	  this.right = right;
	  if (right != null)
	   right.parent = this;
	 }
	  
	 public int getHeight() {
	  return height;
	 }
	  
	 public int getLevel(){
	  int level = 0;
	  SecondAVLNode currentNode = this;
	  while ((currentNode = currentNode.parent) != null)
	   level++;
	  return level;
	 }
	  
	 public int getBalanceFactor(){
	  int leftHeight = getLeftHeight();
	  int rightHeight = getRightHeight();
	  return leftHeight - rightHeight;
	 }
	  
	 public void insertToLeaf(SecondAVLNode node){
	  if (node.value == value){
//	   System.out.println("Duplicate node " + value);
	   return;
	  }
	  else {
	   if (node.value < value){
	    if (left == null)   setLeft(node);
	    else left.insertToLeaf(node);
	   }
	   else {
	    if (right == null) setRight(node);
	    else right.insertToLeaf(node);
	   }
	  }
	 }
	  
	  
	 /**rotate right
	  * change of height should be added;
	  * applies to the LL type situation
	  */
	 public SecondAVLNode rotateRight(){
	  SecondAVLNode newRight = new SecondAVLNode(this);
	  newRight.height = getRightHeight() + 1;
	  newRight.setLeft(left.right);
	  left.setRight(newRight);
	  left.adjustHeight();
	  return left;
	 }
	 
	 /**
	  * rotate left
	  * change of height should be added;
	  * applies to the LL type situation
	  */
	 public SecondAVLNode rotateLeft(){
	  SecondAVLNode newLeft = new SecondAVLNode(this);
	  newLeft.height = getLeftHeight() + 1;
	  newLeft.setRight(right.left);
	  right.setLeft(newLeft);
	  right.adjustHeight();
	  return right;
	 }
	  
	 public void adjustHeight(){
	  int leftHeight = getLeftHeight();
	  int rightHeight = getRightHeight();
	  height = (leftHeight > rightHeight) ? leftHeight + 1 : rightHeight + 1;
	 }
	  
	 public int getLeftHeight(){
	  return left == null ? -1 : left.height;
	 }
	  
	 public int getRightHeight(){
	  return right == null ? -1 : right.height;
	 }
	  
	 public boolean isLeaf(){
	  return left == null && right == null;
	 }
	  
	 public SecondAVLNode getLeftmost(){
	  SecondAVLNode leftmost = this;
	  while (leftmost.left != null)
	   leftmost = leftmost.left;
	  return leftmost;
	 }
	  
	 public SecondAVLNode getRightmost(){
	  SecondAVLNode rightmost = this;
	  while (rightmost.right != null)
	   rightmost = rightmost.right;
	  return rightmost;
	 }
}
