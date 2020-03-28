package eg;

public class Demo {

	public static void main(String[] args) {
		Integer i1=10;
		Integer i2=10;
		Integer i3=9;
		Integer i4=new Integer(10);
		System.out.println(i1==i2);
		System.out.println(i1==i3);
		System.out.println(i1==i4);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(i3));
		System.out.println(i1.equals(i4));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		String s="100";
		int x=Integer.parseInt(s);
		System.out.println(x);
		x=9999;
		s=x+"";
		System.out.println(s);
		i1=x;
		System.out.println(i1);
		i1=89;
		x=i1;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(10));
		Float f=i1.floatValue();
		System.out.println(f);
		f=121.2222f;
		x=f.intValue();
		System.out.println(x);
		
		//Long Float Double
		
	}

}
