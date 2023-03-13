
//Write a Java program to accepts an integer and count the factors of the number.
package Basic;

import java.util.Scanner;

public class Exercise57 {
	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Number");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) 
			if(a%i==0) {
				count++;					
		}
		System.out.println(count);
		
	}


}
