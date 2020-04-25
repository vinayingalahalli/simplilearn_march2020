package eg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
	
		LinkedList li=new LinkedList();
		li.add("adhahdg");
		li.add(1111);
		li.add(12.222);
		li.add(null);
		li.add(true);
		li.add(1111);
		
		System.out.println(li);
		
		List<Integer> li2=new LinkedList<>();
		li2.add(1122);
		li2.add(1010);
		li2.add(1122);
		li2.add(10);
		li2.add(null);
		li2.add(10);
		li2.add(null);
		li2.add(1010);
		System.out.println(li2);
		li2.add(1, 100);
		System.out.println(li2);
		li2.set(1, 10);
		System.out.println(li2);
		System.out.println(li2.get(4));
		System.out.println(li2.size());
		for (int i = 0; i <li2.size(); i++) {
			System.out.println(li2.get(i));
		}
		System.out.println(li2.contains(100));
		System.out.println(li2.contains(10));
		li2.remove(0);//pos
		System.out.println(li2);
		Integer i=10;
		li2.remove(i); // first occurance
		System.out.println(li2);
		while(li2.remove(i)) {}
		System.out.println(li2);
		System.out.println(li2.indexOf(1122));
		
		
		List<Integer> li3=new ArrayList<>();
		li3.addAll(li2);
		li3.add(50);
		li3.add(999);
		li3.add(1122);
		li3.add(55);
		System.out.println("li3 = "+li3);
		System.out.println("li2 = "+li2);
		//li3.retainAll(li2); common
		li3.removeAll(li2); // non common from li3
		System.out.println(li3);
		
		
		li2.addAll(li3);
		System.out.println("li2 = "+li2);
		
		Collections.replaceAll(li2, null, 0);
		
		//Collections.sort(li2);// ascending
		Collections.sort(li2,Collections.reverseOrder());//descending 
		System.out.println(li2);
		Collections.reverse(li2);
		System.out.println(li2);
		System.out.println(Collections.binarySearch(li2, 1122));
		Collections.shuffle(li2);
		System.out.println(li2);
		
	}

}
