package example.patternproxy;

public class RealSubject implements Subject {
	 
    @Override
    public void stampa() {
        System.out.println("RealSubject");
    }
}