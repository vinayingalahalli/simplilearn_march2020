package java8_lambda;

public interface NewInterface {

	//Java8
	public static void hello() {
		System.out.println("hello static method from NewInterface");
	}
	
	default void helloDefault() {
		System.out.println("Default definations of method in interface from Java8");
	}
}
