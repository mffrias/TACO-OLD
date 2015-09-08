package SourcesPauli;

//URL http://moderntone.blogspot.com.ar/2013/05/implementation-of-avl-tree-java-library.html


public class SecondAVLTree {
	
	/*@ invariant (\forall SecondAVLNode n;
	@\reach(root, SecondAVLNode, left + right).has(n) == true;
	@\reach(n.right, SecondAVLNode, right + left).has(n) == false &&
	@\reach(n.left, SecondAVLNode, left + right).has(n) == false);
  	@*/
	/*@ invariant (\forall SecondAVLNode n; n.right == null || n.right.value > n.value 
  	@	&& n.left == null || n.left.value <= n.value);
  	@*/

/*@ invariant (\forall SecondAVLNode n;
@     \reach(root, SecondAVLNode, left + right).has(n) == true;
@     (\forall SecondAVLNode m; \reach(n.left, SecondAVLNode, left + right).has(m) == true; m.value <= n.value) &&
@     (\forall SecondAVLNode m; \reach(n.right, SecondAVLNode, left + right).has(m) == true; m.value > n.value));
@ invariant (\forall SecondAVLNode n;
@     \reach(root, SecondAVLNode, left + right).has(n) == true;
@     n.left.height < n.right.height ==> n.height == n.right.height + 1);
@ invariant (\forall SecondAVLNode n;
@     \reach(root, SecondAVLNode, left + right).has(n) == true;
@     n.left.height >= n.right.height ==> n.height == n.left.height + 1);
@ invariant (\forall SecondAVLNode n;
@     \reach(root, SecondAVLNode, left + right).has(n) == true;
@     (n.left != null && n.right != null ==>
@     n.left.height - n.right.height < 2 && n.left.height -n.right.height > -2) &&
@     (n.left == null && n.right == null ==> n.height == 0) &&
@     (n.left == null && n.right != null ==> -n.right.height > -2) &&
@     (n.left != null && n.right == null ==> n.left.height < 2));
@ invariant root.parent == null;
@ invariant (\forall SecondAVLNode n;
@     \reach(root, SecondAVLNode, left + right).has(n) == true;
@     (n.right != null ==> n.right.parent == n) &&
@     (n.left != null ==> n.left.parent == n));
@*/
		 
		 public /*@ nullable @*/ SecondAVLNode root;
		 
		 public SecondAVLTree(int values[]) {
		  for (int i=0; i<values.length;i++)
		   insert(values[i]);
		 }
		 
		 public SecondAVLNode getRoot() {
		  return root;
		 }
		 
		 public void insert(SecondAVLNode node){
		  if (root == null)
		   root = node;
		  else {
		   root.insertToLeaf(node);
		   SecondAVLNode keyNode = updateHeightsAndDetectKeyNode(node);
		   if (keyNode != null) // rotate to adjust the tree
		    adjustTreeByRotation(keyNode);
		  }
		 }
		  
		 
			/*@
		  @ requires true;
		  @ ensures (\forall SecondAVLNode n;
		    	\old(\reach(root, SecondAVLNode, right + left)).has(n) == true;
		        \reach(root, SecondAVLNode, right + left).has(n) == true);
		  @ ensures (\exists SecondAVLNode n;
		   		n.value == value && 
		   		\reach(root, SecondAVLNode, left + right).has(n) == true);
		  @*/
		 public void insert(int value){
		  if (root == null)
		   root = new SecondAVLNode(value);
		  else {
		   SecondAVLNode newNode = new SecondAVLNode(value);
		   root.insertToLeaf(newNode);
		   SecondAVLNode keyNode = updateHeightsAndDetectKeyNode(newNode);
		   if (keyNode != null) // rotate to adjust the tree
		    adjustTreeByRotation(keyNode);
		  }
		 }
		 
		 public void delete(SecondAVLNode node){
		  int value = node.value;
		  delete(value);
		 }
		  
		 
		 /*@ requires true;
		  *@ ensures (\exists SecondAVLNode n; true; 
		  *@ \old(\reach(root, SecondAVLNode, left + right)).has(n) && n.value == value ==> 
		  *@ (\reach(root, SecondAVLNode, left + right).has(n) == false && 
		  *@ (\forall SecondAVLNode m; \old(\reach(root, SecondAVLNode, left + right)).has(m) && 
		  *@ m != n; \reach(root, SecondAVLNode, left + right).has(m)))); 
		  *@*/
		 public void delete(int value) {
		  SecondAVLNode parentOfDeletedLeaf = deleteBeforeAdjustment(value);
		  if (parentOfDeletedLeaf != null) {
		   SecondAVLNode keyNode = detectKeyNode(parentOfDeletedLeaf);
		   if (keyNode != null){
		    SecondAVLNode newkeyNode = adjustTreeByRotation(keyNode);
		    updateHeights(newkeyNode.parent);
		   }
		 }
		 }
		 
		 public SecondAVLNode detectKeyNode(SecondAVLNode parentOfDeletedLeaf){
		  SecondAVLNode currentNode = parentOfDeletedLeaf;
		  while (currentNode != null) {
		   int bf = currentNode.getBalanceFactor();
		   if (bf == 2 || bf == -2)
		    return currentNode;
		   else
		    currentNode = currentNode.parent;
		  }
		  return null;
		 }
		  
		 public SecondAVLNode deleteBeforeAdjustment(int value) {
		  SecondAVLNode currentNode = root;
		  boolean flag = true;
		  while (currentNode != null && flag) {
		   if (currentNode.value == value)
		    flag = false;
		   else
		    currentNode = value < currentNode.value ?
		     currentNode.left : currentNode.right;
		  }
		 
		  if (currentNode != null) {
		   while (!currentNode.isLeaf()) {
		    SecondAVLNode replacement = currentNode.getBalanceFactor() < 0 ?
		     currentNode.right.getLeftmost() : currentNode.left.getRightmost();
		    currentNode.value = replacement.value;
		    currentNode = replacement;
		   }
		 
		   SecondAVLNode parent = currentNode.getParent();
		   if (parent == null) root = null;
		   else if (currentNode == parent.left)
		    parent.setLeft(null);
		   else
		    parent.setRight(null);
		   updateHeights(parent);
		   return parent;
		  }
		  return null;
		 }
		 
		 public void updateHeights(SecondAVLNode fromParentOfDeletedLeaf){
		  SecondAVLNode currentNode = fromParentOfDeletedLeaf;
		  currentNode.adjustHeight();
		  while (currentNode != null){
		   currentNode.adjustHeight();
		   currentNode = currentNode.parent;
		  }
		 }
		  
		 /**
		  * called by insert(int) keyNode: the node closest to the newly inserted
		  * node where |BF|>1
		  * @param newNode : newly added leaf SecondAVLNode
		  * @return keyNode
		  */
		 public SecondAVLNode updateHeightsAndDetectKeyNode(SecondAVLNode newNode) {
		  SecondAVLNode keyNode = null;
		  boolean flag = true;
		  while (newNode.parent != null && flag) {
		   if (newNode.getParent().height - newNode.height != 1) {
		    if (keyNode == null) {
		     int bf_parent = newNode.getParent().getBalanceFactor();
		     if (bf_parent > 1 || bf_parent < -1) {
		      keyNode = newNode.getParent();
		      flag = false;
		     }
		    }
		    newNode.getParent().height++;
		    newNode = newNode.getParent();
		   } else
		    flag = false;
		  }
		  return keyNode;
		 }
		 
		 
		/*@ requires true;
		  @ ensures true;
		  @*/
		 public SecondAVLNode lookup(int value) {
		  SecondAVLNode currentNode = root;
		  while (currentNode != null) {
		   if (currentNode.value == value)
		    return currentNode;
		   else
		    currentNode = value < currentNode.value ?
		     currentNode.left : currentNode.right;
		  }
		  return null;
		 }
		 
		 /**
		  * LL or LR type if balance factor == 2; rotateRight for keyNode if bf of
		  * keyNode.left == -1, it's LR type; rotateLeft for keyNode.left first RR or
		  * RL type if balance factor == -2; rotateLeft for keyNode if bf of
		  * keyNode.right == 1, it's RL type; rotateRight for keyNode.right first
		  *
		  * @param keyNode
		  */
		 public SecondAVLNode adjustTreeByRotation(SecondAVLNode keyNode) {
		  SecondAVLNode newKeyNode = null;
		  int bf_keyNode = keyNode.getBalanceFactor();
		  if (bf_keyNode == 2) {
		   if (keyNode.left.getBalanceFactor() == -1) // LR
		    keyNode.setLeft(keyNode.left.rotateLeft());
		   newKeyNode = keyNode.rotateRight();
		  } else if (bf_keyNode == -2) {
		   if (keyNode.right.getBalanceFactor() == 1) // RL
		    keyNode.setRight(keyNode.right.rotateRight());
		   newKeyNode = keyNode.rotateLeft();
		  } else {
		   new Exception("There are some bugs").printStackTrace();
		  }
		 
		  if (keyNode.parent == null) {
		   root = newKeyNode;
		   root.parent = null;
		  }
		  else {
		   if (keyNode == keyNode.parent.left)
		    keyNode.parent.setLeft(newKeyNode);
		   else
		    keyNode.parent.setRight(newKeyNode);
		   newKeyNode.parent.adjustHeight();
		  }
		  return newKeyNode;
		 }
		 
		 
}
