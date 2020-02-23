package char_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharDemo {

	public static void main(String[] args) {
		
		try(FileWriter fw=new FileWriter("chardemo.txt");
				BufferedWriter bw=new BufferedWriter(fw)){
			bw.write("Heyy i will be in first line\n");
			bw.write("I will be in new line\n");
			bw.write("i will be after that");
			System.out.println("Written successfully");
		} catch (IOException e) {
			System.out.println(e);
		}
				

	}

}
