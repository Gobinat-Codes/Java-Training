public class MethodDemo{
	
	static void Yazhini(){  // -> non parameterized method
		System.out.println( "Yazhini() : "  + "mairu");
	}
	
	static void Yazhini(int age){ // -> method over loading ,  same method name but different paramter
		System.out.println(age);
	}
	
	static void AmudhuMama(String data){ // -> parameterized method
		System.out.println(data);
	}
	
	static int Gobi(int x){
		return 5 + x;
	}
	
	public static void main(String[] args){
		Yazhini();
		Yazhini(40);
		Gobi(20);
		
		AmudhuMama("Amudhu() : " + "psycho");  // -> psycho - arguments ; parameterized methods call
	}
}