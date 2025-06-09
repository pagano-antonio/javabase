package example.patterncomposite;

import java.util.ArrayList;

public class MiaCartella implements MioFileSystem {

	private String nomeMiaCartella;
	private ArrayList<MioFileSystem> cartelle;

	public MiaCartella(String nomeFile) {
		this.nomeMiaCartella = nomeFile;
		cartelle = new ArrayList<MioFileSystem>();
	}

	@Override
	public void aggiungi(MioFileSystem mfs) {
		cartelle.add(mfs);

	}

	@Override
	public void rimuovi(MioFileSystem mfs) {
		cartelle.remove(mfs);

	}

	@Override
	public void stampa() {
		System.out.println("La cartella "+this.nomeMiaCartella+" contiene");
		for (int i = 0; i < cartelle.size(); i++) {
			cartelle.get(i).stampa();
		}

	}

}
