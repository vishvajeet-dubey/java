package learning;


/*	TYPE CASTING:-
 *		Type casting is when you assign a value of one primitive data type to another type.
 *	
 *		TWO TYPE OF TYPE CASTING
 *		-------------------------
 *			1. Widening Casting (automatically) - converting a smaller type to a larger type size
												  byte -> short -> char -> int -> long -> float -> double.
												  
				
			2. Narrowing Casting (manually)     - converting a larger type to a smaller size type
				                                  double -> float -> long -> int -> char -> short -> byte
			
 * */
//------------------------------------------ PROGRAM ---------------------------------------------------


public class Java_5_Type_Casting {

	public static void main(String[] args) {
		// Widening Casting
		
		int a=10;
		float b=a;  // automatic casting
		System.out.println(b);
		System.out.println("this is the sidening Casting\n------------------------------");
		
		float num=10.78f;
		int num1=(int)num;  //manually casting
		System.out.println(num1+"\nthis is the narrowing Casting");
		
		
	}

}

