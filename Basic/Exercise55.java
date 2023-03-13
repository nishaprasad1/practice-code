//Write a Java program to convert seconds to hour, minute and seconds.
package Basic;

import java.util.Scanner;

public class Exercise55 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the seconds");
		int a=sc.nextInt();
		int s=a%60;
		
		int h=a/60;
		int m=h%60;
		h=h/60;
		System.out.print( h + ":" + m + ":" + s);
		System.out.print("\n");
	}

}
