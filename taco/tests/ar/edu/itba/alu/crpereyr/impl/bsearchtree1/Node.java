package ar.edu.itba.alu.crpereyr.impl.bsearchtree1;

public class Node {
    public int key;              // sorted by key
    public int val;              // associated data
    public Node left, right;     // left and right subtrees

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}
