package oveerride_demo;

public class MobileV2 extends MobileV1{

	public void gaming() {
		System.out.println("Gaming feature of V2");
	}
	public void videoCalling() {
		System.out.println("Video calls from V2");
	}
	public void socialNetwork() {
		System.out.println("Social n/w apps from V2");
	}
	@Override
	public void displayMenu() {
		System.out.println("Menu in V2 is in GRID view");
	}
}
