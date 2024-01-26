class Methods{
	
	static void method1(){
		System.out.println("static method called successfully");
	}
	
	public void method2(){
		System.out.println("public method called successfully");
	}
	 
	void method3(){
		System.out.println("void method called sucessfully");
	}	
	
	static void method4(){
		System.out.println("non-static <- static called successfully");
	}
	
	void method5(){
		method4();
	}	
	
	public static void main(String[] args){
		// static method, calls directly
		method1(); // static <- static
		
		// public method, needs to create a object for a method call 
		Methods obj1 = new Methods();
		obj1.method2(); // static <- non-static
		
		// non-static method, also needs to create a object for a method call 
		Methods obj2 = new Methods();
		obj2.method3(); // static <- non-static
		
		method5();
	}
}