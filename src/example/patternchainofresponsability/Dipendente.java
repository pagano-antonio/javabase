package example.patternchainofresponsability;

public abstract class Dipendente {
	Dipendente dipendente = null;
	 
    public void setSuperiore(Dipendente dipendente) {
        this.dipendente = dipendente;
    }
 
    public abstract void check(int stipendio);
}
