//Write a Java program to print numbers between 1 to 100
//which are divisible by 3, 5 and by both
/*package Basic;

public class Exercise50 {
	public static void main(String args[]) {
		int i;
		for(i=1;i<100;i++) {
			if(i%3==0 ) {
				System.out.println("Number is divisible by 3 "+i);
			}
			else if (i%5==0){
				System.out.println("Number is divisible by 5 "+i);
			}
//			else if(i%15==0) {
//				System.out.println("Number is divisible by 15 "+i);
//			}

			else {
				System.out.println("Number is not divisible"+i);
			}

		}
	}
}
*/
package Basic;
public class Exercise50 {
    	public static void main(String args[]) {
		System.out.println("\nDivided by 3: ");		
		for (int i=1; i<100; i++) {
			if (i%3==0) 
			System.out.print(i +", ");			
		}			
				
		System.out.println("\n\nDivided by 5: ");
		for (int i=1; i<100; i++) {
			if (i%5==0) System.out.print(i +", ");			
		}
				
		System.out.println("\n\nDivided by 3 & 5: ");			
		for (int i=1; i<100; i++) {
			if (i%3==0 && i%5==0) System.out.print(i +", ");			
		}
		System.out.println("\n");
  }
}
