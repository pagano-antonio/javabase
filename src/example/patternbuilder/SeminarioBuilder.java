package example.patternbuilder;

import java.sql.Date;

import example.patternbuilder.Seminario.Luogo;

public class SeminarioBuilder {
	private String argomento;
	private Luogo luogo; // obbligatorio
	private Date data; // obbligatorio
	private Integer numeroPartecipanti;
	private Integer giorniPromemoria;
	private Integer durataInOre;
	private Integer numeroMassimoPartecipanti;

	public void setLuogo(Luogo luogo) {
		this.luogo = luogo;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setNumeroPartecipanti(Integer numeroPartecipanti) {
		this.numeroPartecipanti = numeroPartecipanti;
	}

	public void setGiorniPromemoria(Integer giorniPromemoria) {
		this.giorniPromemoria = giorniPromemoria;
	}

	public void setDurataInOre(Integer durataInOre) {
		this.durataInOre = durataInOre;
	}

	public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	public SeminarioBuilder(String argomento) {
		this.argomento = argomento;
	}

	public Seminario build() {
		Seminario s = new Seminario();
		s.argomento = argomento;
		s.luogo = this.luogo;
		s.data = this.data;
		s.numeroPartecipanti = this.numeroPartecipanti;
		s.durataInOre = this.durataInOre;
		s.numeroMassimoPartecipanti = this.numeroMassimoPartecipanti;
		s.giorniPromemoria = this.giorniPromemoria;
		return s;
	}

}
