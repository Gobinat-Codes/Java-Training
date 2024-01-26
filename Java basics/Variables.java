public class Variables{
	
	// global varibale
	final static int votingAge = 18; // we can use access specifiers / modifiers
	
	public static void main(String[] args){
		
		// local varibales , we cannot use access specifiers / modifiers
		final boolean isValid = true;  // final keyword is for constant
			//	isValid = false;
			
		char c = 'g';
		
		byte b = -125;
		
		short s = 1234;
		
		int i = 1234567;
		
		long l = 12345678910111213L; // for long use L at the end of the long value
		
		float f = 2351.256f;  // for float use f at the end of the float value
		
		double d = 123456.2563;
		
		String name = "Gobinat";
		
		System.out.println(isValid);
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(name);
	}
}	