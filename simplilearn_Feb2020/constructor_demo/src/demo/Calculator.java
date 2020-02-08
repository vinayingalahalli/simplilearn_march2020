package demo;

public class Calculator {

	int a;
	int b;

	public Calculator(String s) {
		System.out.println("Hello " + s);
	}

	public Calculator() {
		System.out.println("Hi Constructor");
	}

	public Calculator(String s1, String s2) {
		System.out.println(s1 + s2);
	}

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return a + b;
	}

	public void add(String s) {

	}

	public void add(int s) {

	}
}
