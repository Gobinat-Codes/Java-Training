public class If{
	public static void main(String[] args){
		int mark1 = 40, mark2 = 50, mark3 = 60, mark4 = 70, mark5 = 80;
		int total = mark1 + mark2 + mark3 + mark4 + mark5;
		float avg = total / 5;
		if(avg > 71){
			System.out.println("grade A");
		}
		else if(avg > 61){
			System.out.println("grade B");
		}
		else if(avg > 51){
			System.out.println("grade C");
		}
		else if(avg < 40){
			System.out.println("grade F");
		}
	}
}	