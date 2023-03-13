//Write a Java program to calculate the modules
// of two numbers without using any inbuilt modulus operator.
package Basic;

import java.util.Scanner;

public class Exercise65 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" First Number is");
		int a=sc.nextInt();
		Scanner sa = new Scanner(System.in);
		System.out.println(" Second Number is");
		int b=sa.nextInt();
		System.out.println(" the result is "+ test(a,b));
	}
	public static int test(int x,int y) {
		int sum=0,result=0;
		sum=sum+(x/y);
		result=result+(x-(sum*y));
		return result;		
		
	}
	}
