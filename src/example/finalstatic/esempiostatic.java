package example.finalstatic;

public  class esempiostatic {

		public static void main(String[] args) {
			Impiegato a = new Impiegato();
			Impiegato b = new Impiegato();
			
			Impiegato.count = 40;
			a.count = 50;
			b.count = 60;
			
			System.out.println(Impiegato.count);
			System.out.println(a.count);
			System.out.println(b.count);
		}
	
	
}
