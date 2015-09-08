package ar.edu.itba.searching;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Search {

	public int[] arreglo;


	//	/*@ invariant arreglo.length*2 >= 2;
	//	  @*/ 


	//	/*@
	//	  @ requires true;
	//	  @ ensures \result == true <==> (\exists int i; 0 <= i && i < A.length; A[i]==value);
	//	  @ ensures \old(A) == A;  
	//	  @ signals (Exception e) false;
	//	  @*/
	//	public static boolean linearSearch(int[] A, int value){
	//
	//		int index = 0;
	//
	//		boolean res = false;
	//		while (index < A.length && !res){
	//			if (A[index] == value)
	//				res = true;
	//			index++;
	//		}
	//		return res;
	//	}
	//
	//
		/*@
		  @ requires (\forall int j; 0 <= j && j < A.length - 1; A[j]<=A[j+1]);
		  @ requires A.length <= 5;
		  @ ensures \result == true <==> (\exists int l; 0 <= l && l < A.length; A[l]==value);
		  @ ensures \old(A) == A;  
		  @ signals (Exception e) false;
		  @*/
		public static boolean binSearch(int[] A, int value) {
			if (A.length == 0) {
				return false;
			}
			int low = 0;
			int high = A.length-1;
	
			while(low <= high) {
				int middle = (low+high) /2; 
				if (value > A[middle]){
					low = middle + 1;
				} else if (value < A[middle]){
					high = middle - 1;
				} else { // The element has been found
					return true; 
				}
			}
			return false;
		}
	//
	//
	//	/*@
	//	 @ requires true;
	//	 @ ensures (\forall int j; 0 <= j && j < A.length - 1; A[j]<=A[j+1]);
	//	 @*/
	//	public static void selectionSort (int[] A){
	//		int lenD = A.length;
	//		int j = 0;
	//		int tmp = 0;
	//		for(int i=0;i<lenD;i++){
	//			j = i;
	//			for(int k = i;k<lenD;k++){
	//				if(A[j]>A[k]){
	//					j = k;
	//				}
	//			}
	//			tmp = A[i];
	//			A[i] = A[j];
	//			A[j] = tmp;
	//		}
	//	}
	//
	//
	//	/*@
	//	 @ requires true;
	//	 @ ensures (\forall int j; 0 <= j && j < A.length - 1; A[j]<=A[j+1]);
	//	 @*/
	//	public static void insertionSort (int[] A){
	//		int len = A.length;
	//		int key = 0;
	//		int i = 0;
	//		for(int j = 1;j<len;j++){
	//			key = A[j];
	//			i = j-1;
	//			while(i>=0 && A[i]>key){
	//				A[i+1] = A[i];
	//				i = i-1;
	//				A[i+1]=key;
	//			}
	//		}
	//	}
	//
	/*@ requires A.length == 3;
	  @ requires x == 0;
	  @ requires y == 2; 
	  @ ensures \old(A[0]) == A[0] && \old(A[1]) == A[1] && \old(A[2]) == A[2];
	  @*/
	public static void swapswap(int A[], int x, int y){
		swap(A,x,y);
		swap(A,x,y-1);
	}

	public static void swap (int A[], int x, int y)
	{
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}


	/*@ requires argA.length == 3;
	  @ requires argf == 0 && argl == 2;
	  @ ensures (\forall int i; 0<=i && i<\result; argA[i]<=\old(argA[argf]));
	  @ ensures (\forall int i; \result<i && i<argA.length; \old(argA[argf])<=argA[i]);
	  @ ensures argl == \old(argl) && argf == \old(argf);
	  @*/
	public static int partition(int argA[], int argf, int argl)
	{
		int[] A = argA;
		int l = argl;
		int f = argf;
		int pivot = A[f];
		while (f < l)
		{
			while (A[f] < pivot) 
				f = f+1;
			while (A[l] > pivot) 
				l = l-1;
			swap (A, f, l);
		}
		return f;
	}


	//	public static void main(String[] args) {
	//        int[] A_int_array_1 = new int[3];
	//        int f_Integer_1 = 0;
	//        // Parameter Initialization
	//        A_int_array_1[0] = 32;
	//        A_int_array_1[1] = 1704954;
	//        A_int_array_1[2] = 3;
	//        int i = partition(A_int_array_1,0,2);
	//        System.out.println(i);
	//	}



	/*@
    @ requires f==0 && l==A.length-1;
    @ requires A.length == 3;
    @ requires A[0] == 0 && A[1] == 3 && A[2] == 2;
    @ ensures (\forall int j; 0 <= j && j < A.length-1; A[j]<=A[j+1]);
    @ signals (Exception e) false;
    @*/
	public static void quicksort(int A[], int f, int l)
	{
		if (f < l) {
			int pivot_index = partition(A, f, l);
			quicksort(A, f, pivot_index);
			quicksort(A, pivot_index+1, l);
		} 
	}


	//	/*@ requires index == 0;
	//	  @ requires A.length == 3 && A[0] == 2 && A[1] == 1 && A[2] == 0;
	//	  @ ensures (\forall int j; 0 <= j && j < A.length-1; A[j]<=A[j+1]);
	//	  @*/
	//	public static void quicksort(int[] A, int index){
	//		if (index<=2){
	//			int lower = 0;
	//			partition(A, lower, index);
	//			A[index] = index;
	//			index = index+1;
	//			quicksort(A,index);
	//		}
	//	}



	//
	//public static void main(String[] args) {
	//    int[] A_int_array_1 = new int[3];
	//    int f_Integer_1 = 0;
	//    int l_Integer_2 = 2;
	//    // Parameter Initialization
	//    A_int_array_1[0] = 0;
	//    A_int_array_1[1] = 3;
	//    A_int_array_1[2] = 2;
	//    quicksort(A_int_array_1,f_Integer_1,l_Integer_2);
	//    System.out.println(Arrays.toString(A_int_array_1));
	//
	//}






		  public static void main(String[] args) {
		        int[] A_int_array_1 = new int[5];
		        int value_Integer_1 = -2147483647;
		        // Parameter Initialization
		        A_int_array_1[0] = -2145370109;
		        A_int_array_1[1] = -1577058304;
		        A_int_array_1[2] = -1043441606;
		        A_int_array_1[3] = 0;
		        A_int_array_1[4] = -2147483647;
		        
		        boolean b = binSearch(A_int_array_1, value_Integer_1);
		        System.out.println(b);
	
		}


	//	  /*@
	//	   @ requires true;
	//	   @ ensures (\forall int i; 0<=i && i<A.length; A[i]<=A[i+1]);
	//	   @*/
	//	  public static boolean sort(int[] A){
	//		  return true;
	//	  }



	//		public static void main(String[] args) {
	//		       int[] A_int_array_1 = new int[1];
	//		        int value_Integer_1 = -3;
	//		        // Parameter Initialization
	//		        A_int_array_1[0] = -3;
	//		        boolean b = binSearch(A_int_array_1, value_Integer_1);
	//		        System.out.println(b);
	//	
	//		}



//	public static void main(String[] args) {
//
//		int[] A_int_array_1 = new int[3];
//		int x_Integer_1 = 0;
//		int y_Integer_2 = 2;
//		// Parameter Initialization
//		A_int_array_1[0] = -9;
//		A_int_array_1[1] = 1048576;
//		A_int_array_1[2] = 1048576;
//
//		// Method Invocation
//		swapswap(A_int_array_1, x_Integer_1, y_Integer_2);
//		System.out.println(Arrays.toString(A_int_array_1));
//
//	}	


	public Search() {
		// TODO Auto-generated constructor stub
	}



	/*@
	  @ requires i==1;
	  @ requires A.length == 0 || A.length == 1 || A.length == 2 || A.length == 3;
	  @ ensures (\forall int j; 0<=j && j<A.length-1; A[j]==\old(A[j+1]));
	  @*/
	public static void recu(int[] A, int i){
		if (i<A.length){
			A[i-1] = A[i];
			recu(A,i+1);
		}
	}




}
