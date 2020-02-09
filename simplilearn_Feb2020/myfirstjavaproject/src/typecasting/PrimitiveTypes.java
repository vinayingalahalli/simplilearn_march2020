package typecasting;

public class PrimitiveTypes {

	public static void main(String[] args) {
		
		int x=10;  // 4bytes
		double d=x;  //8bytes   -Implicit casting
		System.out.println(d);
		
		d=22.333;
		x=(int)d;   // Explicit casting
		System.out.println(x);
		
		
		char c='A';
		int z=c; //implicit
		System.out.println(z);
		z=99;
		c=(char)z;
		System.out.println(c);
		

	}

}
