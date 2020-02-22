package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		li.add("heello");
		li.add(111);
		li.add('e');
		li.add(67.9999);
		li.add(true);
		li.add(1199000000000L);
		System.out.println(li);
		
		LinkedList<Integer> list=new LinkedList<>();
		list.add(123);
		
		List<Integer> li1=new LinkedList<>();
		li1.add(19999);
		li1.add(9);
		li1.add(999);
		li1.add(19999);
		li1.add(null);
		li1.add(null);
		li1.add(100);
		li1.add(19999);
		li1.add(19999);
		System.out.println(li1);
		li1.add(2, 1000);
		System.out.println(li1);
		System.out.println(li1.size());
		System.out.println(li1.get(5));
		li1.set(0, 90000);
		System.out.println(li1);
		Integer i=1000;
		li1.remove(i);
		System.out.println(li1);
		li1.remove(0);
		System.out.println(li1);
		while(li1.remove(new Integer(19999))) {}
		System.out.println(li1);
		System.out.println(li1.contains(99));
		
		
		List<Integer> li2=new ArrayList<>(li1);
		System.out.println("li2 = "+li2);
		li2.addAll(li1);
		System.out.println(li2);
		li2.add(3333333);
		li2.add(3333333);
		li2.add(8989);
		li2.add(909090);
		
		System.out.println("li2 = "+li2);
		System.out.println("li1 = "+li1);
		
		//li2.retainAll(li1);
		li2.removeAll(li1);
		System.out.println("li2 = "+li2);
		
		while(li1.remove(null)) {}
		Collections.sort(li1);// ascending
		
		System.out.println(li1);
		Collections.sort(li2,Collections.reverseOrder());
		System.out.println("li2 = "+li2);
		Collections.reverse(li2);
		System.out.println("li2 = "+li2);
		Collections.shuffle(li2);
		System.out.println("li2 = "+li2);
		Collections.sort(li2);
		System.out.println(Collections.binarySearch(li2, 8989));
	}

}
