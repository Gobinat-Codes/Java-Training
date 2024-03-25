public class StarPattern{
	public static void main(String[] args){
		int pattern = 5;
		for(int i = 0 ; i < pattern ; i++){
			for(int j = 0 ; j <= i ; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
