package composition_demo;

public class Main {

	public static void main(String[] args) {
//		Team team=new Team(700001, "India", "Ravi Shastri");
//		
//		Player p=new Player(100, "Sachin R tendulkar", 200,team);
//		p.printPlayer();

//		Employee e=new Employee(90000, "Rajesh", "Simplilearn", "Trainee");
//		e.printEmployee();

		Organization o = new Organization(10, "simplilearn", 400, "online");
		Employee e = new Employee(100, "Sachin", o, "Manager");
		e.printEmployee();
	}

}
