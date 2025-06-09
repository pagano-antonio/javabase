package example.patternstateDue;

public class Ordine {
	 
    private String statoOrdine;
 
    public Ordine() {
        this.statoOrdine = Stato.NUOVO;
    }
 
    public String getStatoOrdine() {
        return statoOrdine;
    }
 
    public void setStatoOrdine(String statoOrdine){
        this.statoOrdine = statoOrdine;
    }
 
}