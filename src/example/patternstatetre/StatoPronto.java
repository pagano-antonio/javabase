package example.patternstatetre;

public class StatoPronto implements Stato {
	 
    @Override
    public void gestioneStatoOrdine(Ordine ordine, String stato) {
        if (stato.equals("in_partenza"))
            ordine.setStatoOrdine(new StatoInPartenza());
    }
 
}