package learning;


/*		
 *	JAVA STRING METHOD
 *	------------------
 *		1. StringName.length()
 *		2. StringName.toUpperCase()
 *		3. StringName.toLowerCase()
 *		4. StringName.indexOf(value)  **RETURN POSITION OF THE FIRST LETTER OF STRING OR POSTION OF THE CHARECTOR.**
 *		5. StringName1.concat(StringName2) **USED FOR CANCATINATION OF TWO STRING**
 *
 * 
 * */
//------------------------------------------- PROGRAM -------------------------------------------------------
public class java_7_String {

	public static void main(String[] args) {
		
		// StringName.length() **RETURN TOTAL LENGTH OF STRING**
		//---------------------------------------------------------
		
			String name="vishvajeet dubey";
			System.out.println("\n-----------------------1. StringName.length()----------------------------\n");
			System.out.println("lenght of "+name +" is "+ name.length());
			
			// LOWER CASE TO UPERCASE
			
			System.out.println("\n-----------------------2. StringName.toUpperCase()-----------------------\n");
			System.out.println(name.toUpperCase());
			
			// uper case to lower case
			
			System.out.println("\n-----------------------3. StringName.toLowerCase()-----------------------\n");
			System.out.println((String)"JAVA PROGRAMMER".toLowerCase());
			
			// return index value of charector
			
			System.out.println("\n-----------------------4. StringName.indexOf(value)----------------------\n");
			System.out.println(name.indexOf("dubey"));
			
			// concatination of two string
			
			System.out.println("\n-----------------------5. StringName1.concat(StringNmae2)----------------\n");
			String s1="java", s2=" programming";
			System.out.println(s1.concat(s2));
	}

}
