package eg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DemoIterator {

	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap<>();
		hm.put(120, "hello");
		hm.put(100, "heyy");
		hm.put(121, "hello");
		hm.put(109, "heyy");
		hm.put(111, "java");
		hm.put(101, "jee");
		hm.put(122, "jme");
		hm.put(140, "heyy");
		hm.put(191, "helloIIII");
		hm.put(110, "jeeyy");
		hm.put(110, "updated value");
		System.out.println("Before Deletion");
		System.out.println(hm);
//		for(Entry<Integer, String> e:hm.entrySet()) {
//			if(e.getKey()%10==0) {
//				hm.remove(e.getKey());
//			}
//		}
		Iterator<Entry<Integer, String>> i=hm.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer, String> e=i.next();
			if(e.getKey()%10==0) {
				i.remove();
			}
		}
		
		System.out.println("After Deletion");
		System.out.println(hm);

	}

}
/* Enumerator(read -> top to bottom)
 * Iterator (read, remove ->top to bottom)
 * ListIteraor (add read remove -> bidirectional LIST)
 * 
 * */
