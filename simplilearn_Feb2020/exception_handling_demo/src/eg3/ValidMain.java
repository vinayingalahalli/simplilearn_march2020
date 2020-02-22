package eg3;

public class ValidMain {

	public static void main(String[] args) {
		
		Validation v=new Validation();
		try {
			if(v.isValidAge(34)) {
				System.out.println("Age validated");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		if(v.isValidPanNumber("AAAAQ1234"))
		{
			System.out.println("Validated");
		}
		}catch(InvalidPanException e) {
			System.out.println(e.getMessage());
		}
	}

}
