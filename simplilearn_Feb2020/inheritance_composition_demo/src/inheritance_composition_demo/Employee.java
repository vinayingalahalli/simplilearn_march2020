package inheritance_composition_demo;

public class Employee extends Person {

	private Organization org;
	private String project;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age, Organization org, String project, double salary) {
	super(id, name, age);
		this.org = org;
		this.project = project;
		this.salary = salary;
	}

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printEmployee() {
		System.out.println("Printing Employee");
		super.printPerson();
		org.printOrgDetails();
		//System.out.println("Org : "+org);
		System.out.println("Salary : "+salary);
		System.out.println("Project : "+project);
	}
	
	
}
