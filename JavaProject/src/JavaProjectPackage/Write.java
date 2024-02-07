package JavaProjectPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Write {
    public static void main(String[] args) {

        String file = "C:/Users/Aditi/Documents/Sample.txt";

        // Content to be written
        List<String> content = Arrays.asList("Address", "Phone No");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            for (String line : content) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File has been written.");


        } catch (IOException e) {
            System.err.println("Error occurred : " + e.getMessage());
        }
    }
}


