package SourcesHomovoc;

/*@nullable_by_default@*/
public class AVLNode2 {

	public AVLNode2 left, right, parent;
	public int value, height;
	public Object object; // enable the AVLTree to store additional info
	
	public AVLNode2() {
		
	}

	public AVLNode2(int value) {
		this.value = value;
		this.height = 0;
	}

	public AVLNode2(int value, Object object) {
		this.value = value;
		this.height = 0;
		this.object = object;
	}

	public AVLNode2(AVLNode2 node) {
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

	public int getValue() {
		return value;
	}

	public AVLNode2 getParent() {
		return parent;
	}

	public AVLNode2 getLeft() {
		return left;
	}

	public void setLeft(AVLNode2 left) {
		this.left = left;
		if (left != null)
			left.parent = this;
	}

	public AVLNode2 getRight() {
		return right;
	}

	public void setRight(AVLNode2 right) {
		this.right = right;
		if (right != null)
			right.parent = this;
	}

	public int getHeight() {
		return height;
	}

	public int getLevel() {
		int level = 0;
		AVLNode2 currentNode = this;
		while ((currentNode = currentNode.parent) != null)
			level++;
		return level;
	}

	public int getBalanceFactor() {
		int leftHeight = getLeftHeight();
		int rightHeight = getRightHeight();
		return leftHeight - rightHeight;
	}

//	public void insertToLeaf(AVLNode2 node) {
//		if (node.value == value) {
//			return;
//		} else {
//			if (node.value < value) {
//				if (left == null)
//					setLeft(node);
//				else
//					left.insertToLeaf(node);
//			} else {
//				if (right == null)
//					setRight(node);
//				else
//					right.insertToLeaf(node);
//			}
//		}
//	}
	
	public void insertToLeaf(AVLNode2 node) {
		AVLNode2 aux = node;
		boolean found = false;
		while(aux.value != value && !found) {
			if (aux.value == value)
				return;
			if (aux.value < value) {
				if (left == null) {
					setLeft(aux);
					found = true;
				} else
					aux = left;
			} else {
				if (right == null) {
					setRight(node);
					found = true;
				} else
					aux = right;
			}
		}
	}

	/**
	 * rotate right change of height should be added; applies to the LL type
	 * situation
	 */
	public AVLNode2 rotateRight() {
		AVLNode2 newRight = new AVLNode2(this);
		newRight.height = getRightHeight() + 1;
		newRight.setLeft(left.right);
		left.setRight(newRight);
		left.adjustHeight();
		return left;
	}

	/**
	 * rotate left change of height should be added; applies to the LL type
	 * situation
	 */
	public AVLNode2 rotateLeft() {
		AVLNode2 newLeft = new AVLNode2(this);
		newLeft.height = getLeftHeight() + 1;
		newLeft.setRight(right.left);
		right.setLeft(newLeft);
		right.adjustHeight();
		return right;
	}

	public void adjustHeight() {
		int leftHeight = getLeftHeight();
		int rightHeight = getRightHeight();
		if(leftHeight > rightHeight)
			height = leftHeight + 1;
		else
			height = rightHeight + 1;
//		height = (leftHeight > rightHeight) ? leftHeight + 1 : rightHeight + 1;
	}

	public int getLeftHeight() {
		if(left == null)
			return -1;
		else
			return left.height;
//		return left == null ? -1 : left.height;
	}

	public int getRightHeight() {
		if(right == null)
			return -1;
		else 
			return right.height;
//		return right == null ? -1 : right.height;
	}

	public boolean isLeaf() {
		return left == null && right == null;
	}

	public AVLNode2 getLeftmost() {
		AVLNode2 leftmost = this;
		while (leftmost.left != null)
			leftmost = leftmost.left;
		return leftmost;
	}

	public AVLNode2 getRightmost() {
		AVLNode2 rightmost = this;
		while (rightmost.right != null)
			rightmost = rightmost.right;
		return rightmost;
	}

}
