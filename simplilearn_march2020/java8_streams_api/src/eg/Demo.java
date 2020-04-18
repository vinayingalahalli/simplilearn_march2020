package eg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		Integer ar[]=new Integer[] {10,11,22,22111,2,3,4,4,999};
		Stream<Integer> s=Stream.of(ar);
		System.out.println("printing array of stream");
		s.forEach(x->System.out.print(x+" "));
		List<Integer> al=Arrays.asList(ar);
		Stream<Integer> alS=al.stream();
		System.out.println("\nprinting list of streams");
		alS.forEach(x->System.out.print(x+" "));
		List<Integer> evenList=al.stream().filter(v->v%2==0).collect(Collectors.toList());
		System.out.println("\n"+evenList);
		System.out.println("al="+al);
		
		List<String> cityNames=Arrays.asList("hubli","Bengalooru","Chennai","Hyderabad","Houston","Cochin");
		System.out.println("java 7 way");
		for(String s1:cityNames) {
			if(s1.startsWith("h")||s1.startsWith("H")) {
				System.out.println(s1);
			}
		}
		System.out.println("Java 8 way");
		cityNames.stream().filter(s2->s2.startsWith("h")||s2.startsWith("H")).forEach(System.out::println);
		System.out.println("java 8 way with more improvistation");
		cityNames.stream().filter(s2->s2.startsWith("h")||s2.startsWith("H"))
		.sorted()
		.map(String::toUpperCase).forEach(System.out::println);
		
	}

}
