package example.patternsingleton;

public class Stampante {
	
	private static Stampante t = new Stampante();
	
	 private String marca = "HP";
	 private String tipo = "xcf";
	 private int numeroMatricola = 2345;
	 
	 
	
	int numeroFogli;
	
	
	private Stampante() {
		
	}

	
	public static Stampante getInstance() {
		
		return t;
	}
}
