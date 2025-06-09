package example.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProvaComp {
	public static void main(String[] args) {

		List<Country> myCountryList = new ArrayList<Country>();

		Country germany = new Country("Germany", 357021, 81305856);
		Country french = new Country("French", 547030, 65630692);
		Country unitedKingdom = new Country("United Kingdom", 244820, 63047162);
		Country italy = new Country("Italy", 301230, 61261254);
		Country spain = new Country("Spain", 504851, 47042984);

		myCountryList.add(germany);
		myCountryList.add(french);
		myCountryList.add(unitedKingdom);
		myCountryList.add(italy);
		myCountryList.add(spain);

//		//ORDINAMENTO PER area
		int res = germany.compareTo(unitedKingdom);
		System.out.println(res);
////		
//		int res1 = unitedKingdom.compareTo(italy);
//		System.out.println(res1);
		
		
//		System.out.println("ORDINAMENTO PER AREA:");
		//Collections.sort(myCountryList);
		Collections.sort(myCountryList, Collections.reverseOrder());
		
		System.out.println(myCountryList);
		
//		
//
//		for (Country item : myCountryList) {
//			System.out.println(item.getName());
//		}
//
//		System.out.println("---------------------------------------------------------");
//
//////	//ORDINAMENTO PER POPOLAZIONE:
//	System.out.println("ORDINAMENTO PER POPOLAZIONE:");
//	Collections.sort(myCountryList, new PopulationComparator());
//	
//	Collections.sort(myCountryList);
//
//	for (Country item : myCountryList) {
//		System.out.println(item.getName());
//	}
//	System.out.println("---------------------------------------------------------");
//
//
//		
//
////ORDINAMENTO INVERSO PER POPOLAZIONE:
//		 System.out.println("ORDINAMENTO INVERSO PER POPOLAZIONE :");
//		Collections.sort(myCountryList, Collections.reverseOrder(new PopulationComparator()));
//
//		for (Country item : myCountryList) {
//			System.out.println(item.getName());
//		}
//

	}

}
