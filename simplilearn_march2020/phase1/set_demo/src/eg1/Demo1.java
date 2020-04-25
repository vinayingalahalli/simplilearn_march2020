package eg1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		hs.add("hello");
		hs.add("java");
		hs.add("jee");
		hs.add("bridge");
		hs.add("hello");
		hs.add("java");
		hs.add(null);
		hs.add(null);
		hs.add("jme");
		System.out.println(hs);
		
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("hello");
		lhs.add("java");
		lhs.add("jee");
		lhs.add("bridge");
		lhs.add("hello");
		lhs.add("java");
		lhs.add(null);
		lhs.add(null);
		lhs.add("jme");
		System.out.println(lhs);
		
	//	Set<String> ts=new TreeSet<>();  use this if ascending
		Set<String> ts=new TreeSet<>(Collections.reverseOrder()); //use this for descending
		ts.add("hello");
		ts.add("java");
		ts.add("jee");
		ts.add("bridge");
		ts.add("hello");
		ts.add("java");
		//ts.add(null);
		//ts.add(null);
		ts.add("jme");
		System.out.println(ts);
		// addAll() retainAll() removeAll()
		System.out.println(ts.size());
		System.out.println(ts.contains("hey"));
		System.out.println(ts.contains("hello"));
		
		/*
		 * for each , for in , for every, enhanced for
		 */
		for(String s:ts) {
			System.out.println(s.toUpperCase());
		}

	}

}
