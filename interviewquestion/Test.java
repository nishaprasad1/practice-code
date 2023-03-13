package interviewquestion;

public class Test{
	private void m1(int i) {
		System.out.println("int-arg");
	}
	private void m1(double f) {
		System.out.println("float-arg");		
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1(10);//----------> int-arg
		t.m1(10.5f);//---------->float-arg
		t.m1('a');//---------->int-arg
		t.m1(15l);//--------->float-arg
		
//		t.m1(10.5);//CE: The method m1(int) in the type Test 
		          //is not applicable for the arguments (double)
	}
}


