package example.javabase;

import java.util.ArrayList;

public class PrimoGiorno {

	private int a;
	int b = 10;

	byte c = 30;
	short d = 5;
	long f = 34;
	float g = 3.6444444F;// senza F viene considerato un double
	double h = 3.454544444444444444;// si puo aggiungere D o no. Non da errore
	boolean m;
	boolean n = true;
	char prova = 'e';

	public void inizializza() {
		a = 10;
		m = true;
	}



	public static void main(String[] args) {

		PrimoGiorno prim = new PrimoGiorno();
		PrimoGiorno prim1 = new PrimoGiorno();
		PrimoGiorno prim2= new PrimoGiorno();
			
ArrayList  tmp1 = new ArrayList();
tmp1.add(prim);
tmp1.add(prim1);
tmp1.add(prim2);

tmp1.get(1);
tmp1.get(12);


		
		
		
tmp1.contains(prim);


	}
}
