package example.comparator;

public class Docente implements Comparable{

	private String nome;
	private String cognome;
	private int eta;
	
	
	@Override
	public String toString() {
		return "Docente [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + eta;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Docente other = (Docente) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (eta != other.eta)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	public Docente(String nome, String cognome, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
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
	public Docente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
	@Override
	public int compareTo(Object o) {
		Docente d = (Docente) o;
		
		//int res = d.eta -this.eta;
		int res = this.eta-d.eta;
		
		return res;
	}
	
	
	
}
