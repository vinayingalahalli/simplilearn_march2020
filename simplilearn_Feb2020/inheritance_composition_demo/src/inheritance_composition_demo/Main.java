package inheritance_composition_demo;

public class Main {

	public static void main(String[] args) {
		Organization o=new Organization(199999, "Simplilearn", "Bangalore");
		Employee e=new Employee(100, "Guru", 22, o, "Training", 12000.22);
		printAnything(e);
		
		Person p= new Person(909, "Giri", 29);
		printAnything(p);
		printAnything(o);
		printAnything(new Object());

	}
	
	public static void printAnything(Object o) {
		if(o instanceof Employee) {
			Employee e=(Employee)o;
			e.printEmployee();System.out.println("\n\n");
		}else if(o instanceof Person) {
			System.out.println("Printing Person");
			Person p=(Person)o;
			p.printPerson();System.out.println("\n");
		}else if(o instanceof Organization) {
			Organization o1=(Organization)o;
			o1.printOrgDetails();System.out.println("\n");
		}else {
			System.out.println("Hey you are object of java.lang.Object class");
		}
		
	}

}
