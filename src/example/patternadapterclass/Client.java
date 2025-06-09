package example.patternadapterclass;
public class Client {
	 
    public static void main(String[] args) {
        Impiegato impiegato = new Impiegato();
        impiegato.setCognome("Rossi");
        System.out.println("Impiegato: " + impiegato.getCognome());
 
        
        
        
        AdattatoreEmployer adattatoreEmployer = new AdattatoreEmployer();
        adattatoreEmployer.setCognome("Verdi");
        System.out.println("AdattatoreEmployer: " + adattatoreEmployer.getCognome());
        
        
        
        InterfaceImpiegato i = new AdattatoreEmployer();
        
        
        InterfaceEmployer i2 = new AdattatoreEmployer();
        
        
        
    }
}
