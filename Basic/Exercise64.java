//Write a Java program that accepts two integer values between 25 to 75 and
// return true if there is a common digit in both numbers
package Basic;

import java.util.Scanner;

public class Exercise64 {
	 
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println(" First Number is");
			int a=sc.nextInt();
			Scanner sa = new Scanner(System.in);
			System.out.println(" Second Number is");
			int b=sa.nextInt();
			System.out.println(" the result is "+ test(a,b));
		}
		public static boolean test(int x,int y) {
			int sum1=0,sum2=0;
			if((25<x &&x<75) && (25<y &&y<75)) {
				sum1=sum1+(x%10);
				sum2=sum2+(y%10);
				x=x/10;
				y=y/10;
				if(sum1==sum2 || x==y|| x==sum2 || y==sum1) {
					return true;
				}
				return false;
			}
			return false;
			}

}
