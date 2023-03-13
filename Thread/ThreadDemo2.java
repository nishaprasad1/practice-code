package Thread;

public class ThreadDemo2 extends Thread {
	// Java Program to illustrate the execution of
	// program using main thread
	
		public void run()
		{
			System.out.println("GeeksforGeeks");
		}
		public void run(int i)
		{
			System.out.println("Bishal");
		}
	}

	class Test extends ThreadDemo2 {
		public static void main(String[] args)
		{
			var t = new ThreadDemo2();
			t.run(1);
		}
	}


