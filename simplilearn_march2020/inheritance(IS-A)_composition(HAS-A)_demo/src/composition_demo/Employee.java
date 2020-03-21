package composition_demo;

public class Employee extends Person {

	private String organization;// Organization(oid,name,noofemps,location)
	private String designation;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee(int id, String name, String organization, String designation) {
		super(id, name);
		this.organization = organization;
		this.designation = designation;
	}
	
	public void printEmployee() {
		System.out.println("Printing employee details");
		super.printPerson();
		System.out.println("Org Name "+organization);
		System.out.println("Designation "+designation);
	}
}
