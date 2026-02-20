import java.util.*;

public class HashMapOperations {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Add 10 key-value pairs
        map.put(1, "Pranavi");
        map.put(2, "Ravi");
        map.put(3, "Sita");
        map.put(4, "Rahul");
        map.put(5, "Anu");
        map.put(6, "Kiran");
        map.put(7, "Meena");
        map.put(8, "Vijay");
        map.put(9, "Arjun");
        map.put(10, "Sneha");

        // Insert new mapping
        map.put(11, "Lakshmi");

        // Fetch value
        System.out.println("Student 1: " + map.get(1));

        // Clone
        HashMap<Integer, String> mapCopy = new HashMap<>(map);
        System.out.println("Cloned Map: " + mapCopy);

        // Check key
        System.out.println("Contains key 5? " + map.containsKey(5));

        // Check value
        System.out.println("Contains value Ravi? " + map.containsValue("Ravi"));

        // Check empty
        System.out.println("Is empty? " + map.isEmpty());

        // Size
        System.out.println("Size: " + map.size());

        // Print keys
        System.out.println("Keys: " + map.keySet());

        // Print values
        System.out.println("Values: " + map.values());

        // Remove specific key
        map.remove(2);

        // Copy all elements to another map
        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(map);

        System.out.println("Another Map: " + anotherMap);
    }
}
