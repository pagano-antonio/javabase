package example.thread;

public class ThreadImplementato implements Runnable {

	private String nomeThread;

	public ThreadImplementato(String nomeThread) {
		this.nomeThread = nomeThread;
	}

	public void run() {

		System.out.println("inizio metodo run di:" + nomeThread);

		System.out.println("fine metodo run di:" + nomeThread);

	}
}
