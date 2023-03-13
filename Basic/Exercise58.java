//Write a Java program to capitalize the first letter of each word in a sentence. 
//Go to the editor
package Basic;

/*import java.util.Scanner;

public class Exercise58 {
	public static void main(String[] args) {
		int arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Sentence");
		String a=sc.toString();
		if(i=0;i<=a.length();i++) {
			a
		}
		
		
		
		
		
	}

}*/
import java.util.*;
public class Exercise58 {
    public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
    System.out.print("Input a Sentence: ");
	 String line = in.nextLine();
	 String upper_case_line = ""; 
      Scanner lineScan = new Scanner(line); 
        while(lineScan.hasNext()) {
            String word = lineScan.next(); 
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
        }
     System.out.println(upper_case_line.trim()); 
   }
}

