package collection.list;

import java.util.ArrayList;
import java.util.List;

public class OperazioniAvanzate {

	public static void main(String[] args) {
		List<String> primaLista = new ArrayList<>();
		primaLista.add("Apple");
		primaLista.add("Banana");
		primaLista.add("Cherry");

//		// Adding a collection of elements
//		List<String> secondaLista = new ArrayList<>();
//		secondaLista.add("Mango");
//		secondaLista.add("Orange");
//		primaLista.addAll(secondaLista);
//		System.out.println("List after adding more fruits: " + primaLista);

		// Removing a collection of elements
//		List<String> secondaLista = new ArrayList<>();
//		secondaLista.add("Apple");
//		secondaLista.add("Orange");
//		
//		primaLista.removeAll(secondaLista);
//		System.out.println("List after removing some fruits: " + primaLista);

//		// Clearing the list
//		primaLista.clear();
//		System.out.println("List after clearing: " + primaLista);


//
//		// Getting the index of an element
//		primaLista.add("Banana");
//		primaLista.add("Banana");
//		System.out.println("Index of 'Banana': " + primaLista.indexOf("Banana"));
//		System.out.println("Last index of 'Banana': " + primaLista.lastIndexOf("Banana"));

//		// Getting a sublist
		primaLista.add("Banana");
		List<String> sublist = primaLista.subList(1, 3);
		System.out.println("Sublist from index 1 to 3: " + sublist);
	}
}
