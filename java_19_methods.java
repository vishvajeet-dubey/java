package learning;

import sun.net.www.content.text.plain;
import sun.security.util.Length;

/*
	java method - 
	-------------
		java method is collection of statement that group together to perform operation.
		method are used perform certain action and they are also called function
		WHY METODS ARE USED:-
			by defining the method once you can use it multiple times.
		example:-
			public static void main(String[] args)
			{
				//call of method goes here
				method1();
			}
			public static void method1()
			{
				//statement goes here
			}
 */
//============================== program ===========================================


public class java_19_methods 
{

	public static void main(String[] args) 
	{	
		
		Area_Of_Rectangle();  		 // calling of method1
		Perimeter_Of_Rectangle(); 	//  calling of method2
	}
	
	
	// method 1
	public static  void Area_Of_Rectangle()
	{
		int area;
		int	length=10;
		int	breadth=20;
		area=length*breadth;
		System.out.println("Area Of Rectangle = "+ area);
	}
	
	
	
	// method 2
	public static void Perimeter_Of_Rectangle()
	{
		int perimeter,Length, breadth;
		Length=10;
		breadth=20;
		perimeter=2*(Length+breadth);
		System.out.println("Perimeter of Rectangle = " + perimeter);
	}
	
}
