package collection.hashtable;

import java.util.Hashtable;

public class Test {

	 public static void main(String[] args) {
	        // Create a Hashtable to store Person objects and their corresponding phone numbers
	        Hashtable<Person, String> phoneBook = new Hashtable<>();

	        // Add entries to the Hashtable
	        Person person1 = new Person("John", "Doe", 30);
	        Person person2 = new Person("Jane", "Doe", 28);
	        Person person3 = new Person("Jim", "Beam", 35);

	        phoneBook.put(person1, "123-456-7890");
	        phoneBook.put(person2, "098-765-4321");
	        phoneBook.put(person3, "555-555-5555");

	        // Retrieve and print entries from the Hashtable
	        System.out.println("John Doe's Phone Number: " + phoneBook.get(person1));
	        System.out.println("Jane Doe's Phone Number: " + phoneBook.get(person2));
	        System.out.println("Jim Beam's Phone Number: " + phoneBook.get(person3));

	        // Iterate through the Hashtable and print all entries
	        for (Person key : phoneBook.keySet()) {
	            System.out.println(key + "'s Phone Number: " + phoneBook.get(key));
	        }
	    }

}
