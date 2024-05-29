package charstreans.writer;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterStringFormatExample {
    public static void main(String[] args) {
        String name = "Alice";
        String fileName = "stringFormatOutput.txt";

        // Use try-with-resources to ensure the writer is closed
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            // Basic string
            writer.printf("Name: %s%n", name);

            // Left-aligned string within 10-character width
            writer.printf("Left-aligned: %-10s%n", name);

            // Right-aligned string within 10-character width
            writer.printf("Right-aligned: %10s%n", name);

            // Substring
            writer.printf("Substring: %s%n", name.substring(0, 3));

            // Uppercase
            writer.printf("Uppercase: %s%n", name.toUpperCase());

            // Lowercase
            writer.printf("Lowercase: %s%n", name.toLowerCase());

            // Fixed width with truncation
            writer.printf("Truncated: %.3s%n", name);

            System.out.println("Formatted output written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
