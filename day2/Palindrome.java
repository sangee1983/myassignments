package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int A = 34343;
		int temp = 0,rem;
		int num = A;
		for(A = 34343;A>0;A=A/10) {
			rem = A%10;
			temp = temp*10 + rem;
			
			
		}

		if(num==temp) {
			System.out.println("the give number is palindrome");
		
			System.out.println("the given number is not a palindrome");
			
		}
		
	}

}
