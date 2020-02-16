package eg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OpenFile {

	public void openTheFile(String fileName) throws FileNotFoundException {
		
		FileInputStream fis=new FileInputStream(fileName);
	}
}
