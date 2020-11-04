package learning;

import java.util.Scanner;  //importing Scanner to take input


/*
 * input from user:-
 * ------------------
 * 		following steps to take input from user.
 * 		1. first < import java.util.Scanner; > 
 * 		2. Scanner sc=new scanner(inputStream Source);
 * 		3. then store sc container into variable
 * 			int a=sc.nextInt();
 * 			
 * 			Some other Method to take the input given by user
 			--------------------------------------------------
 			1. nextBoolean(); -	Reads a boolean value from the user
			2. nextByte();	  -	Reads a byte value from the user
			3. nextDouble();  -	Reads a double value from the user
			4. nextFloat();	  -	Reads a float value from the user
			5. nextInt();	  -	Reads a int value from the user
			6. nextLine();	  -	Reads a String value from the user
n			7. extLong();	  -	Reads a long value from the user
			8. nextShort();	  -	Reads a short value from the user
 */



//========================== PROGRAM EXAMPLE =====================================

public class java_8_input {

	public static void main(String[] args) {
		
		//taking integer
		Scanner scan = new Scanner(System.in); // scanning input from user.
		System.out.print("Please enter the integer = ");
		int b = scan.nextInt();
		System.out.println(b);
		
		
		//taking string
		Scanner scan1=new Scanner(System.in);
		System.out.print("\nPlease enter the string = ");
		String User_Enter_String=scan1.nextLine();
		System.out.println(User_Enter_String);
		
		
		//taking floating point value
		Scanner scan2 = new Scanner(System.in); // scanning input from user.
		System.out.print("\nPlease enter the floating number  = ");
		float User_Input_float = scan.nextFloat();
		System.out.println(User_Input_float);

	}

}
