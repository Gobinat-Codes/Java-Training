public class RemoveFirstElement{
	public static void main(String[] args){
		int arr1[] = {1,2,3,4,5};
		int arr2[] = new int[arr1.length-1];
		for(int i = 0 ; i<arr2.length ; i++){
			arr2[i] = arr1[i+1];
		}
		for(int j = 0 ; j<arr2.length ; j++){
			System.out.println(arr2[j]);
		}
	}
}