package examples.bintree.materia;
import examples.bintree.materia.Nodo;


public class ArbolBinario {

	public Nodo raiz;
	
	
	public boolean buscar(int i){
		return raiz.buscarNodo(i);
	}
	
	
	public void insertar(int i){
		if (raiz != null)
			raiz.insertarNodo(i);
		else {
			Nodo n = new Nodo();
			n.clave = i;
			raiz = n;
		}
	}

	
	public static void main(String[] args) {
		
		ArbolBinario a = new ArbolBinario();
//		Nodo n1 = new Nodo();
//		Nodo n2 = new Nodo();
//		Nodo n3 = new Nodo();
//		Nodo n4 = new Nodo();
//		Nodo n5 = new Nodo();
//		a.raiz = n1;
//		n1.clave = 20;
//		n1.left = n2;
//		n1.right = n3;
//		n2.clave = 13;
//		n3.clave = 35;
//		n2.left = n4;
//		n4.clave = 17;
//		n3.left = n5;
//		n5.clave = 22;
		
		int[] inputs = new int[15];
		inputs[0] = 11;
		inputs[1] = 15;
		inputs[2] = 17;
		inputs[3] = 13;
		inputs[4] = 16;
		inputs[5] = 19;
		inputs[6] = 20;
		inputs[7] = 5;
		inputs[8] = 8;
		inputs[9] = 10;
		for (int i = 0; i <= 2; i++){
			a.insertar(inputs[i]);
		}
		
		boolean b = a.buscar(17);
		System.out.println(b);
		
		b = a.buscar(22);
		System.out.println(b);

		
		
	}
	
}
