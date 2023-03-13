package Basic;

import java.util.Scanner;

public class Fibonacciseries { 
	public static void main(String args[]) {
		int a,b,c,n,fib,i;
		System.out.println("Enter the number till you want the fibonacci :");
		Scanner ni=new Scanner(System.in);
		n=ni.nextInt();
		a=1;
		b=2;
		System.out.println(a);
		System.out.println(b);
		
		for(i=3;i<=n;i++) {
			c=a+b;
			
			System.out.println(c);
			a=b;
			b=c;
			
			
			
			
			
		}
		
		
	}

}
