package eg1;

public class ValidateMobileNumber {

	public static void main(String[] args) {
		String s="+91-7891237899";
		if(s.matches("\\+91-[0-9]{10}")) {
			System.out.println("Valid Mobile number");
		}else {
			System.out.println("Invalid Mobile Number");
		}

	}

}
