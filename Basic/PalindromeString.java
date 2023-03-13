//check wheather the given string is palidrome or not?
package Basic;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String args[]) {
		
		char arr[];
		System.out.println("enter the caracter : ");
		Scanner s =new Scanner(System.in);
		char[] a = s.next().toCharArray();


		int n=a.length;
		palindrome(a,n);	
	}
	private static void palindrome(char arr[] ,int n) {
		
		int flag=0;
		for(int i=0;i<=n/2 && n!=0;i++) {
			if(arr[i]!=arr[n-i-1]) {
				flag=1;
				break;
			}
		}
		if(flag==1) 
			System.out.println("not Palidrome");
		else
			System.out.println("Palidrome");

	}



}

