package demo;

import demo.Outer.InnerStatic;

public class Main {

	public static void main(String[] args) {

		Outer o = new Outer();
		o.outerMethod();

		Outer.InnerPublic i = o.new InnerPublic();
		i.helloInnerPublic();
		
		Outer.InnerStatic.helloInnerStatic();
		
		InnerStatic i2=new InnerStatic();
		i2.helloInnerNonStatic();
	}

}
