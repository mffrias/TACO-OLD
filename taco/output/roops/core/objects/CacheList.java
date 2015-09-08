package roops.core.objects;

//@ model import org.jmlspecs.lang.*;


public class CacheList extends java.lang.Object {

  /*@ nullable @*/ roops.core.objects.CacheListNode roops_core_objects_CacheList_header;
  int roops_core_objects_CacheList_size;
  private int roops_core_objects_CacheList_modCount;
  public int roops_core_objects_CacheList_DEFAULT_MAXIMUM_CACHE_SIZE;
  /*@ nullable @*/ roops.core.objects.CacheListNode roops_core_objects_CacheList_firstCachedNode;
  int roops_core_objects_CacheList_cacheSize;
  int roops_core_objects_CacheList_maximumCacheSize;
  /*@ invariant (this.roops_core_objects_CacheList_header  !=  null) && (this.roops_core_objects_CacheList_header.roops_core_objects_CacheListNode_next  !=  null) && (this.roops_core_objects_CacheList_header.roops_core_objects_CacheListNode_previous  !=  null) && (this.roops_core_objects_CacheList_size  ==  \reach(this.roops_core_objects_CacheList_header, roops.core.objects.CacheListNode, roops_core_objects_CacheListNode_next).int_size() - 1) && (this.roops_core_objects_CacheList_size  >=  0) && (this.roops_core_objects_CacheList_cacheSize  <=  this.roops_core_objects_CacheList_maximumCacheSize) && (this.roops_core_objects_CacheList_DEFAULT_MAXIMUM_CACHE_SIZE  ==  20) && (this.roops_core_objects_CacheList_cacheSize  ==  \reach(this.roops_core_objects_CacheList_firstCachedNode, roops.core.objects.CacheListNode, roops_core_objects_CacheListNode_next).int_size()) && (\forall roops.core.objects.CacheListNode m; \reach(this.roops_core_objects_CacheList_firstCachedNode, roops.core.objects.CacheListNode, roops_core_objects_CacheListNode_next).has(((java.lang.Object)(m))); ! \reach(m.roops_core_objects_CacheListNode_next, roops.core.objects.CacheListNode, roops_core_objects_CacheListNode_next).has(((java.lang.Object)(m))) && m.roops_core_objects_CacheListNode_previous  ==  null && m.roops_core_objects_CacheListNode_value  ==  0) && (\forall roops.core.objects.CacheListNode n; \reach(this.roops_core_objects_CacheList_header, roops.core.objects.CacheListNode, roops_core_objects_CacheListNode_next).has(((java.lang.Object)(n))); n  !=  null && n.roops_core_objects_CacheListNode_previous  !=  null && n.roops_core_objects_CacheListNode_previous.roops_core_objects_CacheListNode_next  ==  n && n.roops_core_objects_CacheListNode_next  !=  null && n.roops_core_objects_CacheListNode_next.roops_core_objects_CacheListNode_previous  ==  n);
    @*/

  /*@ 
    @ requires true;
    @ ensures false;
    @*/
  public void showInstance(/*@ nullable @*/ roops.core.objects.CacheList list) {
    roops.core.objects.CacheList param_list_0;

    param_list_0 = list;
    {
    }
  }


  public CacheList() {
    this.roops_core_objects_CacheList_header = ((roops.core.objects.CacheListNode)(null));
    this.roops_core_objects_CacheList_size = (byte)0;
    this.roops_core_objects_CacheList_modCount = (byte)0;
    this.roops_core_objects_CacheList_DEFAULT_MAXIMUM_CACHE_SIZE = (byte)0;
    this.roops_core_objects_CacheList_firstCachedNode = ((roops.core.objects.CacheListNode)(null));
    this.roops_core_objects_CacheList_cacheSize = (byte)0;
    this.roops_core_objects_CacheList_maximumCacheSize = (byte)0;
    {
    }
  }

}
