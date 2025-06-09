package esempioeccezioni;

import java.io.File;
import java.io.IOException;

import eccezioni.MiaEccezione;

public class Prova {
	public static int divisione(int d, int s) throws IOException  {
		
		
			int t = d/s;
			if(1==1)
				throw new MiaEccezione();
		
		
		System.out.println("il programma continua");
		return 2;

	}

	public static void prova() throws IOException {
		divisione(20,1);
	}
	
	public static void main(String[] args)  {
		
	
		
			
					try {
						prova();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
			


	}
}
