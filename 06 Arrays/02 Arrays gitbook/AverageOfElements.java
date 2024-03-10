public class AverageOfElements{
	public static void main(String[] args){
		int sum = 0;
		int arr1[] = {1,2,3,4,5};
		for(int i = 0 ; i < arr1.length; i++){
			sum += arr1[i];
		}
		int avg = sum / arr1.length;
		System.out.println(avg);
	}
}