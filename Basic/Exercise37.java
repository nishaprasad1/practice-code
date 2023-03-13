//to reverse the given string
package Basic;

import java.util.Scanner;

public class Exercise37 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}
//class program{
//	public static void main(String args[]){
//		Scanner si =new Scanner(System.in);
//		System.out.println("Input the string");
//		char[] arr=si.nextLine().toCharArray();
//		System.out.println("Reverse string");
//		for(int i=arr.length-1;i>=0;i--){
//		System.out.println(arr[i]);
//}
//		System.out.println("\n");
//		
//}
//}
