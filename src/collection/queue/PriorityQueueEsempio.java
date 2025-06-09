package collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEsempio {

	 public static void main(String args[])
	    {
	        // Creating empty priority queue
	        Queue<Integer> pQueue
	            = new PriorityQueue<Integer>();
	 
	        // Adding items to the pQueue
	        // using add()
	        pQueue.add(10);
	        pQueue.add(20);
	        pQueue.add(15);
	 
	        // Printing the top element of
	        // the PriorityQueue
	        System.out.println(pQueue.peek());
	 
	        // Printing the top element and removing it
	        // from the PriorityQueue container
	        System.out.println(pQueue.poll());
	 
	        // Printing the top element again
	        System.out.println(pQueue.peek());
	    }

}
