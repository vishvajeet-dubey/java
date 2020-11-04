package learning;

/*
	Multidimensional Arrays:-
	--------------------------
		A multidimensional array is an array containing one or more arrays.
		To create a two-dimensional array, add each array within its own set of curly braces:
 		example:-
 		----------
 			int [] [] 	Array_name = { {1,2,3,4,5} , {6,7,8,9} }
 
 */
//========================== program ==================================


public class java_18_multidimentional_array
{

	public static void main(String[] args) 
	{
		// Multidiamentional array declaration 
		String[][] student = { {"name","roll no", "age"}, {"java", "001cs", "25 year"}};
		
		
		// access the element through index value (array_name[row][column])  start from 0.
		System.out.println(student[1][2] + "\n----------------------------"); // print 2nd row and 3rd column
		
		
		
		// print all element from array
		for (int i = 0; i < student.length; i++) 
		{
			for (int j = 0; j < student[i].length; j++) 
			{
				System.out.print(student[i][j]+"\t");
			}
			System.out.println(); //used for breaking into two line
		}
		
	}

}
