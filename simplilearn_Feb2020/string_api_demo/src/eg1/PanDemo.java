package eg1;

public class PanDemo {

	public static void main(String[] args) {
		// first 5 uppercase letters followed by 4 digits and an uppercase letter
		// XXXXX1111X
		String s="AGSDF1211@";
		boolean b=false;
		
		if(s.length()==10 && Character.isUpperCase(s.charAt(9))) {
		
			int alpha=0;
			for (int i = 0; i <5; i++) {
				if(Character.isUpperCase(s.charAt(i))){
					alpha++;
				}
			}
			if(alpha==5) {
				int digits=0;
				for (int i = 5; i < 9; i++) {
					if(Character.isDigit(s.charAt(i))) {
						digits++;
					}
				}
				if(digits==4) {
					b=true;
				}
			}
		}
		if(b) {
			System.out.println("Valid PAN");
		}else {
			System.out.println("Invalid PAN");
		}

	}

}
