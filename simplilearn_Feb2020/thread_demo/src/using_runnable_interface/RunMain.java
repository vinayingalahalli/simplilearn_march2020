package using_runnable_interface;

public class RunMain {

	public static void main(String[] args) {
		MyRunThread r1=new MyRunThread();
		Thread t1=new Thread(r1, "run-1");
		MyRunThread r2=new MyRunThread();
		Thread t2=new Thread(r2, "run-2");
		MyRunThread r3=new MyRunThread();
		Thread t3=new Thread(r3, "run-3");
		MyRunThread r4=new MyRunThread();
		Thread t4=new Thread(r4, "run-4");
		MyRunThread r5=new MyRunThread();
		Thread t5=new Thread(r5, "run-5");
//		t5.setDaemon(true);
//		t4.setDaemon(true);
//		t3.setDaemon(true);
//		t2.setDaemon(true);
//		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for (int i = 0; i < 4; i++) {
//			System.out.println("Printing from "+Thread.currentThread().getName()+" i = "+i);	
//			try {
//				Thread.currentThread().sleep(1500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		System.out.println("Main ends here");

	}

}
