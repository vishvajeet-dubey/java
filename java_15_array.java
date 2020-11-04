package learning;


/*
	ARRAY:-
	-------
	Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
	To declare an array, define the variable type with square brackets:
	example:-
		int[] num = {1, 2, 3, 4, 5, 6, 7};
	
	syntax-
	--------
		data_type[]  name_of_array  =  {values};


	another form but less in use:-
	-------------------------------
		data_type	name_of_array[]	=	{values};

 */



public class java_15_array 
{

	public static void main(String[] args) 
	{
		//array declaration 
		int[] array1 = {1, 2, 3, 4, 5, 6, 7};
		
		
		System.out.println(array1[2]); // index no2 is call
		
		
		
		
		
		System.out.print("-- print whole element in array --\n");
		// printing all the value in array we need loop to it
		int index = 0;
		while(index < array1.length)  // length of array is 7
		{
			System.out.print(index + ",");
			index++;
		}

	}

}
