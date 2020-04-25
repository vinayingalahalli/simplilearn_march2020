package overload_demo;

public class OverloadMain {

	public static void main(String[] args) {
		Calci c=new Calci();
		c.add(12.34f, 999);
		c.add(100, 122);
		System.out.println("(int,int,int) called"+c.add(99, 88, 99));

	}

}
