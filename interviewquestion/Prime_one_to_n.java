package interviewquestion;

import java.util.Scanner;

//public class Prime_one_to_n {
//	public	static	void	main	(String	[]	args)		
//	{	
//		Scanner	sc=new	Scanner(System.in);	
//		System.out.println	("enter	number");	
//		int	n=sc.nextInt	();	
//		System.out.println	("Prime	numbers	between	1	and	"	+	n);	
//		//loop	through	the	numbers	one	by	one	
//		for	(int	i=2;	i	<	n;	i++)	
//		{	
//			boolean	isPrime	=	true;	
//			//check	to	see	if	the	number	is	prime	
//			for	(int	j=2;	j	<	i	;	j++)	
//			{	
//				if	(i	%	j	==	0)	
//				{	
//					isPrime	=	false;	
//					break;	
//				}	
//			}	
//			//	print	the	number	
//			if	(isPrime)	
//				System.out.print	(i	+	"	");	
//		}	
//	}	
//
//}

//============================================================================================
public class Prime_one_to_n {
	
	 public	static	void	main(String[]	args)		
	 {	
	 	 java.util.Scanner	sc=new	java.util.Scanner(System.in);	
	 	 System.out.println("enter	number");	
	 	 int	n=sc.nextInt();	
	 	 int	i;	
	 	 if(n==1)	
	 	 {	
	 	 System.out.println("Prime	starts	from	2");	
	 	 }	
	 	 
	 	 for(i=2;i<n	;i++)	
	 	 {	
	 	 	 if(n%i==0)	
	 	 	 	 System.out.println("not	a	prime");	
	 	 	 break;	
	 	 }	
	 	 if(n==i)	
	 	 	 System.out.println("prime");	
	 }
	

}


