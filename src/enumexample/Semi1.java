package enumexample;

public enum Semi1 {

	CUORI(20), SPADE(15), QUADRI(10), FIORI(56);
	
    private int numeroCarte;
    
    private Semi1(int numeroCarte) {
      this.numeroCarte = numeroCarte;
    }

 
    public int getNumeroCarte()
    {
    	return numeroCarte;
    }
    
}

