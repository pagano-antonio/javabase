package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
	 public static void main(String args[])
	    {
	        // Creating empty LinkedList
	        Queue<Integer> ll
	            = new LinkedList<Integer>();
	 
	        // Adding items to the ll
	        // using add()
	        ll.add(10);
	        ll.add(20);
	        ll.add(15);
	 
	        // Printing the top element of
	        // the LinkedList
	        System.out.println(ll.peek());
	 
	        // Printing the top element and removing it
	        // from the LinkedList container
	        System.out.println(ll.poll());
	 
	        // Printing the top element again
	        System.out.println(ll.peek());
	    }
}
