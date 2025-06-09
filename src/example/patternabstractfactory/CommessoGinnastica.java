package example.patternabstractfactory;

public class CommessoGinnastica implements Commesso{

	@Override
	public Scarpa getScarpa() {
		return new ScarpaGinnastica();
	}

	@Override
	public Borsa getBorsa() {
		return new BorsaGinnastica();
	}

}
