package eg;

public class Demo {

	public static void main(String[] args) {
		Calculator c=new Calculator("giri");
		System.out.println(c.add());
		
		int x=199;
		int y=99;
		c=new Calculator(x, y);
		System.out.println(c.add());

	}

}
