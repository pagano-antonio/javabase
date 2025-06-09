package example.patternobserver;

public class Client {
	public static void main(String[] args) {
		Celebrity dilettaLeotta = new Celebrity("Diletta Leotta");
		Celebrity bradPitt = new Celebrity("Brad Pitt");
		Follower pippo = new Follower("Pippo");
		Follower pluto = new Follower("Pluto");
		Follower paperino = new Follower("Paperino");
		Follower qui = new Follower("Qui");
		Follower quo = new Follower("Quo");
		Follower qua = new Follower("Qua");
		dilettaLeotta.register(pippo);
		dilettaLeotta.register(pluto);
		dilettaLeotta.register(paperino);
		bradPitt.register(qui);
		bradPitt.register(quo);
		bradPitt.register(qua);
		dilettaLeotta.tweet("Hey ragazzi! mi sto allenando in palestra!!!.");
		bradPitt.tweet("La prima regola del fight club è che non ci sono regole!!");
		dilettaLeotta.unregister(pippo);
		dilettaLeotta.tweet("Ci vediamo stasera in TV!!");
	}
}
