public class ModifyArrayElement{
	public static void main(String[] args){
		int arr1[] = {1,2,3,4,5};
		arr1[3] = 10;
		System.out.println("modified array element :" + arr1[3]);
		
		for(int i = 0 ; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}
}