package learning;

import java.util.Scanner;

import sun.security.provider.JavaKeyStore.CaseExactJKS;

public class java_12_switch_statement {

	public static void main(String[] args) {
		
		
		//input 1
		System.out.print("enter number = ");
		Scanner sc = new Scanner(System.in);
		float num1=sc.nextFloat();
		
		
		//operation selection
		System.out.print("Select one operation(+,-,*,/) = ");
		Scanner sc1= new Scanner(System.in);
		String operator= sc1.nextLine();
		
		//input 2
		System.out.print("enter number = ");
		Scanner sc2 = new Scanner(System.in);
		float num2=sc2.nextFloat();
		
		
		
		
		switch (operator) {
		
		//case 1
		case "+": {
			System.out.println(num1+num2);
			break;
		}
		
		
		//case 2
		case "-":
			{
				System.out.println(num1-num2);
				break;
			}
			
			
		//case 3	
		case "*":
			{
				System.out.println(num1*num2);
				break;
			}
	
		
		case "/":
			{
				System.out.println(num1/num2);
				break;
			}
	
			
			//default
		default:{
			System.out.println("Enter valid operator");
		}
		}

	}

}
