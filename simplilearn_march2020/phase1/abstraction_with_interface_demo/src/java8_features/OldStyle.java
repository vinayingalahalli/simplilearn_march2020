package java8_features;

public class OldStyle implements HelloFunctional {

	@Override
	public void hey() {
		// TODO Auto-generated method stub
		System.out.println("heyyyy");
	}
	
	public static void main(String[] args) {
		HelloFunctional h=new OldStyle();
		h.hey();
	}

}
