import java.io.BufferedReader; // BufferedReader , reads values from anywhere in the system
import java.io.InputStreamReader;

public class BufRed1{
	public static void main(String[] args) throws Exception{ // while create buffered reader it shows some errors and warning so we use throws Exception for clear these errors and warnings
		InputStreamReader inputStream = new InputStreamReader(System.in); // we cannot directly use buffered reader so we create a inputstream reader its a java protocal , (System.in) paramter ,means we says that in this system
		BufferedReader reader = new BufferedReader(inputStream); // after we create the bufferedreader we give inputStream object as paramter
		
		String name  = reader.readLine();
		double age = Double.parseDouble(reader.readLine());
		System.out.println(name.charAt(0));
		System.out.println(age);
	}
}

// two methods
// -> read() - read single word
// -> readLine() - complete line as string , jumps to next line 


// String methods
// -> charAt(0) - reading a character , this will read the entire string and displays that specific character