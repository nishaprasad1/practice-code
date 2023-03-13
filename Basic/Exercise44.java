package Basic;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		int a,sum=0,sum1=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a Number: ");
		a=sc.nextInt();

		sum=sum+(a*10+a);
		sum1=sum1+(sum*10+a);
		System.out.print(a+" "+ sum +" "+sum1);
		


	}

}