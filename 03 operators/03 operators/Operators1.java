public class Operators1{
	public static void main(String[] args){
		int a = 1;
		int b = 1;
		int c = 2;
		int d = 2;
		System.out.println("a : " + ++a);
		System.out.println("b : " + b++);
		System.out.println("c : " + --c);
		System.out.println("d : " + d--);
	}
}

// O/P 
// a is pre-increment which means it increments before execution so O/P of a is 2 
// b is post-increment which means it increments after execution so O/P of b is 1
// c is pre-decrement which means it decrements before execution so O/P of b is 1 
// d is post-decrement which means it decrements after execution so O/P of d is 2 .