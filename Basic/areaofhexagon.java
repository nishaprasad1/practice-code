package Basic;

import java.util.Scanner;


public class areaofhexagon {
	
	public static void main(String args[]) {
		int n;
		System.out.println("enter the side");
		Scanner ni=new Scanner(System.in);
		n=ni.nextInt();
		hexagoan(n);	
	} 
	public static void hexagoan(int x) {
		double area= (6 * (x*x))/(4*Math.tan(Math.PI/6));
		System.out.println("area of Hexagoan is :"+" "+area);
		
	}

}
