// Write a Java program that accepts three integer values 
//and return true if one of them is 20 or more and
// less than the substractions of others. 
package Basic;
import java.util.*;
public class Exercise62 {
   
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
		System.out.println(" The condition is "+test(a,b,c));
	}
	public static boolean test(int x,int y,int z) {
//		if((x>20 || y>20||z>20)&& ((x-y)<z ||(y-z)<x||(z-x)<y)) {
		if((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20)) {
		 return true;
		}
		return false;
	}
	
	
}
