package charstreans.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("example2.txt");

		FileWriter fWriter = new FileWriter(file);

		BufferedWriter bWriter = new BufferedWriter(fWriter);
		char[] charArray = { 'a', 's', 'd', 'f' };
		bWriter.write(charArray);
		bWriter.newLine();
		bWriter.write("CodeGnan Hyderabad");
		bWriter.flush();
		bWriter.close();

	}

}
