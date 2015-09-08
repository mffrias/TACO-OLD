package SourcesCristianOntivero;

// http://pizandoenprogra.blogspot.com.ar/2013/02/estructuras-de-datos-lista-simple.html
public class Lista {
	/*@ invariant (\forall Nodo n;
	  @		\reach(Primero, Nodo, Siguiente).has(n) == true;
	  @		\reach(n.Siguiente, Nodo, Siguiente).has(n) == false);
      @ invariant (Primero == null && Ultimo == null) ||
      @     (\reach(Primero, Nodo, Siguiente).has(Ultimo) == true && 
      @     Ultimo.Siguiente == null);
      @ invariant NumElementos == \reach(Primero, Nodo, Siguiente).int_size();
	  @*/
	public int NumElementos = 0;
	public /*@nullable@*/ Nodo Primero;
	public /*@nullable@*/ Nodo Ultimo; 

	public boolean EsVacio()
	{
		if(NumElementos==0){return true;}
		else {return false;}
	}

	public Lista()
	{
		this.NumElementos = 0;
		this.Primero = null;
		this.Ultimo = null;
	}

	public Lista(int Datos, Nodo primero, Nodo ultimo)
	{
	}

	/*@ requires true;
	  @ ensures (\exists Nodo n; 
      @     \reach(Primero, Nodo, Siguiente).has(n);
      @     n.Dato == Dato && n.Siguiente == null);
      @*/
	public void AgregarNodo(int Dato)
	{
		try
		{
			Nodo Nuevo = new Nodo(Dato);

			if (EsVacio()==true)
			{
				Primero = Nuevo;
				Ultimo = Nuevo;
			}
			else
			{
				Ultimo.Siguiente = Nuevo;
				Ultimo = Nuevo;
			}
			NumElementos++; 
		}
		catch (Exception Ex)
		{

		}
	}

	public int ObtenerIndiceNodo(int Dato)
	{
		try
		{
			if (EsVacio()!=true)
			{
				Nodo Temp = Primero;
				int dat = -1;
				int contador = 1;
				while (Temp!=null)
				{
					dat = Temp.Dato;
					if (dat == Dato)
					{
						return contador;
					}
					contador++;
					Temp = Temp.Siguiente;
				}
				return -1;
			}
			else{return -1;}
		}
		catch(Exception Ex)
		{
			return -1;
		}
	}

	public Nodo ObtenerNodoPorDato(int Dato)
	{
		try
		{
			if (EsVacio()!=true)
			{
				Nodo Temp = Primero;
				int dat = -1;
				int contador = 1;
				while (Temp!=null)
				{
					dat = Temp.Dato;
					if (dat == Dato)
					{
						return Temp;
					}
					contador++;
					Temp = Temp.Siguiente;
				}
				return null;
			}
			else{return null;}
		}
		catch(Exception Ex)
		{
			return null;
		}
	}

	public Nodo ObtenerNodoPorIndice(int posicion)
	{
		try
		{
			if (EsVacio()!=true)
			{
				Nodo Temp = Primero;
				for (int i=1;i<posicion;i++)
				{
					Temp = Temp.Siguiente;
				}
				return Temp;
			}
			else{return null;}
		}
		catch(Exception Ex)
		{
			return null;
		}
	}

	/*@	requires true;
      @ ensures (\exists Nodo n; true;
      @     (\old(\reach(Primero, Nodo, Siguiente)).has(n) && n.Dato == dato) ==>
      @     (\reach(Primero, Nodo, Siguiente).has(n) == false && 
      @     (\forall Nodo m; \old(\reach(Primero, Nodo, Siguiente)).has(m) && 
      @         m != n; \reach(Primero, Nodo, Siguiente).has(m))));
      @*/
      public boolean EliminarNodo(int dato)
      {
    	  //        try
    	  //        {
    		  if (EsVacio()!=true)
    		  {
    			  int pos = ObtenerIndiceNodo(dato);
    			  if (pos==1 && NumElementos == 1)
    			  {
    				  Primero = null;
    				  Ultimo = null;
    			  }
    			  else if (pos ==1 && NumElementos>1)
    			  {
    				  Nodo Temp = Primero.Siguiente;
    				  Primero.Siguiente = null;
    				  Primero = Temp;
    			  }
    			  else if (pos > 1 && pos == NumElementos)
    			  {
    				  Nodo Temp = ObtenerNodoPorIndice(pos-1);
    				  Temp.Siguiente = null;
    				  Ultimo = Temp;
    			  }
    			  else
    			  {
    				  Nodo Temp = ObtenerNodoPorIndice(pos-1);
    				  Nodo Aux = Temp.Siguiente;
    				  Temp.Siguiente = Aux.Siguiente;
    				  Aux.Siguiente = null;
    			  }
    			  NumElementos--;
    			  return true;
    		  }
    		  else{return false;}
      }
      //        catch(Exception Ex){return false;}
      //    }

      /*@ requires true;
	  @ ensures (\exists Nodo n; true; 
	  @     n.Dato == Dato ==> \result == true);
	  @*/
      public boolean Existe(int Dato)
      {
    	  try
    	  {
    		  if (EsVacio()!=true)
    		  {
    			  Nodo Temp = Primero;
    			  int dat = -1;
    			  while (Temp!=null)
    			  {
    				  dat = Temp.Dato;
    				  if (dat == Dato)
    				  {
    					  return true;
    				  }
    				  Temp = Temp.Siguiente;
    			  }
    			  return false;
    		  }
    		  else{return false;}
    	  }
    	  catch(Exception Ex)
    	  {
    		  return false;
    	  }
      }


      /*
     \public static void main(String[] args) {
    	Lista l = new Lista();
        Nodo Nodo_1 = new Nodo();
        Nodo Nodo_2 = new Nodo();
        Nodo Nodo_3 = new Nodo();

        int Dato_Integer_1 = -1310721;

        Nodo_1.Dato = -1310721;
        Nodo_1.Siguiente = Nodo_2;

        Nodo_2.Dato = 1;
        Nodo_2.Siguiente = Nodo_3;

        Nodo_3.Dato = -1310721;
        Nodo_3.Siguiente = null;
        l.NumElementos = 3;
        l.Primero = Nodo_1;
        l.Ultimo = Nodo_3;

        l.AgregarNodo(Dato_Integer_1);
    }
       */

/*
      public static void main(String[] args) {
    	  Lista l = new Lista();
    	  Nodo Nodo_1 = new Nodo();
    	  Nodo Nodo_2 = new Nodo();
    	  Nodo Nodo_3 = new Nodo();

    	  int Dato_Integer_1 = 5;

    	  Nodo_1.Dato = 5;
    	  Nodo_1.Siguiente = Nodo_2;

    	  Nodo_2.Dato = 5;
    	  Nodo_2.Siguiente = Nodo_3;

    	  Nodo_3.Dato = 5;
    	  Nodo_3.Siguiente = null;
    	  l.NumElementos = 3;
    	  l.Primero = Nodo_1;
    	  l.Ultimo = Nodo_3;

    	  l.EliminarNodo(Dato_Integer_1);
    	  System.out.println("ACA");
      }

*/


}