package buffer_builder_demo;

public class Demo1 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		sb.append(" heyy").append(198999).append(true).append(1234.888);
		System.out.println(sb);
		sb.insert(2, "JAVA");
		System.out.println(sb);
		sb.delete(4, 7);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
		StringBuffer sb1=new StringBuffer("hey");
		StringBuffer sb2=new StringBuffer("hey");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.toString().equals(sb2.toString()));
		

	}

}
