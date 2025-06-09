package collection.set;

import java.util.TreeSet;

public class TreeSetWithMyClass {
	public static void main(String[] args) {
        // Create a TreeSet of Person
        TreeSet<Person> personSet = new TreeSet<>();

        // Add persons to the TreeSet
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 25));
        personSet.add(new Person("Charlie", 35));
        personSet.add(new Person("Diana", 28));

        // Print the TreeSet
        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}
