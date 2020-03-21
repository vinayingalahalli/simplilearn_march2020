package inner_classes_demo;

public class Outer {

	public void outerMethod() {
		InnerPrivate i=new InnerPrivate();
		i.innerPrivateMethod();
	}
	private class InnerPrivate{
		private  void innerPrivateMethod() {
			System.out.println("hello from innerprivate method");
		}
	}
	
	public class InnerPublic{
		public void innerPublicMethod() {
			System.out.println("hello from innerPublicMethod");
		}
	}
	
	public static class StaticInnerClass{
		
		public static void staticInnerMethhod() {
			System.out.println("hello from static method of static inner class");
		}
		public void nonStaticInnerMethod() {
			System.out.println("hello from non static inner method of static inner class");
		}
	}
	
	
}
