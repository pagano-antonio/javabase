package collection.operazionibase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Element");
		list.add("Element1");
		list.add("Element2");
		list.add("Element3");

		list.remove("Element");
		boolean f = list.contains("Elej");
		
		//list.clear();//delete all
		
		int size = list.size(); 
		
		
		System.out.println("--for each--");
		//for each
		for (String element : list) {
			  System.out.println(element);
			}
		
		//stream
		System.out.println("--stream--");
		list.stream().forEach(System.out::println);
		
		
		list.forEach(System.out::println);
		
		System.out.println("--iterator--");
		//iterator
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
		  String element = iterator.next();
		  System.out.println(element);
		}
		
		

	
		//ListIterator
		System.out.println("--ListIterator--");
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
		  System.out.println(listIterator.next());
		}
		
	
	}
}
