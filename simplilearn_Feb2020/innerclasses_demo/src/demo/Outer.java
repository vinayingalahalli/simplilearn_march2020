package demo;

public class Outer {

	public void outerMethod() {
		Inner i =new Inner();
		i.innerMethod();
	}
	private class Inner{
		public void innerMethod() {
			System.out.println("innerMethod() of private Inner class ");
		}
	}
	public class InnerPublic{
		public  void helloInnerPublic() {
			System.out.println("Hello from InnerPublic");
		}
	}
	
	public static class InnerStatic{
		public static void helloInnerStatic() {
			System.out.println("Hello from static method of InnerStatic class");
		}
		public  void helloInnerNonStatic() {
			System.out.println("Hello from NON static method of InnerStatic class");
		}
	}
}
