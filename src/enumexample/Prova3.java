package enumexample;

import java.util.ArrayList;
import java.util.List;

public class Prova3 {

	enum seme {
		DANARI, SPADE, COPPE, BASTONI
	};

	static public void prova(seme t) {

		if (t.equals(seme.BASTONI))
			System.out.println("sono bastoni");

	}

	public static void main(String[] args) {

		Semi2 t = Semi2.valueOf("CUORI");

		System.out.println(t.isRed());
		System.out.println(t.getNumeroCarte());

	}

}
