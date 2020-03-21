package static_non_static;

public class Demo {
	int x; // instance level
	int y; // instance level
	static int z=100000; //class level
	
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.x=99;
		d1.y=88;
		System.out.println("printing d1");
		d1.print();
		Demo d2=new Demo();
		d2.x=889;
		d2.y=8800000;
		z=909090;
		System.out.println("printing d2");
		d2.print();
		System.out.println("printing d1");
		d1.print();
		
	}
	
	public void print() {
		System.out.println("z= " +z);
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
}
