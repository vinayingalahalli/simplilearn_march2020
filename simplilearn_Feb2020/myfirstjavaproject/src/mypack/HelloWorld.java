package mypack;

public class HelloWorld {

	//static int x;
	public static void main(String vinay[]) {
		if(vinay==null || vinay.length==0) {
			System.out.println("Sorry i wont start");
		}else
		System.out.println("Hello "+vinay[0]+"   "+vinay[1]);
	}
//	class M{}
//	public class Z{}
//	private class D{}
//	protected class Q{}
//	public static class W{}

}
// class A{}
// 
// class B{}
// class Z{}

class Product{
	int pid;
	String pname;
	double price;
	static float discount=2.5f;
}