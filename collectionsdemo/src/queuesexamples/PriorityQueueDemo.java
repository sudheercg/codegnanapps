package queuesexamples;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		
		//Adding the elements into PriorityQueue
		priorityQueue.add(10);
		priorityQueue.add(20);
		priorityQueue.add(15);
		priorityQueue.add(9);
		priorityQueue.add(1);
		
		//Accessing the elements from PQ
		System.out.println("Head of the Priority Queue"+ priorityQueue.peek());
		
		//Removing elements
		System.out.println("Removed element: "+priorityQueue.poll() );
		
		System.out.println("Head of the Priority Queue"+ priorityQueue.peek());

		
		
		
	}
	
}
