package demo1;

public class Demo {

	public static void main(String[] args) {
		
		Integer i1=10;
		Integer i2=10;
		Integer i3=11;
		
		Integer i4=new Integer(10);
		System.out.println("with ==");
		System.out.println(i1==i2);
		System.out.println(i1==i3);
		System.out.println(i1==i4);
		System.out.println("with .equals");
		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(i3));
		System.out.println(i1.equals(i4));
		
		int x=i1; // autoboxing
		System.out.println(x);
		x=99;
		i1=x;
		System.out.println(i1);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		String s="88";
		i1=Integer.parseInt(s);
		System.out.println(i1);
		i1=99999999;
		s=i1.toString();
		System.out.println(s);
		s=x+""; //append with "" will be coverted to String
		System.out.println(s);
		
		Float f=i1.floatValue();
		System.out.println(f);
		f=9.88f;
		int c=f.intValue();
		System.out.println(c);
				

	}

}

//Double Float Long

