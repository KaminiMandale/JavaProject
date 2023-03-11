package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		
		while(num1<11) {
			System.out.println(num1);
			num1++;
			
		}
		 System.out.println("end of while loop");
		 
		 int num2= 10;
		 while(num2>0) {
			 if(num2==5) {
				 System.out.println("SKIP");
				 num2--;
				 break;
			 }
			 System.out.println(num2);
			 num2--;
		 }
		 
		 System.out.println("end of second loop");
	}

}
