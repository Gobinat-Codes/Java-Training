public class Arrays3{
	public static void main(String[] args){
		int arr[] = {1,2,3,4};
		int value = 5;
		int arr2[] = new int[arr.length + 1];
		for(int i = 0 ; i < arr.length ; i++){
			arr2[i] = arr[i];
		}
		
		arr2[arr.length] = value;
		
		for(int j = 0 ; j < arr2.length ; j++){
			System.out.println(arr2[j]);
		}
	}
}