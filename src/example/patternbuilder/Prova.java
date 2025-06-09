package example.patternbuilder;

import java.sql.Date;

public class Prova {
	public static void main(String[] args) {
		Seminario r = new Seminario();
		
		SeminarioBuilder bestPracticeBuilder = new SeminarioBuilder("Java best practice");
		
		bestPracticeBuilder.setLuogo(Seminario.Luogo.SEDE);
		bestPracticeBuilder.setData(new Date(4562112));
		bestPracticeBuilder.setGiorniPromemoria(10);
		bestPracticeBuilder.setNumeroPartecipanti(2);
		bestPracticeBuilder.setDurataInOre(3);
		bestPracticeBuilder.setNumeroMassimoPartecipanti(3);

		Seminario bestPractice = bestPracticeBuilder.build();
		
		
	
		

	}
}
