package charstreans;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		
		File file = new File("codegnan.txt");

		// exists()
		System.out.println(file.exists());

		// createNewFile() to create a file
		file.createNewFile();
		System.out.println(file.exists());

		// Creating a directory
		File file2 = new File("iostreams");
		file2.mkdir();
		
		//File f = new File(String filename);
		//File f = new File(String subdirectory, String name);
		//File f = new File(File file, String name);
		
		File file3 = new File("iostreams","charstreams.txt");
		file3.createNewFile();
		
		file2.isDirectory();
		file2.isFile();
		
		

	}

}
