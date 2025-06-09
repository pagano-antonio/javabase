package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEsempi {

	public static void main(String[] args) {
	
		        List<String> fruits = new ArrayList<>();

		        // Add elements to the ArrayList
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Cherry");
		        fruits.add("Banana");

		        // Print the ArrayList
		        System.out.println("Fruits: " + fruits);

		        // Access an element from the ArrayList
//		        String fruit = fruits.get(1);
//		        System.out.println("The fruit at index 1 is: " + fruit);

//		        // Update an element in the ArrayList
//		        fruits.set(1, "Blueberry");
//		        System.out.println("After updating, Fruits: " + fruits);

//		        // Remove an element from the ArrayList
//		        fruits.remove(2);
//		        System.out.println("After removing the element at index 2, Fruits: " + fruits);

//		        fruits.remove("Banana");
//		        System.out.println("After removing the Fruits: " + fruits);
//		        fruits.removeIf(f ->f.equals("Banana"));
//		        System.out.println("After removing the Fruits: " + fruits);

		        
		        
		        // Create a list of elements to be removed
		        List<String> toRemove = Arrays.asList("Banana", "Cherry");
		        // Remove all instances of the elements in toRemove
		        fruits.removeAll(toRemove);
		        System.out.println(fruits);
//		        // Get the size of the ArrayList
//		        int size = fruits.size();
//		        System.out.println("The size of the ArrayList is: " + size);

//		        // Iterate through the ArrayList using a for loop
		        /*System.out.println("Iterating through the ArrayList:");
		        for (int i = 0; i < fruits.size(); i++) {
		            System.out.println(fruits.get(i));
		        }*/
//
//		        // Iterate through the ArrayList using a for-each loop
		    /*    System.out.println("Iterating through the ArrayList using a for-each loop:");
		        for (String f : fruits) {
		            System.out.println(f);
		        }*/
//
//		        // Check if the ArrayList contains a specific element
//  	        boolean containsApple = fruits.contains("Apple");
//		        System.out.println("Does the ArrayList contain 'Apple'? " + containsApple);

//		        // Clear the ArrayList
//		        fruits.clear();
//		        System.out.println("After clearing, Fruits: " + fruits);
		        
		       /* int i = fruits.indexOf("Banana");
		        System.out.println("position is: " + i);
		        
		        
		        int i2 = fruits.lastIndexOf("Banana");
		        System.out.println("last position is: " + i2);
		        */
		       // fruits.forEach(f->System.out.println(f));
		        
		   //     fruits.forEach(System.out::println);
		    }
		

	

}
