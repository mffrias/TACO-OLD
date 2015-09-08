package SourcesPauli;

// URL  http://www.codesend.com/view/524d444c9fac2c9f21c916cc438bc57b/

public class SecondRBTree {

	/*@ invariant (\forall SecondRBNode n;
	\reach(_root, SecondRBNode, left + right).has(n) == true;
	\reach(n.right, SecondRBNode, right + left).has(n) == false &&
	\reach(n.left, SecondRBNode, left + right).has(n) == false);
  	@ invariant (\forall SecondRBNode n;
	@     \reach(_root, SecondRBNode, left + right).has(n) == true;
	@     (\forall SecondRBNode m; \reach(n.left, SecondRBNode, left + right).has(m) == true; m.key < n.key) &&
	@     (\forall SecondRBNode m; \reach(n.right, SecondRBNode, left + right).has(m) == true; m.key > n.key));
	@ invariant _root.parent == null;
	@ invariant (\forall SecondRBNode n;
	@     \reach(_root, SecondRBNode, left + right).has(n) == true;
	@     (n.right != null ==> n.right.parent == n) &&
	@     (n.left != null ==> n.left.parent == n));
	@*/
	
	public int black =0;
	public int red = 1;
 
    public /*@ nullable @*/ SecondRBNode _nullNode;  //The Null Node
    public /*@ nullable @*/ SecondRBNode _root;   // Root of the the tree
    public boolean _isBalanced;
    public int _nodeCount;
 
    public SecondRBTree() {
        //set null node object
        _nullNode = new SecondRBNode();
        _nullNode.color = black;
 
        //construct root node
        _root = _nullNode;
        _root.color = black;
 
        _isBalanced = true;
        _nodeCount = 0;
    }
 
    public SecondRBTree(boolean isBalanced) {
        this();
        _isBalanced = isBalanced;
    }
 
    public boolean empty() {
        //if root is _nullnode
        return (_root.equals(_nullNode));
    }
 
    /**
     * @param x - key to find
     * @return pointer to the nodeResult else _nullnode
     */
    public SecondRBNode find(int x) {
    	SecondRBNode iterator = _root;
        //Start travelling the tree from the root.
        while (true) {
            if (!(iterator.equals(_nullNode))) {
                if (iterator.key == x) {
                    return iterator;
                } else if (iterator.key < x) {
                    iterator = iterator.right;
                } else {
                    iterator = iterator.left;
                }
            } else {
                return new SecondRBNode();
            }
        }
       
    }
 
    
    /*@ 
	  @ requires true;
	  @ ensures \old(_nodeCount) == _nodeCount;
	  @*/
    public boolean contains(int x) {
        return (!find(x).equals(_nullNode));
    }
 
    /**
     * public double insert(double x)
     * &lt;p/&gt;
     * inserts the x into the binary tree; the tree
     * must remain valid (keep its invariants).
     * the return value is defined in the exercise
     * &lt;p/&gt;
     * precondition:  none
     * postcondition: contains(x) == true (that is, x is in the tree)
     *
     * @param x - key to insert
     * @return - x
     */
    
    /*@
    @ requires true;
    @ ensures \old(_nodeCount) + 1 == _nodeCount;
    @ ensures \reach(_root, SecondRBNode, right + left).int_size() == _nodeCount+1;
    @ ensures (\forall SecondRBNode n; \old(\reach(_root, SecondRBNode, right + left)).has(n) == true; \reach(_root, SecondRBNode, right + left).has(n) == true);
    @ ensures (\exists SecondRBNode n; n.key == x && \reach(_root, SecondRBNode, left + right).has(n) == true);
    @*/
    public double insert(int x) {
    	SecondRBNode newNode = new SecondRBNode(x, _nullNode, _nullNode, _nullNode);
 
        if (_root.equals(_nullNode)) {
            //case root is _nullnode
            _root = newNode;
            _nodeCount++;
        } else {
            //Traveling the tree till find a place to add new key
        	SecondRBNode iterator = _root;
            while (true) {
                if (iterator.key < x) {
                    if (iterator.right.equals(_nullNode)) {
                        iterator.right = newNode;
                        newNode.parent = iterator;
 
                        _nodeCount++;
                        break;
                    } else {
                        iterator = iterator.right;
                    }
                } else if (iterator.key > x) {
                    if (iterator.left.equals(_nullNode)) {
                        iterator.left = newNode;
                        newNode.parent = iterator;
                        _nodeCount++;
                        break;
                    } else {
                        iterator = iterator.left;
                    }
                } else {
                    return x;
                }
            }
        }
        if (_isBalanced) {
            //check for Red/Black Rules, if the tree is RB.
            if (!newNode.equals(_root)) {
                //case 0  - parent is not black then fix up tree
                if (newNode.parent.color != black) {
                    insertFixUp(newNode);
                }
            }
            _root.color = black;
        }
        return x;
    }
 
    public void insertFixUp(SecondRBNode current) {
        while (current.parent.color == red && !current.equals(_root)) {
            if (current.parent.equals(current.parent.parent.left)) {
                //case for right uncle
            	SecondRBNode uncle = current.parent.parent.right;
                if (uncle.color == red) {
                    //case 1 - uncle is red
                    current.parent.color = black; //father
                    uncle.color = black; //uncle
                    current.parent.parent.color = red;//grandfather
                    current = current.parent.parent;
                } else {
                    //case 2 - current is a right child
                    if (current.equals(current.parent.right)) {
                        current = current.parent;
                        leftRotate(current);
                    }
                    //case 3
                    current.parent.color = black;
                    current.parent.parent.color = red;
                    rightRotate(current.parent.parent);
                }
            } else { //symetric cases for a left uncle
            	SecondRBNode uncle = current.parent.parent.left;
                if (uncle.color == red) {
                    //case 1 - uncle is red
                    current.parent.color = black; //father
                    uncle.color = black; //uncle
                    current.parent.parent.color = red;//grandfather
                    current = current.parent.parent;
                } else {
                    //case 2 - current is a right child
                    if (current.equals(current.parent.left)) {
                        current = current.parent;
                        rightRotate(current);
                    }
                    //case 3
                    current.parent.color = black;
                    current.parent.parent.color = red;
                    leftRotate(current.parent.parent);
                }
            }
        }
 
    }
 
    public void deleteFixUP(SecondRBNode current) {
        while ((!current.equals(_root)) && current.color == black) {
            if (current.equals(current.parent.left)) {
            	SecondRBNode brother = current.parent.right;
                if (brother.color == red) {
                    //case1 - right brother is red
                    brother.color = black;
                    current.parent.color = red;
                    leftRotate(current.parent);
                    brother = current.parent.right;
                }
                if (brother.left.color == black &&
                        brother.right.color == black) {
                    //case2 - right brother is black and both of his children black
                    brother.color = red;
                    current = current.parent;
                } else {
                    //one child of right brother is red
                    if (brother.right.color == black) {
                        //case3 - right brother\'s right child is black
                        brother.left.color = black;
                        rightRotate(brother);
                        brother = current.parent.right;
                    }
                    //case4 - right brother\'s left child is black
                    brother.color = current.parent.color;
                    current.parent.color = black;
                    brother.right.color = black;
                    leftRotate(current.parent);
                    current = _root;
                }
            } else {
                //symetric cases as above
            	SecondRBNode brother = current.parent.left;
                if (brother.color == red) {
                    //case1 - left brother is red
                    brother.color = black;
                    current.parent.color = red;
                    rightRotate(current.parent);
                    brother = current.parent.left;
                }
                if (brother.left.color == black &&
                        brother.right.color == black) {
                    //case2 - left brother is black and both of his children black
                    brother.color = red;
                    current = current.parent;
                } else {
                    //one child of left brother is red
                    if (brother.left.color == black) {
                        //case3 - left brother\'s left child is black
                        brother.right.color = black;
                        leftRotate(brother);
                        brother = current.parent.left;
                    }
                    //case4 - left brother\'s right child is black
                    brother.color = current.parent.color;
                    current.parent.color = black;
                    brother.left.color = black;
                    rightRotate(current.parent);
                    current = _root;
                }
            }
        }
        current.color = black; //make sure curren is black
 
    }
 
    /**
     * The method makes newLeft to be the left child of current
     *
     * @param current - node to set the left child
     * @param newLeft - a new node to be the left child of current
     */
    public void setLeftNode(SecondRBNode current, SecondRBNode newLeft) {
        current.left = newLeft;
        newLeft.parent = current;
    }
 
    /**
     * The method makes newRight to be the right child of current
     *
     * @param current  - node to set the right child
     * @param newRight - a new node to be the right child of current
     */
    public void setRightNode(SecondRBNode current, SecondRBNode newRight) {
        current.right = newRight;
        newRight.parent = current;
    }
 
    /**
     * The method replace oldNode with newNode
     *
     * @param oldNode - node to be replaced.
     * @param newNode - new node to replace.
     */
    public void transplant(SecondRBNode oldNode, SecondRBNode newNode) {
        if (!oldNode.parent.equals(_nullNode)) {
            if (oldNode.equals(oldNode.parent.left)) {
                setLeftNode(oldNode.parent, newNode);
            } else {
                setRightNode(oldNode.parent, newNode);
            }
        } else {
            _root = newNode;
            _root.parent = _nullNode;
        }
 
    }
 
    /**
     * The method makes left rotate a round the give node.
     *
     * @param current - the node to rotate around.
     */
    public void leftRotate(SecondRBNode current) {
        SecondRBNode tmp = current.right;
        transplant(current, tmp);
        setRightNode(current, tmp.left);
        setLeftNode(tmp, current);
    }
 
    /**
     * The method makes right rotate a round the give node.
     *
     * @param current -  the node to rotate around.
     */
    public void rightRotate(SecondRBNode current) {
        SecondRBNode tmp = current.left;
        transplant(current, tmp);
        setLeftNode(current, tmp.right);
        setRightNode(tmp, current);
 
    }
 
 
    /**
     * public void delete(double x)
     * &lt;p/&gt;
     * deletes x from the binary tree, if it is there;
     * the tree must remain valid (keep its invariants).
     * the return value is defined in the exercise
     * &lt;p/&gt;
     * precondition:  none
     * postcondition: contains(i) == false (that is, x is not in the tree)
     *
     * @param x - key to delete
     * @return x
     */
    public double delete(int x) {
        SecondRBNode nodeToDelete = find(x);
 
        if (nodeToDelete.equals(_nullNode)) {
            return x;
        }
 
        SecondRBNode node1, node2;
 
        if (nodeToDelete.left.equals(_nullNode) || nodeToDelete.right.equals(_nullNode)) {
            // one chile or no children
            node1 = nodeToDelete;
        } else {
            //two children
            node1 = Successor(nodeToDelete);
        }
 
        if (!node1.left.equals(_nullNode)) {
            node2 = node1.left;
        } else {
            node2 = node1.right;
        }
 
        node2.parent = node1.parent;
 
        if (!node1.parent.equals(_nullNode)) {
            if (node1.equals(node1.parent.left)) {
                node1.parent.left = node2;
            } else {
                node1.parent.right = node2;
            }
        } else {
            _root = node2;
            _root.parent = _nullNode;
        }
 
        if (!node1.equals(nodeToDelete)) {
            nodeToDelete.key = node1.key;
        }
 
        if (_isBalanced) {
            if (node1.color == black && !node2.equals(_nullNode)) {
                deleteFixUP(node2);
                _root.color = black;
            }
        }
        _nodeCount--;
        return x;
    }
 
    /**
     * The method returns the node to the successor of the given node
     *
     * @param x - node
     * @return the node holding the key next to x.key
     */
    public SecondRBNode Successor(SecondRBNode x) {
        SecondRBNode baseNode = x;
 
        if (!baseNode.equals(_nullNode)) {
            if (!baseNode.right.equals(_nullNode)) {
                //return the minimum of right child
                return findMostLeft(baseNode.right);
            } else {
                SecondRBNode baseParentNode = baseNode.parent;
                while (!baseParentNode.equals(_nullNode) && baseNode.equals(baseParentNode.right)) {
                    if (!baseParentNode.equals(_root)) {
                        baseNode = baseParentNode;
                        baseParentNode = baseNode.parent;
                    } else {
                        return _nullNode;
                    }
 
                }
                return baseParentNode;
            }
        } else {
            return _nullNode;
        }
    }
 
    /**
     * The method returns the most left node of a given node.
     *
     * @param current - node to start from
     * @return Most left node
     */
    public SecondRBNode findMostLeft(SecondRBNode current) {
        SecondRBNode iterator = current;
        while (!iterator.left.equals(_nullNode)) {
            iterator = iterator.left;
        }
        return iterator;
    }
 
    /**
     * The method returns the most right node of a given node.
     *
     * @param current - node to start from
     * @return Most Right node
     */
    public SecondRBNode findMostRight(SecondRBNode current) {
        SecondRBNode iterator = current;
        while (!iterator.right.equals(_nullNode)) {
            iterator = iterator.right;
        }
        return iterator;
    }
 
    /**
     * public double min()
     * &lt;p/&gt;
     * Returns the smallest key in the tree. If the tree
     * is empty, returns -1;
     * &lt;p/&gt;
     * precondition: none
     * postcondition: none
     *
     * @return - Minimum key of the tree
     */
    public double min() {
        if (!_root.equals(_nullNode)) {
            return findMostLeft(_root).key;
        } else {
            return -1;
        }
 
    }
 
    /**
     * public double max()
     * &lt;p/&gt;
     * Returns the largest key in the tree. If the tree
     * is empty, returns -1;
     * &lt;p/&gt;
     * precondition: none
     * postcondition: none
     *
     * @return - Maximum key of the tree
     */
    public double max() {
        if (!_root.equals(_nullNode)) {
            return findMostRight(_root).key;
        } else {
            return -1;
        }
    }
 
    /**
     * public double[] toDoubleArray()
     * &lt;p/&gt;
     * returns an double[] array containing the values stored in the tree,
     * in ascending order.
     * &lt;p/&gt;
     * preconditions: none
     * postconditions: returns an array containing exactly the tree\'s elements in
     * ascending order.
     */
    public double[] toDoubleArray() {
        double[] arr = new double[_nodeCount];
        inOrder(_root, arr, 0);
        return arr;
    }
 
 
    public int inOrder(SecondRBNode current, double[] x, int i) {
 
        if (!(current.left.equals(_nullNode))) {
            i = inOrder(current.left, x, i);
        }
 
        x[i] = current.key;
        i++;
 
        if (!(current.right.equals(_nullNode))) {
            i = inOrder(current.right, x, i);
        }
 
        return i;
    }
 
    /**
     * public int getHeight()
     * &lt;p/&gt;
     * Returns the height of the tree.
     * &lt;p/&gt;
     * precondition: none
     * postcondition:
     */
    public int getHeight() {
        return treeHeight(_root, 0);
 
    }
 
    /**
     * The method returns the height of the tree from a given node.
     *
     * @param current - node to start from
     * @return height of the tree
     */
    public int treeHeight(SecondRBNode current, int i) {
        int iLeft;
        int iRight;
 
        if (!(current.left.equals(_nullNode))) {
            iLeft = treeHeight(current.left, i + 1);
        } else {
            iLeft = i + 1;
        }
        if (!(current.right.equals(_nullNode))) {
            iRight = treeHeight(current.right, i + 1);
        } else {
            iRight = i + 1;
        }
 
        if (iLeft > iRight) {
            i = iLeft;
        } else {
            i = iRight;
        }
        return i;
    }
 
    /**
     * public double getAverageDepth()
     * &lt;p/&gt;
     * Returns the average depth of a node in the tree.
     * &lt;p/&gt;
     * precondition: none
     * postcondition:
     */
    public double getAverageDepth() {
        return sumHeight(_root, 0) / (numOfNulls(_root, 0) + _nodeCount);
 
    }
 
    /**
     * The method returns the sum height of a sub tree from a given node.
     *
     * @param current - node to start from
     * @return sum of nodes heights.
     */
 
    public int sumHeight(SecondRBNode current, int i) {
        int sumLeft;
        int sumRight;
 
        if (current.equals(_nullNode)) {
            return i;
        }
        sumLeft = sumHeight(current.left, i + 1);
        sumRight = sumHeight(current.right, i + 1);
 
        i = i + sumLeft + sumRight;
 
 
        return i;
    }
 
 
    /**
     * The method returns the number of null nodes in a tree.
     *
     * @param current - node to start from
     * @return number of null nodes in a tree
     */
 
    public double numOfNulls(SecondRBNode current, double count) {
        if (current.equals(_nullNode)) {
 
            return count + 1;
        }
 
        count = numOfNulls(current.left, count) + numOfNulls(current.right, count);
        return count;
    }
 
 
    /**
     * public int size()
     * &lt;p/&gt;
     * Returns the number of nodes in the tree.
     * &lt;p/&gt;
     * &lt;p/&gt;
     * precondition: none
     * postcondition:
     *
     * @return how many nodes in the tree,
     */
    public int getSize() {
        return _nodeCount;
    }
}
