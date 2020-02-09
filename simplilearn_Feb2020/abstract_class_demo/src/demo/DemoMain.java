package demo;

public class DemoMain {

	public static void main(String[] args) {
		
		EMS e=new SimplilearnEmployee();
		System.out.println("Accessing features of "+e.getClass());
		e.calculateEmployeeSalary();
		e.commonEmployeeBenifits();
		e.createEmployee();
		e.updateEmployee();
		e.removeEmployee();
		System.out.println("\n");
		EMS e1=new XyzEmployee();
		System.out.println("Accessing features of "+e1.getClass());
		e1.calculateEmployeeSalary();
		e1.commonEmployeeBenifits();
		e1.createEmployee();
		e1.updateEmployee();
		e1.removeEmployee();

	}

}
