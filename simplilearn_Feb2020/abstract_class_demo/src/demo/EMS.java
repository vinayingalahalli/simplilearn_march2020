package demo;

public abstract class EMS {
public abstract void createEmployee();
public abstract void updateEmployee();
public abstract void calculateEmployeeSalary();
public abstract void removeEmployee();

public void commonEmployeeBenifits() {
	System.out.println("Common employee benifits to any employee in the world.");
}
}
