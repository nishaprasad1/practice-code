// Write a Java program to create and display unique three-digit number using
// 1, 2, 3, 4.
//Also count how many three-digit numbers are there
package Basic;

public class Exercise39 {
    
 public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				for(int k=1;k<=4;k++) {
					if(i!=k && k!=j && j!=i) {
					count++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.println("Total number of the three-digit-number is " + count);
}
}

