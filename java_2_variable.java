package learning;

/*	VARIABLE
 * 	---------
 *		variable is the name where the data is store in it.
 *		SYNTAX:-
 *			<Type> <VariableName> = <Value>
 *		
 *		Example:-
 *		- String name="java rogramming";
 * 		- char letter='a'; **ALWAYS WRITEN IN SINGLE COTE**
 * 		- int a=10;
 * 		- float b=13.56f; **REQUIRED TO WRITE f AT THE END OF VALUE**
 * 		- boolean isnull=true; **(true/false)**
 * 
 * 		RULES FOR CONSTRUCTING VARIABLE:-
 * 			1. variable can contain digits, underscore, dollar signs, letters.
 * 			2. variable should begin with letter, $, _
 * 			3. variable should not contain whitespaces.
 * 			4. java is the case senstive language.
 * */




public class java_2_variable{

	public static void main(String[] args) {
	
		String name="Java programming";
		char letter='a';
		int a=10;
		float b=13.45f;
		boolean isnull=false;
		System.out.println(name);
		System.out.println("this is java ----->  "+a);
		System.out.println("this is the boolean --->  "+isnull);
		System.out.println("this is the floating value --->  "+b);
		System.out.println("this is the charector ---->  "+letter);

	}

}
