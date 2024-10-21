import java.util.ArrayList;
import java.util.List;

public class ArrayListDriver {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Bill"); // adds at end
        names.add("Jill");
        names.add("Paul");
        names.add("Sue"); // names now has Bill, Jill, Paul, Sue
        names.add(1,"John"); //names now has Bill, John, Jill, Paul, Sue
        //this requires elements after Bill to be shifted

        //output the contents of the list
        for (int i = 0; i < names.size(); i++){
            String name = names.get(i);
            System.out.println(name);
        }

        System.out.println("\nThird name in ArrayList is: " + names.get(2));

        System.out.println("\nThe ArrayList names has " + names.size() + " elements");

        System.out.println("\nDoes the names ArrayList contains the element Emma: " + names.contains("Emma"));

        System.out.println("\nThe position of the element Sue is: " + names.indexOf("Sue"));

        names.removeFirst();

        System.out.println("\n" + names.toString()); //[John, Jill, Paul, Sue]

        System.out.println("\nCheck is ArrayList is empty: " + names.isEmpty());

        names.remove(1); //Remove element by index
        names.remove("John"); //Remove element by name

        System.out.println("\n" + names.toString()); //[Paul, Sue]

        List<String> names1 = new ArrayList<>();
        names1.add("Jill");
        names1.add("Ella");
        names1.add("Sue");

        System.out.println("\nIs names equal to names1? " + names.equals(names1)); //False

        names.clear();
        System.out.println("\nIs names empty after using clear(): " + names.isEmpty()); //True

    }
}
