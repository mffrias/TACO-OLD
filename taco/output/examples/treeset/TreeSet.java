package examples.treeset;

//@ model import org.jmlspecs.lang.*;

/** Red-Black tree based implementation of the <tt>SortedMap</tt> interface.
 This class guarantees that the map will be in ascending key order, sorted
 according to the <i>natural order</i> for the key's class (see
 <tt>Comparable</tt>), or by the comparator provided at creation time,
 depending on which constructor is used.<p>
 This implementation provides guaranteed log(n) time cost for the
 <tt>containsKey</tt>, <tt>get</tt>, <tt>put</tt> and <tt>remove</tt>
 operations.  Algorithms are adaptations of those in Cormen, Leiserson, and
 Rivest's <I>Introduction to Algorithms</I>.<p>
 Note that the ordering maintained by a sorted map (whether or not an
 explicit comparator is provided) must be <i>consistent with equals</i> if
 this sorted map is to correctly implement the <tt>Map</tt> interface.  (See
 <tt>Comparable</tt> or <tt>Comparator</tt> for a precise definition of
 <i>consistent with equals</i>.)  This is so because the <tt>Map</tt>
 interface is defined in terms of the equals operation, but a map performs
 all key comparisons using its <tt>compareTo</tt> (or <tt>compare</tt>)
 method, so two keys that are deemed equal by this method are, from the
 standpoint of the sorted map, equal.  The behavior of a sorted map
 <i>is</i> well-defined even if its ordering is inconsistent with equals; it
 just fails to obey the general contract of the <tt>Map</tt> interface.<p>
 <b>Note that this implementation is not synchronized.</b> If multiple
 threads access a map concurrently, and at least one of the threads modifies
 the map structurally, it <i>must</i> be synchronized externally.  (A
 structural modification is any operation that adds or deletes one or more
 mappings; merely changing the value associated with an existing key is not
 a structural modification.)  This is typically accomplished by
 synchronizing on some object that naturally encapsulates the map.  If no
 such object exists, the map should be "wrapped" using the
 <tt>Collections.synchronizedMap</tt> method.  This is best done at creation
 time, to prevent accidental unsynchronized access to the map: 
 <pre>
     Map m = Collections.synchronizedMap(new TreeMap(...));
 </pre><p>
 The iterators returned by all of this class's "collection view methods" are
 <i>fail-fast</i>: if the map is structurally modified at any time after the
 iterator is created, in any way except through the iterator's own
 <tt>remove</tt> or <tt>add</tt> methods, the iterator throws a
 <tt>ConcurrentModificationException</tt>.  Thus, in the face of concurrent
 modification, the iterator fails quickly and cleanly, rather than risking
 arbitrary, non-deterministic behavior at an undetermined time in the
 future.
 <p>Note that the fail-fast behavior of an iterator cannot be guaranteed
 as it is, generally speaking, impossible to make any hard guarantees in the
 presence of unsynchronized concurrent modification.  Fail-fast iterators
 throw <tt>ConcurrentModificationException</tt> on a best-effort basis. 
 Therefore, it would be wrong to write a program that depended on this
 exception for its correctness:   <i>the fail-fast behavior of iterators
 should be used only to detect bugs.</i><p>
 This class is a member of the 
 <a href="{@docRoot}/../guide/collections/index.html">
 Java Collections Framework</a>.
 @author  Josh Bloch and Doug Lea
 @version 1.56, 01/23/03
 @see Map
 @see HashMap
 @see Hashtable
 @see Comparable
 @see Comparator
 @see Collection
 @see Collections#synchronizedMap(Map)
 @since 1.2
  @Invariant ( this.RED==false ) && 
		( this.BLACK==true ) &&
		( this.root.parent in null ) &&
		( this.root!=null => this.root.color = this.BLACK ) && 
		( all n: TreeSetEntry | n in this.root.*(left @+ right @+ parent) @- null => ( 
				(n.key != null ) &&
				( n.left != null => n.left.parent = n ) &&
				( n.right != null => n.right.parent = n ) &&
				( n.parent != null => n in n.parent.(left @+ right) ) &&
				( n !in n.^parent ) &&
				( all x : TreeSetEntry | (( x in n.left.^(left @+ right) @+ n.left @- null ) => ( n.key > x.key )) ) &&
				( all x : TreeSetEntry | (( x in n.right.^(left @+ right) @+ n.right @- null ) => ( x.key > n.key ))) &&
				( n.color = this.RED && n.parent != null => n.parent.color = this.BLACK ) && 
				( ( n.left=null && n.right=null ) => ( n.blackHeight=1 ) ) &&
				( n.left!=null && n.right=null => ( 
				      ( n.left.color = this.RED ) && 
				      ( n.left.blackHeight = 1 ) && 
				      ( n.blackHeight = 1 )  
				)) &&
				( n.left=null && n.right!=null =>  ( 
				      ( n.right.color = this.RED ) && 
				      ( n.right.blackHeight = 1 ) && 
				      ( n.blackHeight = 1 ) 
				 )) && 
				( n.left!=null && n.right!=null && n.left.color=this.RED && n.right.color=this.RED => ( 
				        ( n.left.blackHeight = n.right.blackHeight ) && 
				        ( n.blackHeight = n.left.blackHeight ) 
				)) && 
				( n.left!=null && n.right!=null && n.left.color=this.BLACK && n.right.color=this.BLACK => ( 
				        ( n.left.blackHeight=n.right.blackHeight ) && 
				        ( n.blackHeight=n.left.blackHeight + 1 )  
				)) && 
				( n.left!=null && n.right!=null && n.left.color=this.RED && n.right.color=this.BLACK => ( 
				        ( n.left.blackHeight=n.right.blackHeight + 1 ) && 
				        ( n.blackHeight = n.left.blackHeight  )  
				)) && 
				( n.left!=null && n.right!=null && n.left.color=this.BLACK && n.right.color=this.RED => ( 
				        ( n.right.blackHeight=n.left.blackHeight + 1 ) && 
				        ( n.blackHeight = n.right.blackHeight  )  )) 
				)) ; 
  @SpecField entries : set TreeSetEntry from this.root, this.entries.left, this.entries.right, this.entries.parent, this.entries.color, this.entries.key | 
            this.entries = this.root.*(left @+ right) @- null ;
*/
class TreeSet extends java.lang.Object {

  /*@ nullable @*/ examples.treeset.TreeSetEntry examples_treeset_TreeSet_root;
  int examples_treeset_TreeSet_size;
  int examples_treeset_TreeSet_modCount;
  boolean examples_treeset_TreeSet_RED;
  boolean examples_treeset_TreeSet_BLACK;

  public TreeSet() {
    this.examples_treeset_TreeSet_root = ((examples.treeset.TreeSetEntry)(null));
    this.examples_treeset_TreeSet_size = 0;
    this.examples_treeset_TreeSet_modCount = 0;
    this.examples_treeset_TreeSet_RED = false;
    this.examples_treeset_TreeSet_BLACK = true;
    {
    }
  }
/** @Ensures return = true <=> (some n: TreeSetEntry | n in this.entries && n.key=aKey) ;
*/

  public boolean contains(int aKey) {
    examples.treeset.TreeSetEntry t_1;
    boolean t_2;

    t_1 = this.getEntry(aKey);
    t_2 = t_1  !=  null;

    return t_2;
  }
/** Returns this map's entry for the given key, or <tt>null</tt> if the map
 does not contain an entry for the key.
 @return this map's entry for the given key, or <tt>null</tt> if the map
                does not contain an entry for the key.
 @throws ClassCastException if the key cannot be compared with the keys
                  currently in the map.
 @throws NullPointerException key is <tt>null</tt> and this map uses
                  natural order, or its comparator does not tolerate *
                  <tt>null</tt> keys.
*/

  private examples.treeset.TreeSetEntry getEntry(int key) {
    boolean t_3;
    boolean t_4;
    boolean t_5;
    examples.treeset.TreeSetEntry var_1_p = this.examples_treeset_TreeSet_root;
    boolean var_2_key_was_found = false;
    boolean var_3_ws_1;

    t_4 = ! var_2_key_was_found;
    t_5 = var_1_p  !=  null;

    if (t_4) {
      {
        if (t_5) {
          {
            t_3 = true;
          }
        } else {
          {
            t_3 = false;
          }
        }
      }
    } else {
      {
        t_3 = false;
      }
    }
    var_3_ws_1 = t_3;
    while (var_3_ws_1) {
      boolean t_7;
      boolean t_8;
      boolean t_9;
      boolean t_10;

      t_7 = key  ==  var_1_p.examples_treeset_TreeSetEntry_key;

      if (t_7) {
        {
          {
            {
              {
                {
                  var_2_key_was_found = true;
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
                  boolean t_6;

                  t_6 = key  <  var_1_p.examples_treeset_TreeSetEntry_key;
                  if (t_6) {
                    {
                      {
                        {
                          {
                            {
                              var_1_p = var_1_p.examples_treeset_TreeSetEntry_left;
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
                              var_1_p = var_1_p.examples_treeset_TreeSetEntry_right;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      t_9 = ! var_2_key_was_found;
      t_10 = var_1_p  !=  null;

      if (t_9) {
        {
          if (t_10) {
            {
              t_8 = true;
            }
          } else {
            {
              t_8 = false;
            }
          }
        }
      } else {
        {
          t_8 = false;
        }
      }
      var_3_ws_1 = t_8;
    }

    return var_1_p;
  }
/** @Modifies_Everything
 
 @Requires entry !in this.entries && entry!=null && entry.left==null && entry.right==null && entry.color==false && entry.parent==null && entry.key==0;
 
 @Ensures ( (some n: TreeSetEntry | n in @old(this.entries) && n.key=aKey ) => (this.entries = @old(this.entries)) ) &&
          ( (no   n: TreeSetEntry | n in @old(this.entries) && n.key=aKey ) => ( some m: TreeSetEntry | ( this.entries = @old(this.entries)  @+ m ) && m.key=aKey ) ) ;
*/

  public void add(final int aKey, final examples.treeset.TreeSetEntry entry) {
    boolean t_23;
    examples.treeset.TreeSetEntry var_4_t = this.examples_treeset_TreeSet_root;

    t_23 = var_4_t  ==  null;
    if (t_23) {
      {
        {
          {
            {
              {
                int t_11;

                entry.examples_treeset_TreeSetEntry_key = aKey;
                entry.examples_treeset_TreeSetEntry_parent = ((examples.treeset.TreeSetEntry)(null));
                this.examples_treeset_TreeSet_root = entry;
                this.examples_treeset_TreeSet_size = 1;
                t_11 = this.examples_treeset_TreeSet_modCount;
                this.examples_treeset_TreeSet_modCount = this.examples_treeset_TreeSet_modCount + (byte)1;
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
                boolean t_12;
                boolean t_13;
                boolean t_14;
                boolean t_22;
                examples.treeset.TreeSetEntry var_5_curr_parent = ((examples.treeset.TreeSetEntry)(null));
                boolean var_6_exit = false;
                boolean var_7_aKey_minus_t_key = false;
                boolean var_8_exit_method = false;
                boolean var_9_ws_2;

                t_13 = var_4_t  !=  null;
                t_14 = var_6_exit  ==  false;

                if (t_13) {
                  {
                    if (t_14) {
                      {
                        t_12 = true;
                      }
                    } else {
                      {
                        t_12 = false;
                      }
                    }
                  }
                } else {
                  {
                    t_12 = false;
                  }
                }
                var_9_ws_2 = t_12;
                while (var_9_ws_2) {
                  boolean t_16;
                  boolean t_17;
                  boolean t_18;
                  boolean t_19;

                  var_5_curr_parent = var_4_t;
                  t_16 = aKey  <  var_4_t.examples_treeset_TreeSetEntry_key;

                  if (t_16) {
                    {
                      {
                        {
                          {
                            {
                              var_7_aKey_minus_t_key = true;
                              var_4_t = var_4_t.examples_treeset_TreeSetEntry_left;
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
                              boolean t_15;

                              t_15 = aKey  >  var_4_t.examples_treeset_TreeSetEntry_key;
                              if (t_15) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          var_7_aKey_minus_t_key = false;
                                          var_4_t = var_4_t.examples_treeset_TreeSetEntry_right;
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
                                          var_7_aKey_minus_t_key = false;
                                          var_6_exit = true;
                                          var_8_exit_method = true;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  t_18 = var_4_t  !=  null;
                  t_19 = var_6_exit  ==  false;

                  if (t_18) {
                    {
                      if (t_19) {
                        {
                          t_17 = true;
                        }
                      } else {
                        {
                          t_17 = false;
                        }
                      }
                    }
                  } else {
                    {
                      t_17 = false;
                    }
                  }
                  var_9_ws_2 = t_17;
                }
                t_22 = var_8_exit_method  ==  false;
                if (t_22) {
                  {
                    {
                      {
                        {
                          {
                            int t_20;
                            int t_21;

                            entry.examples_treeset_TreeSetEntry_key = aKey;
                            entry.examples_treeset_TreeSetEntry_parent = var_5_curr_parent;

                            if (var_7_aKey_minus_t_key) {
                              {
                                {
                                  {
                                    {
                                      {
                                        var_5_curr_parent.examples_treeset_TreeSetEntry_left = entry;
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
                                        var_5_curr_parent.examples_treeset_TreeSetEntry_right = entry;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            this.fixAfterInsertion(entry);
                            t_20 = this.examples_treeset_TreeSet_size;
                            this.examples_treeset_TreeSet_size = this.examples_treeset_TreeSet_size + (byte)1;
                            t_21 = this.examples_treeset_TreeSet_modCount;
                            this.examples_treeset_TreeSet_modCount = this.examples_treeset_TreeSet_modCount + (byte)1;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
/** Balancing operations.
 Implementations of rebalancings during insertion and deletion are
 slightly different than the CLR version.  Rather than using dummy
 nilnodes, we use a set of accessors that deal properly with null.  They
 are used to avoid messiness surrounding nullness checks in the main
 algorithms.
*/

  private static boolean colorOf(examples.treeset.TreeSetEntry p) {
    boolean t_24;
    boolean t_25;
    boolean var_10_black = true;

    t_25 = p  ==  null;
    if (t_25) {
      {
        t_24 = var_10_black;
      }
    } else {
      {
        t_24 = p.examples_treeset_TreeSetEntry_color;
      }
    }

    return (t_24);
  }


  private static examples.treeset.TreeSetEntry parentOf(examples.treeset.TreeSetEntry p) {
    examples.treeset.TreeSetEntry t_26;
    boolean t_27;

    t_27 = p  ==  null;
    if (t_27) {
      {
        t_26 = null;
      }
    } else {
      {
        t_26 = p.examples_treeset_TreeSetEntry_parent;
      }
    }

    return (t_26);
  }


  private static void setColor(examples.treeset.TreeSetEntry p, boolean c) {
    boolean t_28;

    t_28 = p  !=  null;
    if (t_28) {
      {
        {
          {
            {
              {
                p.examples_treeset_TreeSetEntry_color = c;
              }
            }
          }
        }
      }
    }
  }


  private static examples.treeset.TreeSetEntry leftOf(examples.treeset.TreeSetEntry p) {
    examples.treeset.TreeSetEntry t_29;
    boolean t_30;

    t_30 = p  ==  null;
    if ((t_30)) {
      {
        t_29 = null;
      }
    } else {
      {
        t_29 = p.examples_treeset_TreeSetEntry_left;
      }
    }

    return t_29;
  }


  private static examples.treeset.TreeSetEntry rightOf(examples.treeset.TreeSetEntry p) {
    examples.treeset.TreeSetEntry t_31;
    boolean t_32;

    t_32 = p  ==  null;
    if ((t_32)) {
      {
        t_31 = null;
      }
    } else {
      {
        t_31 = p.examples_treeset_TreeSetEntry_right;
      }
    }

    return t_31;
  }
/** From CLR 
*/

  private void rotateLeft(examples.treeset.TreeSetEntry p) {
    boolean t_36;

    t_36 = p  !=  null;
    if (t_36) {
      {
        {
          {
            {
              {
                boolean t_33;
                boolean t_35;
                examples.treeset.TreeSetEntry var_11_r = p.examples_treeset_TreeSetEntry_right;

                p.examples_treeset_TreeSetEntry_right = var_11_r.examples_treeset_TreeSetEntry_left;
                t_33 = var_11_r.examples_treeset_TreeSetEntry_left  !=  null;

                if (t_33) {
                  {
                    {
                      {
                        {
                          {
                            var_11_r.examples_treeset_TreeSetEntry_left.examples_treeset_TreeSetEntry_parent = p;
                          }
                        }
                      }
                    }
                  }
                }
                var_11_r.examples_treeset_TreeSetEntry_parent = p.examples_treeset_TreeSetEntry_parent;
                t_35 = p.examples_treeset_TreeSetEntry_parent  ==  null;

                if (t_35) {
                  {
                    {
                      {
                        {
                          {
                            this.examples_treeset_TreeSet_root = var_11_r;
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
                            boolean t_34;

                            t_34 = p.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_left  ==  p;
                            if (t_34) {
                              {
                                {
                                  {
                                    {
                                      {
                                        p.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_left = var_11_r;
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
                                        p.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_right = var_11_r;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var_11_r.examples_treeset_TreeSetEntry_left = p;
                p.examples_treeset_TreeSetEntry_parent = var_11_r;
              }
            }
          }
        }
      }
    }
  }
/** From CLR 
*/

  private void rotateRight(examples.treeset.TreeSetEntry p) {
    boolean t_40;

    t_40 = p  !=  null;
    if (t_40) {
      {
        {
          {
            {
              {
                boolean t_37;
                boolean t_39;
                examples.treeset.TreeSetEntry var_12_l = p.examples_treeset_TreeSetEntry_left;

                p.examples_treeset_TreeSetEntry_left = var_12_l.examples_treeset_TreeSetEntry_right;
                t_37 = var_12_l.examples_treeset_TreeSetEntry_right  !=  null;

                if (t_37) {
                  {
                    {
                      {
                        {
                          {
                            var_12_l.examples_treeset_TreeSetEntry_right.examples_treeset_TreeSetEntry_parent = p;
                          }
                        }
                      }
                    }
                  }
                }
                var_12_l.examples_treeset_TreeSetEntry_parent = p.examples_treeset_TreeSetEntry_parent;
                t_39 = p.examples_treeset_TreeSetEntry_parent  ==  null;

                if (t_39) {
                  {
                    {
                      {
                        {
                          {
                            this.examples_treeset_TreeSet_root = var_12_l;
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
                            boolean t_38;

                            t_38 = p.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_right  ==  p;
                            if (t_38) {
                              {
                                {
                                  {
                                    {
                                      {
                                        p.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_right = var_12_l;
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
                                        p.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_left = var_12_l;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var_12_l.examples_treeset_TreeSetEntry_right = p;
                p.examples_treeset_TreeSetEntry_parent = var_12_l;
              }
            }
          }
        }
      }
    }
  }
/** From CLR 
*/

  private void fixAfterInsertion(final examples.treeset.TreeSetEntry entry) {
    boolean t_41;
    boolean t_42;
    boolean t_43;
    boolean t_44;
    boolean t_45;
    examples.treeset.TreeSetEntry var_13_x = entry;

    var_13_x.examples_treeset_TreeSetEntry_color = this.examples_treeset_TreeSet_RED;
    boolean var_14_ws_3;

    t_43 = var_13_x  !=  null;
    t_44 = var_13_x  !=  this.examples_treeset_TreeSet_root;

    if (t_43) {
      {
        if (t_44) {
          {
            t_42 = true;
          }
        } else {
          {
            t_42 = false;
          }
        }
      }
    } else {
      {
        t_42 = false;
      }
    }
    t_45 = var_13_x.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_color  ==  this.examples_treeset_TreeSet_RED;

    if (t_42) {
      {
        if (t_45) {
          {
            t_41 = true;
          }
        } else {
          {
            t_41 = false;
          }
        }
      }
    } else {
      {
        t_41 = false;
      }
    }
    var_14_ws_3 = t_41;
    while (var_14_ws_3) {
      examples.treeset.TreeSetEntry t_90;
      examples.treeset.TreeSetEntry t_91;
      examples.treeset.TreeSetEntry t_92;
      examples.treeset.TreeSetEntry t_93;
      boolean t_94;
      boolean t_95;
      boolean t_96;
      boolean t_97;
      boolean t_98;
      boolean t_99;

      t_90 = parentOf(var_13_x);
      t_91 = parentOf(var_13_x);
      t_92 = parentOf(t_91);
      t_93 = leftOf(t_92);
      t_94 = t_90  ==  t_93;

      if (t_94) {
        {
          {
            {
              {
                {
                  examples.treeset.TreeSetEntry t_46;
                  examples.treeset.TreeSetEntry t_47;
                  examples.treeset.TreeSetEntry t_48;
                  boolean t_66;
                  boolean t_67;

                  t_46 = parentOf(var_13_x);
                  t_47 = parentOf(t_46);
                  t_48 = rightOf(t_47);
                  examples.treeset.TreeSetEntry var_15_y = t_48;

                  t_66 = colorOf(var_15_y);
                  t_67 = t_66  ==  this.examples_treeset_TreeSet_RED;
                  if (t_67) {
                    {
                      {
                        {
                          {
                            {
                              examples.treeset.TreeSetEntry t_49;
                              examples.treeset.TreeSetEntry t_50;
                              examples.treeset.TreeSetEntry t_51;
                              examples.treeset.TreeSetEntry t_52;
                              examples.treeset.TreeSetEntry t_53;

                              t_49 = parentOf(var_13_x);
                              setColor(t_49, this.examples_treeset_TreeSet_BLACK);
                              setColor(var_15_y, this.examples_treeset_TreeSet_BLACK);
                              t_50 = parentOf(var_13_x);
                              t_51 = parentOf(t_50);
                              setColor(t_51, this.examples_treeset_TreeSet_RED);
                              t_52 = parentOf(var_13_x);
                              t_53 = parentOf(t_52);
                              var_13_x = t_53;
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
                              examples.treeset.TreeSetEntry t_55;
                              examples.treeset.TreeSetEntry t_56;
                              boolean t_57;
                              examples.treeset.TreeSetEntry t_58;
                              examples.treeset.TreeSetEntry t_59;
                              examples.treeset.TreeSetEntry t_60;
                              examples.treeset.TreeSetEntry t_63;
                              examples.treeset.TreeSetEntry t_64;
                              boolean t_65;

                              t_55 = parentOf(var_13_x);
                              t_56 = rightOf(t_55);
                              t_57 = var_13_x  ==  t_56;

                              if (t_57) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          examples.treeset.TreeSetEntry t_54;

                                          t_54 = parentOf(var_13_x);
                                          var_13_x = t_54;
                                          this.rotateLeft(var_13_x);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              t_58 = parentOf(var_13_x);
                              setColor(t_58, this.examples_treeset_TreeSet_BLACK);
                              t_59 = parentOf(var_13_x);
                              t_60 = parentOf(t_59);
                              setColor(t_60, this.examples_treeset_TreeSet_RED);
                              t_63 = parentOf(var_13_x);
                              t_64 = parentOf(t_63);
                              t_65 = t_64  !=  null;
                              if (t_65) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          examples.treeset.TreeSetEntry t_61;
                                          examples.treeset.TreeSetEntry t_62;

                                          t_61 = parentOf(var_13_x);
                                          t_62 = parentOf(t_61);
                                          this.rotateRight(t_62);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
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
                  examples.treeset.TreeSetEntry t_68;
                  examples.treeset.TreeSetEntry t_69;
                  examples.treeset.TreeSetEntry t_70;
                  boolean t_88;
                  boolean t_89;

                  t_68 = parentOf(var_13_x);
                  t_69 = parentOf(t_68);
                  t_70 = leftOf(t_69);
                  examples.treeset.TreeSetEntry var_16_y = t_70;

                  t_88 = colorOf(var_16_y);
                  t_89 = t_88  ==  this.examples_treeset_TreeSet_RED;
                  if (t_89) {
                    {
                      {
                        {
                          {
                            {
                              examples.treeset.TreeSetEntry t_71;
                              examples.treeset.TreeSetEntry t_72;
                              examples.treeset.TreeSetEntry t_73;
                              examples.treeset.TreeSetEntry t_74;
                              examples.treeset.TreeSetEntry t_75;

                              t_71 = parentOf(var_13_x);
                              setColor(t_71, this.examples_treeset_TreeSet_BLACK);
                              setColor(var_16_y, this.examples_treeset_TreeSet_BLACK);
                              t_72 = parentOf(var_13_x);
                              t_73 = parentOf(t_72);
                              setColor(t_73, this.examples_treeset_TreeSet_RED);
                              t_74 = parentOf(var_13_x);
                              t_75 = parentOf(t_74);
                              var_13_x = t_75;
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
                              examples.treeset.TreeSetEntry t_77;
                              examples.treeset.TreeSetEntry t_78;
                              boolean t_79;
                              examples.treeset.TreeSetEntry t_80;
                              examples.treeset.TreeSetEntry t_81;
                              examples.treeset.TreeSetEntry t_82;
                              examples.treeset.TreeSetEntry t_85;
                              examples.treeset.TreeSetEntry t_86;
                              boolean t_87;

                              t_77 = parentOf(var_13_x);
                              t_78 = leftOf(t_77);
                              t_79 = var_13_x  ==  t_78;

                              if (t_79) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          examples.treeset.TreeSetEntry t_76;

                                          t_76 = parentOf(var_13_x);
                                          var_13_x = t_76;
                                          this.rotateRight(var_13_x);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              t_80 = parentOf(var_13_x);
                              setColor(t_80, this.examples_treeset_TreeSet_BLACK);
                              t_81 = parentOf(var_13_x);
                              t_82 = parentOf(t_81);
                              setColor(t_82, this.examples_treeset_TreeSet_RED);
                              t_85 = parentOf(var_13_x);
                              t_86 = parentOf(t_85);
                              t_87 = t_86  !=  null;
                              if (t_87) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          examples.treeset.TreeSetEntry t_83;
                                          examples.treeset.TreeSetEntry t_84;

                                          t_83 = parentOf(var_13_x);
                                          t_84 = parentOf(t_83);
                                          this.rotateLeft(t_84);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      t_97 = var_13_x  !=  null;
      t_98 = var_13_x  !=  this.examples_treeset_TreeSet_root;

      if (t_97) {
        {
          if (t_98) {
            {
              t_96 = true;
            }
          } else {
            {
              t_96 = false;
            }
          }
        }
      } else {
        {
          t_96 = false;
        }
      }
      t_99 = var_13_x.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_color  ==  this.examples_treeset_TreeSet_RED;

      if (t_96) {
        {
          if (t_99) {
            {
              t_95 = true;
            }
          } else {
            {
              t_95 = false;
            }
          }
        }
      } else {
        {
          t_95 = false;
        }
      }
      var_14_ws_3 = t_95;
    }
    this.examples_treeset_TreeSet_root.examples_treeset_TreeSetEntry_color = this.examples_treeset_TreeSet_BLACK;
  }
/** @Modifies_Everything
 
 @Ensures this.entries.key=@old(this.entries.key) @- aKey;
*/

  public boolean remove(int aKey) {
    examples.treeset.TreeSetEntry t_100;
    boolean t_101;

    t_100 = this.getEntry(aKey);
    examples.treeset.TreeSetEntry var_17_p = t_100;

    t_101 = var_17_p  ==  null;
    if (t_101) {
      {
        {
          {
            {
              {
                return false;
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
                this.deleteEntry(var_17_p);

                return true;
              }
            }
          }
        }
      }
    }
  }
/** Delete node p, and then rebalance the tree.
*/

  private void deleteEntry(examples.treeset.TreeSetEntry p) {
    boolean t_103;
    boolean t_104;
    boolean t_105;
    examples.treeset.TreeSetEntry t_106;
    boolean t_107;
    boolean t_113;
    boolean t_118;

    this.decrementSize();
    t_104 = p.examples_treeset_TreeSetEntry_left  !=  null;
    t_105 = p.examples_treeset_TreeSetEntry_right  !=  null;

    if (t_104) {
      {
        if (t_105) {
          {
            t_103 = true;
          }
        } else {
          {
            t_103 = false;
          }
        }
      }
    } else {
      {
        t_103 = false;
      }
    }

    if (t_103) {
      {
        {
          {
            {
              {
                examples.treeset.TreeSetEntry t_102;

                t_102 = this.successor(p);
                examples.treeset.TreeSetEntry var_18_s = t_102;

                p.examples_treeset_TreeSetEntry_key = var_18_s.examples_treeset_TreeSetEntry_key;
                p = var_18_s;
              }
            }
          }
        }
      }
    }
    t_107 = p.examples_treeset_TreeSetEntry_left  !=  null;

    if (t_107) {
      {
        t_106 = p.examples_treeset_TreeSetEntry_left;
      }
    } else {
      {
        t_106 = p.examples_treeset_TreeSetEntry_right;
      }
    }
    examples.treeset.TreeSetEntry var_19_replacement = (t_106);
    examples.treeset.TreeSetEntry var_20_fix_argument = ((examples.treeset.TreeSetEntry)(null));
    boolean var_21_replacement_is_not_null = false;
    boolean var_22_else_branch = false;

    t_113 = var_19_replacement  !=  null;

    if (t_113) {
      {
        {
          {
            {
              {
                boolean t_109;
                examples.treeset.TreeSetEntry t_110;
                examples.treeset.TreeSetEntry t_111;

                var_19_replacement.examples_treeset_TreeSetEntry_parent = p.examples_treeset_TreeSetEntry_parent;
                t_109 = p.examples_treeset_TreeSetEntry_parent  ==  null;

                if (t_109) {
                  {
                    {
                      {
                        {
                          {
                            this.examples_treeset_TreeSet_root = var_19_replacement;
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
                            boolean t_108;

                            t_108 = p  ==  p.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_left;
                            if (t_108) {
                              {
                                {
                                  {
                                    {
                                      {
                                        p.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_left = var_19_replacement;
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
                                        p.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_right = var_19_replacement;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                p.examples_treeset_TreeSetEntry_parent = ((examples.treeset.TreeSetEntry)(null));
                t_110 = p.examples_treeset_TreeSetEntry_parent;
                p.examples_treeset_TreeSetEntry_right = t_110;
                t_111 = p.examples_treeset_TreeSetEntry_right;
                p.examples_treeset_TreeSetEntry_left = t_111;
                var_21_replacement_is_not_null = true;
                var_20_fix_argument = var_19_replacement;
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
                boolean t_112;

                t_112 = p.examples_treeset_TreeSetEntry_parent  ==  null;
                if (t_112) {
                  {
                    {
                      {
                        {
                          {
                            this.examples_treeset_TreeSet_root = ((examples.treeset.TreeSetEntry)(null));
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
                            var_22_else_branch = true;
                            var_20_fix_argument = p;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }

    if (var_22_else_branch) {
      {
        t_118 = true;
      }
    } else {
      {
        if (var_21_replacement_is_not_null) {
          {
            t_118 = true;
          }
        } else {
          {
            t_118 = false;
          }
        }
      }
    }
    if (t_118) {
      {
        {
          {
            {
              {
                boolean t_114;

                t_114 = p.examples_treeset_TreeSetEntry_color  ==  this.examples_treeset_TreeSet_BLACK;

                if (t_114) {
                  {
                    {
                      {
                        {
                          {
                            this.fixAfterDeletion(var_20_fix_argument);
                          }
                        }
                      }
                    }
                  }
                }
                if (var_22_else_branch) {
                  {
                    {
                      {
                        {
                          {
                            boolean t_117;

                            t_117 = p.examples_treeset_TreeSetEntry_parent  !=  null;
                            if (t_117) {
                              {
                                {
                                  {
                                    {
                                      {
                                        boolean t_116;

                                        t_116 = p  ==  p.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_left;

                                        if (t_116) {
                                          {
                                            {
                                              {
                                                {
                                                  {
                                                    p.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_left = ((examples.treeset.TreeSetEntry)(null));
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
                                                    boolean t_115;

                                                    t_115 = p  ==  p.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_right;
                                                    if (t_115) {
                                                      {
                                                        {
                                                          {
                                                            {
                                                              {
                                                                p.examples_treeset_TreeSetEntry_parent.examples_treeset_TreeSetEntry_right = ((examples.treeset.TreeSetEntry)(null));
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        p.examples_treeset_TreeSetEntry_parent = ((examples.treeset.TreeSetEntry)(null));
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
/** From CLR 
*/

  private void fixAfterDeletion(final examples.treeset.TreeSetEntry entry) {
    boolean t_119;
    boolean t_120;
    boolean t_121;
    examples.treeset.TreeSetEntry var_23_x;

    var_23_x = entry;
    boolean var_24_ws_4;

    t_120 = var_23_x  !=  this.examples_treeset_TreeSet_root;
    t_121 = var_23_x.examples_treeset_TreeSetEntry_color  ==  this.examples_treeset_TreeSet_BLACK;

    if (t_120) {
      {
        if (t_121) {
          {
            t_119 = true;
          }
        } else {
          {
            t_119 = false;
          }
        }
      }
    } else {
      {
        t_119 = false;
      }
    }
    var_24_ws_4 = t_119;
    while (var_24_ws_4) {
      examples.treeset.TreeSetEntry t_122;
      examples.treeset.TreeSetEntry t_123;
      boolean t_124;
      boolean t_160;
      boolean t_161;
      boolean t_162;
      boolean t_163;
      examples.treeset.TreeSetEntry var_25_parentOf_x;

      t_122 = parentOf(var_23_x);
      var_25_parentOf_x = t_122;
      examples.treeset.TreeSetEntry var_26_leftOf_parentOf_x;

      t_123 = leftOf(var_25_parentOf_x);
      var_26_leftOf_parentOf_x = t_123;
      boolean var_27_colorOf_parentOf_x;

      t_124 = colorOf(var_25_parentOf_x);
      var_27_colorOf_parentOf_x = t_124;
      t_160 = var_23_x  ==  var_26_leftOf_parentOf_x;

      if (t_160) {
        {
          {
            {
              {
                {
                  examples.treeset.TreeSetEntry t_125;
                  boolean t_126;
                  boolean t_129;
                  examples.treeset.TreeSetEntry t_130;
                  boolean t_131;
                  examples.treeset.TreeSetEntry t_132;
                  boolean t_133;
                  boolean t_140;
                  boolean t_141;
                  boolean t_142;
                  examples.treeset.TreeSetEntry var_28_sib;

                  t_125 = rightOf(var_25_parentOf_x);
                  var_28_sib = t_125;
                  boolean var_29_colorOf_sib;

                  t_126 = colorOf(var_28_sib);
                  var_29_colorOf_sib = t_126;
                  t_129 = var_29_colorOf_sib  ==  this.examples_treeset_TreeSet_RED;

                  if (t_129) {
                    {
                      {
                        {
                          {
                            {
                              examples.treeset.TreeSetEntry t_127;
                              examples.treeset.TreeSetEntry t_128;

                              setColor(var_28_sib, this.examples_treeset_TreeSet_BLACK);
                              setColor(var_25_parentOf_x, this.examples_treeset_TreeSet_RED);
                              this.rotateLeft(var_25_parentOf_x);
                              t_127 = parentOf(var_23_x);
                              var_25_parentOf_x = t_127;
                              t_128 = rightOf(var_25_parentOf_x);
                              var_28_sib = t_128;
                            }
                          }
                        }
                      }
                    }
                  }
                  examples.treeset.TreeSetEntry var_30_leftOf_sib;

                  t_130 = leftOf(var_28_sib);
                  var_30_leftOf_sib = t_130;
                  boolean var_31_colorOf_leftOf_sib;

                  t_131 = colorOf(var_30_leftOf_sib);
                  var_31_colorOf_leftOf_sib = t_131;
                  examples.treeset.TreeSetEntry var_32_rightOf_sib;

                  t_132 = rightOf(var_28_sib);
                  var_32_rightOf_sib = t_132;
                  boolean var_33_colorOf_rightOf_sib;

                  t_133 = colorOf(var_32_rightOf_sib);
                  var_33_colorOf_rightOf_sib = t_133;
                  t_141 = var_31_colorOf_leftOf_sib  ==  this.examples_treeset_TreeSet_BLACK;
                  t_142 = var_33_colorOf_rightOf_sib  ==  this.examples_treeset_TreeSet_BLACK;

                  if (t_141) {
                    {
                      if (t_142) {
                        {
                          t_140 = true;
                        }
                      } else {
                        {
                          t_140 = false;
                        }
                      }
                    }
                  } else {
                    {
                      t_140 = false;
                    }
                  }
                  if (t_140) {
                    {
                      {
                        {
                          {
                            {
                              setColor(var_28_sib, this.examples_treeset_TreeSet_RED);
                              var_23_x = var_25_parentOf_x;
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
                              boolean t_136;
                              examples.treeset.TreeSetEntry t_137;
                              boolean t_138;
                              examples.treeset.TreeSetEntry t_139;

                              t_136 = var_33_colorOf_rightOf_sib  ==  this.examples_treeset_TreeSet_BLACK;

                              if (t_136) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          examples.treeset.TreeSetEntry t_134;
                                          examples.treeset.TreeSetEntry t_135;

                                          setColor(var_30_leftOf_sib, this.examples_treeset_TreeSet_BLACK);
                                          setColor(var_28_sib, this.examples_treeset_TreeSet_RED);
                                          this.rotateRight(var_28_sib);
                                          t_134 = parentOf(var_23_x);
                                          var_25_parentOf_x = t_134;
                                          t_135 = rightOf(var_25_parentOf_x);
                                          var_28_sib = t_135;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              t_137 = parentOf(var_23_x);
                              var_25_parentOf_x = t_137;
                              t_138 = colorOf(var_25_parentOf_x);
                              var_27_colorOf_parentOf_x = t_138;
                              t_139 = rightOf(var_28_sib);
                              var_32_rightOf_sib = t_139;
                              setColor(var_28_sib, var_27_colorOf_parentOf_x);
                              setColor(var_25_parentOf_x, this.examples_treeset_TreeSet_BLACK);
                              setColor(var_32_rightOf_sib, this.examples_treeset_TreeSet_BLACK);
                              this.rotateLeft(var_25_parentOf_x);
                              var_23_x = this.examples_treeset_TreeSet_root;
                            }
                          }
                        }
                      }
                    }
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
                  boolean t_143;
                  boolean t_146;
                  examples.treeset.TreeSetEntry t_147;
                  boolean t_148;
                  examples.treeset.TreeSetEntry t_149;
                  boolean t_150;
                  boolean t_157;
                  boolean t_158;
                  boolean t_159;
                  examples.treeset.TreeSetEntry var_34_sib;

                  var_34_sib = var_26_leftOf_parentOf_x;
                  boolean var_35_colorOf_sib;

                  t_143 = colorOf(var_34_sib);
                  var_35_colorOf_sib = t_143;
                  t_146 = var_35_colorOf_sib  ==  this.examples_treeset_TreeSet_RED;

                  if (t_146) {
                    {
                      {
                        {
                          {
                            {
                              examples.treeset.TreeSetEntry t_144;
                              examples.treeset.TreeSetEntry t_145;

                              setColor(var_34_sib, this.examples_treeset_TreeSet_BLACK);
                              setColor(var_25_parentOf_x, this.examples_treeset_TreeSet_RED);
                              this.rotateRight(var_25_parentOf_x);
                              t_144 = parentOf(var_23_x);
                              var_25_parentOf_x = t_144;
                              t_145 = leftOf(var_25_parentOf_x);
                              var_34_sib = t_145;
                            }
                          }
                        }
                      }
                    }
                  }
                  examples.treeset.TreeSetEntry var_36_rightOf_sib;

                  t_147 = rightOf(var_34_sib);
                  var_36_rightOf_sib = t_147;
                  boolean var_37_colorOf_rightOf_sib;

                  t_148 = colorOf(var_36_rightOf_sib);
                  var_37_colorOf_rightOf_sib = t_148;
                  examples.treeset.TreeSetEntry var_38_leftOf_sib;

                  t_149 = leftOf(var_34_sib);
                  var_38_leftOf_sib = t_149;
                  boolean var_39_colorOf_leftOf_sib;

                  t_150 = colorOf(var_38_leftOf_sib);
                  var_39_colorOf_leftOf_sib = t_150;
                  t_158 = var_37_colorOf_rightOf_sib  ==  this.examples_treeset_TreeSet_BLACK;
                  t_159 = var_39_colorOf_leftOf_sib  ==  this.examples_treeset_TreeSet_BLACK;

                  if (t_158) {
                    {
                      if (t_159) {
                        {
                          t_157 = true;
                        }
                      } else {
                        {
                          t_157 = false;
                        }
                      }
                    }
                  } else {
                    {
                      t_157 = false;
                    }
                  }
                  if (t_157) {
                    {
                      {
                        {
                          {
                            {
                              setColor(var_34_sib, this.examples_treeset_TreeSet_RED);
                              var_23_x = var_25_parentOf_x;
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
                              boolean t_153;
                              examples.treeset.TreeSetEntry t_154;
                              boolean t_155;
                              examples.treeset.TreeSetEntry t_156;

                              t_153 = var_39_colorOf_leftOf_sib  ==  this.examples_treeset_TreeSet_BLACK;

                              if (t_153) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          examples.treeset.TreeSetEntry t_151;
                                          examples.treeset.TreeSetEntry t_152;

                                          setColor(var_36_rightOf_sib, this.examples_treeset_TreeSet_BLACK);
                                          setColor(var_34_sib, this.examples_treeset_TreeSet_RED);
                                          this.rotateLeft(var_34_sib);
                                          t_151 = parentOf(var_23_x);
                                          var_25_parentOf_x = t_151;
                                          t_152 = leftOf(var_25_parentOf_x);
                                          var_34_sib = t_152;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              t_154 = parentOf(var_23_x);
                              var_25_parentOf_x = t_154;
                              t_155 = colorOf(var_25_parentOf_x);
                              var_27_colorOf_parentOf_x = t_155;
                              t_156 = leftOf(var_34_sib);
                              var_38_leftOf_sib = t_156;
                              setColor(var_34_sib, var_27_colorOf_parentOf_x);
                              setColor(var_25_parentOf_x, this.examples_treeset_TreeSet_BLACK);
                              setColor(var_38_leftOf_sib, this.examples_treeset_TreeSet_BLACK);
                              this.rotateRight(var_25_parentOf_x);
                              var_23_x = this.examples_treeset_TreeSet_root;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      t_162 = var_23_x  !=  this.examples_treeset_TreeSet_root;
      t_163 = var_23_x.examples_treeset_TreeSetEntry_color  ==  this.examples_treeset_TreeSet_BLACK;

      if (t_162) {
        {
          if (t_163) {
            {
              t_161 = true;
            }
          } else {
            {
              t_161 = false;
            }
          }
        }
      } else {
        {
          t_161 = false;
        }
      }
      var_24_ws_4 = t_161;
    }
    setColor(var_23_x, this.examples_treeset_TreeSet_BLACK);
  }


  private void decrementSize() {
    int t_164;
    int t_165;

    t_164 = this.examples_treeset_TreeSet_modCount;
    this.examples_treeset_TreeSet_modCount = this.examples_treeset_TreeSet_modCount + (byte)1;
    t_165 = this.examples_treeset_TreeSet_size;
    this.examples_treeset_TreeSet_size = this.examples_treeset_TreeSet_size + (byte)-1;
  }


  private examples.treeset.TreeSetEntry successor(examples.treeset.TreeSetEntry t) {
    boolean t_173;

    t_173 = t  ==  null;
    if (t_173) {
      {
        {
          {
            {
              {
                return ((examples.treeset.TreeSetEntry)(null));
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
                boolean t_172;

                t_172 = t.examples_treeset_TreeSetEntry_right  !=  null;
                if (t_172) {
                  {
                    {
                      {
                        {
                          {
                            examples.treeset.TreeSetEntry var_40_p = t.examples_treeset_TreeSetEntry_right;
                            boolean var_41_ws_5;

                            var_41_ws_5 = var_40_p.examples_treeset_TreeSetEntry_left  !=  null;
                            while (var_41_ws_5) {
                              var_40_p = var_40_p.examples_treeset_TreeSetEntry_left;
                              var_41_ws_5 = var_40_p.examples_treeset_TreeSetEntry_left  !=  null;
                            }

                            return var_40_p;
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
                            boolean t_166;
                            boolean t_167;
                            boolean t_168;
                            examples.treeset.TreeSetEntry var_42_p = t.examples_treeset_TreeSetEntry_parent;
                            examples.treeset.TreeSetEntry var_43_ch = t;
                            boolean var_44_ws_6;

                            t_167 = var_42_p  !=  null;
                            t_168 = var_43_ch  ==  var_42_p.examples_treeset_TreeSetEntry_right;

                            if (t_167) {
                              {
                                if (t_168) {
                                  {
                                    t_166 = true;
                                  }
                                } else {
                                  {
                                    t_166 = false;
                                  }
                                }
                              }
                            } else {
                              {
                                t_166 = false;
                              }
                            }
                            var_44_ws_6 = t_166;
                            while (var_44_ws_6) {
                              boolean t_169;
                              boolean t_170;
                              boolean t_171;

                              var_43_ch = var_42_p;
                              var_42_p = var_42_p.examples_treeset_TreeSetEntry_parent;
                              t_170 = var_42_p  !=  null;
                              t_171 = var_43_ch  ==  var_42_p.examples_treeset_TreeSetEntry_right;

                              if (t_170) {
                                {
                                  if (t_171) {
                                    {
                                      t_169 = true;
                                    }
                                  } else {
                                    {
                                      t_169 = false;
                                    }
                                  }
                                }
                              } else {
                                {
                                  t_169 = false;
                                }
                              }
                              var_44_ws_6 = t_169;
                            }

                            return var_42_p;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

}
