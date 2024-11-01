package Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex3_ReadFile {
    public static void main(String[] args) {
        String fileLocation = "MyLabs/Lab2/mattia_pascal.txt";
        TreeSet<String> words = new TreeSet<>();

        try (Scanner scan = new Scanner(new File(fileLocation))) {
            while (scan.hasNextLine()) {
                String word = scan.nextLine();
                words.add(word);
            }
            System.out.println("Unique words in file: ");
            for (String word : words) {
                System.out.println(word);
            }
            System.out.println("Total unique words: " + words.size());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
