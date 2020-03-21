package inner_classes_demo;

public class Main {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.outerMethod();
		
		Outer.InnerPublic i=o.new InnerPublic();
		i.innerPublicMethod();
		
		
		Outer.StaticInnerClass.staticInnerMethhod();
		
		Outer.StaticInnerClass s=new Outer.StaticInnerClass();
		s.nonStaticInnerMethod();
	}

}
