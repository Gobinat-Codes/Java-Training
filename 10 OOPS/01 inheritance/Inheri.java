class Inheri{
	public void coding(){
		System.out.println("Inherit successfully");
	}
}

class Access extends Inheri{
	public static void main(String[] args){
		Access obj2 = new Inheri();
		Access obj1 = new Access();
		obj2.coding();
		
	}
}