public class ArmStrongNumber{
	public static void main(String[] args){
		
		int number = 1634;
		
		int originalNumber = number;
		int sum = 0;
		
		while(number != 0){
			int digit = number % 10;
			sum += digit * digit * digit * digit;
			number /= 10;
		}
		
		if(sum == originalNumber){
			System.out.println(originalNumber + " is armstrong number");
		}
		else{
			System.out.println(originalNumber + " is not a armstrong number");
		}
	}
}