package interviewquestion;

import java.util.Scanner;

public class Perfect_No {
	public static void main(String args[]) {
		int n,i,sum=0;
		System.out.println("Enter the number :");
		Scanner si=new Scanner(System.in);
		n =si.nextInt();
		for(i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			
		}
		if(n==sum)
			System.out.println("Perfect Number");	
		else
			System.out.println(" Not Perfect Number");
		
	
		
		
	}

}
