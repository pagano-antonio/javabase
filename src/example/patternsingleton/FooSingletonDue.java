package example.patternsingleton;

public class FooSingletonDue {
	private static FooSingletonDue fooSingleton;

	public static FooSingletonDue getIstance() {
		if (fooSingleton == null) {
			synchronized (FooSingletonDue.class) {
				if (fooSingleton == null) {
					fooSingleton = new FooSingletonDue();
				}

			}
		}
		return fooSingleton;

	}
}
