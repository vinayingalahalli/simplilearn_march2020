package eg;

public class DemoEmp {

	public static void main(String[] args) {
		Employee e=new Employee(100, "sachin");
		e.printEmployee();
		
		Employee e2=new Employee(102, "kanya", 22, 98000000L);
		e2.printEmployee();
	}

}
