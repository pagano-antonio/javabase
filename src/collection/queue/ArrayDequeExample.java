package collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;


public class ArrayDequeExample {

	public static void main(String[] args) {
		
		Deque<String> arrayDeque = new ArrayDeque<>();

// Adding elements to the deque
		arrayDeque.add("Alice");
		arrayDeque.add("Bob");
		arrayDeque.add("Charlie");

		// Displaying the deque
		System.out.println("ArrayDeque: " + arrayDeque);

// Removing the head of the deque
		String removed = arrayDeque.remove();
		System.out.println("Removed: " + removed);

		// Displaying the deque after removal
		System.out.println("ArrayDeque after removal: " + arrayDeque);

		// Peeking at the head of the deque
		String head = arrayDeque.peek();
		System.out.println("Head of the deque: " + head);

		// Polling the head of the deque
		head = arrayDeque.poll();
		System.out.println("Polled head of the deque: " + head);

		// Displaying the deque after polling
		System.out.println("ArrayDeque after polling: " + arrayDeque);
	}

}
