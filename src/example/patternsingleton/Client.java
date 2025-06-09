package example.patternsingleton;

public class Client {

	 public static void main(String[] args) {
	 
		 
		 	Impiegato a = Impiegato.getInstance();
		 	Impiegato b = Impiegato.getInstance();
		 	
		 	if(a == b)
		 	{//  a e b si puntano allo stesso oggetto
		 		System.out.println("a e b sono la stessa istanza");
		 	}
		 

	 
	}

}
