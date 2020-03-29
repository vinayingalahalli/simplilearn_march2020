package eg2;

public class Validate {

	
	public boolean isValidAge(int age) throws InvalidAgeException {
		if(age<=0) {
			throw new InvalidAgeException("age cannot be zero or -ve");
		}
		if(age<20 || age>35) {
			throw new InvalidAgeException("age should be between 20 and 35 only");
		}
		
		return true;
	}
	
	public boolean isValidPan(String pan) {
		if(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			return true;
		}else {
			throw new InvalidPanException("Entered Pan "+pan+" is invalid");
		}
	}
}
