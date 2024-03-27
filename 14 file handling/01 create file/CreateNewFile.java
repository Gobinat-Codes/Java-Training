import java.io.*; // for Exception, File
import java.util.*; // for Scanner
public class CreateNewFile{
	public static void main(String[] args) throws Exception{
		File file = new File("file2.txt");
		if(!file.exists()){
			file.createNewFile();
			System.out.println("file created");
		}
		else{
			System.out.println("file already created");
		}
	}
}