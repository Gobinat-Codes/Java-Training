public class Factorial{
	
	public static void factorial(){
		int factorial = 1;
		for(int i = 1; i <= 5 ; i+=1){
			factorial *= i;
			//System.out.println("factorial of numbers : " + factorial);
			return factorial;
		}
	}

	
	public static void main(String[] args){
		System.out.println("factorial of numbers : " + factorial);
		factorial();
	}
}
