package example.patternabstractfactory;

public class BorsaTennis implements Borsa{

	@Override
	public Borsa create() {
		System.out.println("Creazione borsa da tennis completata");
		return this;
	}

	

	

}
