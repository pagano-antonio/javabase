package example.patternabstractfactorydue;

public class MotifCombo  implements Combo {
 
    @Override
    public Combo create() {
        System.out.println("Creazione MotifCombo completata");
        return this;
    }
 
}
