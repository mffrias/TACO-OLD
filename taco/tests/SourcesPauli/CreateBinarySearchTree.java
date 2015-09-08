package SourcesPauli;

// URL http://codereview.stackexchange.com/questions/31994/creating-a-binary-search-tree


public class CreateBinarySearchTree {

	 /*@ invariant (\forall TreeNode n; \reach(root, TreeNode, left + right).has(n) == true;
	  @ \reach(n.right, TreeNode, right + left).has(n) == false &&
	  @ \reach(n.left, TreeNode, left + right).has(n) == false); 
	  @*/
	
	/*@ invariant (\forall TreeNode n; 
	  @ n.right == null || n.right.item > n.item && 
	  @ n.left == null || n.left.item <= n.item);
	@*/
	
	
	
    public /*@ nullable @*/ TreeNode root;

    public int size = 0;
    
    public CreateBinarySearchTree() {
    }

    /**
     * Will create a BST imperative on order of elements in the array
     */
    public CreateBinarySearchTree(int[] a) {
        this();
        for(int i=0; i<a.length;i++){
        	size++;
            add(i);
        }
    }


    /*@
    @ requires true;
    @ ensures \old(size) + 1 == size;
    @ ensures \reach(root, TreeNode, right + left).int_size() == size+1;
    @ ensures (\forall TreeNode n; \old(\reach(root, TreeNode, right + left)).has(n) == true; \reach(root, TreeNode, right + left).has(n) == true);
    @ ensures (\exists TreeNode n; n.item == item && \reach(root, TreeNode, left + right).has(n) == true);
    @*/
    public void add(int item) {
        if (root == null) {
        	size++;
            root = new TreeNode(null, item, null);
            return;
        }

        TreeNode node = root;
        boolean flag = true;
        while (true && flag) {
            if (item < node.item) {
                if (node.left == null) {
                    node.left = new TreeNode(null, item, null);
                    flag = false;
                }
                node = node.left;
            } else {
                if (node.right == null) {
                    node.right = new TreeNode(null, item, null);
                    flag = false;
                }
                node = node.right;
            }
        }
    }
}
