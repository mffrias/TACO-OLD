package SourcesCristianOntivero;

/*@nullable_by_default@*/
public class Nodo {
    public int Dato; 
    public Nodo Siguiente;
    
    public Nodo(int dato, Nodo sig)
    {
        this.Dato = dato;
        this.Siguiente = sig;
    }
    
    public Nodo(int dato)
    {
        this.Dato = dato;
        this.Siguiente = null;
    }
    
    public Nodo()
    {
        this.Dato = 0;
        this.Siguiente = null;
    }
}