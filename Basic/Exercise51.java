//Write a Java program to convert a string to an integer in Java
package Basic;
import java.util.*;
public class Exercise51 {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Number n");
			String n=sc.nextLine();
			int result=Integer.parseInt(n);
			System.out.println(result);
			 System.out.println("Number m");
			String m=sc.nextLine();
			int result1=Integer.parseInt(m);
			System.out.println(result1);
			
			
//			int sum=Integer.sum(result,result1);
//	        
//	        System.out.println("Sum is " + sum);
//			
			int sum=result+result1;
			 System.out.println("Sum is " + sum);
			
			
			
			
		
	 }
	

}
