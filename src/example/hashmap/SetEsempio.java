package example.hashmap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEsempio {
	public static void main(String[] args) {
//	// HashSet
//		Set<String> set = new HashSet<String>();
//		
//		set.add("ciao");
//		set.add("mondo");
//		set.add("ciao");
//
//		for (String s : set)
//			System.out.println(s);
//	//il primo elemento, ossia "ciao", è sovrascritto dal terzo

//	// TreeSet
//		TreeSet<Integer> tree = new TreeSet<Integer>();
//		tree.add(12);
//		tree.add(63);
//		tree.add(34);
//		tree.add(45);
//
//		Iterator<Integer> iterator = tree.iterator();
//		System.out.print("Contenuto di TreeSet: ");
//
//		while (iterator.hasNext()) {
//			Integer h1 = iterator.next();
//			System.out.print(h1 + " ");
//		}
////	
//////	for (Integer i : tree) {
//////		System.out.println(i);
//////	}
////	
////	
//////	System.out.println();
//////	//visualizzati ordinati
////
		// LinkedHashSet
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();

		lhset.add("Z");
		lhset.add("PQ");
		lhset.add("N");
		lhset.add("O");
		lhset.add("KK");
		lhset.add("FGH");

		System.out.println("valori inseriti dentro il LinkedHashSet" + lhset);
		System.out.println(lhset);
		// stampati secondo l ordine di inserimento
	}
}
