package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetWithMyClass {
	public static void main(String[] args) {
        // Create a LinkedHashSet of Person
        Set<Person> personSet = new LinkedHashSet<>();
        
       
        // Add persons to the LinkedHashSet
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 25));
        personSet.add(new Person("Charlie", 35));
        personSet.add(new Person("Diana", 28));
        personSet.add(new Person("Alice", 30)); // This should not add a duplicate

        // Print the LinkedHashSet
        for (Person person : personSet) {
            System.out.println(person);
        }
        
        
        
  
    }
	
}
