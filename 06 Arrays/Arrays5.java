public class Arrays5{
	public static void main(String[] args){
		char letters[] = {'a','e','i','o','u'};
		char value = 'f';
		char letters2[] = new char[letters.length + 1];
		
		for(int i = 0 ; i < letters.length; i++){
			letters2[i] = letters[i];
		}
		
		letters2[letters.length] = value;
		
		for(int j = 0 ; j < letters2.length ; j++){
			System.out.println(letters2[j]);
		}
	}
}