//static test
package javapractthory;

class Base{
	static int i = 10;
	static {
		m1();
		System.out.println("1");
		System.out.println("first static block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("2");
		System.out.println("main method");
	}
	public static void m1() {
		System.out.println("3");
		System.out.println("j: "+j);
	}
	static {
		System.out.println("4");
		System.out.println("second static block");
	}
	
	static int j =20;
}
