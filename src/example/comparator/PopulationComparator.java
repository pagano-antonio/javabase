package example.comparator;

import java.util.Comparator;

public class PopulationComparator implements Comparator<Country> {

	@Override
	public int compare(Country o1, Country o2) {
		int result;
		result = o1.getPopulation() - o2.getPopulation();
		
	
		return result;
	}
}

