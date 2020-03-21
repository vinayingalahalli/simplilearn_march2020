package eg;

public class Employee {

	int id;
	String name;
	int age;
	long contact;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, String name, int age, long contact) {
		this(id,name);
		this.age = age;
		this.contact = contact;
	}
	public void printEmployee() {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
	}
	
}
