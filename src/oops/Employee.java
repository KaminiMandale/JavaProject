package oops;

public class Employee {
	
	public String Name;
	public int EmpId;
	
	public Employee() {
		System.out.println("Inside dafault cons ");
	}
	
	public Employee(String var1, int var2) {
		System.out.println("inside param cons ");
		Name = var1;
		EmpId = var2;
	}
	
	public void DisplayName() {
		System.out.println("Name of the Employee is "  + Name);
		
	}

}
