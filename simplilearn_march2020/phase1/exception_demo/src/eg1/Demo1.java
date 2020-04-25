package eg1;

public class Demo1 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int res=0;
		
		try {
		res=a/b;
		String s=null;
		System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}catch(NullPointerException e) {
			System.out.println("Something is empty");
		}catch(Exception e) {
		System.out.println("some other excepton occured");	
		}
		finally {
			System.out.println("Result is "+res);
		}
		System.out.println("Other LOC");
	}

}
