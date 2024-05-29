package charstreans.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {

		//PrintWriter writer = new PrintWriter(String fileName);
		PrintWriter writer = new PrintWriter("myfile.txt");
		
		//PrintWriter writer = new PrintWriter(File fileDescriptor);
		File fileObj = new File("myfile.txt");
		PrintWriter writer2 = new PrintWriter(fileObj);
		
		//PrintWriter writer = new PrintWriter(Writer writer);
		FileWriter fWriter = new FileWriter("myfile.txt");
		PrintWriter writer3 = new PrintWriter(fWriter);
		
		writer.write(200);
		writer.println(200);
		writer.println(true);
		writer.println('M');
		writer.println("Codegnan IT solutions");
		writer.close();
		
		
		
		
		
		
		
		
	}

}
