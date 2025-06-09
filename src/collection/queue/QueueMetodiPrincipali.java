package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMetodiPrincipali {

	//breve introduzione
	//
	
	public static void main(String[] args) {
		  // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();
        
        // Adding elements to the Queue
     //   queue.add("Element1"); 
      //  queue.add("Element2"); 
        
        // Displaying the Queue
        System.out.println("Queue: " + queue);
        
        // Accessing the head element
  //        System.out.println("Head of the queue (using element()): " + queue.element()); // Throws exception if the queue is empty
   //     System.out.println("Head of the queue (using peek()): " + queue.peek()); // Returns null if the queue is empty
//        
//        // Removing elements from the Queue
//        System.out.println("Removed from queue (using remove()): " + queue.remove()); // Throws exception if the queue is empty
        System.out.println("Removed from queue (using poll()): " + queue.poll()); // Returns null if the queue is empty

//        // Displaying the Queue after removals
        System.out.println("Queue after removals: " + queue);
	}

}
