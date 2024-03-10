public class Arrays4{
	public static void main(String[] args){
		String names[] = {"gobi","siva","hari","bhrama"};
		String value = "ram";
		String names2[] = new String[names.length + 1];
		
		for(int i = 0 ; i < names.length ; i++){
			names2[i] = names[i];
		}
		
		names2[names.length] = value;
		
	for(int j = 0 ; j < names2.length ; j++){
			System.out.println(names2[j]);
		}
}
}



