//Write a Java program to reverse a word.
package Basic;

import java.util.*;
public class Exercise61 {
    public static void main(String[] args){	
    Scanner in = new Scanner(System.in);
    System.out.print("\nInput a word: ");
	 String result=""; 
    char[] ch= in.nextLine().toCharArray();  
	 for (int i = ch.length - 1; i >= 0; i--) {
			 result += ch[i];
		 }
	 System.out.println("Reverse word: "+result); 
	 }			
}

