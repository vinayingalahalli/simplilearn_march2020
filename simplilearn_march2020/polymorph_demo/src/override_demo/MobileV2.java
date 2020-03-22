package override_demo;

public class MobileV2 extends MobileV1 {

	public void videoCalling() {
		System.out.println("Video calling from V2");
	}
	
	public void socialApps() {
		System.out.println("Social N/wing from V2");
	}
	
	public void gaming() {
		System.out.println("Gaming from V2");
	}
	
	@Override
	public void displayMenu() {
	//	super.displayMenu();
		System.out.println("Menu in V2 is upgraded to GRID view");
	}
}
