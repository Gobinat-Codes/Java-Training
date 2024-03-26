public class ParaConstructor{
		public String name;
		public int age;
		
		public ParaConstructor(String fname, int fage){
			this.name =  fname;
			this.age = fage;
			System.out.println(fname);
			System.out.println(fage);
		}

	public static void main(String[] args){
			ParaConstructor obj1 = new ParaConstructor("Gobi",24);
	}
}