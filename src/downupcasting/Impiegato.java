package downupcasting;

public class Impiegato {

	String nome;
	String cognome;
	public int eta;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String dammiResidenza()
	{
		return "";
		
	}
	
	public static void main(String[] args) {

	Padre pippo = new Padre();
	System.out.println(pippo.count);
	
	
	}
}
