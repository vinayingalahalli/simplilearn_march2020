package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.CreditCard;

public class DeSerializeMain {

	public static void main(String[] args) {
		
		try(FileInputStream fis=new FileInputStream("serialize.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				){
			CreditCard cc=(CreditCard) ois.readObject();
			System.out.println("Object deserialized was ");
			System.out.println(cc);
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
