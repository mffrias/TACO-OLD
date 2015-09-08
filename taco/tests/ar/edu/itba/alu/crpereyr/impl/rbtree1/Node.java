package ar.edu.itba.alu.crpereyr.impl.rbtree1;

class Node
{
    public int key;
    public int value;
    public Node left;
    public Node right;
    public Node parent;
    public int color;

    public Node(int key, int value, int nodeColor, Node left, Node right) {
        this.key = key;
        this.value = value;
        this.color = nodeColor;
        this.left = left;
        this.right = right;
        if (left  != null)  left.parent = this;
        if (right != null) right.parent = this;
        this.parent = null;
    }
    public Node grandparent() {
        assert parent != null; // Not the root node
        assert parent.parent != null; // Not child of root
        return parent.parent;
    }
    public Node sibling() {
        assert parent != null; // Root node has no sibling
        if (this == parent.left)
            return parent.right;
        else
            return parent.left;
    }
    public Node uncle() {
        assert parent != null; // Root node has no uncle
        assert parent.parent != null; // Children of root have no uncle
        return parent.sibling();
    }
}

