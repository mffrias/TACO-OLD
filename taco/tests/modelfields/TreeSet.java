package modelfields;

public class TreeSet {


	/*@
	 @ invariant ( this.RED==false ) && 
	 @		( this.BLACK == true ) &&
	 @		( this.root.parent == null ) &&
	 @		( this.root!=null ==> this.root.color == this.BLACK ) && 
	 @		( \forall TreeSetEntry n; \reach(this.root, TreeSetEntry, left+right).has(n); 
	 @				( n.left != null ==> n.left.parent == n ) &&
	 @				( n.right != null ==> n.right.parent == n ) &&
	 @				( n.parent != null ==> (n.parent.left == n || n.parent.right == n) ) &&
	 @				( \reach(n.parent, TreeSetEntry, parent).has(n) == false ) &&
	 @				( \forall TreeSetEntry x; \reach(n.left, TreeSetEntry, left + right).has(x); n.key > x.key ) &&
	 @				( \forall TreeSetEntry x; \reach(n.right, TreeSetEntry, left + right).has(x); x.key > n.key ) &&
	 @				( (n.color == this.RED && n.parent != null) ==> n.parent.color == this.BLACK )
	 @		); 
	 @ invariant this.size == \reach(root, TreeSetEntry, left+right).int_size();
	 @ 
	 @ 
	 @*/

	public /*@nullable@*/ TreeSetEntry root = null;

	public int size = 0;

	public int modCount = 0;

	/*static final */ boolean RED = false;
	/*static final */ boolean BLACK = true;



  /*@ 
	@ requires root != null;
	@ ensures \result == true <==> (\exists TreeSetEntry e; \reach(root, TreeSetEntry, left+right).has(e); e.key == value);
	@ ensures (\forall TreeSetEntry e; \reach(root, TreeSetEntry, left+right).has(e); 
	@	e.left == \old(e.left) && e.right == \old(e.right) && e.color == \old(e.color) && e.key == \old(e.key)); 
	@ signals (Exception e) false; 
	@*/
	public boolean contains(int value) {
		TreeSetEntry p = root;
		//@ decreasing \reach(root, TreeSetEntry, left + right).int_size();
		while (p != null) {
			if (value == p.key) {
				return true;
			} else if (value < p.key) {
				p = p.left;
			} else {
				p = p.right;
			}
		}
		return false;

	}


	private TreeSetEntry getEntry(int key) {
		TreeSetEntry p = root;
		while (p != null) {

			if (key == p.key) {

				return p;
			} else if (key < p.key) {

				p = p.left;
			} else {

				p = p.right;
			}
		}

		return null;
	}


}