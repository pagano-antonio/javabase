package example.patternstatetre;

public class GestioneOrdine {
	 
    public static void main(String[] args) {
        new GestioneOrdine().esecuzioneOrdine();
    }
 
    public void esecuzioneOrdine() {
        Ordine ordine = new Ordine();
 
        Stato statoOrdine = ordine.getStatoOrdine();
        System.out.println("Stato attuale dell'ordine: " + statoOrdine );
 
        statoOrdine.gestioneStatoOrdine( ordine, "in_corso" );
        statoOrdine = ordine.getStatoOrdine();
        System.out.println("Stato attuale dell'ordine: " + statoOrdine );
 
        statoOrdine.gestioneStatoOrdine( ordine, "pronto" );
        statoOrdine = ordine.getStatoOrdine();
        System.out.println("Stato attuale dell'ordine: " + statoOrdine );
 
        statoOrdine.gestioneStatoOrdine( ordine, "in_partenza" );
        statoOrdine = ordine.getStatoOrdine();
        System.out.println("Stato attuale dell'ordine: " + statoOrdine );
 
        statoOrdine.gestioneStatoOrdine( ordine, "spedito" );
        statoOrdine = ordine.getStatoOrdine();
        System.out.println("Stato attuale dell'ordine: " + statoOrdine );
    }
}