public class SecondSmallestElement{
	public static void main(String[] args){
		int arr1[] = {1,2,3,4,5};
		int smallest = arr1[0];
		int secondSmallest = arr1[1];
		for(int i = 1 ; i < arr1.length ; i++){
			if(arr1[i] < smallest){
				secondSmallest = smallest;
				smallest = arr1[i];
			}
			else if(arr1[i] != smallest && arr1[i] < secondSmallest){
				secondSmallest = arr1[i];
			}
		}
		System.out.println(secondSmallest);
	}
}