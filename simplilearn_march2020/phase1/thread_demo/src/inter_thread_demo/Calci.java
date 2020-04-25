package inter_thread_demo;

public class Calci implements Runnable {
	private int total;

//	public Calci() {
//		Thread t = new Thread(this);
//		t.start();
//		synchronized (t) {
//			try {
//				t.wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//	}

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total = total + i;
			}
			notify();
		}
	}
	public int getTotal() {
		return total;
	}
}
