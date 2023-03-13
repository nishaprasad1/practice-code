//Write a Java program to convert a given string into lowercase.
package Basic;
import java.util.*;
public class Exercise59 {
	public static void main(String[] args){
		 Scanner in = new Scanner(System.in);
	    System.out.print("Input a Sentence: ");
		 String line = in.nextLine();
		 line=line.toLowerCase();
		 System.out.println(line);
	   }

}
