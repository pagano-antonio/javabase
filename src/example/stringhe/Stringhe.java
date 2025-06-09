package example.stringhe;

import java.util.ArrayList;
import java.util.List;

public class Stringhe {

	public String tmp="";
	public static void main(String[] args) {

		String s = "ciao";
		String c = "ciao";
		System.out.println(s == c);
		
		s = "hello";
		
	
		
//		
//		
//		
//		
//		String c1 = new String("ciao");
//		String d = new String("ciao");
//		
//		System.out.println(c1 == d); 
//		
//		
//		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(c));
//		System.out.println(System.identityHashCode(c1));
//		System.out.println(System.identityHashCode(d));
////		s = s+"ne";
////		
////		 s.replace("ci", "so");
//		
////		String tmp =  s.replace("ia", "ai");
////		 System.out.println(tmp);
	
		
//		List<int> r = new ArrayList<int>();
		List<Integer> r = new ArrayList<Integer>();
		
        Long x = new Long("42");
        
        
       // Long y = new Long(42);
        Long y = 42L;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));

        if(x == y)
        	System.out.println("numeri uguali");
        if(x.equals(y))
        	System.out.println("numeri uguali con equals");
        
        
//		 
//		 
//		 if(s == c)
//			 System.out.println("cccccc");
//		
//		System.out.println(s);

//		
		
		
		
	
		
		
		
		
		// il primo if è true perche s,c puntano alla stessa locazione
		// infatti gli indirizzi sono uguali (hashcode del OBJ da l indirizzo di
		// memoria, ma siccome String fa l override di hashcode uso System.identityHashCode che
		// richiama quello di OBJ)


	}

}
