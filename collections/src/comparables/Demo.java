package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Kumar", 44));
		personList.add(new Person("Karim", 44));
		personList.add(new Person("krishna", 33));
		personList.add(new Person("kenneth", 22));

		Collections.sort(personList);

	}

}
