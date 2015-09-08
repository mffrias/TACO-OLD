package SourcesCristianOntivero;


public class BST
{
	/*@ invariant (\forall TreeNode n;
    @     \reach(root, TreeNode, left + right).has(n) == true;
    @     \reach(n.right, TreeNode, right + left).has(n) == false &&
    @     \reach(n.left, TreeNode, left + right).has(n) == false);
    @
    @ invariant (\forall TreeNode n; 
    @     \reach(root, TreeNode, left + right).has(n) == true;
    @     (\forall TreeNode m; 
    @     \reach(n.left, TreeNode, left + right).has(m) == true;
    @     m.data <= n.data) &&
    @     (\forall TreeNode m;
    @     \reach(n.right, TreeNode, left + right).has(m) == true;
    @     m.data > n.data));
    @*/
	public /*@nullable@*/ TreeNode root;

	public BST()
	{
		root = null;
	}
	public boolean isEmpty()
	{
		return root == null;
	}

	/*@ requires true;
    @ ensures (\exists TreeNode n;
    @     \reach(root, TreeNode, left + right).has(n) == true;
    @     n.data == data);
    @*/
	public int insert(int data)
	{
		//		root = insertRec(root, data);
		int data2 = 0;
		do  {
			if (data > 0){
				int a = 7;
				a = 9;
			}	
		} while (data > 0);
		
//		while (data == data){
//			data--;
//		}
		return data;
	}

	public TreeNode insertRec(TreeNode node, int data)
	{
		if (node == null)
			node = new TreeNode(data);
		else
		{
			if (data <= node.getData())
				node.left = insertRec(node.left, data);
			else
				node.right = insertRec(node.right, data);
		}
		return node;
	}

	public void delete(int k)
	{
		if(!isEmpty() && search(k))
			root = deleteRec(root, k);
	}

	private TreeNode deleteRec(TreeNode root, int k)
	{
		TreeNode p, p2, n;
		if (root.getData() == k)
		{
			TreeNode lt, rt;
			lt = root.getLeft();
			rt = root.getRight();
			if (lt == null && rt == null)
				return null;
			else if (lt == null)
			{
				p = rt;
				return p;
			}
			else if (rt == null)
			{
				p = lt;
				return p;
			}
			else
			{
				p2 = rt;
				p = rt;
				while (p.getLeft() != null)
					p = p.getLeft();
				p.setLeft(lt);
				return p2;
			}
		}
		if (k < root.getData())
		{
			n = deleteRec(root.getLeft(), k);
			root.setLeft(n);
		}
		else
		{
			n = deleteRec(root.getRight(), k);
			root.setRight(n);             
		}
		return root;
	}

	public boolean search(int val)
	{
		return searchRec(root, val);
	}

	private boolean searchRec(TreeNode r, int val)
	{
		boolean found = false;
		while ((r != null) && !found)
		{
			int rval = r.getData();
			if (val < rval)
				r = r.getLeft();
			else if (val > rval)
				r = r.getRight();
			else
			{
				return true;	
			}
			found = searchRec(r, val);
		}
		return found;
	}
}