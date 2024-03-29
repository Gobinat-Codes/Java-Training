import java.io.*;
import java.util.*;
public class FileDelete1{
	public static void main(String[] args){
		File file = new File("file6.txt");
		if(file.delete()){
			System.out.println("file deleted successfully");
		}
		else{
			System.out.println("file already deleted");
		}
	}
}