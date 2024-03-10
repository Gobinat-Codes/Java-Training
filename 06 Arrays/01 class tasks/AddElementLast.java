public class AddElementLast{
	public static void main(String[] args){
		int arr1[] = {1,2,3,4};
		int value = 5;
		int arr2[] = new int[arr1.length + 1];
		for(int i = 0 ; i < arr1.length ; i++){
			arr2[i] = arr1[i];
		}
		
		arr2[arr1.length] = value;  // here in length when we give length -1 means it creates a new array and value it as by default 0
		for(int j = 0 ; j < arr2.length ; j++){
			System.out.println(arr2[j]);
		}
	}
} 