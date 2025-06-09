package eccezioni;

import java.util.Scanner;

public class CatchMultipli {
	public static void main(String[] args) {

		try {

			Scanner scan = new Scanner(System.in);
			System.out.println("dammi un numero");
			int x = scan.nextInt();
			// This will throw an ArithmeticException if num is 0
			int result = 100 / x;

			System.out.println("risultato divisione:" + x);
		} catch (ArithmeticException e) {
			System.out.println("ERRORE: hai inseriti dati non validi. Ritenta");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("ERRORE: CONTATTARE L AMMINISTRATORE DEL SISTEMA");
			e.printStackTrace();
		}

	}

}
