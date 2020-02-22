package eg1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		hs.add("heyy");
		hs.add("hii");
		hs.add("heyy");
		hs.add(null);
		hs.add(null);
		hs.add("java");
		hs.add("jee");
		hs.add("jse");
		hs.add("jme");
		System.out.println(hs);
		
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("heyy");
		lhs.add("hii");
		lhs.add("heyy");
		lhs.add(null);
		lhs.add(null);
		lhs.add("java");
		lhs.add("jee");
		lhs.add("jse");
		lhs.add("jme");
		System.out.println(lhs);
		
	//	Set<String> ts=new TreeSet<>();
		Set<String> ts=new TreeSet<>(Collections.reverseOrder());
		ts.add("heyy");
		ts.add("hii");
		ts.add("heyy");
	//	ts.add(null);
	//	ts.add(null);
		ts.add("java");
		ts.add("jee");
		ts.add("jse");
		ts.add("jme");
		System.out.println(ts);

		ts.remove("jme");
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.contains("hello"));
		
		/*for each
		 * for in
		 * for every
		 * enhanced for loop / advanced for loop
		 * 
		 *  works from top to bottom and reads all the records from top to bottom
		 *  
		 * 
		 */
		for(String s:ts) {
			System.out.println(s);
		}
	}

}
