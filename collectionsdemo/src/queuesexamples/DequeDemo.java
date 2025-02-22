package queuesexamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>(); 
		
		//Adds 19 to the front
		deque.addFirst(19);

		//adds 30 to the rear or end
		deque.addLast(30);
		
		//adds 33 to the front
		deque.offerFirst(33);
		
		//adds 50 to the end or rear
		deque.offerLast(50);
		
		System.out.println("Deque: "+deque);
		
		System.out.println("Head of the deque: "+deque.getFirst());
		System.out.println("Tail of the deque: "+deque.getLast());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
