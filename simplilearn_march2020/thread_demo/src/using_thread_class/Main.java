package using_thread_class;

public class Main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t=Thread.currentThread();
		t.setName("my_main");
		t.setPriority(6);
		System.out.println(Thread.currentThread());
		
		MyThread m1=new MyThread();
		m1.setName("t1");
		MyThread m2=new MyThread();
		m2.setName("t2");
		MyThread m3=new MyThread();
		m3.setName("t3");
		MyThread m4=new MyThread();
		m4.setName("t4");
		MyThread m5=new MyThread();
		m5.setName("t5");
		m1.setDaemon(true);
		m2.setDaemon(true);
		m3.setDaemon(true);
		m4.setDaemon(true);
		m5.setDaemon(true);
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		for (int i = 0; i < 4; i++) {
			System.out.println("printing from "+Thread.currentThread().getName()+" i = "+i);
//			try {
//				Thread.currentThread().sleep(1500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}

	}

}
