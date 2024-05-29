package charstreans.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo3 {

	public static void main(String[] args) {

		File file = new File("example.txt");

		try (FileWriter writer = new FileWriter(file, false)) {

			writer.write("Pledge \n");
			writer.write("India is my country and all Indians are my brothers and sisters."
					+ "I love my country and "
					+ "I am proud of its rich and varied heritage.\n");
		
		
			writer.flush();

		} catch (IOException io) {
			io.printStackTrace();
		}

	}

}
