package example.patternabstractfactory;

public class CommessoTennis implements Commesso{

	@Override
	public Scarpa getScarpa() {	
		return new ScarpaTennis();
	}

	@Override
	public Borsa getBorsa() {
		return new BorsaTennis();
	}

}
