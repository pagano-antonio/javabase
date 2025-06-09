package example.patternadapterobject;

public class AdattatoreEmployer extends Impiegato {
	 
    private Employer employer = null;
 
    public AdattatoreEmployer(Employer employer) {
        this.employer = employer;
    }
 
    @Override
    public String getCognome() {
    	
    	String cogn = employer.getLastName();
    	
        return cogn;
    }
 
    @Override
    public void setCognome(String cognome) {
        employer.setLastName(cognome);
    }
}
