public class FibonacciSeries{
	public static void main(String[] args){
		int sum;
		int a = 0 , b = 1;
		for(int i = 0 ; i <= 10 ; i++){
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);
		}
	}
}
