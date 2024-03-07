public class Factorial{
	public static void main(String[] args){
		int factorial = 1;
		for(int i = 1; i <= 5 ; i+=1){
			factorial *= i;
			System.out.println("factorial of numbers : " + factorial);
		}
	}
}