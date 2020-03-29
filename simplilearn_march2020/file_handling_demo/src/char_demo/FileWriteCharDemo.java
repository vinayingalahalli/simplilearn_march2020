package char_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharDemo {

	public static void main(String[] args) {
		
		try(FileWriter fw=new FileWriter("char.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				){
			bw.write("Hey How are you doing today?");
			bw.newLine();
			bw.write("you can see me in new line");
			bw.write(" i will be in same line as previous");
			bw.newLine();
			bw.write("I will be again in a new new line");
			System.out.println("Message written successfully");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
