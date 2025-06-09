package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");

        // Iterates in the order of insertion
        System.out.println("LinkedHashSet elements:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }
}

