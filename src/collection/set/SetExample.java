package collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
    	
    	//SET
    	//HASHSET
    	//TREESET
    	
    	
        // Creating a HashSet
        Set<String> set = new HashSet<>();

        // Adding elements to the Set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate element, will not be added

        // Displaying the Set
        System.out.println("Set elements: " + set);

        // Checking if an element exists
        if (set.contains("Banana")) {
            System.out.println("Set contains Banana");
        } else {
            System.out.println("Set does not contain Banana");
        }

        // Removing an element
        set.remove("Orange");

        // Displaying the Set after removal
        System.out.println("Set elements after removal: " + set);

        // Iterating over the Set
        System.out.println("Iterating over the Set:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}

