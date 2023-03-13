package javapractthory;

//class St3{
//	int i =10;
//	{
//		m1();
//		System.out.println("first instance block");
//	}
//	St3(){
//		System.out.println("consturctor");
//	}
//	public static void main(String[] args) {
//		System.out.println("main");
//	}
//	public void m1() {
//		System.out.println("j: "+j);
//	}
//	{
//		System.out.println("second instance block");
//	}
//	int j =20;
//}
//================================================
class St3{
	int i =10;
	{
		m1();
		System.out.println("first instance block");
	}
	St3(){
		System.out.println("consturctor");
	}
	public static void main(String[] args) {
		var t = new St3();
		System.out.println("main");
	}
	public void m1() {
		System.out.println("j: "+j);
	}
	{
		System.out.println("second instance block");
	}
	int j =20;
}