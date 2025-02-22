package sortingdemo.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {

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
		System.out.println("After Sorting Person Objects based on Name: ");

		Collections.sort(personsList, new NameComparator());
		for (Person person : personsList) {
			System.out.println(person);
		}
		
		

		System.out.println();
		System.out.println("After Sorting Person Objects based on Age: ");

		Collections.sort(personsList, new AgeComparator());
		for (Person person : personsList) {
			System.out.println(person);
		}
		
		
	}

}
