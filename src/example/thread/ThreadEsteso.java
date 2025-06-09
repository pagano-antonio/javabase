package example.thread;

public class ThreadEsteso extends Thread {

	private String nomeThread;


	public ThreadEsteso(String nomeThread) {
		this.nomeThread = nomeThread;
	}

	public void run() {
		System.out.println("inizio metodo run di:"+nomeThread);

		
		System.out.println("fine metodo run di:"+nomeThread);

	}
}
