package java8_lambda;

@FunctionalInterface
public interface HiFunctional {

	public static void hey() {
		System.out.println("Static methods");
	}
	
	void sayHello(String s);
	default void sayHello123(String s) {
		//
	}
}
