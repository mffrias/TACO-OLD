package SourcesCristianOntivero;

/*@nullable_by_default@*/
public class TreeNode {
     public TreeNode left, right;
     public int data;
 
     public TreeNode()
     {
         left = null;
         right = null;
         data = 0;
     }
     
     public TreeNode(int n)
     {
         left = null;
         right = null;
         data = n;
     }
     
     public void setLeft(TreeNode n)
     {
         left = n;
     }
     
     public void setRight(TreeNode n)
     {
         right = n;
     }
     
     public TreeNode getLeft()
     {
         return left;
     }
     
     public TreeNode getRight()
     {
         return right;
     }
     
     public void setData(int d)
     {
         data = d;
     }
     
     public int getData()
     {
         return data;
     }     
 }