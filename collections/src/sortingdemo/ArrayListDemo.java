package sortingdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> marksList = new ArrayList<>();
		marksList.add(13);
		marksList.add(66);
		marksList.add(33);
		marksList.add(35);

		// Iterator,ListIterator,for, enhancedfor
		System.out.println("Marks List Before sorting: ");
		for (Integer mark : marksList) {
			System.out.println(mark);
		}

		System.out.println();
		Collections.sort(marksList);
		System.out.println("Marks List After sorting");
		for (Integer mark : marksList) {
			System.out.println(mark);
		}

		System.out.println();

		ArrayList<String> fruitsList = new ArrayList<>();
		fruitsList.add("Mango");
		fruitsList.add("Banana");
		fruitsList.add("Apple");
		fruitsList.add("Guava");

		// Iterator,ListIterator,for, enhancedfor
		System.out.println("Fruits List Before sorting: ");
		for (String fruit : fruitsList) {
			System.out.println(fruit);
		}

		Collections.sort(fruitsList);

		System.out.println();
		System.out.println("Fruits List After sorting: ");
		for (String fruit : fruitsList) {
			System.out.println(fruit);
		}

		System.out.println();
		
		ArrayList<Person> personsList = new ArrayList<>();

		personsList.add(new Person("Kumar", 65, 6));
		personsList.add(new Person("Akash", 43, 5.5));
		personsList.add(new Person("Venki", 4, 5.9));
		personsList.add(new Person("Chetan", 87, 4.6));

		System.out.println("Before Sorting Person Objects: ");
		for (Person person : personsList) {
			System.out.println(person);

		}

		System.out.println();
		System.out.println("After Sorting Person Objects: ");
		Collections.sort(personsList);
		for (Person person : personsList) {
			System.out.println(person);
		}
	}

}
