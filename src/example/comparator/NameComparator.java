package example.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Country> {

	@Override
	public int compare(Country o1, Country o2) {
		int result;
		result = o1.getName().compareTo(o2.getName());
		
		
		
		return result;
	}

}
