package staticcampo;

public class Test {

	public static void main(String[] args) {
		
		Impiegato a = new Impiegato();
		Impiegato b = new Impiegato();
		
		Impiegato.eta = 30;
		a.eta = 40;
		b.eta = 50;
		
		System.out.println(Impiegato.eta);
		System.out.println(a.eta);
		System.out.println(b.eta);
	}

}
