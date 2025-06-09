package patternsingleton;

public class Prova {

	//lazy singleton
	//altro modo di creare il singleton
	//https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
	
	private static Prova x; // riferimento all' istanza

	private Prova() {
	}// costruttore

	public static Prova getIstance() {
		if (x == null)
			x = new Prova();
		return x;
	}

	public void metodo() {
	}

	public static void main(String[] args) {
		Prova sg1 = Prova.getIstance(); // Crea l' stanza
		sg1.metodo();

		Prova sg2 = Prova.getIstance(); // Ritorna il riferimento
		sg2.metodo();

		// sg1 e sg2 puntanto allo stesso oggetto
	}

}
