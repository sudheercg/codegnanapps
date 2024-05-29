package comparators.seperate;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Person, String> nameMap = new TreeMap<>(new NameComparator());
		nameMap.put(new Person("Farheen", 30, 5.5), "Engineer");
		nameMap.put(new Person("Ankit", 25, 6.1), "Artist");
		nameMap.put(new Person("Ganesh", 35, 4.3), "Doctor");

		for (Map.Entry<Person, String> entry : nameMap.entrySet()) {

			System.out.println(entry.getKey().getName() + " " + entry.getValue());
		}

	}

}
