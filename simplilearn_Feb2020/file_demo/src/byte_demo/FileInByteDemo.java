package byte_demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInByteDemo {

	public static void main(String[] args) {
		
		try(FileInputStream fis=new FileInputStream("data.txt");
				BufferedInputStream bis=new BufferedInputStream(fis);
				){
			System.out.println("Available bytes before read "+bis.available());
			//System.out.println("Reading "+(char)bis.read());
			StringBuilder sb=new StringBuilder();
			while(bis.available()!=0) {
				sb.append((char)bis.read());
			}
			System.out.println("Available bytes after read "+bis.available());
			System.out.println("Data from file is ");
			System.out.println(sb);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		

	}

}
