public class Cla2{
	public static void main(String[] args){
		
		String productName = args[0];
		System.out.println("Product Name : " + productName);
		
		double price = Double.parseDouble(args[1]);
		System.out.println("Price : " + price);
		
		if(250.25 <= price){
			System.out.println("Validate");
		}
		else{
			System.out.println("Not Validate");
		}
	}
}