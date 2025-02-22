package sets.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetWithComparatorExample {

	public static void main(String[] args) {

		Comparator<Integer> descendingOrder = new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {

				return o2 - o1;
			}
		};

		TreeSet<Integer> numbers = new TreeSet<>(descendingOrder);

		numbers.add(5);
		numbers.add(1);
		numbers.add(504);
		numbers.add(8);

		// Display the elements of TReeSet
		for (Integer number : numbers) {
			System.out.println(number);
		}
	}

}
