package week1.day2;

public class Palindrome {
public static void main(String[] args) {
	int num=34343, a, sum=0;
	int temp;
	temp=num;
	while(num>0) {
	a=num%10;
	sum=(sum*10)+a;
	num=num/10;
	
	}
	
	if (temp==sum) {
		System.out.println(temp+ "is a Palindrome number");
		}
	else {
		System.out.println(temp+ "is not a Palindrome number");
		
	}
}
}
