package eg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name=sc.nextLine();
//		System.out.println("Enter Age");
//		int age=sc.nextInt();  //nextXYZ()
//		System.out.println("Enter rating");
//		float rating=sc.nextFloat();
//		System.out.println("Enter email");
//		String email=sc.nextLine();
//		System.out.println("Enter contact number");
//		long contact=sc.nextLong();
		
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter Age");
		int age=Integer.parseInt(sc.nextLine());  //nextXYZ()
		System.out.println("Enter rating");
		float rating=Float.parseFloat(sc.nextLine());
		System.out.println("Enter email");
		String email=sc.nextLine();
		System.out.println("Enter contact number");
		long contact=Long.parseLong(sc.nextLine());
		System.out.println("Enter gender (m/f/o)");
		char gender=sc.nextLine().charAt(0);
		
		System.out.println("Hello "+name);
		System.out.println("Age "+age);
		System.out.println("rating "+rating);
		System.out.println("Email "+email);
		System.out.println("Contact "+contact);
		System.out.println("Gender "+gender);
		
		User user=new User(name, age, gender, rating, email, contact);
		System.out.println("User obj holds");
		System.out.println(user);
		
		User u2=new User();
		
		System.out.println("Enter your name");
		u2.setName(sc.nextLine());
		System.out.println("Enter Age");
		u2.setAge(Integer.parseInt(sc.nextLine()));  //nextXYZ()
		System.out.println("Enter rating");
		u2.setRating(Float.parseFloat(sc.nextLine()));
		System.out.println("Enter email");
		u2.setEmail(sc.nextLine());
		System.out.println("Enter contact number");
		u2.setContact(Long.parseLong(sc.nextLine()));
		System.out.println("Enter gender (m/f/o)");
		u2.setGender(sc.nextLine().charAt(0));
		
		System.out.println(u2);
		
	}

}
