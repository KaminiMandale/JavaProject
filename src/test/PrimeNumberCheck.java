package test;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 33;
		boolean flag = true;

		for (int i = 2; i < num; i++) {
			int rem = num % i;
			if (rem == 0) {
				flag = false;
				break;
			}

		}
		if (flag == true) {
			System.out.println("prime num");
		} else {
			System.out.println("not a prime num");
		}
	}

}
