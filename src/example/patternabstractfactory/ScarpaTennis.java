package example.patternabstractfactory;

public class ScarpaTennis implements Scarpa{

	@Override
	public Scarpa create() {
		System.out.println("Creazione scarpe da tennis completata");
		return this;
	}	

}
