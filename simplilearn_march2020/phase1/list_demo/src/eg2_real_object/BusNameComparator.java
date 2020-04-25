package eg2_real_object;

import java.util.Comparator;

public class BusNameComparator implements Comparator<Bus>{

	@Override
	public int compare(Bus b1, Bus b2) {
		return b2.getName().compareTo(b1.getName());
	}

}
