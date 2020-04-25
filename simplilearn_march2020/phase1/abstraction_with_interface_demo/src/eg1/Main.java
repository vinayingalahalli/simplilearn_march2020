package eg1;

public class Main {

	public static void main(String[] args) {
		MyInterface m=new MyClass();
		m.common();
		m.method1();
		Interface2 i=new MyClass();
		i.common();
		i.hello();
		MyInterface.Inner i2=new MyClass();
		i2.inner1();

	}

}
