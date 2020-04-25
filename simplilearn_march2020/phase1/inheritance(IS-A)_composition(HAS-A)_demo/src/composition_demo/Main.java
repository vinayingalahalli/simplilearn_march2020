package composition_demo;

public class Main {

	public static void main(String[] args) {
		Team team=new Team(700001, "India", "Ravi Shastri");
		
		Player p=new Player(100, "Sachin R tendulkar", 200,team);
		printAnyObject(p);
		
		
		Employee e=new Employee(90000, "Rajesh", "Simplilearn", "Trainee");
		printAnyObject(e);
		Person person=new Person(777, "Jay");
		printAnyObject(person);
		printAnyObject(new Object());
		printAnyObject(team);
	}
	
	public static void printAnyObject(Object o) {
		if( o instanceof Player) {
			Player p=(Player)o;
			p.printPlayer();
		}else if( o instanceof Employee) {
			Employee e=(Employee)o;
			e.printEmployee();
		}else if(o instanceof Person) {
			Person p=(Person)o;
			p.printPerson();
		}else if(o instanceof Team) {
			Team t=(Team)o;
			t.printTeam();
		}else {
			System.out.println("O is just a objet of Object class itself");
		}
		
	}

}
