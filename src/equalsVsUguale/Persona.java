package equalsVsUguale;

public class Persona {
	private String nome;
	private String cognome;

	public Persona(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}

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

	public static void main(String[] args) {
		
		Persona p = new Persona("pippo", "rossi");
		Persona p1 = new Persona("pippo", "rossi");
		
		
		
		
//System.out.println("valore di p:"+p);
//System.out.println("valore di p1:"+p1);
//		if (p == p1)
//			System.out.println(" sono uguali");
//		else
//			System.out.println("diversi");
		
		if (p.equals(p1))
			System.out.println("equals sono uguali");
		else
			System.out.println("equals diversi");

	}

	@Override
	public boolean equals(Object obj) {

		
		
		if(obj instanceof Persona)
		{
			Persona p = (Persona)obj;
			if(p.getNome().equals(nome) && p.getCognome().equals(cognome)) {
				return true;
			}
		}
		
		return false;
	}

	

}
