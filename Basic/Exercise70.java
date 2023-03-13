//Write a Java program to create a string in 
//the form short_string + long_string + short_string
// from two strings. The strings must not have the same length.
package Basic;

public class Exercise70 {
	public static void main(String[] args)
	{
		String s1="nisha";
		String s2="Prasad";
		if(s1.length()>=s2.length()) {
			 System.out.println(s2+" "+s1+" "+s2 );
		}
		else{
			System.out.println(s1+" "+s2+" "+s1 );
		}
		
	}

}
