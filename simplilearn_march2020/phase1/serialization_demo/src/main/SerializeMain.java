package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.CreditCard;

public class SerializeMain {

	public static void main(String[] args) {
		CreditCard cc=new CreditCard(12345678901234L, "Sachin R T", "ABC Bank", 100);
		
		try(FileOutputStream fos=new FileOutputStream("serialize.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				){
			oos.writeObject(cc);
			System.out.println(cc);
			System.out.println("Object persisted successfully");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
