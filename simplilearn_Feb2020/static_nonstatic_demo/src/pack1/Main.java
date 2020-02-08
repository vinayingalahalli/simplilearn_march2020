package pack1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello from main()");
		hey();
		Main m=new Main();
		m.hello();
		m.helloAgain();
		//m.hey(); // not recommended for static methods
		Hello.sayHello();
		Hello h=new Hello();
		h.helloNonStatic();
	}
	
	public static void hey() {
		System.out.println("Hello from hey()");
	}
	
	public void hello() {
		System.out.println("Hello from hello()");
	}
	public void helloAgain() {
		System.out.println("Hello from helloAgain()");
	}

}
