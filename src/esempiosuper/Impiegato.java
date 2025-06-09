package esempiosuper;

class Persona {
	
	String nome;
	String cognome;
	int matricola;
	
	String codiceFiscale() {
		return nome + cognome;
	}
	
	Persona(String n, String c){
		nome = n;
		cognome = c;
	}
	
	Persona(){

	}
	
}

public class Impiegato extends Persona {

	int matricola;
	
	
	public Impiegato() {
		super("rossi","mario");
		System.out.println("ciao");
		
	}
	
	
	
	String codiceFiscale() {
		String t = super.codiceFiscale();
		return t + matricola;
	}
	
	public void stampaInfo() {
		int nweMatricola = matricola + super.matricola;
		
		
		System.out.println("nome:" + super.nome);
		System.out.println("cognome:" + super.cognome);
		System.out.println("codice Fiscale:"+super.codiceFiscale());
	}

}
