import java.io.*;
import java.util.*;
public class CheckFile{ // check file exists or create a new file
	public static void main(String[] args) throws Exception{
		File file = new File("file3.txt");
		if(file.exists()){
			System.out.println("file exists");
		}
		else{
			file.createNewFile();
			System.out.println("new file created");
		}
	}
}