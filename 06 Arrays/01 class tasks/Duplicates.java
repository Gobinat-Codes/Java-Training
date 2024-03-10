public class Duplicates{
	public static void main(String[] args){
		int arr1[] = {1,2,3,4,5,1,2};
		int element1 = 6;
		int element2 = 7;
		for(int i = 0 ; i < arr1.length-1 ; i++){
			for(int j = i+1 ; j < arr1.length ; j++){
				if(arr1[i] == arr1[j]){
					arr1[j] = element1;
				}
			}
		}
		
		for(int i = 0 ; i < arr1.length ; i++){
			if(arr1[i] == element1){
				arr1[i] = element2;
			}
		}
		
		for(int z = 0 ; z < arr1.length ; z++){
			System.out.println(arr1[z]);
		}
	}
}