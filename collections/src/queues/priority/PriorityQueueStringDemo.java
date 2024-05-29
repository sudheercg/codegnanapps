package queues.priority;

import java.util.PriorityQueue;

public class PriorityQueueStringDemo {
	
	public static void main(String[] args) {
		PriorityQueue<String> stringQueue = new PriorityQueue<>();
		stringQueue.add("Jaheer");
		stringQueue.add("Beena");
		stringQueue.add("Abhi");
		stringQueue.add("Kumar");
		stringQueue.add("Babu");
		
		while(!stringQueue.isEmpty()) {
			System.out.println(stringQueue.poll());
		}
		
	}

}
