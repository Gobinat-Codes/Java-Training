abstract class Abstraction01{
	abstract int add(int a, int b){
		
	}
	
	int multiply(int a , int b){
		return a*b;
	}
	
	public static void main(String[] args){
		public int add(int a, int b){
			return a+b;
		}
		
		Abstraction01 abs = new Abstraction01();
		System.out.println(abs.add(10,10));
		System.out.println(abs,multiply(10,10))
	}
}