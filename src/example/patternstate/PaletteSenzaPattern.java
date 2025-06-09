package example.patternstate;

public class PaletteSenzaPattern {
	
	private String nomeColore;
	
	public void settaColore(String nomCol) {
		nomeColore = nomCol;
	}
	
	
	
	public void currentColor() {
		String hex=null;
		
		if(nomeColore.equals("RED"))  // REDCOLOR
			hex = "000345";
		if(nomeColore.equals("WHITE"))// WHITECOLOR
			hex = "2534534";		
		if(nomeColore.equals("BLACK"))// BLACK COLOR
			hex = "666666666";
	
		
		
		System.out.println("il codice esadecimale del colore è:"+hex);
	}
	
	
	
	
	
	

	
	

}
