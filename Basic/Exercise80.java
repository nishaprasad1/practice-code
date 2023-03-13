//Write a Java program to get the larger value between first and 
//last element of an array (length 3) of integers 
package Basic;

import java.util.*;

public class Exercise80 {
	public static void main(String[] args){
		int[] arr= {10,20,30,12,51,88,123};
		//		Scanner sc =new Scanner(System.in);		
		//		System.out.println("enter the element");
		test(arr);			

	}
	public static  void test(int[] arr) {
		int max=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(max <= arr[i]) 

				max=arr[i];			
			
		}
		System.out.println("the greater number is "+" "+max);

	}
}




