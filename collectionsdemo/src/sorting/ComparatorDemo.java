package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();

		personList.add(new Person("Raj", 90));
		personList.add(new Person("Kumar", 40));
		personList.add(new Person("Adam", 70));
		personList.add(new Person("Amir", 30));

		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return Integer.compare(p1.getAge(), p2.getAge());
			}
		});

		for (Person person : personList) {
			System.out.println(person);

		}
	
		
		

	}
}
