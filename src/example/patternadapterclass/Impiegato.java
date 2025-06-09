package example.patternadapterclass;

public class Impiegato implements InterfaceImpiegato {
	  
    private String cognome = null;
  
    @Override
    public String getCognome() {
        return cognome;
    }
  
    @Override
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
  
}
