package java8_features;

public interface NewInterface {

	public static void hey() {
		System.out.println("Heyy I am static method from Interface available from Java8");
	}
	
	
	default void helloDefault() {
		System.out.println("Hi default from Java8");
	}
}
