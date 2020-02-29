package using_thread_class;

public class DemoMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t=Thread.currentThread();
		t.setName("vinay's_main...");
		t.setPriority(9);
		System.out.println(Thread.currentThread());
		
		MyThread t1=new MyThread();
		t1.setName("t-1");
		t1.setPriority(7);
		MyThread t2=new MyThread();
		t2.setName("t-2");
		MyThread t3=new MyThread();
		t3.setName("t-3");
		MyThread t4=new MyThread();
		t4.setName("t-4");
		MyThread t5=new MyThread();
		t5.setName("t-5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
