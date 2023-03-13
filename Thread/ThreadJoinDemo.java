package Thread;


	class T2 extends Thread{
		public void run(){
			for(int i=0;i<10;i++) {
				System.out.println("child thread");
				try {
					Thread.sleep(2000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	class ThreadJoinDemo{
		public static void main(String[] args) throws InterruptedException {
				var t = new T2();
				t.start();
				t.join();                      //---------> "line (1)"
	//		t.join(10000L);
				
				for(int i=0;i<10;i++) {
					System.out.println("main thread");
				}
		}
	}

