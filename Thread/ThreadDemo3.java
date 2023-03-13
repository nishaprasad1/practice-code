package Thread;

public	class ThreadDemo3{
	public static void main(String[] args) {
			var t = new T1();
			t.start();
			
			for(int i=0;i<10;i++) {
				System.out.println("main thread");
			}
	}
}

	class T1 extends Thread{
		public void run(){
			for(int i=0;i<10;i++) {
				System.out.println("child thread");
				Thread.yield();                         //line (1)
			}
		}
	}
