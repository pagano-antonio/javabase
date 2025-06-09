package esempio.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEsempi {
	public static void main(String[] args) {
		Persona p = new Persona();
		p.setCognome("Pippo");
		Persona p1 = new Persona();
		p1.setCognome("Pluto");
		
		Persona[] tmp1 = new Persona[4];
		
		
		List<Persona> tmp = new ArrayList<>();
		
		tmp.add(p); 
		tmp.add(p1);
		
		Persona r = tmp.get(0);//tmp[0]
		System.out.println(r.getCognome());
		
		
		for(int i=0; i<tmp.size(); i++) {
			Persona q = tmp.get(i);
			System.out.println(q.getCognome());
		}
		
		
		
		for (Persona g : tmp) {
				System.out.println(g.getCognome());		
		}
		
	}
}
