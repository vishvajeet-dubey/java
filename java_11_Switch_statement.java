package learning;

import java.util.Scanner;

import com.sun.tools.javac.util.Context.Key;

/*
 	switch(expression){
 		case 1:
 			statment1
 		case2:
 			statement2
 		case3:
 			statement3
 		default:
 			if out of all cases is true then run default statement
 	
 	}
  */


//======================= Program ==================

public class java_11_Switch_statement {

	public static void main(String[] args) {
		
	//Star of input statement
		int user_input;
		
		System.out.print("Enter the Number = ");
		Scanner sc = new Scanner(System.in);
		user_input=sc.nextInt();
	//End of input statement
		
		
		
		switch (user_input) {  // starting of switch
		
		//case1
		case 90: {
			System.out.println("very good");
		}
		
		
		//case2
		case 70:{
			System.out.println("good");
		}
		
		
		//default
		default:
		{
			System.out.println("not defined");
		}
		
	}

}
}
