package enumexample;

public enum Semi2 {
	
	CUORI(true,10), SPADE(false, 12), QUADRI(true, 23), FIORI(false,28);
	
    private boolean red;
    private int numeroCarte;
    
    private Semi2(boolean red, int numeroCarte) {
      this.red = red;
      this.numeroCarte = numeroCarte;
    }

    public boolean isRed() {
        return red;
      }

    public int getNumeroCarte()
    {
    	return numeroCarte;
    }
    
}


