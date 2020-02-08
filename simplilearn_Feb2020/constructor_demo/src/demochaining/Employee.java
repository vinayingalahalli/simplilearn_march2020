package demochaining;

public class Employee {
	int id;
	String name;
	String email;
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

	public Employee(int id, String name, String email) {
		this(id,name); //chaining
		this.email = email;
	}

	public void printEmployee() {
		System.out.println("Id = " + id);
		System.out.println("Name = " + name);
		System.out.println("Email = "+email);
	}
}
