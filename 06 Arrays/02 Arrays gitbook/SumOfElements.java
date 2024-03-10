public class SumOfElements{
	public static void main(String[] args){
		int sum = 0;
		int arr1[] = {1,2,3,4,5};
		for(int i = 0 ; i < arr1.length; i++){
			sum += arr1[i];
			System.out.println(sum);
		}
	}
}