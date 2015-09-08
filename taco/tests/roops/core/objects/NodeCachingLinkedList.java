/****************************************************************************
Author: Juan Pablo Galeotti and Marcelo Frias, Relational Formal Methods 
Group, University of Buenos Aires and Buenos Aires Institute of Technology,
Buenos Aires, Argentina.

ROOPS class implementing the apache.commons.collections class NodeCachingLinkedList.
It uses an auxiliary class LinkedListNode. Method removeIndex has been modified by
adding a goal that requires the cache list to be full to be covered. This means that
22 nodes are required in the cache part of the structure. 
A bug has been seeded in method isCacheFull. The bug allows to remove a node from the
NodeCachingLinkedList using method removeIndex and end up with an overflown cache. 
This state is captured by goal 10. The input NodeCachingLinkedList must have 23 nodes
in its cache linked list.

The class has annotations in JFSL [1] given as ROOPS comments. In particular, a class
invariant is provided.

[1] http://sdg.csail.mit.edu/forge/plugin.html
****************************************************************************/
package roops.core.objects;





public class NodeCachingLinkedList {
	/*@
	  @ invariant 
	  @		( this.header!=null ) &&
	  @		( this.header.next!=null ) &&
	  @		( this.header.previous!=null ) &&
	  @		( this.size == \reach(this.header, LinkedListNode, next).int_size() - 1 ) &&
	  @		( this.size >= 0 ) &&
	  @		( this.cacheSize <= this.maximumCacheSize ) &&
	  @		( this.DEFAULT_MAXIMUM_CACHE_SIZE == 20 ) &&
	  @		( this.cacheSize == \reach(this.firstCachedNode, LinkedListNode, next).int_size() ) &&
	  @		( \forall LinkedListNode m; \reach(this.firstCachedNode, LinkedListNode, next).has(m);
	  @				  !\reach(m.next, LinkedListNode, next).has(m) &&
	  @				  m.previous == null &&
	  @				  m.value == 0 ) &&
	  @		( \forall LinkedListNode n; \reach(this.header, LinkedListNode, next).has(n); 
	  @				  n != null &&
	  @				  n.previous != null &&
	  @				  n.previous.next == n &&
	  @				  n.next != null &&
	  @				  n.next.previous == n ); 
	  @
	  @*/
	
	
	
	
	/*@ 
	  @ requires true;
	  @ 
	  @ ensures false;
	  @*/
	public void showInstance(/*@ nullable @*/ NodeCachingLinkedList list) {
	}

	/*@ nullable @*/ LinkedListNode header;
	int size;
	
	private int modCount;

	public int DEFAULT_MAXIMUM_CACHE_SIZE;



	 /*@ nullable @*/ LinkedListNode firstCachedNode;

	/**
	 * The size of the cache.
	 */
    int cacheSize;

	/**
	 * The maximum size of the cache.
	 */
	int maximumCacheSize;
	
	public NodeCachingLinkedList() {}
}
/* end roops.core.objects */
