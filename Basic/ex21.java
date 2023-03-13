//Convert a decimal number to octal number
package Basic;


import java.util.Scanner;

public class ex21 {
	
	 public static void main(String agrs []) {
		 
		 int dec1,quot,i=1,j;
			int oct[]=new int[100];
			Scanner in= new Scanner(System.in);
			System.out.print("Input a decimal number: ");
			  dec1 = in.nextInt();
			    
			  quot=dec1;
			  
			  while(quot !=0)
			  {
				  oct[i++]=quot%8;
				  quot=quot/8;}
				  			   
	   		
	        System.out.print("Oct number is: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(oct[j]);
	        }
	        System.out.print("\n");
}
	 
}
