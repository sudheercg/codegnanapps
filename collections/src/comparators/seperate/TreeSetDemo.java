package comparators.seperate;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Person> personSet = new TreeSet<>(new HeightComparator());
		personSet.add(new Person("Farheen", 30, 5.5));
		personSet.add(new Person("Ankit", 25, 6.1));
		personSet.add(new Person("Ganesh", 35, 4.3));
		
		for(Person person : personSet) {
			System.out.println(person.getName()+" "+person.getAge()+" "+person.getHeight());
		}
		
		
		
	}

}
