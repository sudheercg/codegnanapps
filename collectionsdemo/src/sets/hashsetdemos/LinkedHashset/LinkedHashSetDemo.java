package sets.hashsetdemos.LinkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<String> fruitSet = new LinkedHashSet<>();
		fruitSet.add("Mango");
		fruitSet.add("Banana");
		fruitSet.add("Kiwi");
		fruitSet.add("Apple");

		Iterator<String> fruitsIterator = fruitSet.iterator();

		while (fruitsIterator.hasNext()) {
			System.out.println(fruitsIterator.next());
		}

	

	}

}
