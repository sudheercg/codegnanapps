package sets.hashsetdemos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> fruitSet = new HashSet<>(50);
		fruitSet.add("Mango");
		fruitSet.add("Banana");
		fruitSet.add("Kiwi");
		fruitSet.add("Apple");

		Iterator<String> fruitsIterator = fruitSet.iterator();

		while (fruitsIterator.hasNext()) {
			System.out.println(fruitsIterator.next());
		}

		ArrayList<String> countriesList = new ArrayList<>();
		countriesList.add("India");
		countriesList.add("Russia");
		countriesList.add("Singapore");
		countriesList.add("Canada");
		countriesList.add("Canada");

		
		System.out.println();
		System.out.println("Countries List");
		HashSet<String> countrySet = new HashSet<>(countriesList);

		Iterator<String> itr = countrySet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
