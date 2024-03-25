import java.util.*;
public class Anagram1{
	public static void main(String[] args){
		String str1 = "race";
		String str2 = "care";
		
		if(str1.length() != str2.length()){
			System.out.println("is not a anagrams");
			return;
		}
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1,arr2)){
			System.out.println("is anagrams");
		}
		else{
			System.out.println("is not anagrams");
		}
	}
}