package example.patterncomposite;

public interface MioFileSystem {
	public void aggiungi(MioFileSystem mfs);

	public void rimuovi(MioFileSystem mfs);

	public void stampa();
}
