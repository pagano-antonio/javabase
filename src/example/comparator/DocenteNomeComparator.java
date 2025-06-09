package example.comparator;

import java.util.Comparator;

public class DocenteNomeComparator implements Comparator<Docente>{

	@Override
	public int compare(Docente o1, Docente o2) {
		
		int res = o1.getNome().compareTo(o2.getNome());
		
		return res;
	}

}
