package examples.singlylist;

//@ model import org.jmlspecs.lang.*;

/** @Invariant all n: SinglyLinkedListNode | ( ( n in this.header.*next @- null ) => ( n !in n.next.*next @- null ) ) ;
  @SpecField myseq: seq SinglyLinkedListNode from this.header, SinglyLinkedListNode.next | (
		( #(this.header.*next @- null) = #(this.myseq) ) && 
		( this.header=null => #(this.myseq)=0 ) && 
		( this.header!= null => this.header=this.myseq[0] ) && 
		( all i: int | ( ( i >= 0 && i < ( #(this.myseq) - 1) ) => ( this.myseq[i + 1] = this.myseq[i].next ) ) )
		) ;
*/
public class SinglyLinkedList extends java.lang.Object {

  /*@ nullable @*/ examples.singlylist.SinglyLinkedListNode examples_singlylist_SinglyLinkedList_header;/** @Modifies_Everything
 
 @Ensures (some i: int | ( ( i>=0 && i < #(this.myseq) ) && (this.myseq[i] in SinglyLinkedListNode) && (this.myseq[i].value=value_param)) ) <=> return=true ;
*/

  public boolean contains(/*@ nullable @*/ java.lang.Object value_param) {
    boolean t_1;
    boolean t_2;
    boolean t_3;
    examples.singlylist.SinglyLinkedListNode var_1_current;
    boolean var_2_result;

    var_1_current = this.examples_singlylist_SinglyLinkedList_header;
    var_2_result = false;
    boolean var_3_ws_1;

    t_2 = var_2_result  ==  false;
    t_3 = var_1_current  !=  null;

    if (t_2) {
      {
        if (t_3) {
          {
            t_1 = true;
          }
        } else {
          {
            t_1 = false;
          }
        }
      }
    } else {
      {
        t_1 = false;
      }
    }
    var_3_ws_1 = t_1;
    while (var_3_ws_1) {
      boolean t_6;
      boolean t_7;
      boolean t_8;
      boolean t_9;
      boolean t_10;
      boolean t_11;
      boolean t_12;
      boolean var_4_equalVal;

      t_7 = value_param  ==  null;
      t_8 = var_1_current.examples_singlylist_SinglyLinkedListNode_value  ==  null;

      if (t_7) {
        {
          if (t_8) {
            {
              t_6 = true;
            }
          } else {
            {
              t_6 = false;
            }
          }
        }
      } else {
        {
          t_6 = false;
        }
      }

      if (t_6) {
        {
          {
            {
              {
                {
                  var_4_equalVal = true;
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
                  boolean t_5;

                  t_5 = value_param  !=  null;
                  if (t_5) {
                    {
                      {
                        {
                          {
                            {
                              boolean t_4;

                              t_4 = value_param  ==  var_1_current.examples_singlylist_SinglyLinkedListNode_value;
                              if (t_4) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          var_4_equalVal = true;
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
                                          var_4_equalVal = false;
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
                              var_4_equalVal = false;
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
      t_9 = var_4_equalVal  ==  true;

      if (t_9) {
        {
          {
            {
              {
                {
                  var_2_result = true;
                }
              }
            }
          }
        }
      }
      var_1_current = var_1_current.examples_singlylist_SinglyLinkedListNode_next;
      t_11 = var_2_result  ==  false;
      t_12 = var_1_current  !=  null;

      if (t_11) {
        {
          if (t_12) {
            {
              t_10 = true;
            }
          } else {
            {
              t_10 = false;
            }
          }
        }
      } else {
        {
          t_10 = false;
        }
      }
      var_3_ws_1 = t_10;
    }

    return var_2_result;
  }
/** @Requires ( index>=0 && index<#(this.myseq) ) ;
 
 @Modifies_Everything
 @Ensures ( #(this.myseq) = #(@old(this.myseq))-1 ) && 
		( all i: int | ( (i>=0 && i<index ) => (this.myseq[i] = @old(this.myseq[i]) ) )) && 
		( all j: int | ( (j>=index && j<#(this.myseq)) => this.myseq[j]=@old(this.myseq[j+1]) ) ) ;
*/

  public void remove(int index) {
    boolean t_13;
    boolean t_14;
    boolean t_15;
    boolean t_20;
    examples.singlylist.SinglyLinkedListNode var_5_current;

    var_5_current = this.examples_singlylist_SinglyLinkedList_header;
    examples.singlylist.SinglyLinkedListNode var_6_previous;

    var_6_previous = ((examples.singlylist.SinglyLinkedListNode)(null));
    int var_7_current_index;

    var_7_current_index = 0;
    boolean var_8_found = false;
    boolean var_9_ws_2;

    t_14 = var_8_found  ==  false;
    t_15 = var_5_current  !=  null;

    if (t_14) {
      {
        if (t_15) {
          {
            t_13 = true;
          }
        } else {
          {
            t_13 = false;
          }
        }
      }
    } else {
      {
        t_13 = false;
      }
    }
    var_9_ws_2 = t_13;
    while (var_9_ws_2) {
      boolean t_16;
      boolean t_17;
      boolean t_18;
      boolean t_19;

      t_16 = index  ==  var_7_current_index;

      if (t_16) {
        {
          {
            {
              {
                {
                  var_8_found = true;
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
                  var_7_current_index = var_7_current_index + 1;
                  var_6_previous = var_5_current;
                  var_5_current = var_5_current.examples_singlylist_SinglyLinkedListNode_next;
                }
              }
            }
          }
        }
      }
      t_18 = var_8_found  ==  false;
      t_19 = var_5_current  !=  null;

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
    t_20 = var_6_previous  ==  null;
    if (t_20) {
      {
        {
          {
            {
              {
                this.examples_singlylist_SinglyLinkedList_header = var_5_current.examples_singlylist_SinglyLinkedListNode_next;
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
                var_6_previous.examples_singlylist_SinglyLinkedListNode_next = var_5_current.examples_singlylist_SinglyLinkedListNode_next;
              }
            }
          }
        }
      }
    }
  }
/** @Modifies_Everything
 
 @Ensures ( #(this.myseq)=#(@old(this.myseq))+1 ) && 
          ( this.myseq[#(this.myseq)-1].value=arg ) && 
		    ( all i: int | ( ( i>=0 && i<#(@old(this.myseq)) ) => ( this.myseq[i]=@old(this.myseq[i]) )) )
*/

  public void insertBack(/*@ nullable @*/ java.lang.Object arg) {
    examples.singlylist.SinglyLinkedListNode t_21;
    boolean t_22;

    t_21 = new examples.singlylist.SinglyLinkedListNode();
    examples.singlylist.SinglyLinkedListNode var_10_freshNode = t_21;

    var_10_freshNode.examples_singlylist_SinglyLinkedListNode_value = arg;
    var_10_freshNode.examples_singlylist_SinglyLinkedListNode_next = ((examples.singlylist.SinglyLinkedListNode)(null));
    t_22 = this.examples_singlylist_SinglyLinkedList_header  ==  null;
    if (t_22) {
      {
        {
          {
            {
              {
                this.examples_singlylist_SinglyLinkedList_header = var_10_freshNode;
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
                examples.singlylist.SinglyLinkedListNode var_11_current;

                var_11_current = this.examples_singlylist_SinglyLinkedList_header;
                boolean var_12_ws_3;

                var_12_ws_3 = var_11_current.examples_singlylist_SinglyLinkedListNode_next  !=  null;
                while (var_12_ws_3) {
                  var_11_current = var_11_current.examples_singlylist_SinglyLinkedListNode_next;
                  var_12_ws_3 = var_11_current.examples_singlylist_SinglyLinkedListNode_next  !=  null;
                }
                var_11_current.examples_singlylist_SinglyLinkedListNode_next = var_10_freshNode;
              }
            }
          }
        }
      }
    }
  }


  public static void main(java.lang.String[] args) {
    examples.singlylist.SinglyLinkedList t_23;
    java.lang.Object t_24;

    t_23 = new examples.singlylist.SinglyLinkedList();
    examples.singlylist.SinglyLinkedList var_13_list = t_23;

    t_24 = new java.lang.Object();
    var_13_list.insertBack(t_24);
    var_13_list.remove(0);
  }


  public SinglyLinkedList() {
    this.examples_singlylist_SinglyLinkedList_header = ((examples.singlylist.SinglyLinkedListNode)(null));
  }

}
