public class Cla{
	public static void main(String[] args){
		
		int age = Integer.parseInt(args[0]);
		System.out.println("Age is : " + age);
		
		String name = args[1];
		System.out.println("Name is : " + name);
		
		
		if(age >= 18){      // here we can also use short handed if else (conditional or ternary operator)
			System.out.println(name + " Eligible to vote");
		}
		else{
			System.out.println(name + " Not eligible to vote");
		}
		
	}
}


// String methods
// -> charAt(0) - reading a character , this will read the entire string and displays that specific character