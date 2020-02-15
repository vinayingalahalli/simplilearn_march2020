package eg1;

public class Demo {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s);

		System.out.println(s.equals("hello"));
		System.out.println(s.equals("Hello"));

		System.out.println(s.equalsIgnoreCase("HELlo"));

		System.out.println(s.length());
		System.out.println(s.charAt(0));

		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		System.out.println(s.startsWith("he"));
		System.out.println(s.startsWith("something"));
		System.out.println(s.endsWith("llo"));
	    
		
		System.out.println(s.contains("lol"));
		
		String s1="     jagf jaksdaskj af f a     ";
		System.out.println(s1);
		System.out.println(s1.trim());
		
		String s3="hello hi good morning everyone";
		String s4[]=s3.split(" ");
		for (int i = 0; i < s4.length; i++) {
			System.out.println(s4[i]+s4[i].length());
		}
		
		
		
		
		
	}

}
