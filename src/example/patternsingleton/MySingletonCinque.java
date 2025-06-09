package example.patternsingleton;

import java.util.Hashtable;

public class MySingletonCinque {
	public static final MySingletonCinque mySingleton = new MySingletonCinque();
    private final Hashtable hash = new Hashtable();
    private MySingletonCinque()  {
        hash.put("1", "1");
        System.out.println("Singleton instanziato! hashcode: " + hashCode() );
    }
    public Hashtable getHash() {
        return hash;
    }
    
    public static void main(String[] args) {
        System.out.println("Hash originario: "+MySingletonCinque.mySingleton.getHash().get("1"));
        MySingletonCinque.mySingleton.getHash().put("1", "2");
        System.out.println("Hash modificato: "+MySingletonCinque.mySingleton.getHash().get("1"));

	}
    
}
