package charstreans.writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader fReader = new FileReader("example.txt");
		BufferedReader bReader = new BufferedReader(fReader);

		String line = bReader.readLine();

		while (line != null) {
			System.out.println(line);
			line = bReader.readLine();
		}

		bReader.close();

	}

}
