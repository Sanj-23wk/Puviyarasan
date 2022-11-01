package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 1;
		boolean flag = false;
		for (int i = 0; i <= num/2; i++) {
			if (num %2==0) {
				flag=true;
				break;
			}
			
		}
		
		if (!flag) {
			System.out.println(num+"is a prime number");
		    
		}
		
		else {
			System.out.println(num+ "is not prime number");
		}
	}
}
