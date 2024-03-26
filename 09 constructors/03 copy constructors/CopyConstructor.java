public class CopyConstructor{
	public String name;
	public int age;
	
	public CopyConstructor(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}
	
	public CopyConstructor(CopyConstructor other){
		this.name = other.name;
		this.age = other.age;
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args){
		CopyConstructor obj1 = new CopyConstructor("Gobi",24);
		}
}