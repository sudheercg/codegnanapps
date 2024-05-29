package charstreans;

import java.io.File;
import java.io.IOException;

public class FileListDemo {

	public static void main(String[] args) throws IOException{

		File mydirectory = new File("mydirectory");
		mydirectory.mkdir();
		
		File myfile1 = new File("mydirectory","myfile1.txt");
		myfile1.createNewFile();
		
		File myfile2 = new File("mydirectory", "myfile2.txt");
		myfile2.createNewFile();
		
		
		File myfile3 = new File("mydirectory", "myfile3.txt");
		myfile3.createNewFile();
		
		
		//list() lists the contents of the directory
		String[] filesArray = mydirectory.list();
		
		for (String filename:filesArray) {
			System.out.println(filename);
		}
		
		
		
		
		
		
	}

}
