public class Votes{
	private String pname;
	private String mname;
	private int votes;
	
	public String getName(){
		return pname;
	}
	
	public void setName(String pname){
		this.pname = pname;
	}
	
	public String getName2(){
		return mname;
	}
	
	public void setName2(String mname){
		this.mname = mname;
	}
	
	public int getVotes(){
		return votes;
	}
	
	public void setVotes(int votes){
		this.votes = votes;
	}
	
	public static void main(String[] args){
		Votes obj1 = new Votes();
		Votes obj2 = new Votes();
		Votes obj3 = new Votes();

		obj1.setName("BJP");
		System.out.println(obj1.getName());
		obj1.setName2("Modi");
		System.out.println(obj1.getName2());
		obj1.setVotes(100000);
		System.out.println(obj1.getVotes());
		
		obj2.setName("ADMk");
		System.out.println(obj2.getName());
		obj2.setName2("edapaadi");
		System.out.println(obj2.getName2());
		obj2.setVotes(1000);
		System.out.println(obj2.getVotes());
		
		obj3.setName("DMK");
		System.out.println(obj3.getName());
		obj3.setName2("stalin");
		System.out.println(obj3.getName2());
		obj3.setVotes(10);
		System.out.println(obj3.getVotes());
		
	}
}
		