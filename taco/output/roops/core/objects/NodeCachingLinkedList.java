package roops.core.objects;

//@ model import org.jmlspecs.lang.*;


public class NodeCachingLinkedList extends java.lang.Object {

  /*@ nullable @*/ roops.core.objects.LinkedListNode roops_core_objects_NodeCachingLinkedList_header;
  int roops_core_objects_NodeCachingLinkedList_size;
  private int roops_core_objects_NodeCachingLinkedList_modCount;
  public int roops_core_objects_NodeCachingLinkedList_DEFAULT_MAXIMUM_CACHE_SIZE;
  /*@ nullable @*/ roops.core.objects.LinkedListNode roops_core_objects_NodeCachingLinkedList_firstCachedNode;
  int roops_core_objects_NodeCachingLinkedList_cacheSize;
  int roops_core_objects_NodeCachingLinkedList_maximumCacheSize;
  /*@ invariant (this.roops_core_objects_NodeCachingLinkedList_header  !=  null) && (this.roops_core_objects_NodeCachingLinkedList_header.roops_core_objects_LinkedListNode_next  !=  null) && (this.roops_core_objects_NodeCachingLinkedList_header.roops_core_objects_LinkedListNode_previous  !=  null) && (this.roops_core_objects_NodeCachingLinkedList_size  ==  \reach(this.roops_core_objects_NodeCachingLinkedList_header, roops.core.objects.LinkedListNode, roops_core_objects_LinkedListNode_next).int_size() - 1) && (this.roops_core_objects_NodeCachingLinkedList_size  >=  0) && (this.roops_core_objects_NodeCachingLinkedList_cacheSize  <=  this.roops_core_objects_NodeCachingLinkedList_maximumCacheSize) && (this.roops_core_objects_NodeCachingLinkedList_DEFAULT_MAXIMUM_CACHE_SIZE  ==  20) && (this.roops_core_objects_NodeCachingLinkedList_cacheSize  ==  \reach(this.roops_core_objects_NodeCachingLinkedList_firstCachedNode, roops.core.objects.LinkedListNode, roops_core_objects_LinkedListNode_next).int_size()) && (\forall roops.core.objects.LinkedListNode m; \reach(this.roops_core_objects_NodeCachingLinkedList_firstCachedNode, roops.core.objects.LinkedListNode, roops_core_objects_LinkedListNode_next).has(((java.lang.Object)(m))); ! \reach(m.roops_core_objects_LinkedListNode_next, roops.core.objects.LinkedListNode, roops_core_objects_LinkedListNode_next).has(((java.lang.Object)(m))) && m.roops_core_objects_LinkedListNode_previous  ==  null && m.roops_core_objects_LinkedListNode_value  ==  0) && (\forall roops.core.objects.LinkedListNode n; \reach(this.roops_core_objects_NodeCachingLinkedList_header, roops.core.objects.LinkedListNode, roops_core_objects_LinkedListNode_next).has(((java.lang.Object)(n))); n  !=  null && n.roops_core_objects_LinkedListNode_previous  !=  null && n.roops_core_objects_LinkedListNode_previous.roops_core_objects_LinkedListNode_next  ==  n && n.roops_core_objects_LinkedListNode_next  !=  null && n.roops_core_objects_LinkedListNode_next.roops_core_objects_LinkedListNode_previous  ==  n);
    @*/

  /*@ 
    @ requires true;
    @ ensures false;
    @*/
  public void showInstance(/*@ nullable @*/ roops.core.objects.NodeCachingLinkedList list) {
    roops.core.objects.NodeCachingLinkedList param_list_0;

    param_list_0 = list;
    {
    }
  }


  public NodeCachingLinkedList() {
    this.roops_core_objects_NodeCachingLinkedList_header = ((roops.core.objects.LinkedListNode)(null));
    this.roops_core_objects_NodeCachingLinkedList_size = (byte)0;
    this.roops_core_objects_NodeCachingLinkedList_modCount = (byte)0;
    this.roops_core_objects_NodeCachingLinkedList_DEFAULT_MAXIMUM_CACHE_SIZE = (byte)0;
    this.roops_core_objects_NodeCachingLinkedList_firstCachedNode = ((roops.core.objects.LinkedListNode)(null));
    this.roops_core_objects_NodeCachingLinkedList_cacheSize = (byte)0;
    this.roops_core_objects_NodeCachingLinkedList_maximumCacheSize = (byte)0;
    {
    }
  }

}
