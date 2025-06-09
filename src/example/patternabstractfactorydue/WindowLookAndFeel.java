package example.patternabstractfactorydue;

public class WindowLookAndFeel implements LookAndFeel {
 
    @Override
    public Button createButton() {
    	
    	
    	// aggiungo eventuali modifiche alla creazione dell oggetto button 
    	
    	
        return new WindowButton();
    }
 
    @Override
    public Combo createCombo() {
        return new WindowCombo();
    }
}
