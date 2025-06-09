package example.threadsyncronized;

public class Prova {

	public static void main(String[] args) {

//		//non sync
/*		ContatoreCondiviso tmp = new ContatoreCondiviso();

		ThreadDemo T1 = new ThreadDemo("Thread - 1 ", tmp);
		ThreadDemo T2 = new ThreadDemo("Thread - 2 ", tmp);

		T1.start();
		T2.start();
*/		
		
		
		//sync
		ContatoreCondiviso PD = new ContatoreCondiviso();

		ThreadDemoSync T1 = new ThreadDemoSync("Thread - 1 ", PD);
		ThreadDemoSync T2 = new ThreadDemoSync("Thread - 2 ", PD);

		T1.start();
		T2.start();
	}

}
