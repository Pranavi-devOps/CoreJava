import java.util.*;

public class HashSetOperations {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // Add 10 elements
        set.add("Java");
        set.add("Python");
        set.add("C");
        set.add("C++");
        set.add("HTML");
        set.add("CSS");
        set.add("JS");
        set.add("SQL");
        set.add("React");
        set.add("Spring");

        // Add duplicate (will not add)
        set.add("Java");

        // Print set
        System.out.println("Set: " + set);

        // Check contains
        System.out.println("Contains Java? " + set.contains("Java"));

        // Remove element
        set.remove("C");

        // Size
        System.out.println("Size: " + set.size());

        // Iterate
        System.out.println("Iterating:");
        for (String s : set) {
            System.out.println(s);
        }

        // Check empty
        System.out.println("Is empty? " + set.isEmpty());

        // Clear all
        set.clear();
        System.out.println("After clear: " + set);
    }
}
