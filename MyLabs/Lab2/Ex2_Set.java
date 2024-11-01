package Lab2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex2_Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Kay");
        set.add("Jay");
        set.add("May");
        set.add("Fay");
        set.add("Kay");

        System.out.println("Set output: " + set.toString());
        // HasSet output: [Kay, Jay, May, Fay] NO duplicates are allowed
        // Does not maintain any specific order

        System.out.println("\nHasSet output: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Kay");
        treeSet.add("Jay");
        treeSet.add("May");
        treeSet.add("Fay");
        treeSet.add("Kay");

        System.out.println("\nTreeSet output: " + treeSet.toString());
        // TreeSet output: [Fay, Jay, Kay, May] NO duplicates are allowed
        // Sorted (alphabetical) order

        System.out.println("\nTreeSet output: ");
        Iterator<String> treeIt = treeSet.iterator();
        while (treeIt.hasNext()) {
            System.out.println(treeIt.next());
        }
    }
}
