class Inheritance01{
	public void coding(){
		System.out.println("Inherit successfully");
	}
}

class Access extends Inheritance01{
	public static void main(String[] args){
		Access obj1 = new Access();
		obj1.coding();
		
	}
}