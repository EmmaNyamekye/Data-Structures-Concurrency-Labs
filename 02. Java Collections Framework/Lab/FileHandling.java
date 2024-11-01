package Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "02. Java Collections Framework/Lab/hamlet.txt";

        try (Scanner in = new Scanner(new File(fileName))) {  // Use try-with-resources
            int lineNumber = 1;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner lineParser = new Scanner(line);
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();

                    System.out.println("''" + word + lineNumber);
                }
                lineNumber++;
                lineParser.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}