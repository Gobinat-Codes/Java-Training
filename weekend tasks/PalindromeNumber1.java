public class PalindromeNumber1{
	public static void main(String[] args){
		int n, r , sum , temp;
		sum = 0;
		n = 4554;
		
		temp = n;
		
		while(n > 0){
			r = n % 10;
			sum = (sum*10) + r;
			n = n / 10;
		}
		
		if(temp == sum){
			System.out.println(temp + " is palindrome number");
		}
		else{
			System.out.println(temp + " is not a palindrome number");
		}
	}
}