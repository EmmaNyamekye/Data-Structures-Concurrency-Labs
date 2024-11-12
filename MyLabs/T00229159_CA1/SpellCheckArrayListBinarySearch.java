package T00229159_CA1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SpellCheckArrayListBinarySearch {

    public static void main(String[] args) throws FileNotFoundException {
        List<String> dictionaryOfWords = readDictionary("MyLabs/T00229159_CA1/words_alpha.txt");
        Set<String> document = readWords("MyLabs/T00229159_CA1/The-Little-Prince.txt");
        int numMisspelledWords = 0;

        for (String word : document) {
            if (Collections.binarySearch(dictionaryOfWords, word.toLowerCase()) < 0) {
                numMisspelledWords++;
            }
        }
        System.out.println("Number of misspelled words: " + numMisspelledWords);
    }

    private static List<String> readDictionary(String filename) throws FileNotFoundException {
        Scanner inScan = new Scanner(new File(filename));
        inScan.useDelimiter("[^a-zA-Z]+");
        List<String> words = new ArrayList<String>();
        while (inScan.hasNext()) {
            words.add(inScan.next().toLowerCase());
        }
        inScan.close();
        // Sort the list after reading all words
        Collections.sort(words);  // Sorts the words alphabetically
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