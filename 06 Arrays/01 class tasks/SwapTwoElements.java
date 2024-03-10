public class SwapTwoElements{
	public static void main(String[] args){
		int arr1[] = {1,2,4,3,5};
		int index2 = 2;
		int index3 = 3;
		int temp = 0;
			temp = arr1[index2];
			arr1[index2] = arr1[index3];
			arr1[index3] = temp;
		for(int i = 0 ; i<arr1.length ; i++){
			System.out.println(arr1[i]);		
	}
}
}