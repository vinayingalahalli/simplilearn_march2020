package eg;

public class Calculator {

	int x;
	int y;
	
	public Calculator(String n) {
		System.out.println("n = "+n);;
	}
	
	public Calculator(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int add() {
		return x+y;
	}
	
}
