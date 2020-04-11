package synch_eg;

public class Printer {

	public synchronized static void printPages(Page page) {
		System.out.print(page.getPage1());
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(page.getPage2());
	}
}