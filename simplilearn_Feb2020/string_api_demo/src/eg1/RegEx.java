package eg1;

public class RegEx {

	public static void main(String[] args) {
		/*
		 * RegEx (Regular Expression)
		 * PMA - Pattern matching Algorithm  
		 * GREP - Global regular expression
		 * 
		 * [] - represents any pattern
		 * {} - length
		 * [a-z]{5} - any lowercase letters of length 5 
		 * [0-9]{7,10} - any digits of minimum length 7 and max length of 10
		 * [A-Za-z]{1,} - atleast 1 alphabet
		 * ^ - not
		 * [^a-z] - apart from lowercase letters
		 * ?+.*() 
		 */
		String s="AGSDF1211S";
		if(s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Valid PAN");
		}else {
			System.out.println("Invalid PAN");
		}
		String s1="HEllooo123    2 ()( )...A1 ...n";
		System.out.println(s1.replaceAll("[^A-Za-z]", ""));
		System.out.println(s1.replaceAll("[^A-Za-z]", "").length());
		System.out.println(s1.replaceAll("[ A-Za-z0-9]", ""));
	}

}
