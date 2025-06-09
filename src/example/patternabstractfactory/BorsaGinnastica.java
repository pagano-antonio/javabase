package example.patternabstractfactory;

public class BorsaGinnastica implements Borsa{

	@Override
	public Borsa create() {
		System.out.println("Creazione borsa da ginnastica completata");
		return this;
	}

	

	
}
