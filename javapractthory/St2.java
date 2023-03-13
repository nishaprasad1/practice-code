package javapractthory;

public class St2 {
	static {
		m1();
		System.out.println("1");
		System.out.println("Base static block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("2");
		System.out.println("Base main method");
	}
	public static void m1() {
		System.out.println("3");
		System.out.println("j: "+j);
	}
	static int j = 20;

}
   //===============================================

