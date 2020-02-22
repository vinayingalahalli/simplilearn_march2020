package eg3;

public class Validation {

	public boolean isValidAge(int age) throws InvalidAgeException{
		
		if(age<=0) {
			throw new InvalidAgeException("Age cannot be -ve or 0");
		}
		if(age<18 || age>33) {
			throw new InvalidAgeException("Only users between 18 and 33 are allowed");
		}
		
		return true;
	}
	
	
	public boolean isValidPanNumber(String pan)throws InvalidPanException {

		if(!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			throw new InvalidPanException("Entered Pan "+pan+ " is invalid");
		}
		return true;
	}
}
