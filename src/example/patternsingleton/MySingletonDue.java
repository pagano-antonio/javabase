package example.patternsingleton;

public class MySingletonDue {
	
	private static MySingletonDue mySingleton = new MySingletonDue();

	public static MySingletonDue getInstance() {
		return mySingleton;
	}

	private MySingletonDue() {
		System.out.println("Singleton instanziata! hashcode: " + hashCode());
	}
	

}
