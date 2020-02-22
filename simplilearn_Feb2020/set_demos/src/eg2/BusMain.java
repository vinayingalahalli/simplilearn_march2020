package eg2;

import java.util.LinkedHashSet;
import java.util.Set;

public class BusMain {

	public static void main(String[] args) {
		Bus b1=new Bus(101, "abc travels", 199.99d, 3.4f);
		Bus b0=new Bus(121, "xyz travels", 599.99d, 3.9f);
		Bus b2=new Bus(177, "pqr travels", 499.99d, 4.4f);
		Bus b3=new Bus(100, "java travels", 99.99d, 4.7f);
		Bus b4=new Bus(133, "jee travels", 99.99d, 4.94f);
		Bus b5=new Bus(122, "jse travels", 99.99d, 4.4f);
		Bus b6=new Bus(109, "jme travels", 99.99d, 1.4f);
		
		Set<Bus> busList=new LinkedHashSet<>(); //TreeSet
		busList.add(b0);
		busList.add(b1);
		busList.add(b2);
		busList.add(b3);
		busList.add(b4);
		busList.add(b5);
		busList.add(b6);
		busList.add(new Bus(109, "jme travels", 99.99d, 1.4f));
		busList.add(new Bus(109, "jme travels", 99.99d, 1.4f));
		System.out.println("Printing all buses");
		printBuses(busList);
		
		
	}
	public static void printBuses(Set<Bus> busList) {
		for(Bus b:busList) {
			System.out.println(b);
		}
		System.out.println("\n\n");
	}

}
