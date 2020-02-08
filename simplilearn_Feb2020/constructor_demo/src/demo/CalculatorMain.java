package demo;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c=new Calculator("Raj");
		Calculator c1=new Calculator();
		Calculator c2=new Calculator("one", "two");
		
		
		System.out.println(c2.add());
		
		Calculator c3=new Calculator(1233, 9);
		System.out.println(c3.add());
	}

}
