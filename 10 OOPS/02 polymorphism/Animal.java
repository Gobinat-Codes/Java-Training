class Animal{
	public void animalSound(){
		System.out.println("Meaow,bow-bow,Ooo");
	}
}

class Cat extends Animal{
	public void animalSound(){
		System.out.println("meaow");
	}
}

class Dog extends Animal{
	public void animalSound(){
		System.out.println("bow-bow");
	}
}

class Owl extends Animal{
	public void animalSound(){
		System.out.println("Ooo");
	}
}

class Zoo{
	public static void main(String[] args){
	Animal ani = new Animal();	
	Animal cat = new Cat();
	Animal dog = new Dog();
	Animal owl = new Owl();
	
	ani.animalSound();
	cat.animalSound();
	dog.animalSound();
	owl.animalSound();
	}
}
	