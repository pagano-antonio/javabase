package example.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDocente {

	public static void main(String[] args) {
		
		Docente d = new Docente("antonio", "pagano",48);
		Docente d1 = new Docente("giovanni", "bernini",59);
		Docente d3 = new Docente("leo", "da vicni",59);
		Docente d2 = new Docente("otello", "russo",22);
		
		
		List<Docente> l = new ArrayList<>();
		l.add(d);
		l.add(d1);
		l.add(d2);
		l.add(d3);
		
		System.out.println(l);
		
		
		//Collections.sort(l);
		Collections.sort(l, Collections.reverseOrder());
		
		System.out.println(l);
		
		
		
		
		
		Collections.sort(l, new DocenteNomeComparator());
		System.out.println(l);
		
		
		Collections.sort(l, new DocenteCognomeComparator());
		System.out.println(l);	
		
	}

}
