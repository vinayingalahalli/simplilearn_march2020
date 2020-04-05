package eg2_real_object;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BusMain {

	public static void main(String[] args) {

		//Set<Bus> busList = new HashSet<>();
		Set<Bus> busList = new TreeSet<>();
		busList.add(new Bus(111, "abc travels", 1200.33, 3.33f));
		busList.add(new Bus(100, "jee travels", 1100.33, 1.33f));
		busList.add(new Bus(141, "java travels", 1299.33, 4.33f));
		busList.add(new Bus(110, "micro travels", 1298.33, 2.33f));
		busList.add(new Bus(121, "mono travels", 1100.39, 2.33f));
		busList.add(new Bus(131, "xyz travels", 1400.33, 2.33f));
		busList.add(new Bus(110, "micro travels", 1298.33, 2.33f));
		busList.add(new Bus(121, "mono travels", 1100.39, 2.33f));
		busList.add(new Bus(111, "abc travels", 1200.33, 3.33f));
		busList.add(new Bus(101, "pqr travels", 1200.33, 4.39f));
		System.out.println("Printing all buses");
		printBuses(busList);

	}

	public static void printBuses(Set<Bus> busList) {
//		for (int i = 0; i < busList.size(); i++) {
//			System.out.println(busList.get(i));
//		}
//		for(Bus b:busList) {
//			System.out.println(b);
//		}
		Iterator<Bus> i=busList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
