package edu.fiu.sort;

public class Sort {

	
	
  /*@
	@ requires true;
	@ ensures (\forall int i; 0 <= i && i < a.length - 1; a[i] <= a[i-1]); 
	@*/
    public static void insertionSort( int [ ] a )
    {
        for( int p = 1; p < a.length; p++ )
        {
            int tmp = a[ p ];
            int j = p;
            
            for( ; j > 0 && tmp < a[ j - 1 ] ; j-- )
                a[ j ] = a[ j - 1 ];
            a[ j ] = tmp;
        }
    }
    
   
    

}
