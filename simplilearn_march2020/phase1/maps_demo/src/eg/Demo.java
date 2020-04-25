package eg;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		
		Map<Integer, String> hm=new HashMap<>();
		hm.put(121, "hello");
		hm.put(100, "heyy");
		hm.put(121, "hello");
		hm.put(109, "heyy");
		hm.put(111, "java");
		hm.put(101, "jee");
		hm.put(121, "jme");
		hm.put(140, "heyy");
		hm.put(191, "helloIIII");
		hm.put(110, "jeeyy");
		hm.put(110, "updated value");
		hm.put(null, null);
		hm.put(199, null);
		hm.put(null, null);
		System.out.println(hm);
		
		Map<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(121, "hello");
		lhm.put(100, "heyy");
		lhm.put(121, "hello");
		lhm.put(109, "heyy");
		lhm.put(111, "java");
		lhm.put(101, "jee");
		lhm.put(121, "jme");
		lhm.put(140, "heyy");
		lhm.put(191, "helloIIII");
		lhm.put(110, "jeeyy");
		lhm.put(110, "updated value");
		lhm.put(null, null);
		lhm.put(199, null);
		lhm.put(null, null);
		System.out.println(lhm);
		
		Map<Integer, String> tm=new TreeMap<>();
		tm.put(121, "hello");
		tm.put(100, "heyy");
		tm.put(121, "hello");
		tm.put(109, "heyy");
		tm.put(111, "java");
		tm.put(101, "jee");
		tm.put(121, "jme");
		tm.put(140, "heyy");
		tm.put(191, "helloIIII");
		tm.put(110, "jeeyy");
		tm.put(110, "updated value");
		//tm.put(null, null);
		tm.put(199, null);
	//	tm.put(null, null);
		System.out.println(tm);
		
		Map<Integer, String> ht=new Hashtable<>();
		ht.put(121, "hello");
		ht.put(100, "heyy");
		ht.put(121, "hello");
		ht.put(109, "heyy");
		ht.put(111, "java");
		ht.put(101, "jee");
		ht.put(121, "jme");
		ht.put(140, "heyy");
		ht.put(191, "helloIIII");
		ht.put(110, "jeeyy");
		ht.put(110, "updated value");
		//ht.put(null, null);
		//ht.put(199, null);
		//ht.put(null, null);
		System.out.println(ht);
		System.out.println(ht.size());
		System.out.println(ht.get(110));
		System.out.println(ht.containsKey(100));
		System.out.println(ht.containsValue("jee"));
		ht.remove(100);
		System.out.println(ht);
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		Set<Integer> set=ht.keySet();
		
		for(Integer i:set) {
			System.out.println("Key = "+i+" Value ="+ht.get(i));
		}
		
		for(Entry<Integer, String> e:ht.entrySet()) {
			System.out.println("key -> "+e.getKey()+" Value -> "+e.getValue());
		}

	}

}
