//Write a Java program that accepts three integers from the user and
// return true if the second number is greater than first number and 
//third number is greater than second number. If "abc" is true second
// number does not need to be greater than first number
package Basic;

import java.util.Scanner;

public class Exercise53 {

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
		if(abc)
			return (z> y);
		return (y > x && z > y);
	}

}
