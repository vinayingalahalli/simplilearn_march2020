package inheritance_demo;

public class WhatsAppV3 extends WhatsAppV2{

	public void videoCalling() {
		System.out.println("Video calling from V3");
	}
	
	public void conferenceCall() {
		System.out.println("Con call from V3");
	}
	public WhatsAppV3() {
		System.out.println("V3");
		}
}
