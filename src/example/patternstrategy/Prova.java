package example.patternstrategy;

import java.util.List;

public class Prova {

	public static void main(String[] args) {
		ElementList contextElements = new ElementList();
		contextElements.addElement(new int[] { 3, 2, 4, 3, 6, 5 });
		contextElements.setSortAlgorithm(new BubbleSortAlgorithm());
		List sortedList = contextElements.getSortedList();
	}

}
