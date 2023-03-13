//sum of digit of a given number 
package Basic;

import java.util.Scanner;

public class sumofdigit {
	public static void main(String args[]) {
		int n,i,sum=0;
		System.out.println("enter the number");
		Scanner ni=new Scanner(System.in);
		n=ni.nextInt();
			System.out.println("the sum of digit is :"+" "+sum(n));		
	}
		public static int sum(int x) {
			int sum=0;
			while(x!=0) {
				sum=sum+(x%10);
				x=x/10;
				
			}
			return sum;
		}
}
