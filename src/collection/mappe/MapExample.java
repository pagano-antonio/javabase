package collection.mappe;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> map = new HashMap<>();

        // 1. Put elements into the map
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Frank", 35);
        
        // 2. Get an element by key
 //       System.out.println("Alice's age: " + map.get("Bobff"));

//        // 3. Check if a key exists
//        if (map.containsKey("Bob")) {
//            System.out.println("Bob is in the map.");
//        }
//
//        // 4. Check if a value exists
        if (map.containsValue(25)) {
            System.out.println("There is a person aged 25 in the map.");
        }
//
//        // 5. Remove an element by key
       map.remove("Charlie");
//
//        // 6. Get the size of the map
       System.out.println("Map size: " + map.size());
//
//        // 7. Iterate over the map entries
        System.out.println("Map entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }
//
//        // 8. Iterate over the keys
        System.out.println("Map keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
//
//        // 9. Iterate over the values
        System.out.println("Map values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }
//
//        // 10. Clear the map
        map.clear();
        System.out.println("Map size after clear: " + map.size());
    }
}
