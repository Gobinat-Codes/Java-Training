import java.util.Scanner;
public class Scnar1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String str = sc.nextLine();
		System.out.println("Verified name : " + str);
		
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Verified age : " + age);
		
		System.out.print("Enter radius : ");
		float rd = sc.nextFloat();
		System.out.println("Verified radius : " + rd);
		
		System.out.print("Enter double : ");
		double db = sc.nextDouble();
		System.out.println("Verified double : " + db);
		
		System.out.print("Enter boolean : ");
		boolean bl = sc.nextBoolean();
		System.out.println("Verified boolean : " + bl);
		
		System.out.print("Enter byte : ");
		byte by = sc.nextByte();
		System.out.println("Verified byte : " + by);
		
		System.out.print("Enter short : ");
		short sh = sc.nextShort();
		System.out.println("Verified short : " + sh);
		
		System.out.print("Enter long : ");
		long lg = sc.nextLong();
		System.out.println("Verified long : " + lg);
		
		System.out.print("Enter your char : ");
		char ch = sc.next().charAt(0);  // --------------------> for using char at scanner
		System.out.println("Verified char : " + ch);
	}
}