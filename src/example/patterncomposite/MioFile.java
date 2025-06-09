package example.patterncomposite;

public class MioFile implements MioFileSystem {
 
    private String mioFileName = null;
 
    public MioFile(String nomeFile) {
        this.mioFileName = nomeFile;
    }

	@Override
	public void aggiungi(MioFileSystem mfs) {

		 System.out.println("Impossibile Aggiungere Elementi ad un File!!");
	}

	@Override
	public void rimuovi(MioFileSystem mfs) {
		System.out.println("Impossibile rimuoverlo!");
		
	}

	@Override
	public void stampa() {
		 System.out.println(mioFileName);
		
	}
    
    
}
