package demo;

public class XyzEmployee extends EMS{

	@Override
	public void createEmployee() {
	System.out.println("XYZ emp added to MYSQL Db");
		
	}

	@Override
	public void updateEmployee() {
		System.out.println("XYZ emp updated to MYSQL Db");
		
	}

	@Override
	public void calculateEmployeeSalary() {
		System.out.println("XYZ emp salary calculated from MYSQL Db");
		
	}

	@Override
	public void removeEmployee() {
		// TODO Auto-generated method stub
		System.out.println("XYZ emp removed from MYSQL Db");
	}

}
