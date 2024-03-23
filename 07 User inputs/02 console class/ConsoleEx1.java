import java.io.Console;
public class ConsoleEx1{
	public static void main(String[] args){
		Console console = System.console();
		String name = console.readLine();
		char[] pass = console.readPassword();
		String passAsString = "";
	}
}