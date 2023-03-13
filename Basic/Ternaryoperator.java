package Basic;

public class Ternaryoperator {
	public static void main (String [] args) {
		int a=12;
		int b=15;
		int c=9;
		int d=20;
		int num1=a>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("num1 ="+num1);
		int num2=b>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("num1 ="+num2);
		int num3=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("num1 ="+num3);
		int num4=d>(a>b?a:b)?c:(a>b?a:b);
	System.out.println("num1 ="+num4);
	}

}
