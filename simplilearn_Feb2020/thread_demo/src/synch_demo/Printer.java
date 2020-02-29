package synch_demo;

public class Printer {

	public static synchronized void printMessage(Messages message) {
		System.out.print(message.getMessage1());
		try {
			Thread.currentThread().sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" "+message.getMessage2());
	}
}
