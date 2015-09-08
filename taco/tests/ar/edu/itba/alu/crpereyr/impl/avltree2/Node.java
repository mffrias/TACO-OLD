package ar.edu.itba.alu.crpereyr.impl.avltree2;

public class Node {

    public int data;
    public Node left;
    public Node right;
    public int depth;

    public Node(int data) {
        this(data, null, null);
    }

    public Node(int data, Node left, Node right) {
        super();
        this.data = data;
        this.left = left;
        this.right = right;
        if (left == null && right == null)
            setDepth(1);
        else if (left == null)
            setDepth(right.getDepth() + 1);
        else if (right == null)
            setDepth(left.getDepth() + 1);
        else
            setDepth(((left.getDepth() > right.getDepth()) ? left.getDepth() : right.getDepth()) + 1);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    /**
     * @return the depth
     */
    public int getDepth() {
        return depth;
    }

    /**
     * @param depth
     *            the depth to set
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int compareInto(Node o) {
        return this.data - o.data;
    }
}

