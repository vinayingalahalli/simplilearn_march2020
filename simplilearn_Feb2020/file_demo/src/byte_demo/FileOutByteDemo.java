package byte_demo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutByteDemo {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		String message="\nnew message once again";
		try {
			fos=new FileOutputStream("data.txt",true);
			bos=new BufferedOutputStream(fos);
			byte b[]=message.getBytes();
			bos.write(b);
			System.out.println("Message written successfully");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}

	}

}
