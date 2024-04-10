abstract class Abstraction02{
	public abstract void coding();
	public void programming(){
		System.out.println("java is best");
	}
}

class Abstract extends Abstraction02{
	public void coding(){
		System.out.println("secret is opened");
	}
}

class Main{
	public static void main(String[] args){
		Abstraction02 obj1 = new Abstraction02();
		Abstract obj2 = new Abstract();
		obj1.programming();
		obj2.coding();
	}
}