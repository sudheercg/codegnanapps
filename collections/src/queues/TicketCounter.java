package queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TicketCounter {

	public static void main(String[] args) {

		Queue<String> ticketLine = new LinkedList<>();

		ticketLine.add("Mahesh");
		ticketLine.add("Lisa");
		ticketLine.add("Kennedy");
		ticketLine.offer("Sai");
		ticketLine.offer("Salman");

		System.out.println("Element at Head:::: " + ticketLine.element());
		System.out.println(ticketLine.peek());

				Iterator<String> iterator = ticketLine.iterator();
		while (iterator.hasNext()) {
			String passenger = iterator.next();
			System.out.println(passenger);
		}
		System.out.println();
		System.out.println("***Serving the Passengers***");
		while (!ticketLine.isEmpty()) {
			// Removes and retrieves the person at the front of the line
			String processedPassenger = ticketLine.poll();
			System.out.println("Serving: " + processedPassenger);
		}
	}

}
