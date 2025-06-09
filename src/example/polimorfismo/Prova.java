package example.polimorfismo;

import example.javabase.PrimoGiorno;

public class Prova {
	
	public static void faiVerso(Animale l) {
		l.emettiVerso();
	}

	public static void main(String[] args) {

		Leone l1 = new Leone();

		faiVerso(l1);

		Mucca m = new Mucca();
		faiVerso(m);

		Cavallo c = new Cavallo();
		faiVerso(c);

		System.out.println("-------------------");

		 Animale[] arrayAnimali = new Animale[5];
		 
		 arrayAnimali[0] = new Mucca();
		 arrayAnimali[1] = new Mucca();
		 arrayAnimali[2] = new Cavallo();
		 arrayAnimali[3] = new Mucca();
		 arrayAnimali[4] = new Leone();
		 
		 
		 
	
		 for(Animale e: arrayAnimali)
			 e.emettiVerso();          
		 
		 
		 
		 
		 
		 
		//

		// chiamata di un metodo che appartiene solo al figlio
//		 Animale muc = new Mucca();
//		 muc.emettiVerso(1); //errore compilazione, metodo non visibile

	}

}
