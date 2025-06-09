package example.patternstate;

public class Client {
	 
    public static void main(String[] args) {
    	
//    	PaletteSenzaPattern r = new PaletteSenzaPattern();
//    	
//
//    	
//    	r.settaColore("RED");
//    	
//    	r.currentColor();
    	
        Palette context = new Palette();
        context.setColor(new RedColor());
        context.currentColor();
        
        
        
        
        context.setColor(new WhiteColor());
        context.currentColor();
    }
}