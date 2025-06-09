package collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkdListEsempi {

	public static void main(String[] args) {
		 List<String> linkedList = new LinkedList<>();

	     // Adding elements
	     linkedList.add("Java");
	     linkedList.add("Python");
	     linkedList.add("C++");

	     // Adding element at the beginning
	     linkedList.add(1, "JavaScript");

	     // Removing first element
	     linkedList.remove(0);

	     // Iterating over elements
	     for (String language : linkedList) {
	         System.out.println(language);
	     }

	}

     
     
}
}
