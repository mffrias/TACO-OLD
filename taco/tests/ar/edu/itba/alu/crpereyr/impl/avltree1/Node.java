package ar.edu.itba.alu.crpereyr.impl.avltree1;

/*@nullable_by_default@*/
public class Node {
    public int key;
    public Object val;
    public int height;
    public Node left, right;
    public Node(int k, Object v) {
        key = k;
        val = v;
        height = 0;
        left = right = null;
    }
}

