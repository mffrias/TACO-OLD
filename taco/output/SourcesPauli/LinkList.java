package SourcesPauli;

//@ model import org.jmlspecs.lang.*;


public class LinkList extends java.lang.Object {

  public /*@ nullable @*/ SourcesPauli.Link SourcesPauli_LinkList_first;
  /*@ invariant (\forall SourcesPauli.Link n; \reach(this.SourcesPauli_LinkList_first, SourcesPauli.Link, SourcesPauli_Link_nextLink).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesPauli_Link_nextLink, SourcesPauli.Link, SourcesPauli_Link_nextLink).has(((java.lang.Object)(n)))  ==  false);
    @*/

  public LinkList() {
    this.SourcesPauli_LinkList_first = ((SourcesPauli.Link)(null));
    {
      this.SourcesPauli_LinkList_first = ((SourcesPauli.Link)(null));
    }
  }


  public boolean isEmpty() {
    {
      boolean t_1;

      t_1 = this.SourcesPauli_LinkList_first  ==  null;

      return t_1;
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\exists SourcesPauli.Link n; \reach(this.SourcesPauli_LinkList_first, SourcesPauli.Link, SourcesPauli_Link_nextLink).has(((java.lang.Object)(n))); n.SourcesPauli_Link_data1  ==  d1 && n.SourcesPauli_Link_data2  ==  d2 && n.SourcesPauli_Link_nextLink  ==  null);
    @*/
  public void insert(int d1, int d2) {
    int param_d1_0;

    param_d1_0 = d1;
    int param_d2_1;

    param_d2_1 = d2;
    {
      SourcesPauli.Link t_2;

      t_2 = new SourcesPauli.Link(param_d1_0, param_d2_1);
      SourcesPauli.Link var_1_link = t_2;

      var_1_link.SourcesPauli_Link_nextLink = this.SourcesPauli_LinkList_first;
      this.SourcesPauli_LinkList_first = var_1_link;
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\exists SourcesPauli.Link n; true; (\forall SourcesPauli.Link m; \old(\reach(this.SourcesPauli_LinkList_first, SourcesPauli.Link, SourcesPauli_Link_nextLink)).has(((java.lang.Object)(m))) && m  !=  n; \reach(this.SourcesPauli_LinkList_first, SourcesPauli.Link, SourcesPauli_Link_nextLink).has(((java.lang.Object)(m)))));
    @*/
  public SourcesPauli.Link delete() {
    {
      SourcesPauli.Link var_2_temp = this.SourcesPauli_LinkList_first;

      this.SourcesPauli_LinkList_first = this.SourcesPauli_LinkList_first.SourcesPauli_Link_nextLink;

      return var_2_temp;
    }
  }

}
