import java.io.Console;
public class Console1{
	public static void main(String[] args){
		Console console = System.console();
		String name = console.readLine();
		char[] pass = console.readPassword();
		String passAsString = "";
			for(int i = 0 ; i < pass.length ; i++){
				passAsString += pass[i];
			}
		if(name.equals("gobi") && pass.equals("123")){
			System.out.println("access");
		}
		else{
			System.out.println("denied");
		}
	}
}
