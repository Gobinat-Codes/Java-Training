import java.io.*;
import java.util.*;
public class ReadFile{
	public static void main(String[] args) throws Exception{
		File file = new File("D:\\Java Training\\14 file handling\\01 create file\\file2.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		sc.close();
		
		if(file.exists()){
			System.out.println("File Name : " + file.getName());
			System.out.println("File Path : " + file.getAbsolutePath());
			System.out.println("File Readabilty : " + file.canWrite());
			System.out.println("File Writebility : " + file.canRead());
			System.out.println("File Length : " + file.length());
		}
		else{
			System.out.println("file does not exists");
		}
	}
}