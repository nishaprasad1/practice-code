package Basic;

public class reentrant {
	public static void main (String [] args) {
		String s1="pgdac";
		String s2= new String("pgdac");
		String s3="pgdac";
		String s4=s1;
		if(s1==s2) {
			System.out.println("s1 and s2 equals");
			
		}
		else {
			System.out.println("s1 and s2 not equals");
		}
		if(s1==s3) {
			System.out.println("s1 and s3 equals");
		}
		else {
			System.out.println("s1 and s3 not equals");
		}
	if(s1==s4) {
		System.out.print("s1 and s4 equals");
	}
	else {
		System.out.print("s1 and s4 not  equals");
	}
}
	

}
