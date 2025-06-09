package example.patternsingleton;

public class Impiegato {

	private static final Impiegato unicaIstanza = new Impiegato();

	private String nome = "Pippo";

	private Impiegato() {
	}

	public static Impiegato getInstance() {

		return unicaIstanza;

	}

	public String getNome() {
		return nome;
	}
}
