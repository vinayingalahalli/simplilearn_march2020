package java8_lambda;

public class LambdaMain {

	public static void main(String[] args) {
		HelloFunctional h=()->{
			System.out.println("Hello lambda");
		};
		h.hello();
		HelloFunctional h1=()->{
			System.out.println("Hello lambda again");
		};
		h1.hello();
		
		
		HiFunctional h3=(name)->{
			System.out.println("Heyyy "+name);
		};
		
		h3.sayHello("Dr.Vinay");
		h3.sayHello123("v");
		HiFunctional.hey();
		
		
		SumFunctional s=(a,b)->{
			return a+b;
		};
		
		System.out.println("Result is "+s.add(100, 8888));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
