import java.io.*;
import java.util.*;
public class FileWrite{
	public static void main(String[] args) throws Exception{
		File file = new File("file4.txt");
		if(file.exists()){
			System.out.println("file is there");
		}
		else{
			System.out.println("file is not there");
		}
		
		FileWriter writer = new FileWriter(file);
		writer.write("\nHello world!!!");       //    \n is for new line, the text is wrtten in next next new line 
		writer.append("\nHello Java");
		writer.write("\nHello Programming");
		writer.close();								// writer must be close because the stream will open and cause security issues (vulnerability)
		System.out.println("written successfully");
		
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		sc.close();                     // Scanner must be close because the stream will open and cause security issues (vulnerability)
	}
}