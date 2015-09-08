package SourcesPauli;

// URL http://codereview.stackexchange.com/questions/31994/creating-a-binary-search-tree

/*@ nullable_by_default @*/
public class TreeNode {
	
    public /*@ nullable @*/ TreeNode left;
    public int item;
    public /*@ nullable @*/ TreeNode right;

    public TreeNode(TreeNode left, int item, TreeNode right) {
        this.left = left;
        this.right = right;
        this.item = item; 
    }
}