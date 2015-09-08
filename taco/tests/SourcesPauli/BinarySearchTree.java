package SourcesPauli;

public class BinarySearchTree {
	 /*@ invariant (\forall BSTNode n; \reach(root, BSTNode, left + right).has(n) == true;
	  @ \reach(n.right, BSTNode, right + left).has(n) == false &&
	  @ \reach(n.left, BSTNode, left + right).has(n) == false); 
	  @*/
	
	/*@ invariant (\forall BSTNode n; 
	  @ n.right == null || n.right.elem > n.elem && 
	  @ n.left == null || n.left.elem <= n.elem);
	@*/


	// Field "root" (private visibility) can not be referenced in a specification context of "package" visibility [JML]
    public /*@ nullable @*/ BSTNode root;
    public int size;

    public BinarySearchTree(){
    	root = null;
    }
    
    
    
    /*@
      @ requires true;
      @ ensures \old(size) + 1 == size;
      @ ensures \reach(root, BSTNode, right + left).int_size() == size+1;
      @ ensures (\forall BSTNode n; \old(\reach(root, BSTNode, right + left)).has(n) == true; \reach(root, BSTNode, right + left).has(n) == true);
      @ ensures (\exists BSTNode n; n.elem == elem && \reach(root, BSTNode, left + right).has(n) == true);
      @*/
    public void add(int elem){
    	BSTNode current = root;
    	BSTNode previous = root;
    	
    	if(root == null){
    		size++;
    		root = new BSTNode(elem);
    		return;
    	}
    	while(current != null){
    		int comparison = current.elem - elem;
    		previous = current;
            if(comparison < 0){
            	current = current.right;
            }else{
            	current = null;
            }
    	}
    	if(previous.elem - elem < 0){
    		previous.right = new BSTNode(elem);
    	}else previous.left = new BSTNode(elem);
    	size++;
    	return;
    }
    
    /*@ 
	  @ requires true;
	  @ ensures \old(size) == size;
	  @ ensures ((\result == true) ==> (\exists BSTNode n; n.elem == elem && \reach(root, BSTNode, left + right).has(n) == true));
	  @*/
    public boolean contains(int elem){
    	if(root == null) return false;
    	
    	BSTNode current = root;
    	int comparison;
    	while(current != null){
    		comparison = current.elem - elem;
    		if(comparison < 0) current = current.right;
    		else if(comparison > 0) current = current.left;
    		else return true;
    	}
    	return false;
    }
}