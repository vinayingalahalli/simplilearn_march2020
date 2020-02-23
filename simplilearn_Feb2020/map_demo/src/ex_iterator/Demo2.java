package ex_iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo2 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(100, "giri");
		hm.put(101, "suma");
		hm.put(102, "chetan");
		hm.put(103, "giri");
		hm.put(100, "updated");
		hm.put(400, "daaas");
		hm.put(999, "daas");
		hm.put(499, "keshh");
		System.out.println("Before deletion"+ hm);
//		for(Entry<Integer, String> e:hm.entrySet()) {
//			if(e.getKey()%10==0) {
//			hm.remove(e.getKey());
//			}
//		}
		Iterator<Entry<Integer, String>> i=hm.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer, String> e=i.next();
			if(e.getKey()%10==0) {
				i.remove();
			}
		}
		/*
		 * Enumerator - read from top to bottom
		 * Iterator - read and remove from top to bottom
		 * ListIterator - read, remove ,add but only on List and is bidirectional
		 */
		System.out.println("After deletion "+hm);
	}

}
