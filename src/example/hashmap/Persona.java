package example.hashmap;

public class Persona {
	private String nome;
	private int id;
	
	
	public Persona(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	public String getNome() {
	
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public int hashCode() {
		
		System.out.println("chiamato hashCode per ="+ id+"."+nome);
		return id;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("called equals on ="+ id+"."+nome +  "  to compare with  = "+ ((Persona)obj).getId() + "."+ ((Persona)obj).getNome());
		
		if( ((Persona)obj).getId() == id  && ((Persona)obj).getNome().equals(nome) )
							return true;
		return false;
	}
	
	

}
