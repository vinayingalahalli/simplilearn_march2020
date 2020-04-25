package eg1;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
		
		Business b=new Business();
		try {
			b.openFile("test.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
