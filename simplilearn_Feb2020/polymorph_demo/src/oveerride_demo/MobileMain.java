package oveerride_demo;

public class MobileMain {

	public static final float PI=3.47f;
	
	public static void main(String[] args) {
		
		MobileV2 v2=new MobileV2();
		System.out.println("Accessing features of "+v2.getClass());
		v2.calling();
		v2.messaging();
		v2.displayMenu();
		v2.gaming();
		v2.socialNetwork();
		final int x=100;
		//x++;

	}

}
