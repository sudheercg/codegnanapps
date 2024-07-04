package arraylistexamples;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> countriesList = new LinkedList<>();
		
		countriesList.add("India");
		countriesList.add("USA");
		countriesList.add("UK");
		
		System.out.println("Retrieving countries using enhanced for loop");

		for(String country:countriesList) {
			System.out.println(country);
		}

		System.out.println();
		System.out.println("Retrieving countries using classic for loop");
		for(int i=0; i<countriesList.size(); i++) {
			System.out.println(countriesList.get(i));
		}
		
		//adding
		countriesList.addFirst("Canada");
		countriesList.addLast("Australia");
		
		System.out.println();
		System.out.println("Retrieving countries using classic for loop");
		for(int i=0; i<countriesList.size(); i++) {
			System.out.println(countriesList.get(i));
		}
		
		//Methods to remove
		System.out.println();
		System.out.println("Removal");
		countriesList.removeFirst();
		
		//to remove last element
		System.out.println(countriesList.removeLast());
		
		//To get the elements
		System.out.println();
		System.out.println("Retrieval");
		System.out.println(countriesList.getFirst());
		System.out.println(countriesList.getLast());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
