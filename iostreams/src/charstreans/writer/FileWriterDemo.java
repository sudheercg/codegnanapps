package charstreans.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args)  {

		File file = new File("example.txt");
		FileWriter writer= null;
		
		try {
		 writer = new FileWriter(file);
		writer.write("Hello World \n");
		writer.write("Attending IO Streams session \n");
		writer.write('C');
		writer.write("\n");
		char[] vowelsArray = { 'a', 'e', 'i', 'o', 'u' };
		writer.write(vowelsArray);
		writer.flush();
	
		}
		catch(IOException io ) {
			io.printStackTrace();
		}
		
		finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
