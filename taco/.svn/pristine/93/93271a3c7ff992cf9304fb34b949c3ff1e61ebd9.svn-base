package ar.edu.taco.skunk;


public class Landing {

	static Boolean isHeightPositive(float height){
		Boolean b = null;
		if (height > 0)
			b = Boolean.TRUE;

		if (height <= 0)
			b = Boolean.FALSE;

		return b;
	}


	/*@ requires true;
	  @ ensures true;
	  @ signals (Exception e) false;
	  @*/
	static boolean initLandingOK(float height){

		Boolean b = isHeightPositive(height);
		
		return b.booleanValue();
	}


	
	
	
	
	/*@
	 @ requires i1 != 1 && i2 != 1 && i3 != 1 && i4 != 1 && i5 != 1;
	 @ ensures \result == false; 
	 @*/
	public boolean aerodynamic1 (int i1, int i2, int i3, int i4, int i5){

		if (i1*i2*i3*i4*i5 == 1)
			return true;
		else
			return false;
		
	}




/*@ requires true;
  @ ensures \result == true;
  @ signals (RuntimeException e) false;
  @*/
	public static boolean testDivZero(int i1, int i2, int i3){
		i2 = i1/(i2/i3);
		return true;
	}
	
	
//	public static void main(String[] args) {
//		int i1 = 5;
//		int i2 = 1;
//		int i3 = 3;
//		System.out.println(i1/i2/i3);
//		boolean b = testDivZero(i1, i2, i3);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		public static void main(String[] args){
//			boolean b = initLandingOK(Float.NaN);
//			System.out.println(b);
//		}

//		public static void main(String[] args) {
//			int i1 = 913832521;
//			int i2 = 913832521;
//			int i3 = 1039974511;
//			int i4 = 913832521;
//			int i5 = 111625831;
//			int result = i1*i2*i3*i4*i5;
//			System.out.println(result);
//		}

//public static void main(String[] args) {
//	float i1 = 1f;
//	float i2 = 0f;
//	boolean b = Landing.testDivZero(i1, i2);
//}
	

}
