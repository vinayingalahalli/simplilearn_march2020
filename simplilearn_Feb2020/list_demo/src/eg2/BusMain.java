package eg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusMain {

	public static void main(String[] args) {
		Bus b1=new Bus(101, "abc travels", 199.99d, 3.4f);
		Bus b0=new Bus(121, "xyz travels", 599.99d, 3.9f);
		Bus b2=new Bus(177, "pqr travels", 499.99d, 4.4f);
		Bus b3=new Bus(100, "java travels", 99.99d, 4.7f);
		Bus b4=new Bus(133, "jee travels", 99.99d, 4.94f);
		Bus b5=new Bus(122, "jse travels", 99.99d, 4.4f);
		Bus b6=new Bus(109, "jme travels", 99.99d, 1.4f);
		
		List<Bus> busList=new ArrayList<>();
		busList.add(b0);
		busList.add(b1);
		busList.add(b2);
		busList.add(b3);
		busList.add(b4);
		busList.add(b5);
		busList.add(b6);
		System.out.println("Printing all buses");
		printBuses(busList);
		
		System.out.println("Sorting buses based on Id");
		Collections.sort(busList);
		printBuses(busList);
		
		System.out.println("Sorting buses based on Name");
		Collections.sort(busList,new BusNameComparator());
		printBuses(busList);
		
		System.out.println("Sorting buses based on Fare");
		Collections.sort(busList,(b11,b21)->{
			Double d1=b11.getFare();
			Double d2=b21.getFare();
			return d1.compareTo(d2);
		});
		printBuses(busList);
		
		System.out.println("Sorting buses based on Fare and then on ratings");
		Collections.sort(busList,(b11,b21)->{
			Double d1=b11.getFare();
			Double d2=b21.getFare();
			int x=d1.compareTo(d2);
			if(x==0) {
				Float f1=b11.getRating();
				Float f2=b21.getRating();
				x=f2.compareTo(f1);
			}
			return x;
		});
		printBuses(busList);
	}
	public static void printBuses(List<Bus> busList) {
		for (int i = 0; i < busList.size(); i++) {
			System.out.println(busList.get(i));
		}
		System.out.println("\n\n");
	}

}
