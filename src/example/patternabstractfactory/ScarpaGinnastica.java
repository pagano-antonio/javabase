package example.patternabstractfactory;

public class ScarpaGinnastica implements Scarpa{

	@Override
	public Scarpa create() {
		 System.out.println("Creazione scarpe da ginnastica completata");
		return this;
	}

}
