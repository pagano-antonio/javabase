package example.threadsyncronized;

public class ThreadDemo extends Thread {
	  
	   private String threadName;
	   
	   ContatoreCondiviso  PD;

	   ThreadDemo( String name,  ContatoreCondiviso pd) {
	      threadName = name;
	      PD = pd;
	   }
	   
	   public void run() {
		   System.out.println("Starting " +  threadName );
		   
	      PD.stampaCont(threadName);
	      
	      System.out.println("Thread " +  threadName + " exiting.");
	   }


	}