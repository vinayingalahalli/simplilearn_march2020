package ex1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {

		Map<Integer, String> hs = new HashMap<>();
		hs.put(100, "giri");
		hs.put(101, "suma");
		hs.put(102, "chetan");
		hs.put(103, "giri");
		hs.put(100, "updated");
		hs.put(null, "daaas");
		hs.put(999, "daas");
		hs.put(null, null);
		System.out.println("Hap " + hs);

		Map<Integer, String> lhs = new LinkedHashMap<>();
		lhs.put(100, "giri");
		lhs.put(101, "suma");
		lhs.put(102, "chetan");
		lhs.put(103, "giri");
		lhs.put(100, "updated");
		lhs.put(null, "daaas");
		lhs.put(999, "daas");
		lhs.put(null, null);
		System.out.println("LHap " + lhs);

		Map<Integer, String> ts = new TreeMap<>();
		ts.put(199, "giri");
		ts.put(101, "suma");
		ts.put(102, "chetan");
		ts.put(103, "giri");
		ts.put(100, "updated");
		// ts.put(null, "daaas");
		ts.put(999, "null");
		// ts.put(null, null);
		System.out.println("TrweHap " + ts);

		Map<Integer, String> ht = new Hashtable<>();
		ht.put(199, "giri");
		ht.put(101, "suma");
		ht.put(102, "chetan");
		ht.put(103, "giri");
		ht.put(100, "updated");
		// ts.put(null, "daaas");
		// ht.put(999, null);
		// ts.put(null, null);
		System.out.println("HtHap " + ht);

		System.out.println(ht.size());
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		System.out.println(ht.get(100));
		ht.remove(100);
		System.out.println(ht);
		System.out.println(ht.containsKey(103));
		System.out.println(ht.containsValue("suma"));
		
		Set<Integer> set=ht.keySet();
		System.out.println("Looping using keySet()");
		for(Integer i:set) {
			System.out.println("Key = "+i+" Value = "+ht.get(i));
		}
		
		System.out.println("looping using entrySet()");
		for(Entry<Integer, String> e:ht.entrySet()) {
			System.out.println("Key -> "+e.getKey()+" Value ->"+e.getValue());
		}
	}

}
