package example.passaggioparametri;

import downupcasting.Impiegato;

public class Test {
	public static void main(String[] args) {

		provatre p = new provatre();
		

//		// per valore
//		int count = 15;
//		p.hello(count);
//		System.out.println(count);

		
		
		// per riferimento
		Impiegato tmp = new Impiegato();
		tmp.setNome("paperino")	;
		p.helloImpiegatoDue(tmp);
		System.out.println(tmp.getNome());
		
		


		

	}
}
