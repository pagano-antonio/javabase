package collection.set;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
    	
    	Set<Integer> tmp = new HashSet<>();
    	tmp.add(15);
    	tmp.add(30);
    	
    	tmp.add(15);
    	
    	System.out.println(tmp);
    	boolean h = tmp.contains(20);
    	System.out.println(h);
    	
    	for(Integer j: tmp) {
    		System.out.println(j);
    	}
    	
    	
    	
        Set<Person> hashSet = new HashSet<>();
        
        
        
        Person p = new Person("anto", 89);
        Person p1 = new Person("giuse", 18);
//        // Adding elements
        hashSet.add(p);
        hashSet.add(p1);
        hashSet.add(new Person("gianni", 50));
        hashSet.add(new Person("rocco", 12));
        
        boolean g = hashSet.contains(new Person("gianni", 50));
        System.out.println(g);
        System.out.println(hashSet);
//
//        // No guaranteed order in iteration
//        System.out.println("HashSet elements:");
//        for (Person fruit : hashSet) {
//            System.out.println(fruit);
//        }
    }
}
