package example.thread;

public class Prova {
	public static void main(String[] args) {


		
		
		
		ThreadEsteso t = new ThreadEsteso("T");
		t.start();
		System.out.println("il main procede");
		
		
		
		ThreadEsteso t1 = new ThreadEsteso("T1");
		t1.start();
		System.out.println("il main procede dopo il secondo thread");

		
		
		ThreadImplementato p = new ThreadImplementato("P");
		Thread r = new Thread(p);
		r.start();
		
		ThreadImplementato p1 = new ThreadImplementato("P1");
		Thread r1 = new Thread(p1);
		r1.start();
		
		
		
		
//		while(fino a quando esistono file excel f da leggere)
//		{
//			leggo il file excel f.
//			
//			for(leggo il contenuto del file)
//			{
//				String emailLettaDalFileExcel = 
//				EmailSimulazione.sendEmail(emailLettaDalFileExcel, "BENVENUTO IN WIND");
//			}
//		}
		//immmaginiamo mille file--> tutto sara mmolto lento
		// lettura file e invio email sono operazioni lente.
		
//		while(fino a quando esistono file excel f da leggere)
//		{
//			leggo il file excel f.
//			ThreadEsteso t = new ThreadEsteso("T", f);
//			t.start();
//			
//		}	
		
		
	}

}
