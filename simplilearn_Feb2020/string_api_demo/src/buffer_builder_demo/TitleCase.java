package buffer_builder_demo;

public class TitleCase {

	public static void main(String[] args) {
		String s="hello hi good evening everyone.";
		StringBuilder sb=new StringBuilder();
		String s1[]=s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			sb.append(Character.toUpperCase(s1[i].charAt(0))).append(s1[i].substring(1)).append(" ");
		}
		System.out.println(sb.toString().trim());
		

	}

}
//1)Try the above for last letter of every word
//2) Try the above with middle letter , but only for those words whose length is odd.