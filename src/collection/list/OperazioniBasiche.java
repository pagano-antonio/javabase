package collection.list;

import java.util.ArrayList;
import java.util.List;

public class OperazioniBasiche {

	  public static void main(String[] args) {
		     List<Impiegato> listaImp = new ArrayList<>();
		     Impiegato  a = new Impiegato("antonio", "pagano");
		     Impiegato  b = new Impiegato("giovanni", "pagano");	
		     listaImp.add(a);
		     listaImp.add(b);
//		     System.out.println(listaImp);
		     
		     
	        List<String> fruits = new ArrayList<>();

	        // Adding elements
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");

//	        System.out.println(fruits);
	        // Getting element at index 0
        System.out.println("Element at index 1: " + fruits.get(0)); // Banana
//
	        // Setting element at index 2
//	        fruits.set(2, "Mango");
//	        System.out.println("Updated list: " + fruits);
//
//	        // Removing an element
//	        fruits.remove("Banana");
//	        System.out.println("List after removal: " + fruits);
	        
//	        Impiegato  c = new Impiegato("antonio", "pagano");
//	        listaImp.remove(c);
//	        System.out.println(listaImp);
//
//	        // Removing an element index i
//	        fruits.remove(0);
//	        System.out.println("List after removal: " + fruits);

//	        // Checking the size of the list
//	        System.out.println("Size of list: " + fruits.size());
//
//	        // Checking if the list contains a specific element
//	        System.out.println("Contains 'Apple': " + fruits.contains("Apple"));
//	        System.out.println("Contains 'BananaJoe': " + fruits.contains("BananaJoe"));
//
//	        // Checking if the list is empty
//	        System.out.println("Is list empty? " + fruits.isEmpty());
//	  
//	  
//	  
	  }


}
