public class ComplieTimePolymorphism{
	static int add(int a){
		return a + 5;
	}
	
	static int add(int a, int b){
		return a + b;
	}
	
	static double add(double a, double b){
		return a + b;
	}
	
	public static void main(String[] args){
		System.out.println(add(5));
		System.out.println(add(10,10));
		System.out.println(add(20.2,20.2));
	}
}

// static polymorphism