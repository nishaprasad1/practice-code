package javapractthory;

public class St4 {
	{
		System.out.println("1st instance block");
	}
	static	{
		System.out.println("1st static block");
	}
	St4(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		var t = new St4();
		System.out.println("main 1");
		var t1 = new St4();
		System.out.println("main 2");
		
	}
	static {
		System.out.println("2nd static block");
	}
	{
		System.out.println("2nd instance block");
	}
}
