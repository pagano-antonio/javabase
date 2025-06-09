package example.patternbuilder;

import java.sql.Date;
import java.text.DateFormat;

public class Seminario {

	public enum Luogo {
		SEDE, CLIENTE
	}

	private static DateFormat dt = DateFormat.getDateInstance();

	public String argomento;
	public Luogo luogo;
	public Date data;
	public Integer numeroPartecipanti;
	public Integer giorniPromemoria;
	public Integer durataInOre;
	public Integer numeroMassimoPartecipanti;

	public Seminario() {
		
	}
	
	public Seminario(String argomento) {
		this.argomento = argomento;
	}

	public Seminario(String argomento, Luogo luogo, Date data) {
		this(argomento);
		this.luogo = luogo;
		this.data = data;
	}

	public Seminario(String argomento, Luogo luogo, Date data, Integer giorniPromemoria) {
		this(argomento, luogo, data);
		this.giorniPromemoria = giorniPromemoria;
	}

	public Seminario(String argomento, Luogo luogo, Date data, Integer giorniPromemoria, Integer numeroPartecipanti) {
		this(argomento);
		this.data = data;
		this.giorniPromemoria = giorniPromemoria;
		this.numeroPartecipanti = numeroPartecipanti;
	}

	public Seminario(String argomento, Luogo luogo, Date data, Integer giorniPromemoria, Integer numeroPartecipanti,
			Integer durataInOre) {
		this(argomento, luogo, data);
		this.giorniPromemoria = giorniPromemoria;
		this.numeroPartecipanti = numeroPartecipanti;
		this.durataInOre = durataInOre;
	}

	public Seminario(String argomento, Luogo luogo, Date data, Integer giorniPromemoria, Integer numeroPartecipanti,
			Integer durataInOre, Integer numeroMassimoPartecipanti) {
		this(argomento, luogo, data, giorniPromemoria, numeroPartecipanti, durataInOre);
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	public String toString() {
		return "Il seminario è intitolato '" + argomento + "" + data != null ? "' si tiene in data  " + dt.format(data)
				: "";
	}

}
