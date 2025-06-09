package collection.set;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
      //  Set<String> treeSet = new TreeSet<>();
    	Set<String> treeSet = new TreeSet<>(Comparator.reverseOrder());
////
////        // Adding elements
        treeSet.add("Apple");
        treeSet.add("Date");
        treeSet.add("Cherry");

        treeSet.add("Banana");
        
        System.out.println(treeSet);

        // Elements are sorted
        System.out.println("TreeSet elements:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    	
       
    /*	
        Set<Person> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add(new Person("antonio", 18));
        treeSet.add(new Person("giusepe", 38));
        treeSet.add(new Person("rocco", 45));
        treeSet.add(new Person("giovanni", 15));

        // Elements are sorted
        System.out.println("TreeSet elements:");
        for (Person fruit : treeSet) {
            System.out.println(fruit);
        }
        */
    }
}
