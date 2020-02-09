package inheritance_demo;

public class WhatsAppMain {

	public static void main(String[] args) {
		WhatsAppV3 v3=new WhatsAppV3();
		System.out.println("Created object of "+v3.getClass());
		v3.conferenceCall();
		v3.message();
		v3.videoCalling();
		v3.voiceCall();
		v3.voiceMessage();
		System.out.println(v3.hashCode());
		
		

	}

}
