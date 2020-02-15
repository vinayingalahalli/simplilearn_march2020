package java8_lambda;

public class BoilerPlate implements HelloFunctional {

	public static void main(String[] args) {
		HelloFunctional h=new BoilerPlate();
		h.hello();
	}

	@Override
	public void hello() {
		System.out.println("heyyy");
		
	}

}
