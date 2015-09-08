package examples.singlylist;

//@ model import org.jmlspecs.lang.*;


class SinglyLinkedListNode extends java.lang.Object {

  /*@ nullable @*/ examples.singlylist.SinglyLinkedListNode examples_singlylist_SinglyLinkedListNode_next;
  /*@ nullable @*/ java.lang.Object examples_singlylist_SinglyLinkedListNode_value;

  SinglyLinkedListNode() {
    this.examples_singlylist_SinglyLinkedListNode_next = ((examples.singlylist.SinglyLinkedListNode)(null));
    this.examples_singlylist_SinglyLinkedListNode_value = ((java.lang.Object)(null));
  }

}
