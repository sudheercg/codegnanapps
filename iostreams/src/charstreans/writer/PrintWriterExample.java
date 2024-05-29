package charstreans.writer;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Date;

public class PrintWriterExample {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "formattedOutput.txt";

        // Use try-with-resources to ensure the writer is closed
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            
            // Writing formatted strings
            writer.println("Formatted Output Example:");
            
            // Formatting numbers
            int intValue = 42;
            double doubleValue = 3.14159;
            writer.printf("Integer: %d%n", intValue);
            writer.printf("Floating point number: %.2f%n", doubleValue);
            
            // Formatting strings
            String name = "Ashok Reddy";
            writer.printf("Name: %s%n", name);
            
            // Left-aligned string within 10-character width
            writer.printf("Left-aligned: %-10s%n", name);

            // Right-aligned string within 10-character width
            writer.printf("Right-aligned: %10s%n", name);
       
            
            
            // Formatting dates
            Date now = new Date();
            writer.printf("Current date and time: %tF %<tT%n", now);
            
            // Combining different types in a formatted string
            writer.printf("User %s logged in at %tF %<tT with an ID of %d%n", name, now, intValue);
            
            System.out.println("Formatted output written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
