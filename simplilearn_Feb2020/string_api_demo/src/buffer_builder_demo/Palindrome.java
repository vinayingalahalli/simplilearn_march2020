package buffer_builder_demo;

public class Palindrome {

	public static void main(String[] args) {
		int x=101;
		String s=x+"";
		
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s1=sb.toString();
		if(s.equals(s1)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		
		
		if(new StringBuffer(s).reverse().toString().equals(s)) {
			System.out.println("Palin");
		}else {
			System.out.println("Not Palin");
		}
		
	}

}
