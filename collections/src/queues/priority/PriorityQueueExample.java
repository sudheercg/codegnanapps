package queues.priority;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		priorityQueue.offer(5);
		priorityQueue.offer(2);
		priorityQueue.offer(8);
		priorityQueue.offer(1);
		
		//Examining the head of the PriorityQueue using peek()
		System.out.println("Head of the PriorityQueue: "+ priorityQueue.peek());
		
		
		//poll() removes and returns the head of the queue. 
		while(!priorityQueue.isEmpty()) {
			System.out.println("Removed Element::: "+ priorityQueue.poll());
		}
		
		
	}

}
