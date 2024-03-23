public class MethodEx{
	String global = "global variable";  // global variable
	
	public static void printHelloWorld(){			// same method name and different parameters are method overloading
		System.out.println("Hello");
	}
	
	public static void main printHelloWorld(String data){    // (String data) -> are method parameters
		System.out.println(data);
	}
	
	boolean isVotingEligible(int age){
		boolean result = false;
		if(age >= 18){
			result = true;
		}
		return result;
	}
	
	public static void main(String[] args){
		String local = "Hello Parameter";
		printHelloWorld();
		printHelloWorld(local);
		boolean votingEligible = new MethodEx().isVotingEligible(20);
		System.out.println(votingEligibility);
	}
}