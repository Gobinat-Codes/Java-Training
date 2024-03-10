public class RemoveSpecificElement{
	public static void main(String[] args){
		int arr1[] = {1,2,3,4,5};
		int removeIndex = 2;
		int arr2[] = new int[arr1.length-1];
		for(int i = 0 ; i< removeIndex ; i++){
			arr2[i] = arr1[i];
		}
		
		for(int i = removeIndex + 1 ; i<arr1.length ; i++){
			arr2[i-1] = arr1[i];
		}
		
		for(int j = 0 ; j<arr2.length ; j++){
			System.out.println(arr2[j]);
		}
	}
}