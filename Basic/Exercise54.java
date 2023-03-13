//Write a Java program that accepts three integers from the user and 
//return true if two or more of them (integers ) have the same 
//rightmost digit. The integers are non-negative
package Basic;

import java.util.Scanner;

public class Exercise54 {
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
		System.out.println(" The condition is "+test(a,b,c,true));
	}
	public static boolean test(int x,int y,int z,boolean abc) {
		 return (x%10==y%10||y%10==z%10|| z%10==x%10);
	}
	


}
