package override_demo;

public class Main {

	public static final int VALUE=9999; 
	
	public static void main(String[] args) {
		MobileV2 v2=new MobileV2();
		
		v2.calling();
		v2.gaming();
		v2.messaging();
		v2.displayMenu();
		System.out.println(v2.hashCode());
		v2.socialApps();
		v2.videoCalling();
		
		
		MobileV1 v1=new MobileV2();
		v1.calling();
		v1.displayMenu();
		
		final int x=100;
		//x=99;
		
		System.out.println(Math.PI);

	}

}
