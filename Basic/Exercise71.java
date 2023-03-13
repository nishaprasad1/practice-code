//Write a Java program to create the concatenation of 
//the two strings except removing the first character of each string.
// The length of the strings must be 1 and above
package Basic;
import java.lang.*;
public class Exercise71 {
	public static void main(String[] args)
	{
		String str1 = "Python";    
		String str2 = "Tutorial"; 

		System.out.println(str1.substring(1) + str2.substring(1));
	} 
}
