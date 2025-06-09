package collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCustomExample {
	 public static void main(String[] args) {
	        Queue<Task> taskQueue = new PriorityQueue<>();

	        // Adding tasks to the priority queue
	        taskQueue.add(new Task("Fix bugs", 1));
	        taskQueue.add(new Task("Write documentation", 3));
	        taskQueue.add(new Task("Develop new feature", 2));
	        taskQueue.add(new Task("Code review", 4));

	        // Displaying and processing tasks in priority order
	        while (!taskQueue.isEmpty()) {
	            Task task = taskQueue.poll();
	            System.out.println("Processing task: " + task);
	        }
	    }
}
