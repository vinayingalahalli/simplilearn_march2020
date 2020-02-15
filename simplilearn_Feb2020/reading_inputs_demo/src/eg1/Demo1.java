package eg1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scanner.nextLine();//next() - one word   nextLine() - sentence
		System.out.println("Enter age");
		int age=scanner.nextInt();   //nextFloat nextDouble nextLong 
		System.out.println("enter gender (m/f/o)");
		char gender =scanner.next().charAt(0);
		System.out.println("Hello "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender "+gender);
		
		
		//Best Practice....
		int a=Integer.parseInt(scanner.nextLine());

	}

}
;