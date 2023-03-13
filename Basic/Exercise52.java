//Write a Java program to calculate the sum of two integers 
//and return true if the sum is equal to a third integer.
package Basic;

import java.util.Scanner;

public class Exercise52 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" First Number is");
		int a=sc.nextInt();
		Scanner sa = new Scanner(System.in);
		System.out.println(" Second Number is");
		int b=sa.nextInt();
		Scanner sb = new Scanner(System.in);
		System.out.println(" Third Number is");
		int c=sb.nextInt();
		if((a+b)==c) {
			System.out.println("The result is : yes");
		}
		else{
			System.out.println("The result is no");
		}
	}

}
