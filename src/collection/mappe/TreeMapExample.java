package collection.mappe;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
//        Map<String, Integer> treeMap = new TreeMap<>();
//
//        // Adding elements
//        treeMap.put("One", 1);
//        treeMap.put("Two", 2);
//        treeMap.put("Three", 3);
//
//        // Automatically sorted by key
//        System.out.println("Sorted map:");
//        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
    	
    	
    	
        Map<Person, Integer> treeMap = new TreeMap<>();

        // Adding elements
        treeMap.put(new Person("Antonio", "Pagano",18), 1);
        treeMap.put(new Person("Michele", "Pagano",18), 1);
        treeMap.put(new Person("Giovanni", "Pagano",18), 1);

        // Automatically sorted by key
        System.out.println("Sorted map:");
        for (Map.Entry<Person, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

