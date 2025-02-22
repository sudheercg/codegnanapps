package sets.set;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();

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
