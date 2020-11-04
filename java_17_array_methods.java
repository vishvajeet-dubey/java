package learning;


public class java_17_array_methods
{

	public static void main(String[] args) 
	{
		
		//array declaration 
		String[] fruit = {"mango", "apple", "banana", "pineapple"};
		
		
		
		
		
		// 1. access the element through index value
		// example
		System.out.println(fruit[1]);
		//---------------------------------------------------------------
		
		System.out.println("\n--------- change an element---------");
		
		
		
		
		
		// 2. change an element in array
		// example
		System.out.println("before  -----> " + fruit[3]);
		fruit[3]="graps";
		System.out.println("after   -----> " + fruit[3]);
		//-----------------------------------------------------------------
		
		System.out.println("\n----------- array length------------");
		
		
		
		
		
		// 3. array length 
		// example
		//		array.length;
		System.out.println("the length of array = "+fruit.length);
		//-----------------------------------------------------------------
		
		System.out.println("\n------- loop through an array-------");
		
		
		
		
		
		// 4. loop through an array 
		// example
		for (int i = 0; i < fruit.length; i++)
		{
			System.out.print(fruit[i] + ", ");
		}
		//------------------------------------------------------------------
		
		System.out.println("\n\n--------------   END   -------------");
		
		
	}	

}
