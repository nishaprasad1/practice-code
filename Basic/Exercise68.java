//Write a Java program to create a new string of 4 copies 
//of the last 3 characters of the original string. 
//The length of the original string must be 3 and above.
package Basic;

public class Exercise68 {
	public static void main(String[] args)
	{
	  String main_string = "Nisha Prasad";
	  System.out.println(main_string.substring(main_string.length() - 6) );
	  System.out.println(main_string.substring(main_string.length() - 6) );
	  System.out.println(main_string.substring(main_string.length() - 6) );
		}
}
