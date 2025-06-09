package example.hashmap;

import java.util.*;

import example.comparator.Country;

public class ProvaCollection {

	public static void main(String[] args) {

		
	
//		
//		List<String> l1 = new ArrayList<>();
//
//		l1.add("primo");
//		l1.add("secondo");
//		l1.add("terzo");
//
//		for (String s : l1)
//			System.out.println(s);
//		
//		
//
//		// LinkedList
//		List<String> l = new LinkedList<>();
//
//		l.add("primo");
//		l.add("secondo");
//		l.add("terzo");
//
//		for (String s : l)
//			System.out.println(s);
//		
//		
//
//		// TreeMap
//		Map<Integer, String> map1 = new TreeMap<Integer, String>();
//		map1.put(20, "ciao mamma");
//		String tmp = map1.get(20);
//		System.out.println(tmp);
		
//		Map<String, String> map = new TreeMap<String, String>();
//		map.put("Nome", "Mario");
//		map.put("Cognome", "Rossi");
//		map.put("Cognome", "RossiBis");
//		map.put("Email", "pagano@hotmail.it");
//		map.put("Numero", "123456789");
//		map.put("Email3", "sdfsdfsd@jkj.it");
//		
////		for (String s : map.values())
////			System.out.println(s);
//		
//		for (String s : map.keySet())
//			System.out.println(s);
//
//		String g = map.get("Email3");

////		// ordinamento su una classe Country
//		Country germany = new Country("Germany", 357021, 81305856);
//		Country french = new Country("French", 547030, 65630692);
//		Country unitedKingdom = new Country("United Kingdom", 244820, 63047162);
//		Country italy = new Country("Italy", 301230, 61261254);
		Country spain = new Country("Spain", 504851, 47042984);
System.out.println(spain.hashCode());
Map<Country, String> mapO = new HashMap<Country, String>();
map0.put(spain, "ciao");

//

////		
//		Map<Country, String> mapO = new TreeMap<Country, String>();
//		mapO.put(germany, "GERMANIA");
//		mapO.put(french, "FRANCIA");
//		mapO.put(unitedKingdom, "GRAN BRETAGNA");
//		mapO.put(italy, "ITALIA");
//		mapO.put(spain, "SPAGNA");
////		
//		for (Country item : mapO.keySet()) {
//			System.out.println(item);
//		}
//		
//		
		
		
		//hashtable
		Hashtable<String, String> hashtable = 
        new Hashtable<String, String>();


hashtable.put("Key1","Pippo");
hashtable.put("Key2","Pluto");
hashtable.put("Key3","Paperino");
hashtable.put("Key4","Qui");
hashtable.put("Key5","Quo");
hashtable.put("Key1","qua");   

System.out.println(hashtable.get("Key1"));// stampa Pippo--> qua
System.out.println(hashtable.get("Key5"));// stampa Quo


hashtable.put("Key5","Zio Paperone");// è gia presente la chiave Key5,  il valore Quo
//viene sovrascitto con Zio Paperone


System.out.println(hashtable.get("Key5"));// stampa Zio Paperone	
		
		
		
//
//		// linkedHashMap
//		// vengono visualizzate in base all inserimento
//		Map<String, Double> linkedHashMap = new LinkedHashMap<String, Double>();
//		linkedHashMap.put("Apple", new Double(91.98));
//		linkedHashMap.put("Sony", new Double(16.76));
//		linkedHashMap.put("Dell", new Double(30.47));
//		linkedHashMap.put("HP", new Double(33.91));
//		linkedHashMap.put("IBM", new Double(181.71));
//		
//		Double h = linkedHashMap.get("Sony");
//
//        System.out.println("Valori inseriti nella mappa : ");
//        for (String key : linkedHashMap.keySet()) {
//                System.out.println(key + ":\t" + linkedHashMap.get(key));
//        }
 
//
////		// HashSet
//		Set<String> set = new HashSet<String>();
//		set.add("ciao");
//		set.add("mondo");
//		set.add("ciao");
//
//		for (String s : set)
//			System.out.println(s);
////		//il primo elemento, ossia "ciao", è sovrascritto dal terzo
//
////		// TreeSet
//		TreeSet<Integer> tree = new TreeSet<Integer>();
//		tree.add(12);
//		tree.add(63);
//		tree.add(34);
//		tree.add(45);
//	 
//		
//		Iterator<Integer> iterator = tree.iterator();
//		System.out.print("Contenuto di TreeSet: ");
//	 
//
//		while (iterator.hasNext()) {
//			Integer h1 = iterator.next();
//			System.out.print(h1 + " ");
//		}
//		
////		for (Integer i : tree) {
////			System.out.println(i);
////		}
//		
//		
////		System.out.println();
////		//visualizzati ordinati
//
		// LinkedHashSet
//		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
//
//
//	         lhset.add("Z");
//	         lhset.add("PQ");
//	         lhset.add("N");
//	         lhset.add("O");
//	         lhset.add("KK");
//	         lhset.add("FGH");
//	         
//	         System.out.println("valori inseriti dentro il LinkedHashSet"+lhset);
//	         System.out.println(lhset);
		// stampati secondo l ordine di inserimento

	}

}
