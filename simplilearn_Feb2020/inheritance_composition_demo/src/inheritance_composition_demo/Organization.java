package inheritance_composition_demo;

public class Organization {

	private int org_id;
	private String orgName;
	private String headquarters;
	
	public Organization() {
		// TODO Auto-generated constructor stub
	}

	public int getOrg_id() {
		return org_id;
	}

	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public Organization(int org_id, String orgName, String headquarters) {
		super();
		this.org_id = org_id;
		this.orgName = orgName;
		this.headquarters = headquarters;
	}

	public void printOrgDetails() {
		System.out.println("Organization Details");
		System.out.println("Org Id : "+org_id);
		System.out.println("Org Name : "+orgName);
		System.out.println("Headquarters : "+headquarters);
		
	}
	
}
