package buffer_builder_demo;

public class Palindrome {

	public static void main(String[] args) {
		int x=1211;
		//String s="1madam1";
		String s=x+"";
		if(new StringBuffer(s).reverse().toString().equals(s)) {
			System.out.println("Its Palin");
		}else {
			System.out.println("Its not palin");
		}

	}

}
