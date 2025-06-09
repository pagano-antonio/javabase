package collection.operazionibase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestDue {

	public static void main(String[] args) {

		Collection<String> list = new ArrayList<>();

		String[] names = { "Anna", "Bob", "Carol", "David", "Edna" };
		list.addAll(Arrays.asList(names));
		System.out.println(list);

		list.add("Fred");
		list.addAll(Arrays.asList("George", "Gary", "Grace"));
		System.out.println(list);

		list.removeIf(s -> s.charAt(0) == 'G');
		System.out.println(list);
		System.out.println("Gary is in the list? " + list.contains("Gary"));
//        list.sort();

		// Collections.fill
		// utilizzato per sostituire tutti gli elementi di una lista specificata con un
		// elemento specificato.
		List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
		Collections.fill(list, "filled");
		System.out.println("Collections.fill: " + list);

		// Collections.nCopies
		List<String> copies = Collections.nCopies(5, "copy");
		System.out.println("Collections.nCopies: " + copies);

		// Collections.copy
		List<String> dest = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
		List<String> src = new ArrayList<>(Arrays.asList("x", "y", "z"));
		Collections.copy(dest, src);
		System.out.println("Collections.copy: " + dest);

		// List.copyOf
		List<String> original = new ArrayList<>(Arrays.asList("original1", "original2"));
		List<String> copyOfList = List.copyOf(original);
		System.out.println("List.copyOf: " + copyOfList);

		// Collections.addAll
		List<String> addAllList = new ArrayList<>();
		Collections.addAll(addAllList, "element1", "element2", "element3");
		System.out.println("Collections.addAll: " + addAllList);

		// Collections.shuffle
		List<Integer> shuffleList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Collections.shuffle(shuffleList);
		System.out.println("Collections.shuffle: " + shuffleList);

		// Collections.reverse
		Collections.reverse(shuffleList);
		System.out.println("Collections.reverse: " + shuffleList);

		// Sorting with Comparator
		List<Card> cards = new ArrayList<>();
		cards.add(new Card("Ace", "Spades"));
		cards.add(new Card("King", "Hearts"));
		cards.add(new Card("Queen", "Diamonds"));
		cards.add(new Card("Jack", "Clubs"));

		var sortingAlgorithm = Comparator.comparing(Card::getRank).thenComparing(Card::getSuit);
		Collections.sort(cards, sortingAlgorithm);
		System.out.println("Collections.sort with Comparator: " + cards);

		// Collections.indexOfSubList
		List<Integer> mainList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		List<Integer> subList = Arrays.asList(3, 4);
		int index = Collections.indexOfSubList(mainList, subList);
		System.out.println("Collections.indexOfSubList: " + index);

		// Collections.disjoint
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		boolean disjoint = Collections.disjoint(list1, list2);
		System.out.println("Collections.disjoint: " + disjoint);

		// Collections.binarySearch
		List<Integer> sortedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		int pos = Collections.binarySearch(sortedList, 3);
		System.out.println("Collections.binarySearch: " + pos);

		// Collections.replaceAll
		List<String> replaceList = new ArrayList<>(Arrays.asList("apple", "banana", "apple"));
		Collections.replaceAll(replaceList, "apple", "orange");
		System.out.println("Collections.replaceAll: " + replaceList);

		// Collections.frequency
		int frequency = Collections.frequency(replaceList, "orange");
		System.out.println("Collections.frequency: " + frequency);

		// Collections.rotate
		List<Integer> rotateList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Collections.rotate(rotateList, 2);
		System.out.println("Collections.rotate: " + rotateList);

		synchronizedList();

		CopyOnWriteArrayList();

	}

	static void CopyOnWriteArrayList() {
		CopyOnWriteArrayList<String> cowArrayList = new CopyOnWriteArrayList<>();

		// Adding elements to the CopyOnWriteArrayList
		cowArrayList.add("one");
		cowArrayList.add("two");
		cowArrayList.add("three");

		System.out.println("CopyOnWriteArrayList: " + cowArrayList);

		// Iterating over the CopyOnWriteArrayList
		for (String s : cowArrayList) {
			System.out.println(s);
		}

		// Modifying the CopyOnWriteArrayList during iteration
		for (String s : cowArrayList) {
			if ("two".equals(s)) {
				cowArrayList.add("four");
			}
			System.out.println("Element: " + s);
		}

		System.out.println("Modified CopyOnWriteArrayList: " + cowArrayList);
	}

	static void synchronizedList() {
		List<String> list = new ArrayList<>();
		List<String> synchronizedList = Collections.synchronizedList(list);

		// Adding elements to the synchronized list
		synchronizedList.add("one");
		synchronizedList.add("two");
		synchronizedList.add("three");

		System.out.println("Synchronized List: " + synchronizedList);

		// Accessing elements of the synchronized list
		synchronized (synchronizedList) {
			for (String s : synchronizedList) {
				System.out.println(s);
			}
		}
	}

}
