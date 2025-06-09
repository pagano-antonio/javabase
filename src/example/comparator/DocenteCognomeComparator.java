package example.comparator;

import java.util.Comparator;

public class DocenteCognomeComparator implements Comparator<Docente>{

	@Override
	public int compare(Docente o1, Docente o2) {
		
		int res = o1.getCognome().compareTo(o2.getCognome());
		
		return res;
	}

}
