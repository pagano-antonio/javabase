package example.passaggioparametri;

import downupcasting.Impiegato;

public class provatre {
	
	public int hello(int x) {
		x++;
		return x;
	}
	
	public void helloD(int x) {
		x++;
		
	}

	public void helloImpiegato(Impiegato x) {
		
		x.setNome("pippo");

	}
	public void helloImpiegatoDue(Impiegato x) {
	
		x.setNome("pippo");
		x = new Impiegato();
		x.setNome("pluto");
	
	}
	

}
