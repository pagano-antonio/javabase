package example.patternsingleton;

public class ImpiegatoDue {
	
	private static ImpiegatoDue unicaIstanza;
	
	private String nome = "Pippo";
	
	private ImpiegatoDue() {
	}
	
	public static synchronized ImpiegatoDue getInstance() {
		
		if ( unicaIstanza == null )
			unicaIstanza = new ImpiegatoDue();
		
		return unicaIstanza;

	}

	
	
	public String getNome() {
		return nome;
	}
}
