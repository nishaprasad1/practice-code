// Write a Java program to convert a decimal number to hexadecimal number.
package Basic;

import java.util.Scanner;

public class ex20 {
	
 public static void main(String agrs []) {
	 
	 int dec,rem;
	 String hexnum="";
	 char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};	
	 Scanner in=new Scanner(System.in);
	 System.out.println("enter the decimal number : ");
	 dec =in.nextInt();
	 while(dec>0)
	 {
		 rem= dec%16;
		 hexnum=hex[rem]+hexnum;
		 dec=dec/16;
		 	 }
	  System.out.print("Hexadecimal number is : "+hexnum+"\n");
	 

	 
 }
 
}
