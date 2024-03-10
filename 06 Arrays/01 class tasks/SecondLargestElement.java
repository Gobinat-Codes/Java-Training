public class SecondLargestElement{
	public static void main(String[] args){
		int arr1[] = {1,2,3,4,5};
		int largest = arr1[0];
		int secondLargest = arr1[1];
		for(int i = 0 ; i < arr1.length ; i++){
			if(arr1[i] > largest){
				secondLargest = largest;
				largest = arr1[i];
			}
			else if(arr1[i] != largest && arr1[i] > secondLargest){
				secondLargest = arr1[i];
			}
		}
		System.out.println(secondLargest);
	}
}