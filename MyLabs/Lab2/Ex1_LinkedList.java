package Lab2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex1_LinkedList {
    public static void main(String[] args) {
        // (I)
        LinkedList<String> people = new LinkedList<>();
        people.add("Kay");
        people.add("Jay");
        people.add("May");
        people.add("Fay");

        // (II)
        ListIterator<String> listIt = people.listIterator();
        listIt.next();
        listIt.next();
        listIt.add("Ray");

        // (III)
        people.remove("Jay");

        // (IV)
        System.out.println("Names from beginning:");
        ListIterator<String> it = people.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nNames from end:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

        // (V)
        people.add("Kay"); // Duplicates are allowed
        System.out.println("\nNew LinkedList:");
        ListIterator<String> it1 = people.listIterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
