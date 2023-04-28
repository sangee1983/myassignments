package week1.day2;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num = 13;
		boolean flag  = false;
		for(int i = 2;i<num/2;i++) {
			if(num/i == 0) {
				flag = true;
				break;
			}
		}

		if(!flag)
		System.out.println(num+ "-it is a primenumber");	
		else {
			System.out.println(num+ "it is not primenumber");
		}
			
	}

}
