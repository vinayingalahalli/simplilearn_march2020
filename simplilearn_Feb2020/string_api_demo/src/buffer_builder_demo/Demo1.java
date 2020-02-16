package buffer_builder_demo;

public class Demo1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello buffer");
		System.out.println(sb);
		sb.append(" java").append(123).append(true).append(" jeee").append(12.445555);
		System.out.println(sb);
		sb.insert(1, "vinay");
		System.out.println(sb);
		sb.delete(3, 7);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuffer sb1=new StringBuffer("hello");
		StringBuffer sb2=new StringBuffer("hello");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.toString().equals(sb2.toString()));
	}

}
