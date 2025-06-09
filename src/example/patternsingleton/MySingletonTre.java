package example.patternsingleton;

public class MySingletonTre {
	private static MySingletonTre mySingleton = null;
	   public static MySingletonTre getInstance(){
	       if ( mySingleton == null )
	           mySingleton = new MySingletonTre();
	       return mySingleton;
	   }
	   private MySingletonTre(){
	       System.out.println("Singleton instanziato! hashcode: " + hashCode() );
	   }
}
