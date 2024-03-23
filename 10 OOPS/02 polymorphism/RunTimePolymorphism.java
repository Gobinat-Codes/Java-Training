class Fruits {

		 void printHello(){
			System.out.println("Banana");
		}
		g
	}

public class RunTimePolymorphism extends Fruits{
	
		void printHello(){
			System.out.println("Apple");
	
	
		}
		
		void test() {
			super.printHello();   // super - keyword only used in non-static methods
		}
	
	
	public static void main(String[] args){
		RunTimePolymorphism r= new RunTimePolymorphism();
		Fruits f = new Fruits();
		r.printHello();
		r.printHello();
		f.printHello();
		
		r.test();
	}

}

// dynamic polymorphism
		