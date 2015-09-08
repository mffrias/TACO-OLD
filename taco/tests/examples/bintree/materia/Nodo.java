package examples.bintree.materia;

public class Nodo {
	public Nodo left;
	public int clave;
	public Nodo right;



	public boolean buscarNodo(int i) {
		if (i == clave)
			return true;
		else if (i < clave) {
			if (left != null)
				return left.buscarNodo(i);
			else
				return false;
		} else {
			if (right != null)
				return right.buscarNodo(i);
			else
				return false;
		}

	}


	public void insertarNodo(int i) {
		if (i < clave) {
			if (left != null){
				left.insertarNodo(i);
				System.out.println(i);
			}	
			else {
				Nodo n = new Nodo();
				n.clave = i;
				left = n;
			}
		} else {
			if (right != null){
				right.insertarNodo(i);
				System.out.println(i);
			}
			else {
				Nodo n = new Nodo();
				n.clave = i;
				right = n;	
			}
		}

	}

}
