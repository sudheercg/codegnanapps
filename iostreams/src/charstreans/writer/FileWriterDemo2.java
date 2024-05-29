package charstreans.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	public static void main(String[] args) {

		File file = new File("example.txt");

		try (FileWriter writer = new FileWriter(file)) {

			writer.write("Hello World \n");
			writer.write("Attending IO Streams session \n");
			writer.write('C');
			writer.write("\n");
			char[] vowelsArray = { 'a', 'e', 'i', 'o', 'u' };
			writer.write(vowelsArray);
			writer.flush();

		} catch (IOException io) {
			io.printStackTrace();
		}

	}

}
