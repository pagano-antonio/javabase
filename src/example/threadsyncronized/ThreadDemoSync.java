package example.threadsyncronized;

public class ThreadDemoSync extends Thread {
	private Thread t;
	private String threadName;
	ContatoreCondiviso PD;

	ThreadDemoSync(String name, ContatoreCondiviso pd) {
		threadName = name;
		PD = pd;
	}

	public void run() {
		System.out.println("Starting " + threadName);
		synchronized (PD) {
			PD.stampaCont(threadName);
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

}
