package example.patternsingleton;

public class FooSingleton {
	private static FooSingleton fooSingleton;

	public static FooSingleton getIstance() {
		
			synchronized (FooSingleton.class) {
				if (fooSingleton == null) {
					fooSingleton = new FooSingleton();
				}
				return fooSingleton;
			}

		

	}
	
}
