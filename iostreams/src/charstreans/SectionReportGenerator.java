package charstreans;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SectionReportGenerator {

    public static void main(String[] args) {
        String outputFile = "section_report.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            // Generate report for sections 1 to 5
            for (int section = 1; section <= 5; section++) {
                // Write section header with section number
                bw.write("Section ");
                bw.write(section); // Writing section number as Unicode code point

                // Add new line
                bw.newLine();

                // Write section content
                bw.write("This is the content of section " + section);

                // Add two new lines between sections
                bw.newLine();
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Section report generated successfully.");
    }
}
