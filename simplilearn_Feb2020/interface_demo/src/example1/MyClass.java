package example1;

public class MyClass implements MyInterface,Interface2 {

	@Override
	public void helloMyInterface() {
		System.out.println("Helllo");
		
	}

	@Override
	public void helloAgain() {
		// TODO Auto-generated method stub
		System.out.println("Hello Again");
		System.out.println(x);
	}
	
	public void local() {
		System.out.println("Local to Myclass");
	}

	@Override
	public void hey() {
		// TODO Auto-generated method stub
		System.out.println("heyyy from Interface2");
	}

	@Override
	public void heyAgain() {
		// TODO Auto-generated method stub
		System.out.println("hey again from Interface2");
	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
	System.out.println("I am common method");	
	}

}
