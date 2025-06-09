package generics;

public class ClasseGenerica<T> {
	
	private T campo;

	public T getCampo() {
		return campo;
	}

	public void setCampo(T campo) {
		this.campo = campo;
	}
	
	public static void main(String[] args) {
		ClasseGenerica<String> type = new ClasseGenerica<>();
		
		
		type.setCampo("CIAO"); 
		System.out.println(type.getCampo());
		
		//Integer f = type.getCampo();

		
		ClasseGenerica<Integer> typeDUe = new ClasseGenerica<>();
		typeDUe.setCampo(23); 
		System.out.println(type.getCampo());
		
		
		
		ClasseGenerica type1 = new ClasseGenerica(); 
		type1.setCampo(10); 
		System.out.println(type1.getCampo());
		String r = (String) type1.getCampo();
		
		
		
		
		Impiegato i = new Impiegato();
		i.setNome("Antonio");
		ClasseGenerica<Impiegato> type2 = new ClasseGenerica<>(); 
		type2.setCampo(i); 
		Impiegato a = (Impiegato) type2.getCampo();
		System.out.println(a.getNome());
		
		
		
		
	}

}
