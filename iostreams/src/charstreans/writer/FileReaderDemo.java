package charstreans.writer;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Reading the character data from the file.
public class FileReaderDemo {

	public static void main(String[] args) {

		// Creating a File object
		File file = new File("example.txt");

		// Using the try with resources to avoid resource leak and handle checked
		// exception
		try (FileReader reader = new FileReader(file)) {
			int character;

			// read method returns and the ascii int value for the character. -1 indicates
			// the end of the file.
			while ((character = reader.read()) != -1) {

				// typecasting the numeric value to char
				System.out.print((char) character);
			}

		} catch (IOException io) {
			io.printStackTrace();
		}

	}

}
