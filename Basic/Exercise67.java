// Write a Java program to insert a word in the middle of the another string.
//Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
package Basic;

import java.lang.*;
public class Exercise67 {
public static void main(String[] args)
{
  String main_string = "Nisha Prasad";
  String word = "Ram";
  System.out.println(main_string.substring(0, 6) + word + main_string.substring(5));
	}
}

