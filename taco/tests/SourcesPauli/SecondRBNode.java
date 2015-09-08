package SourcesPauli;

/*@nullable_by_default@*/
public class SecondRBNode {

public /*@ nullable @*/ SecondRBNode right;
public /*@ nullable @*/ SecondRBNode left;
public /*@ nullable @*/ SecondRBNode parent;
public int key;
public int color = 1; //default color of node is red.

public SecondRBNode(int _key) {
    this();
    key = _key;
}

public SecondRBNode() {
    right = null;
    left = null;
    parent = null;
}

public SecondRBNode(int k, SecondRBNode l, SecondRBNode r, SecondRBNode p) {
    right = r;
    left = l;
    parent = p;
    key = k;
}

}