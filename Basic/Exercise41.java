//Print the ascii value of a given character

package Basic;

import java.util.*;

public class Exercise41 { 
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			
			String str=sc.nextLine();
			for(int i=0;i<=str.length();i++) {				
			int a2=str.charAt(i);
			 System.out.println(str.charAt(i)+"="+ a2);
			}
			sc.close();
			
		
	 }

}                            
