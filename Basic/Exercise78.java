//Write a Java program to test that a given array of 
//integers of length 2 contains a 4 or a 7
package Basic;
import java.util.*;

public class Exercise78 {
	public static void main(String[] args){
		
		Scanner sc =new Scanner(System.in);
		
		int[] arr=new int[5];
		System.out.println("enter the element");
		for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
		if(arr[i]==4 || arr[i]==7) {
			System.out.println("true");
		} 
		}
		
		
	}

}
