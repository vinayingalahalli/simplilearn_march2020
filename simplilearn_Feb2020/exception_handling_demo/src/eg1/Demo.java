package eg1;

public class Demo {

	public static void main(String[] args) {
	
		int a=10;
		int b=0;
		int res=0;
		
		try {
		res=a/b;
		//System.out.println(args[0]);
		String s=null;
		System.out.println(s.length());
		}catch(ArithmeticException e) {
			System.out.println("You cannot divide by zero.....");
		}catch(NullPointerException e) {
			System.out.println("Something is empty");
		}
		finally {
			System.out.println("Result is "+res);
		}
		System.out.println("Some other stuff post result");
	}

}
