package javapractthory;

//public class st1 {
//	static int i = 10;
//	static {
//		m1();
//		System.out.println("1");
//		System.out.println(i);//-------> direct read
//	}
//	public static void m1() {
//		System.out.println("2");
//		System.out.println(i);//-------> indirect read
//	}
//	public static void main(String[] args) {
//		m1();
//		System.out.println("3");
//		System.out.println("main method");
//	}
//
//
//}
//=======================================================================
//public class st1{
//	static int x = 10;
//	static {
//		System.out.println(x);
//	}
//	public static void main(String[] args) {}
//	
//}
//================================================================================
class st1{
	static {
		System.out.println("yes i can print"); //not possible to print
		System.exit(0);
	}
}
