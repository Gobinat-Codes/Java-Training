public class LargestElement{
	public static void main(String[] args){
		int arr1[] = {1,2,3,4,5};
		int max = arr1[0];
		for(int i = 0 ; i < arr1.length ; i++){
			if(arr1[i] > max)
				max = arr1[i];
		}
		System.out.println(max);
	}
}