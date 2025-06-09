package example.hashmap;

import java.util.HashMap;

public class ProvaMap {

	public static void main(String[] args) {
		
		
	//primo esempio	
//		HashMap<Integer, Persona> mappa1 = new HashMap<Integer, Persona>();
//		
//		
//		mappa1.put(21, new Persona("vasco", 23));
//		mappa1.put(22, new Persona("pluto", 256));
//		
//		mappa1.get(21);

//		
//	
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		Persona tmp = mappa1.get(22);
//		
//		System.out.println(tmp.getNome());		
		
		
		
		
////		
////		
////		
////		
//		Integer key = 21;
//		String value1 = mappa1.get(key);
//		System.out.println("Key: " + key +" value1: "+ value1);
//		mappa1.put(21, "ciaoooo");
//		System.out.println(" value1: "+ mappa1.get(21));
		
		

//	
////		//ESEMPIO COLLISIONE
		Persona p1 = new Persona("mario",1);
		Persona p2 = new Persona("gino",2);
		Persona p3 = new Persona("flavio",1);// viene messo lo stesso id di p1, l hashcode per 
											// come definito ritorna l id.
	
		Persona p4 = new Persona("vasco",1);
		
		HashMap<Persona, String> mappa = new HashMap<Persona, String>();
		
		mappa.put(p1, "ONE");
		mappa.put(p2, "TWO");
		mappa.put(p3, "THREE");
		mappa.put(p4, "FOUR");

		// l esecuzione fino a questo punto fa apparire OUTPUT
//				chiamato hashCode per =1.mario  --> inserisce p1 put(p1, "ONE")
//				chiamato hashCode per =2.gino  ---> inserisce p2  put(p2, "TWO");
//				chiamato hashCode per =1.flavio  -->  cerca di inserire p3 put(p3, "THREE") MA si rende conto che c è la coppia  (p1, "ONE") nella stessa locazione con hash =1. 
				// non sa se sovrascrivere o meno, cioe se è lo stessa coppia o no.
//				called equals on =1.flavio  to compare with  = 1.mario --> per capirlo chiama equals
//		
		 System.out.println("------------------------------");
		 
		 Persona p1bis = new Persona("vasco",1);
		String value =  mappa.get(p1bis);
		
		
		//System.out.println(mappa.keySet());
		 System.out.println(" value: "+ value);
		 //OUTPUT
//		 		chiamato hashCode per =1.mario
//				 called equals on =1.mario  to compare with  = 1.mario
//				  value: ONE
// 	se uso lo stesso oggetto p1  e l hashmap trova subito lo stesso oggetto p1 non chiama  equals,  perche riconosce i puntamenti
		 
 
		 
		
	}

}
