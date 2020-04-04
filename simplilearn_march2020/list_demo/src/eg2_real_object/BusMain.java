package eg2_real_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusMain {

	public static void main(String[] args) {

		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(111, "abc travels", 1200.33, 3.33f));
		busList.add(new Bus(100, "jee travels", 1100.33, 1.33f));
		busList.add(new Bus(141, "java travels", 1299.33, 4.33f));
		busList.add(new Bus(110, "micro travels", 1298.33, 2.33f));
		busList.add(new Bus(121, "mono travels", 1100.39, 2.33f));
		busList.add(new Bus(131, "xyz travels", 1400.33, 2.33f));
		System.out.println("Printing all buses");
		printBuses(busList);

		Collections.sort(busList);
		System.out.println("\n\nPrinting all buses sorted based on id");
		printBuses(busList);

		Collections.sort(busList, new BusNameComparator());
		System.out.println("\n\nPrinting all buses sorted based on name descending");
		printBuses(busList);

		Collections.sort(busList, (b1, b2) -> {
			Double d1 = b1.getCost();
			Double d2 = b2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\n\nPrinting all buses sorted based on fare");
		printBuses(busList);
		Collections.sort(busList, (b1, b2) -> {
			Float f1 = b1.getRating();
			Float f2 = b2.getRating();
			int x = f2.compareTo(f1);
			if (x == 0) {
				Double d1 = b1.getCost();
				Double d2 = b2.getCost();
				x = d1.compareTo(d2);
			}
			return x;
		});

		System.out.println("\n\nPrinting all buses sorted based on rating first and if same then by fare");
		printBuses(busList);
	}

	public static void printBuses(List<Bus> busList) {
		for (int i = 0; i < busList.size(); i++) {
			System.out.println(busList.get(i));
		}
	}

}
