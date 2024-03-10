public class AddElementFirst{
	public static void main(String[] args){
		int arr1[] = {10,20,30,40,50};
		int value = 100;
		int arr2[] = new int[arr1.length + 1];
		for(int i = 0 ; i < arr1.length ; i++){
			arr2[i + 1] = arr1[i];
		}
		arr2[0] = value;   // assigns new value to the first place as 0, it shifts all the elements to the right side
		for(int j = 0 ; j < arr2.length ; j++){
			System.out.println(arr2[j]);
		}
	}
}