package ar.edu.taco.randoopSamples;

public class SeqSearch {
	
	/*@
	 @ invariant true;
	 @*/
	
	/*@
	 @ requires sValue >=0;
	 @ requires sValue < arr.length;
	 @ ensures false;
	 @*/
	public boolean seqSearch(int[] arr, int sValue) {
		for (int index = 0; index < arr.length-1; index++) 
	      		if (arr[index] == sValue)
	        		return true;
	    	return false;
	}
}