package example.patternmethodfactory;

public class CommessoGinnastica extends Commesso {
    public static Scarpe getScarpe(){
        return new ScarpeGinnastica();
    }
}
