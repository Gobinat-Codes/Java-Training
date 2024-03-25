import java.util.*;
public class Anagram1{
	public static void main(String[] args){
		String str1 = "race";
		String str2 = "care";
		
		// first we check the given string characters are same 
		if(str1.length() != str2.length()){
			System.out.println("is not a anagrams");
			return;
		}
		
		// we convert the strings to char arrays
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		// we sort the arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		// we check these arrays are equal
		if(Arrays.equals(arr1,arr2)){
			System.out.println("is anagrams");
		}
		else{
			System.out.println("is not anagrams");
		}
	}
}