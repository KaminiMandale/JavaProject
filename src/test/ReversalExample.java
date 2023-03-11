package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "HelloWorld";
		
		String result= " ";
		
		for (int i=str1.length()-1;i>=0;i--)
		{
			result= result+str1.charAt(i);
		}
		System.out.println("reversed string is " +result);
		
		//if(str1.equals(result)) {
//		System.out.println("the given string is palindrom");
	//	}else {
	//		System.out.println("the given is not parameter");
	//	}
		
		
		if(str1.equalsIgnoreCase(result)) {
			System.out.println("the given string is palindrom");
		}else {
			System.out.println("the given is not parameter");
		}
		
		//===========
		
		String str2 = "David meets john and lilly";
		String[] arr= str2.split(" ");
		
		String result1= " ";
		for(int i=arr.length-1;i>=0;i--) {
			result1= result1+arr[i]+ " ";
		}
System.out.println("the result is "+ result1.trim());
	}

}
