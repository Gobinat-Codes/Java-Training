public class SumSqr{
	public static void main(String[] args){
		int n = 10;
		int ans = 0;
		for(int i = 1; i <= n ; i++){
		int sqr = i * i;
			ans = ans + sqr;
		}
			System.out.println(ans);
	}
}
