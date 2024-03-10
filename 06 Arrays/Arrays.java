public class Arrays{
	public static void main(String[] args){
		int no[] = new int[7];
		 no[0] = 25;
		 no[5] = 35;
		 no[6] = 45;
		
		System.out.println(no[0]);
		System.out.println(no[5]);
		System.out.println(no[6]);
		
		int size = no.length;
		System.out.println(size);
		
		for(int i = 0 ; i < size ; i++){
			System.out.println(no[i]);
	}
	}
}