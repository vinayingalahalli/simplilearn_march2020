package demo3;

public class DemoMain {

	public static void main(String[] args) {

		System.out.println("Hello main");
		new DemoMain();
		new DemoMain();
		new DemoMain();
	}
	public DemoMain(){
		System.out.println("Hello constructor");
	}

	static {
		System.out.println("Hello from static block");
	}

	{
		System.out.println("Helo from non static block");
	}

}
