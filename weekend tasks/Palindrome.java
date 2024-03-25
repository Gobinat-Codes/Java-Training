public class Palindrome{
	public static void main(String[] args){
		String value = "radar";
		
		// for palindrome we have to put start and end of the string
		int start = 0;
		int end = value.length()-1;
		
		boolean isPalindrome = true;
		while(start < end){
			if(value.charAt(start) != value.charAt(end)){
			 isPalindrome = false;
			break;
		}
		start++;
		end--;
		}
		
		if(isPalindrome){
			System.out.println(value + " is palindrome");
		}
		else{
			System.out.println(value + " is not a palindrome");
		}
	}
}