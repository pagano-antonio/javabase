package patternfacade;

import java.util.Iterator;

public class CasaFacade {

	int grandezzaCasa;
	int numeroPiani;
	
	
	public int preventivoLavori() {
		
		return 1;
	}
	
	public void costrusciCasa() {
		
		int numMuratori = grandezzaCasa * numeroPiani/10;
		int numIdraulici = numeroPiani;
		int numElettricisti = numeroPiani;
		
		Muratore[] arrayMuratori = new Muratore[numMuratori] ;
		Idraulico[] arrayIdraulici = new Idraulico[numIdraulici] ;
		Elettricista[] arrayElettricisti = new Elettricista[numElettricisti] ;
		
		for (int i = 0; i < arrayMuratori.length; i++) {
			arrayMuratori[i] = new Muratore();
			arrayMuratori[i].costruisciCasa();
		}
		
		for (int i = 0; i < arrayIdraulici.length; i++) {
			arrayIdraulici[i] = new Idraulico();
			arrayIdraulici[i].costruisciCasa();
		}
		
		for (int i = 0; i < arrayElettricisti.length; i++) {
			arrayElettricisti[i] = new Elettricista();
			arrayElettricisti[i].costruisciCasa();
		}
		
		
	}
	
	public int getGrandezzaCasa() {
		return grandezzaCasa;
	}
	public void setGrandezzaCasa(int grandezzaCasa) {
		this.grandezzaCasa = grandezzaCasa;
	}
	public int getNumeroPiani() {
		return numeroPiani;
	}
	public void setNumeroPiani(int numeroPiani) {
		this.numeroPiani = numeroPiani;
	}
	
	
}
