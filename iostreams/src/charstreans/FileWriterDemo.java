package charstreans;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        // Example of FileWriter usage
        String fileName = "example.txt";

        try {
            // Creating a FileWriter object to write to a file named "example.txt"
            FileWriter writer = new FileWriter(fileName);

            // Writing characters to the file
            writer.write("Hello, World!\n");
            writer.write("This is an example of using FileWriter.\n");

            // Closing the FileWriter to release resources
            writer.close();

            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            // Handling exceptions if file operations fail
            e.printStackTrace();
        }
    }
}
