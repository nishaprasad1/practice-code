//Write a Java program to test if 10 appears as either the first 
//or last element of an array of integers. The length of 
//the array must be greater than or equal to 2.
package Basic;

public class Exercise74 {
	public static void main(String[] args){
		int arr[]= {10,20,30,40,50,60,70,80,90,10};
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==10) 
				System.out.println("true"+" "+arr[i]);
			else
			System.out.println("false"+" "+arr[i]);
		}
	}

}
