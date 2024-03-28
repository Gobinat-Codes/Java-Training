import java.io.*; // for Exception, File
import java.util.*; // for Scanner
public class FileHandling{
	public static void main(String[] args) {
		try{
		File file = new File("D:\\Java Training\\14 file handling\\demo\\file27.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		sc.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}