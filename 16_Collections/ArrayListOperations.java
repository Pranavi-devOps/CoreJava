import java.util.*;

public class ArrayListOperations {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Add 10 elements
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("HTML");
        list.add("CSS");
        list.add("JS");
        list.add("SQL");
        list.add("React");
        list.add("Spring");

        // Add one more element
        list.add("Hibernate");

        // Iterate using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Add element at specific index
        list.add(2, "NodeJS");

        // Remove element
        list.remove("C");

        // Remove at index
        list.remove(3);

        // Update element
        list.set(1, "Advanced Python");

        // Check element at index
        System.out.println("Element at index 2: " + list.get(2));

        // Size
        System.out.println("Size: " + list.size());

        // Check element exists
        System.out.println("Contains Java? " + list.contains("Java"));

        // Remove all
        list.clear();
        System.out.println("List after clear: " + list);
    }
}
