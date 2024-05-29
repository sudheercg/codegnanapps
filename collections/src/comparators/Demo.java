package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Kumar",44,5));
		personList.add(new Person("Karim",44,5));
		personList.add(new Person("krishna",33,5));
		personList.add(new Person("kenneth",22,5));
		
		
		ArrayList<String> fruitList = new ArrayList<>();
		fruitList.add("Grapes");
		fruitList.add("Banana");
		fruitList.add("Mango");
		fruitList.add("apple");

		Collections.sort(fruitList);
		
		
	}

}
