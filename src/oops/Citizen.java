package oops;

public class Citizen extends Person{
	public int ssm;
	
	public Citizen() {
		System.out.println("inside default cons");
	}
	
	public Citizen(String Name, String Countryname, int age,int ssm) {
	 System.out.println("inside param cons");
	 
	 this.Name=Name;
	 this.Countryname= Countryname;
	 this.age= age;
	 this.ssm=ssm;
		
	}
public void Print() {
	System.out.println("ssm is " + ssm);
}
}
