package using_thread_class;

public class MyThread  extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread()+" Id is "+Thread.currentThread().getId());
	}
}
