package queuesexamples;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesDemo {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(1);//Head
		queue.add(44);
		queue.add(33);//Tail
		
		System.out.println(queue.peek());
		
		//Removing elements
		System.out.println(queue.poll());
		
		
		
		
		
		
	}

}
