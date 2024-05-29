package comparators.seperate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Farheen", 30, 5.5));
		personList.add(new Person("Ankit", 25, 6.1));
		personList.add(new Person("Ganesh", 35, 4.3));

		// Sorting by name
		Collections.sort(personList, new NameComparator());
		System.out.println("Sort using Name comparator");
	//	System.out.println(personList);
		
		Iterator<Person> iterator = personList.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.getName());
		}
		System.out.println();
		System.out.println("Sort using Age comparator");
		Collections.sort(personList, new AgeComparator());
		
		Iterator<Person> ageIterator = personList.iterator();
		while(ageIterator.hasNext()) {
			Person person = ageIterator.next();
			System.out.println(person.getName()+" "+person.getAge());
		}
		
		System.out.println();
		System.out.println("Sort using Height comparator");
		Collections.sort(personList, new HeightComparator());
		
		Iterator<Person> heightIterator = personList.iterator();
		while(heightIterator.hasNext()) {
			Person person = heightIterator.next();
			System.out.println(person.getName()+" "+person.getAge()+" "+person.getHeight());
		}
		
		
		
		
		

	}
}