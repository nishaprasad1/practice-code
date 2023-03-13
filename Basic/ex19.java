// Write a Java program to convert a decimal number to binary number.
package Basic;

import java.util.Scanner;

public class ex19 {
	
	public static void main(String args[]) {
		
		int dec1,quot,i=1,j;
		int bin[]=new int[100];
		Scanner in= new Scanner(System.in);
		System.out.print("Input a decimal number: ");
		  dec1 = in.nextInt();
		    
		  quot=dec1;
		  
		  while(quot !=0)
		  {
			  bin[i++]=quot%2;
			  quot=quot/2;}
			  			   
   		
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin[j]);
        }
        System.out.print("\n");
    


			  
		  }
	} 
