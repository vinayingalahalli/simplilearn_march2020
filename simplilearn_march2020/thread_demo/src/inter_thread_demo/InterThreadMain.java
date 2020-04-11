package inter_thread_demo;

public class InterThreadMain {

	public static void main(String[] args) {
		Calci c = new Calci();
		Thread t = new Thread(c);
		t.start();
		synchronized (t) {
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Total = " + c.getTotal());

	}

}
