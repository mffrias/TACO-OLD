package SourcesMatiasDeSanti;

/*@ nullable_by_default @*/
public class BSTNode {
    public int el;
    public /*@ nullable @*/ BSTNode left;
    public /*@ nullable @*/ BSTNode right;
    public BSTNode() {
        left = right = null;
    }
    public BSTNode(int el) {
        this(el,null,null);
    }
    public BSTNode(int el, BSTNode lt, BSTNode rt) {
        this.el = el; left = lt; right = rt;
    }
}