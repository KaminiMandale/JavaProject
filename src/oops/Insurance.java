package oops;

public class Insurance extends Citizen {
	
	public int InsuranceId;
	
	public Insurance() {
		System.out.println("inside default cons of insurance");
	}
	
	public void Print() {
		System.out.println("insurance id is " +InsuranceId);
	}

}
