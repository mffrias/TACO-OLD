package SourcesCristianOntivero;

//@ model import org.jmlspecs.lang.*;


public /*@ nullable_by_default @*/ class Nodo extends java.lang.Object {

  public int SourcesCristianOntivero_Nodo_Dato;
  public SourcesCristianOntivero.Nodo SourcesCristianOntivero_Nodo_Siguiente;

  public Nodo(int dato, SourcesCristianOntivero.Nodo sig) {
    this.SourcesCristianOntivero_Nodo_Dato = (byte)0;
    this.SourcesCristianOntivero_Nodo_Siguiente = ((SourcesCristianOntivero.Nodo)(null));
    {
      this.SourcesCristianOntivero_Nodo_Dato = dato;
      this.SourcesCristianOntivero_Nodo_Siguiente = sig;
    }
  }


  public Nodo(int dato) {
    this.SourcesCristianOntivero_Nodo_Dato = (byte)0;
    this.SourcesCristianOntivero_Nodo_Siguiente = ((SourcesCristianOntivero.Nodo)(null));
    {
      this.SourcesCristianOntivero_Nodo_Dato = dato;
      this.SourcesCristianOntivero_Nodo_Siguiente = ((SourcesCristianOntivero.Nodo)(null));
    }
  }


  public Nodo() {
    this.SourcesCristianOntivero_Nodo_Dato = (byte)0;
    this.SourcesCristianOntivero_Nodo_Siguiente = ((SourcesCristianOntivero.Nodo)(null));
    {
      this.SourcesCristianOntivero_Nodo_Dato = 0;
      this.SourcesCristianOntivero_Nodo_Siguiente = ((SourcesCristianOntivero.Nodo)(null));
    }
  }

}
