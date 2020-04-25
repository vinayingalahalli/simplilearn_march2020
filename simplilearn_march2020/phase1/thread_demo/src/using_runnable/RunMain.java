package using_runnable;

public class RunMain {

	public static void main(String[] args) {
		MyRunThread m1=new MyRunThread();
		MyRunThread m2=new MyRunThread();
		MyRunThread m3=new MyRunThread();
		MyRunThread m4=new MyRunThread();
		MyRunThread m5=new MyRunThread();
		
		Thread t1=new Thread(m1, "run-1");
		Thread t2=new Thread(m2, "run-2");
		Thread t3=new Thread(m3, "run-3");
		Thread t4=new Thread(m4, "run-4");
		Thread t5=new Thread(m5, "run-5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		for (int i = 0; i < 4; i++) {
			System.out.println("printing from "+Thread.currentThread().getName()+" i = "+i);
			try {
				Thread.currentThread().sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
		
		System.out.println("main ends here");
	}

}
