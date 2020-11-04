package learning;


/*
 Difference b/w while and do while:-
 -----------------------------------
 	in while loop Condition is checked first then statement(s) is executed.	
 	but in the case of do while loop, Statement(s) is executed atleast once, thereafter condition is checked.
 	
 	
 do while loop:-
 ------------------
 	1. Statement(s) is executed atleast once, thereafter condition is checked.
 	2. first statement is executed then condition is checked if it is true then goes inside loop else it goes to outside of the loop.
 	
 	
 	SYNTAX:-
 	---------
 		do{
 			execute at least one time
 		}while(condition);
 
 */


public class java_14_do_while_loop 
{

	public static void main(String[] args) 
	{
		int a=0; 
		
		
		
		
		//do while loop
		do 
		{
			System.out.println(a);
			a++;
		} while (a<=10);
		//end of do while loop
		
		System.out.println("------------------------");
		
		
		
		
		//another example 
		int b = 0;
		
		
		// start do while loop
		do
		{
			System.out.println(b);
		} while (b<0); 	//condition is false but execute do part
		
		

	}

}
