package eg2;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		OpenFile o=new OpenFile();
		try {
			o.openTheFile("askdakj.txt");
			System.out.println("File opened");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
