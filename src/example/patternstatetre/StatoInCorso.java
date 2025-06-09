package example.patternstatetre;

public class StatoInCorso implements Stato {
	 
    @Override
    public void gestioneStatoOrdine(Ordine ordine, String stato) {
        if (stato.equals("esaurito")) {
            ordine.setStatoOrdine(new StatoEsaurito());
        } else if (stato.equals("cancellato")) {
            ordine.setStatoOrdine(new StatoCancellato());
        } else if (stato.equals("pronto")) {
            ordine.setStatoOrdine(new StatoPronto());
        } else if (stato.equals("difettoso")) {
            ordine.setStatoOrdine(new StatoDifettoso());
        }
    }
}