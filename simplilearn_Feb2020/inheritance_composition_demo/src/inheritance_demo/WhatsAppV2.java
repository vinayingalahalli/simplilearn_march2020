package inheritance_demo;

public class WhatsAppV2 extends WhatsAppV1 {

	public void voiceMessage() {
		System.out.println("VoiceMessage from V2");
	}
	
	public void voiceCall() {
		System.out.println("Voicecall from V2");
	}
	public WhatsAppV2() {
	System.out.println("V2");
	}
	
}
