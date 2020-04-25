package overload_demo;

public class Calci {

	public void add(int a,int b) {
		System.out.println("void int,int called.. result is "+(a+b));
	}
	
	public int add(int a,int b, int c) {
		return a+b+c;
	}
	
	public void add(float a,int b) {
		System.out.println("void float,int called.. result is "+(a+b));
	}
}
