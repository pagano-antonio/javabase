package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClassiCustom {

	public static void main(String[] args) {
		
		List<Person> tmp = new ArrayList<>();
		
		Person p = new Person("antonio", 18);
		Person p1 = new Person("giuseppe", 28);
		Person p2 = new Person("nino", 28);
	
		tmp.add(p);
		tmp.add(p1);
		tmp.add(p2);
		
		// System.out.println("Contenuto: " + tmp);
		
        Person p5 = tmp.get(1);
       // System.out.println(p5);
        
        tmp.set(1, new Person("andrea",30));
        //System.out.println("After updating,  " + tmp);

       // tmp.remove(2);
     //   System.out.println("Contenuto: " + tmp);
        
        
       // tmp.remove( new Person("andrea",30));
        
       // tmp.removeIf(f ->f.getAge() > 25);
        
        
        
        //boolean containsApple = tmp.contains(new Person("andrea",30));
        
        int i = tmp.indexOf(new Person("andrea",30));
        System.out.println("Contenuto: " + i);
        
        
        
	}

}
