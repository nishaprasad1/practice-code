package Thread;

class T3 extends Thread{
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("I am lazy Thread");
				Thread.sleep(2000L);
			}
		}catch (InterruptedException e) {
			System.out.println("I got Interrupted");
		}			
	}
}
class ThreadSleepDemo{
	public static void main(String[] args) {
		var t = new T3();
		t.start();
		t.interrupt();                              //----------->"line (1)"
		System.out.println("end of main");
		
	}
}