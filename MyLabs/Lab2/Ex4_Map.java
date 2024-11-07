package Lab2;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex4_Map {
    public static void main(String[] args) {
        Map<Integer, String> mapNames = new HashMap<Integer, String>();
        mapNames.put(1, "Kay");
        mapNames.put(2, "Jay");
        mapNames.put(3, "May");
        mapNames.put(3, "Tooo"); // Last occurrence of integer 3 will be stored
        mapNames.put(5, "Fay");
        mapNames.put(6, "Kay");

        // Print out all the values
        Set<Integer> keySet = mapNames.keySet();
        for (Integer key : keySet){
            String value = mapNames.get(key);
            System.out.println(key + " : " + value);
        }

        /*To store all the line numbers on which a word occurred,
        you could use a List or a Set of line numbers –
        which would be better? Update the code to do this.
        Also perform a search on the Map for a key value –
        what method allows you to search for a word?*/
    }
}
