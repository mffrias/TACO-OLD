package SourcesMatiasDeSanti;

import java.util.NoSuchElementException;

import SourcesMatiasDeSanti.StrykerException;

public class RedBlackTree {
	
	/*@ 
	  @ invariant root != null ==> root.parent == null;
	  @ invariant root != null ==> root.color == 1;
	  @ invariant (\forall RedBlackNode n; \reach(root, RedBlackNode, right + left + parent).has(n) == true; 
	  @			    \reach(n.left, RedBlackNode, left + right).has(n) == false 
	  @				&&
	  @             \reach(n.right, RedBlackNode, left + right).has(n) == false 
	  @				&&
	  @				(n.left != null ==> n.left.parent == n)
	  @				&&
	  @				(n.right != null ==> n.right.parent == n)
	  @				&&
	  @				(\forall RedBlackNode m; \reach(n.left, RedBlackNode, left+right).has(m)==true; m.data < n.data)
	  @				&& 
	  @				(\forall RedBlackNode m; \reach(n.right, RedBlackNode, left+right).has(m)==true; m.data > n.data)
	  @				&&
	  @				((n.right != null || n.left != null) ==> n.right != n.left) 
	  @				&&
	  @ 		    ((n.left == null && n.right == null && n.color == 1) ==> n.blackHeight == 1)
	  @				&&
	  @ 		    ((n.left == null && n.right == null && n.color == 0) ==> n.blackHeight == 0) 
	  @				&&
	  @				((n.left != null && n.right == null && n.color == 1) ==> (n.left.color == 0 && n.left.blackHeight == 0 && n.blackHeight == 1)) 
	  @				&&
	  @				((n.left != null && n.right == null && n.color == 0) ==> (n.left.color == 0 && n.left.blackHeight == 0 && n.blackHeight == 0)) 
	  @				&&
	  @				((n.left == null && n.right != null && n.color == 1) ==> (n.right.color == 0 && n.right.blackHeight == 0 && n.blackHeight == 1)) 
	  @				&&
	  @				((n.left == null && n.right != null && n.color == 0) ==> (n.right.color == 0 && n.right.blackHeight == 0 && n.blackHeight == 0)) 
	  @				&&
	  @				((n.left != null && n.right != null && n.color == 1 && n.right.blackHeight >= n.left.blackHeight) ==> n.blackHeight == n.right.blackHeight + 1) 
	  @				&&
	  @				((n.left != null && n.right != null && n.color == 1 && n.right.blackHeight < n.left.blackHeight) ==> n.blackHeight == n.left.blackHeight + 1) 
	  @				&&
	  @				((n.left != null && n.right != null && n.color == 0 && n.right.blackHeight >= n.left.blackHeight) ==> n.blackHeight == n.right.blackHeight) 
	  @				&&
	  @				((n.left != null && n.right != null && n.color == 0 && n.right.blackHeight < n.left.blackHeight) ==> n.blackHeight == n.left.blackHeight) 
	  @				&&
	  @				((n.color == 0 && n.left != null) ==> (n.left.color == 1)) 
	  @				&&
	  @				((n.color == 0 && n.right != null) ==> (n.right.color == 1)));
	  @
	  @*/
	/*
	 */
	public RedBlackNode root;

	/**
	 * Constructs an empty tree.
	 */
	public RedBlackTree() {
		root = null;
	}

	/**
	 * Inserts a new node into the tree.
	 * 
	 * @param obj
	 *            the object to insert
	 */
	/*@ requires true;
      @ ensures (\forall RedBlackNode rbn; \reach(this.root, RedBlackNode, left+right).has(rbn); rbn.left == null);
      @ signals (NoSuchElementException e) false;
      @*/
	public void add(/*@nullable@*/ RedBlackTree t, int obj) {
		boolean flag = true;
		if (false || true)
			obj++;
		else
			obj--;
//		throw new NoSuchElementException();
//		throw new StrykerException();
		
		
//		RedBlackNode newNode = new RedBlackNode();
//		newNode.data = obj;
//		newNode.left = null;
//		newNode.right = null;
//		if (root == null) {
//			root = newNode;
//		} else {
//			root.addNode(newNode);
//		}
//		fixAfterAdd(newNode);
	}

	/**
	 * Tries to find an object in the tree.
	 * 
	 * @param obj
	 *            the object to find
	 * @return true if the object is contained in the tree
	 */
//	public boolean find(int obj) {
//		RedBlackNode current = root;
//		while (current != null) {
//			int d = current.data - obj;
//			if (d == 0)
//				return true;
//			else if (d > 0)
//				current = current.left;
//			else
//				current = current.right;
//		}
//		return false;
//	}

	/**
	 * Tries to remove an object from the tree. Does nothing if the object is
	 * not contained in the tree.
	 * 
	 * @param obj
	 *            the object to remove
	 */
//	public void remove(int obj) {
//		// Find node to be removed
//
//		RedBlackNode toBeRemoved = root;
//		boolean found = false;
//		while (!found && toBeRemoved != null) {
//			int d = toBeRemoved.data - obj;
//			if (d == 0) {
//				found = true;
//			} else {
//				if (d > 0) {
//					toBeRemoved = toBeRemoved.left;
//				} else {
//					toBeRemoved = toBeRemoved.right;
//				}
//			}
//		}
//
//		if (!found) {
//			return;
//		}
//
//		// toBeRemoved contains obj
//
//		// If one of the children is empty, use the other
//
//		if (toBeRemoved.left == null || toBeRemoved.right == null) {
//			RedBlackNode newChild;
//			if (toBeRemoved.left == null) {
//				newChild = toBeRemoved.right;
//			} else {
//				newChild = toBeRemoved.left;
//			}
//
//			fixBeforeRemove(toBeRemoved);
//
//			if (toBeRemoved.parent == null) {
//				root = newChild;
//			} // Found in root
//			else {
//				toBeRemoved.replaceWith(newChild);
//			}
//			return;
//		}
//
//		// Neither subtree is empty
//
//		// Find smallest element of the right subtree
//
//		RedBlackNode smallest = toBeRemoved.right;
//		while (smallest.left != null) {
//			smallest = smallest.left;
//		}
//
//		// smallest contains smallest child in right subtree
//
//		// Move contents, unlink child
//
//		toBeRemoved.data = smallest.data;
//		fixBeforeRemove(smallest);
//		smallest.replaceWith(smallest.right);
//	}

	/**
	 * A node of a red-black tree stores a data item and references of the child
	 * nodes to the left and to the right. The color is the "cost" of passing
	 * the node; 1 for black or 0 for red. Temporarily, it may be set to 2 or
	 * -1.
	 */

	/**
	 * Restores the tree to a red-black tree after a node has been added.
	 * 
	 * @param newNode
	 *            the node that has been added
	 */
//	private void fixAfterAdd(RedBlackNode newNode) {
//		if (newNode.parent == null) {
//			newNode.color = 1;
//		} else {
//			newNode.color = 0;
//			if (newNode.parent.color == 0) {
//				fixDoubleRed(newNode);
//			}
//		}
//	}

	/**
	 * Fixes the tree so that it is a red-black tree after a node has been
	 * removed.
	 * 
	 * @param removed
	 *            the node that is to be removed
	 */
//	private void fixBeforeRemove(RedBlackNode removed) {
//		if (removed.color == 0) {
//			return;
//		}
//
//		if (removed.left != null || removed.right != null) // It is not a leaf
//		{
//			// Color the child black
//			if (removed.left == null) {
//				removed.right.color = 1;
//			} else {
//				removed.left.color = 1;
//			}
//		} else {
//			bubbleUp(removed.parent);
//		}
//	}

	/**
	 * Move a charge from two children of a parent
	 * 
	 * @param parent
	 *            a node with two children, or null (in which case nothing is
	 *            done)
	 */
//	private void bubbleUp(RedBlackNode parent) {
//		if (parent == null) {
//			return;
//		}
//		parent.color++;
//		parent.left.color--;
//		parent.right.color--;
//
//		RedBlackNode child = parent.left;
//		if (child.color == -1) {
//			fixNegativeRed(child);
//			return;
//		} else if (child.color == 0) {
//			if (child.left != null && child.left.color == 0) {
//				fixDoubleRed(child.left);
//				return;
//			}
//			if (child.right != null && child.right.color == 0) {
//				fixDoubleRed(child.right);
//				return;
//			}
//		}
//
//		child = parent.right;
//		if (child.color == -1) {
//			fixNegativeRed(child);
//			return;
//		} else if (child.color == 0) {
//			if (child.left != null && child.left.color == 0) {
//				fixDoubleRed(child.left);
//				return;
//			}
//			if (child.right != null && child.right.color == 0) {
//				fixDoubleRed(child.right);
//				return;
//			}
//		}
//
//		if (parent.color == 2) {
//			if (parent.parent == null) {
//				parent.color = 1;
//			} else {
//				bubbleUp(parent.parent);
//			}
//		}
//	}

	/**
	 * Fixes a "double red" violation.
	 * 
	 * @param child
	 *            the child with a red parent
	 */
//	private void fixDoubleRed(RedBlackNode child) {
//		RedBlackNode parent = child.parent;
//		RedBlackNode grandParent = parent.parent;
//		if (grandParent == null) {
//			parent.color = 1;
//			return;
//		}
//		RedBlackNode n1, n2, n3, t1, t2, t3, t4;
//		if (parent == grandParent.left) {
//			n3 = grandParent;
//			t4 = grandParent.right;
//			if (child == parent.left) {
//				n1 = child;
//				n2 = parent;
//				t1 = child.left;
//				t2 = child.right;
//				t3 = parent.right;
//			} else {
//				n1 = parent;
//				n2 = child;
//				t1 = parent.left;
//				t2 = child.left;
//				t3 = child.right;
//			}
//		} else {
//			n1 = grandParent;
//			t1 = grandParent.left;
//			if (child == parent.left) {
//				n2 = child;
//				n3 = parent;
//				t2 = child.left;
//				t3 = child.right;
//				t4 = parent.right;
//			} else {
//				n2 = parent;
//				n3 = child;
//				t2 = parent.left;
//				t3 = child.left;
//				t4 = child.right;
//			}
//		}
//
//		if (grandParent == root) {
//			root = n2;
//			n2.parent = null;
//		} else {
//			grandParent.replaceWith(n2);
//		}
//
//		n1.setLeftChild(t1);
//		n1.setRightChild(t2);
//		n2.setLeftChild(n1);
//		n2.setRightChild(n3);
//		n3.setLeftChild(t3);
//		n3.setRightChild(t4);
//		n2.color = grandParent.color - 1;
//		n1.color = 1;
//		n3.color = 1;
//
//		if (n2 == root) {
//			root.color = 1;
//		} else if (n2.color == 0 && n2.parent.color == 0) {
//			fixDoubleRed(n2);
//		}
//	}

	/**
	 * Fixes a "negative red" violation.
	 * 
	 * @param negRed
	 *            the negative red node
	 */
//	private void fixNegativeRed(RedBlackNode negRed) {
//		RedBlackNode n1, n2, n3, n4, t1, t2, t3, child;
//		RedBlackNode parent = negRed.parent;
//		if (parent.left == negRed) {
//			n1 = negRed.left;
//			n2 = negRed;
//			n3 = negRed.right;
//			n4 = parent;
//			t1 = n3.left;
//			t2 = n3.right;
//			t3 = n4.right;
//			n1.color = 0;
//			n2.color = 1;
//			n4.color = 1;
//			n2.setRightChild(t1);
//			int temp = n4.data;
//			n4.data = n3.data;
//			n3.data = temp;
//			n3.setLeftChild(t2);
//			n3.setRightChild(t3);
//			n4.setRightChild(n3);
//			child = n1;
//		} else {
//			n4 = negRed.right;
//			n3 = negRed;
//			n2 = negRed.left;
//			n1 = parent;
//			t3 = n2.right;
//			t2 = n2.left;
//			t1 = n1.left;
//			n4.color = 0;
//			n3.color = 1;
//			n1.color = 1;
//			n3.setLeftChild(t3);
//			int temp = n1.data;
//			n1.data = n2.data;
//			n2.data = temp;
//			n2.setRightChild(t2);
//			n2.setLeftChild(t1);
//			n1.setLeftChild(n2);
//			child = n4;
//		}
//
//		if (child.left != null && child.left.color == 0) {
//			fixDoubleRed(child.left);
//			return;
//		}
//		if (child.right != null && child.right.color == 0) {
//			fixDoubleRed(child.right);
//		}
//	}
	
	
	
//	public static void main(String[] args) {
//		RedBlackTree rbt = new RedBlackTree();
//		RedBlackNode n1 = new RedBlackNode();
//		int datum = -520093657;
//		rbt.root = n1;
//		n1.right = null;
//		n1.left = null;
//		n1.data = 1610612730;
//		n1.parent = null;
//		n1.color = 1;
//		n1.blackHeight = 0;
//		rbt.add(datum);
//		System.out.println("End!");
//	}
		

}
