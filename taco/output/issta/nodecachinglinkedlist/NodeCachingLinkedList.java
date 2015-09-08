package issta.nodecachinglinkedlist;

//@ model import org.jmlspecs.lang.*;

/** @j2daType
*/
public /*@ nullable_by_default @*/ class NodeCachingLinkedList extends java.lang.Object {

  public issta.nodecachinglinkedlist.LinkedListNode issta_nodecachinglinkedlist_NodeCachingLinkedList_header;
  public issta.nodecachinglinkedlist.LinkedListNode issta_nodecachinglinkedlist_NodeCachingLinkedList_firstCachedNode;
  public int issta_nodecachinglinkedlist_NodeCachingLinkedList_maximumCacheSize;
  public int issta_nodecachinglinkedlist_NodeCachingLinkedList_cacheSize;
  public int issta_nodecachinglinkedlist_NodeCachingLinkedList_size;
  public int issta_nodecachinglinkedlist_NodeCachingLinkedList_DEFAULT_MAXIMUM_CACHE_SIZE;
  public int issta_nodecachinglinkedlist_NodeCachingLinkedList_modCount;
  /*@ invariant this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header  !=  null && this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header.issta_nodecachinglinkedlist_LinkedListNode_next  !=  null && this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header.issta_nodecachinglinkedlist_LinkedListNode_previous  !=  null && (\forall issta.nodecachinglinkedlist.LinkedListNode n; \reach(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header, issta.nodecachinglinkedlist.LinkedListNode, issta_nodecachinglinkedlist_LinkedListNode_next).has(((java.lang.Object)(n))); n  !=  null && n.issta_nodecachinglinkedlist_LinkedListNode_previous  !=  null && n.issta_nodecachinglinkedlist_LinkedListNode_previous.issta_nodecachinglinkedlist_LinkedListNode_next  ==  n && n.issta_nodecachinglinkedlist_LinkedListNode_next  !=  null && n.issta_nodecachinglinkedlist_LinkedListNode_next.issta_nodecachinglinkedlist_LinkedListNode_previous  ==  n) && this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size + 1  ==  \reach(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header, issta.nodecachinglinkedlist.LinkedListNode, issta_nodecachinglinkedlist_LinkedListNode_next).int_size() && this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size  >=  0;
    @*/
  /*@ invariant (\forall issta.nodecachinglinkedlist.LinkedListNode m; \reach(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_firstCachedNode, issta.nodecachinglinkedlist.LinkedListNode, issta_nodecachinglinkedlist_LinkedListNode_next).has(((java.lang.Object)(m))); \reach(m.issta_nodecachinglinkedlist_LinkedListNode_next, issta.nodecachinglinkedlist.LinkedListNode, issta_nodecachinglinkedlist_LinkedListNode_next).has(((java.lang.Object)(m)))  ==  false && m.issta_nodecachinglinkedlist_LinkedListNode_previous  ==  null);
    @*/
  /*@ invariant this.issta_nodecachinglinkedlist_NodeCachingLinkedList_cacheSize  <=  this.issta_nodecachinglinkedlist_NodeCachingLinkedList_maximumCacheSize;
    @*/
  /*@ invariant this.issta_nodecachinglinkedlist_NodeCachingLinkedList_DEFAULT_MAXIMUM_CACHE_SIZE  ==  3;
    @*/
  /*@ invariant this.issta_nodecachinglinkedlist_NodeCachingLinkedList_cacheSize  ==  \reach(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_firstCachedNode, issta.nodecachinglinkedlist.LinkedListNode, issta_nodecachinglinkedlist_LinkedListNode_next).int_size();
    @*/

  public NodeCachingLinkedList() {
    this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header = ((issta.nodecachinglinkedlist.LinkedListNode)(null));
    this.issta_nodecachinglinkedlist_NodeCachingLinkedList_firstCachedNode = ((issta.nodecachinglinkedlist.LinkedListNode)(null));
    this.issta_nodecachinglinkedlist_NodeCachingLinkedList_maximumCacheSize = (byte)0;
    this.issta_nodecachinglinkedlist_NodeCachingLinkedList_cacheSize = (byte)0;
    this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size = (byte)0;
    this.issta_nodecachinglinkedlist_NodeCachingLinkedList_DEFAULT_MAXIMUM_CACHE_SIZE = (byte)0;
    this.issta_nodecachinglinkedlist_NodeCachingLinkedList_modCount = (byte)0;
    {
      issta.nodecachinglinkedlist.LinkedListNode t_1;

      t_1 = new issta.nodecachinglinkedlist.LinkedListNode();
      this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header = t_1;
      this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header.issta_nodecachinglinkedlist_LinkedListNode_next = this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header;
      this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header.issta_nodecachinglinkedlist_LinkedListNode_previous = this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header;
      this.issta_nodecachinglinkedlist_NodeCachingLinkedList_firstCachedNode = ((issta.nodecachinglinkedlist.LinkedListNode)(null));
      this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size = 0;
      this.issta_nodecachinglinkedlist_NodeCachingLinkedList_cacheSize = 0;
      this.issta_nodecachinglinkedlist_NodeCachingLinkedList_DEFAULT_MAXIMUM_CACHE_SIZE = 3;
      this.issta_nodecachinglinkedlist_NodeCachingLinkedList_maximumCacheSize = 3;
      this.issta_nodecachinglinkedlist_NodeCachingLinkedList_modCount = 0;
    }
  }


  /*@ 
    @ requires index  >=  0 && index  <  this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size;
    @ requires this.issta_nodecachinglinkedlist_NodeCachingLinkedList_maximumCacheSize  ==  this.issta_nodecachinglinkedlist_NodeCachingLinkedList_DEFAULT_MAXIMUM_CACHE_SIZE;
    @ ensures this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size  ==  \old(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size) - 1;
    @ ensures \old(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_cacheSize)  <  this.issta_nodecachinglinkedlist_NodeCachingLinkedList_maximumCacheSize ==> this.issta_nodecachinglinkedlist_NodeCachingLinkedList_cacheSize  ==  \old(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_cacheSize) + 1;
    @ ensures this.issta_nodecachinglinkedlist_NodeCachingLinkedList_modCount  ==  \old(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_modCount) + 1;
    @ ensures (index  ==  0 && this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size  >  0) ==> \result  ==  \old(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header.issta_nodecachinglinkedlist_LinkedListNode_next.issta_nodecachinglinkedlist_LinkedListNode_value);
    @ ensures (index  ==  1 && this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size  >  1) ==> \result  ==  \old(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header.issta_nodecachinglinkedlist_LinkedListNode_next.issta_nodecachinglinkedlist_LinkedListNode_next.issta_nodecachinglinkedlist_LinkedListNode_value);
    @ ensures (index  ==  2 && this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size  >  2) ==> \result  ==  \old(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header.issta_nodecachinglinkedlist_LinkedListNode_next.issta_nodecachinglinkedlist_LinkedListNode_next.issta_nodecachinglinkedlist_LinkedListNode_next.issta_nodecachinglinkedlist_LinkedListNode_value);
    @ ensures (\forall issta.nodecachinglinkedlist.LinkedListNode n; \reach(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header, issta.nodecachinglinkedlist.LinkedListNode, issta_nodecachinglinkedlist_LinkedListNode_next).has(((java.lang.Object)(n))); \old(\reach(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header, issta.nodecachinglinkedlist.LinkedListNode, issta_nodecachinglinkedlist_LinkedListNode_next)).has(((java.lang.Object)(n))));
    @ ensures (\exists issta.nodecachinglinkedlist.LinkedListNode n; \old(\reach(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header, issta.nodecachinglinkedlist.LinkedListNode, issta_nodecachinglinkedlist_LinkedListNode_next)).has(((java.lang.Object)(n))); \reach(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header, issta.nodecachinglinkedlist.LinkedListNode, issta_nodecachinglinkedlist_LinkedListNode_next).has(((java.lang.Object)(n)))  ==  false);
    @ ensures (\forall issta.nodecachinglinkedlist.LinkedListNode n; \old(\reach(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_firstCachedNode, issta.nodecachinglinkedlist.LinkedListNode, issta_nodecachinglinkedlist_LinkedListNode_next)).has(((java.lang.Object)(n))); \reach(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_firstCachedNode, issta.nodecachinglinkedlist.LinkedListNode, issta_nodecachinglinkedlist_LinkedListNode_next).has(((java.lang.Object)(n))));
    @ ensures (\forall issta.nodecachinglinkedlist.LinkedListNode n; \old(\reach(this.issta_nodecachinglinkedlist_NodeCachingLinkedList_firstCachedNode, issta.nodecachinglinkedlist.LinkedListNode, issta_nodecachinglinkedlist_LinkedListNode_next)).has(((java.lang.Object)(n))); n.issta_nodecachinglinkedlist_LinkedListNode_previous  ==  null);
    @ ensures this.issta_nodecachinglinkedlist_NodeCachingLinkedList_maximumCacheSize  ==  this.issta_nodecachinglinkedlist_NodeCachingLinkedList_DEFAULT_MAXIMUM_CACHE_SIZE;
    @ signals (java.lang.RuntimeException e) false;
    @*/
  public /*@ nullable @*/ java.lang.Object remove(final int index) {
    int param_index_0;

    param_index_0 = index;
    {
      boolean t_3;
      boolean t_5;
      boolean t_7;
      int t_10;
      boolean t_11;
      boolean t_12;
      issta.nodecachinglinkedlist.LinkedListNode var_1_node = ((issta.nodecachinglinkedlist.LinkedListNode)(null));

      t_3 = param_index_0  <  0;

      if (t_3) {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_2;

                  t_2 = new java.lang.RuntimeException();
                  throw t_2;
                }
              }
            }
          }
        }
      }
      t_5 = param_index_0  ==  this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size;

      if (t_5) {
        {
          {
            {
              {
                {
                  java.lang.RuntimeException t_4;

                  t_4 = new java.lang.RuntimeException();
                  throw t_4;
                }
              }
            }
          }
        }
      }
      t_7 = param_index_0  >  this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size;

      if (t_7) {
        {
          {
            {
              {
                {
                  java.lang.IndexOutOfBoundsException t_6;

                  t_6 = new java.lang.IndexOutOfBoundsException();
                  throw t_6;
                }
              }
            }
          }
        }
      }
      t_10 = this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size / 2;
      t_11 = param_index_0  <  t_10;

      if (t_11) {
        {
          {
            {
              {
                {
                  var_1_node = this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header.issta_nodecachinglinkedlist_LinkedListNode_next;
                  int var_2_currentIndex = 0;
                  boolean var_3_ws_1;

                  var_3_ws_1 = var_2_currentIndex  <  param_index_0;

                  /*@ decreasing index - var_2_currentIndex;
                    @*/
                  while (var_3_ws_1) {
                    int t_8;

                    var_1_node = var_1_node.issta_nodecachinglinkedlist_LinkedListNode_next;
                    t_8 = var_2_currentIndex;
                    var_2_currentIndex = var_2_currentIndex + (byte)1;
                    var_3_ws_1 = var_2_currentIndex  <  index;
                  }
                }
              }
            }
          }
        }
      } else {
        {
          {
            {
              {
                {
                  var_1_node = this.issta_nodecachinglinkedlist_NodeCachingLinkedList_header;
                  int var_4_currentIndex = this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size;
                  boolean var_5_ws_2;

                  var_5_ws_2 = var_4_currentIndex  >  param_index_0;

                  /*@ decreasing var_4_currentIndex - index;
                    @*/
                  while (var_5_ws_2) {
                    int t_9;

                    var_1_node = var_1_node.issta_nodecachinglinkedlist_LinkedListNode_previous;
                    t_9 = var_4_currentIndex;
                    var_4_currentIndex = var_4_currentIndex + (byte)-1;
                    var_5_ws_2 = var_4_currentIndex  >  index;
                  }
                }
              }
            }
          }
        }
      }
      java.lang.Object var_6_oldValue;

      var_6_oldValue = var_1_node.issta_nodecachinglinkedlist_LinkedListNode_value;
      var_1_node.issta_nodecachinglinkedlist_LinkedListNode_previous.issta_nodecachinglinkedlist_LinkedListNode_next = var_1_node.issta_nodecachinglinkedlist_LinkedListNode_next;
      var_1_node.issta_nodecachinglinkedlist_LinkedListNode_next.issta_nodecachinglinkedlist_LinkedListNode_previous = var_1_node.issta_nodecachinglinkedlist_LinkedListNode_previous;
      this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size = this.issta_nodecachinglinkedlist_NodeCachingLinkedList_size - 1;
      this.issta_nodecachinglinkedlist_NodeCachingLinkedList_modCount = this.issta_nodecachinglinkedlist_NodeCachingLinkedList_modCount + 1;
      t_12 = this.issta_nodecachinglinkedlist_NodeCachingLinkedList_cacheSize  <  this.issta_nodecachinglinkedlist_NodeCachingLinkedList_maximumCacheSize;
      if (t_12) {
        {
          {
            {
              {
                {
                  issta.nodecachinglinkedlist.LinkedListNode var_7_nextCachedNode;

                  var_7_nextCachedNode = this.issta_nodecachinglinkedlist_NodeCachingLinkedList_firstCachedNode;
                  var_1_node.issta_nodecachinglinkedlist_LinkedListNode_previous = ((issta.nodecachinglinkedlist.LinkedListNode)(null));
                  var_1_node.issta_nodecachinglinkedlist_LinkedListNode_next = var_7_nextCachedNode;
                  var_1_node.issta_nodecachinglinkedlist_LinkedListNode_value = null;
                  this.issta_nodecachinglinkedlist_NodeCachingLinkedList_firstCachedNode = var_1_node;
                  this.issta_nodecachinglinkedlist_NodeCachingLinkedList_cacheSize = this.issta_nodecachinglinkedlist_NodeCachingLinkedList_cacheSize + 1;
                }
              }
            }
          }
        }
      }

      return var_6_oldValue;
    }
  }

}
