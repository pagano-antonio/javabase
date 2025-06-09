package example.patternabstractfactorydue;

public class Client {
	public static void main(String[] args) {
        LookAndFeel lookAndFeel = null;
        
        String type = "window";
        if (type.equals("window"))
            lookAndFeel = new WindowLookAndFeel();
        else
            lookAndFeel = new MotifLookAndFeel();
 
        Button button = lookAndFeel.createButton();
        button.create();
        Combo combo = lookAndFeel.createCombo();
        combo.create();
 
    }
 
}
