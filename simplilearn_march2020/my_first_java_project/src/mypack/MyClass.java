package mypack;

 public class MyClass {

	public static void main(String vinay[]) {
		System.out.println("Helllo");
		System.out.println(vinay[0]);
		System.out.println(vinay[1]);
		System.out.println(vinay[2]);
		heyy();
		MyClass m=new MyClass();
		m.hello();
		m.heyy();
		Two.helloStatic();
		Two t=new Two();
		t.nonStatic();
	}
	public void hello() {
		System.out.println("I am non static method");
	}
	public static void heyy() {
		System.out.println("Heyyy");
	}
	
//	private class A{
//		
//	}
//	protected class B{
//		
//	}

}
 
// class D{
//	 
// }
// class P{
//	 
// }
// class A{
//	 
// }
// 