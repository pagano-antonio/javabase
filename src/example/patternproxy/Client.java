package example.patternproxy;

public class Client {
	 
    private Subject subject;
 
    public static void main(String[] args) {
        new Client().invoke();
    }
 
    void invoke() {
        subject = new MyProxy();
        subject.stampa();
    }
 
}