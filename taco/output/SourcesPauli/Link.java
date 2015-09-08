package SourcesPauli;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class Link extends java.lang.Object {

  public int SourcesPauli_Link_data1;
  public int SourcesPauli_Link_data2;
  public /*@ nullable @*/ SourcesPauli.Link SourcesPauli_Link_nextLink;

  public Link(int d1, int d2) {
    this.SourcesPauli_Link_data1 = (byte)0;
    this.SourcesPauli_Link_data2 = (byte)0;
    this.SourcesPauli_Link_nextLink = ((SourcesPauli.Link)(null));
    {
      this.SourcesPauli_Link_data1 = d1;
      this.SourcesPauli_Link_data2 = d2;
    }
  }

}
