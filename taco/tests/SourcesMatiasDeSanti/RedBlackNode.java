package SourcesMatiasDeSanti;

/*@nullable_by_default@*/
public class RedBlackNode {
	public int data;
	public RedBlackNode left;
	public RedBlackNode right;
	public RedBlackNode parent;
	public int color;
	public int blackHeight = 0;

	/**
	 * Constructs a red node with no data.
	 */
	public RedBlackNode() {
	}

	/**
	 * Sets the left child and updates its parent pointer.
	 * 
	 * @param child
	 *            the new left child
	 */
	public void setLeftChild(RedBlackNode child) {
		left = child;
		if (child != null) {
			child.parent = this;
		}
	}

	/**
	 * Sets the right child and updates its parent pointer.
	 * 
	 * @param child
	 *            the new right child
	 */
	public void setRightChild(RedBlackNode child) {
		right = child;
		if (child != null) {
			child.parent = this;
		}
	}

	/**
	 * Updates the parent's and replacement node's links when this node is
	 * replaced.
	 * 
	 * @param replacement
	 *            the node that replaces this node
	 */
	public void replaceWith(RedBlackNode replacement) {
		if (parent == null)
			return;
		if (this == parent.left)
			parent.setLeftChild(replacement);
		else
			parent.setRightChild(replacement);
	}

	/**
	 * Inserts a new node as a descendant of this node.
	 * 
	 * @param newNode
	 *            the node to insert
	 */
	public void addNode(RedBlackNode newNode) {
		int comp = newNode.data - data;
		if (comp < 0) {
			if (left == null) {
				left = newNode;
				left.parent = this;
			} else {
				left.addNode(newNode);
			}
		} else if (comp > 0) {
			if (right == null) {
				right = newNode;
				right.parent = this;
			} else {
				right.addNode(newNode);
			}
		}
	}
}