package test;

public class ForLoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=1;num<11;num++) {
			System.out.println(num);
		}
		System.out.println("end of the first loop");
		
		for(int num1=30;num1>0;num1-=2) {
			System.out.println(num1);
		}
		System.out.println("end of the second loop");
		
		for(int num1=30;num1>0;num1-=2) {
			System.out.println(num1);
		}
		System.out.println("end of the second loop");
		
		
System.out.println("Table of 2");
		
		int num2=2;
		for(int i=1;i<11;i++) {
			System.out.println(num2*i);
			//System.out.printf("%d * %d = %d \n" , num , i, num*i);
		}
		System.out.println("End Table of 2");
		
		int arr[]= {2,3,4,5,6,7};
		{
		for(int i= 0; i<arr.length;i++)
			System.out.println("element in array is " +arr[i]);
		}
		
		String str ="kamini" ;
				for(int i=0;i<str.length();i++);
				{
					
					System.out.println(" char value is " +str.charAt(i));
				}
				
				
	}

}
