package eg2;

public class Main {

	public static void main(String[] args) {
	
		Validate v=new Validate();
		try {
			if(v.isValidAge(-35)) {
				System.out.println("Age validated");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		if(v.isValidPan("ABCDE1111A")) {
			System.out.println("Pan Validated");
		}
		}catch(InvalidPanException e) {
			System.out.println(e.getMessage());
		}

	}

}
