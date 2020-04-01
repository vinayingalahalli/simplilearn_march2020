package composition_demo;

public class Organization {

	private int oid;
	private String name;
	private int noofemps;
	private String location;

	public Organization() {
	
	}
	
	public Organization(int oid, String name, int noofemps, String location) {
	 	this.oid = oid;
		this.name = name;
		this.noofemps = noofemps;
		this.location = location;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoofemps() {
		return noofemps;
	}

	public void setNoofemps(int noofemps) {
		this.noofemps = noofemps;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void printOrganization() {
		System.out.println("oid : "+oid);
		System.out.println("organization name : "+name);
		System.out.println("noofemps : "+noofemps);
		System.out.println("location : "+location);
		
		
		
	}
	
}
