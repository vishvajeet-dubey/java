package learning;

import java.util.Scanner;


public class java_9_Adding_two_number {
	public static void main(String[] args) {
		
		//taking 1st number from user
		float user_input_1, user_input_2, total_sum;
		Scanner sc1= new Scanner(System.in);
		System.out.print("Enter first number = ");
		user_input_1=sc1.nextFloat();
		
		//taking 2nd number from user
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter second number = ");
		user_input_2=sc2.nextFloat();
		
		total_sum=user_input_1+user_input_2;
		System.out.println("sum = "+ total_sum);
				
		
	}
}
