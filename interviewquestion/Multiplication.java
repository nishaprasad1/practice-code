package interviewquestion;

public class Multiplication {
	 public	static	void	main(String[]	args)		
	 {	
	 	 java.util.Scanner	sc=new	java.util.Scanner(System.in);	
	 	 System.out.println("enter	number");	
	 	 int	n=sc.nextInt();	
	 	 int	i,j;
	 	 for(i=1;i<=n;i++)
	 	 {
	 		 for(j=1;j<=10;j++) {
	 			 System.out.println(i+"*"+j+" "+(i*j));	
	 		 }
	 		 System.out.println("\n");	
	 	 }
	 	 
	 }
}
