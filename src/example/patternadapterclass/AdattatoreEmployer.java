package example.patternadapterclass;

public class AdattatoreEmployer extends Employer implements  InterfaceImpiegato {
	  
    @Override
    public String getCognome() {
        return getLastName();
    }
  
    @Override
    public void setCognome(String cognome) {
        setLastName(cognome);
    }
}