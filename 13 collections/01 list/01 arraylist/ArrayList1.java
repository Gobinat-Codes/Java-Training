import java.util.*;
public class ArrayList1{
	public static void main(String[] args){
		ArrayList<String> names =  new ArrayList<String>();
		names.add("gobi");    // add - is used to add elements to the list
		names.add("mani");
		names.add("luffy");
		names.add("saamy");
		
		System.out.println("access 0th element : " + names.get(0));  // get - is used to get the specific element 
		
		System.out.println("print names : " + names);   // - it prints the elements in array format
		
		System.out.println(names.set(0,"hari"));    // set - it set the value for specific index
		System.out.println("access 0th element after set : " + names.get(0));  // set - access after set
		
		System.out.println(names.remove(0));    // remove -  removes the specific element from the list
		System.out.println("print names : " + names);  // remove - access after remove
		
	//	names.clear();   // it clears the entire elements in the list
	
		Collections.sort(names);   // Collections.sort() - use to sort the list array elements in  ascending (also used for numbers (all datatypes)
		
		for(String i : names){    // loop through list elements prints values in step by step
			System.out.println("loop through list : " + i);
		}
	}
}