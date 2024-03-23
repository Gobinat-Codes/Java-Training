// encapsulation

// these class are called as DTO (data transfer objects)

public class BesantDetails{
	
	private String name;
	private String role;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getRole(){
		return role;
	}

	public void setRole(String role){
			this.role = role;
	}
	
	public static void main(String[] args){
		BesantDetails bo = new BesantDetails();
		
		bo.setName("name : " + "Mei Alagan");
		System.out.println(bo.getName());
		bo.setName("role : " + "trainer");
		System.out.println(bo.getName());
		
	}
}
