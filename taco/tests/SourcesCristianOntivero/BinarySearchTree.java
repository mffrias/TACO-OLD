package SourcesCristianOntivero;

/*@ nullable_by_default @*/
public class BinarySearchTree {
	/*@ invariant (\forall BSTNode n;
	  @ 		\reach(root, BSTNode, left + right).has(n) == true;
	  @ 		\reach(n.right, BSTNode, right + left).has(n) == false &&
	  @ 		\reach(n.left, BSTNode, left + right).has(n) == false);
	  @*/

	/*@ invariant (\forall BSTNode n; 
	  @		\reach(root, BSTNode, left + right).has(n) == true;
	  @		(\forall BSTNode m; \reach(n.left, BSTNode, left + right).has(m) == true; m.elem <= n.elem) &&
	  @		(\forall BSTNode m; \reach(n.right, BSTNode, left + right).has(m) == true; m.elem > n.elem));
	  @*/

	// No puedo usarla private
	// Field "root" (private visibility) can not be referenced in a
	// specification context of "package" visibility [JML]
	public BSTNode root;

	public BinarySearchTree() {
		root = null;
	}

	//	public static int testField;

	/*@ requires true;
	  @ ensures true;
	  @*/
	public void insert(int elem) {
		BSTNode current = root;
		BSTNode previous = root;


		if (root == null) {
			root = new BSTNode(elem);
			return;
		}

		boolean comparison;
		while (current != null) {

			comparison = current.elem < elem;
			previous = current;
			if (comparison) current = current.right;
			else current = current.left;
		}
		if (previous.elem < elem) previous.right = new BSTNode(elem);
		else previous.left = new BSTNode(elem);
	}

	/*@
	  @ requires true;
	  @ ensures \old(\reach(root, BSTNode, left + right)).int_size() == 
	  		\reach(root, BSTNode, left + right).int_size();
	  @*/
	public boolean contains(int elem) {
		if (root == null) return false;

		//insert(elem);
		BSTNode current = root;
		int comparison;
		while (current != null) {
			comparison = current.elem - elem;
			if (comparison < 0) current = current.right;
			else if (comparison > 0) current = current.left;
			else return true;
		}
		return false;
	}

	/*@
	  @ requires (\forall BSTNode n; \reach(root, BSTNode, left+right).has(n) == true; n.elem >= 0 && n.elem < 2);   
	  @ requires true;
	  @*/
	public void delete(int elem){
		BSTNode current = root;
		BSTNode previous = null;

		/* Todo anidado dentro del if ya que TACO parece no soportar return; */
		if(current != null){
			while(current != null && current.elem != elem){
				previous = current;
				if(current.elem > elem) 
					current = current.left;
				else current = current.right;
			}
			if(current != null){
				if(current.left == null && current.right == null){
					if(previous == null) root = null;
					else if(previous.elem > elem) 
						previous.left = null;
					else 
						previous.right = null;
				}else if(current.left == null){
					/* Faltaba este if, por lo que detectaba error taco */
					if(previous == null) 
						root = current.right;
					else if(previous.elem > elem) 
						previous.left = current.right;
					else 
						previous.right = current.right;
				}else if(current.right == null){
					/* Faltaba este if, por lo que detectaba error taco */
					if(previous == null) root = current.left;
					else if(previous.elem > elem) 
						previous.left = current.left;
					else 
						previous.right = current.left;
				}else{
					BSTNode inOrderSucc = current.right;
					previous = null;
					while(inOrderSucc.left != null){
						previous = inOrderSucc;
						inOrderSucc = inOrderSucc.left;
					}
					current.elem = inOrderSucc.elem;
					if(previous == null) 
						current.right = inOrderSucc.right;
					else 
						previous.left = inOrderSucc.right;
				}
			}
		}
	}

	//	public static void printInOrder(BSTNode node) {
	//		if (node != null) {
	//			printInOrder(node.left);
	//			System.out.print(node.elem + " ");
	//			printInOrder(node.right);
	//
	//		}
	//	}
	//
	//	public static void main(String args[]) {
	//		BinarySearchTree bst = new BinarySearchTree();
	//
	//		SourcesCristianOntivero.BSTNode BSTNode_1 = new SourcesCristianOntivero.BSTNode();
	//		SourcesCristianOntivero.BSTNode BSTNode_2 = new SourcesCristianOntivero.BSTNode();
	//
	//        int elem_Integer_1 = 2119168;
	//        
	//        bst.root = BSTNode_1;
	//        
	//        BSTNode_1.elem = -2147216384;
	//        BSTNode_1.left = null;
	//        BSTNode_1.right = null;
	//    
	//        BSTNode_2.elem = 2119168;
	//        BSTNode_2.right = null;
	//        BSTNode_2.left = null;
	//        
	//      
	//
	//        printInOrder(bst.root);
	//        System.out.println("");
	//        bst.insert(elem_Integer_1,BSTNode_2);
	//        printInOrder(bst.root);
	//
	//
	//	}


	//	public static void main(String[] args) {
	//		BinarySearchTree bst = new BinarySearchTree();
	//		BSTNode n1 = new BSTNode();
	//		BSTNode n2 = new BSTNode();
	//		BSTNode n3 = new BSTNode();
	//		BSTNode n4 = new BSTNode();
	//		bst.root = n1;
	//		n1.left = n2;
	//		n1.right = n3;
	//		n1.elem = 244808295;
	//		n2.left = null;
	//		n2.right = null;
	//		n2.elem = 244808295;
	//		n3.left = n4;
	//		n3.right = null;
	//		n3.elem = 246903398;
	//		n4.left = null;
	//		n4.right = null;
	//		n4.elem = 246903398;
	//		int dato = 244808295;
	//		printInOrder(bst.root);
	//		System.out.println("");
	//		System.out.println("----------------");
	//		bst.delete(dato);
	//		printInOrder(bst.root);
	//	}
}