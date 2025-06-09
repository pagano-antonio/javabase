package example.patterncomposite;

public class Client {
	public static void main(String[] args) {
		MioFileSystem f1 = new MioFile("F1");
		MioFileSystem f2 = new MioFile("F2");
		MioFileSystem c1 = new MiaCartella("C1");
		c1.aggiungi(f1);
		c1.aggiungi(f2);

		MioFileSystem f3 = new MioFile("F3");
		MioFileSystem f4 = new MioFile("F4");
		MioFileSystem c2 = new MiaCartella("C2");
		c2.aggiungi(f3);
		c2.aggiungi(f4);
		
		c1.aggiungi(c2);
		c1.stampa();
	}
}
