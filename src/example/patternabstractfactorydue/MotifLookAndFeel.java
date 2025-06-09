package example.patternabstractfactorydue;

public class MotifLookAndFeel implements LookAndFeel {
 
    @Override
    public Button createButton() {
        return new MotifButton();
    }
 
    @Override
    public Combo createCombo() {
        return new MotifCombo();
    }
 
}