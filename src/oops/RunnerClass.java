package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.Name = "Sweta";
		emp1.EmpId = 1000 ;
		
		emp1.DisplayName();
		
		Employee emp2=new Employee();
		emp2.Name= "kamini";
		emp2.EmpId = 200;
		
		emp2.DisplayName();
		
		Employee emp3= new Employee("rohan",700);
		emp3.DisplayName();
	Citizen ct1 =new Citizen();
	
	ct1.age=50;
	ct1.Name= "Mike";
	ct1.ssm = 12345;
	ct1.Countryname = "india";
	
	Citizen ct2= new Citizen("rahul","india",30,6789);
	Insurance obj1= new Insurance();
	obj1.InsuranceId= 3000;
	
	EncapsulationExample emp = new EncapsulationExample();
	emp.setSalary(5000);
	
		
	}

}
