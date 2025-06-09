package example.patternproxy;

public class MyProxy implements Subject {
	 
    private RealSubject realSubject = new RealSubject();
 
    @Override
    public void stampa() {
        System.out.println("MyProxy");
        realSubject.stampa();
    }
}