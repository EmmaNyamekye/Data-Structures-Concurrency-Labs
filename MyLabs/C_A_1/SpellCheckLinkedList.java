package C_A_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SpellCheckLinkedList {

    public static void main(String[] args) throws FileNotFoundException {
        Collection<String> dictionaryOfWords = readDictionary("MyLabs/C_A_1/words_alpha.txt");
        Set<String> document = readWords("MyLabs/C_A_1/The-Little-Prince.txt");
        int numMisspelledWords = 0;

        for (String word : document) {
            if(!dictionaryOfWords.contains(word)) {
                numMisspelledWords++;
            }
        }
        System.out.println("Number of misspelled words: " + numMisspelledWords);
    }

    private static Collection<String> readDictionary(String filename) throws FileNotFoundException {
        Scanner inScan = new Scanner(new File(filename));

        inScan.useDelimiter("[^a-zA-Z]+");
        Collection<String> words = new LinkedList<String>();
        while (inScan.hasNext()) {
            words.add(inScan.next().toLowerCase());
        }
        inScan.close();
        return words;
    }

    private static Set<String> readWords(String filename) throws FileNotFoundException {
        Set<String> words = new HashSet<String>();
        Scanner inScan = new Scanner(new File(filename));

        inScan.useDelimiter("[^a-zA-Z]+");
        while (inScan.hasNext()) {
            words.add(inScan.next().toLowerCase());
        }
        inScan.close();
        return words;
    }
}
