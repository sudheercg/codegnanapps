package streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {

		String[] fruitsArray = { "Apple", "Banana", "Cherry" };

		// List<String> fruits = fruitsArray.
		// Arrays.stream(fruitsArray)

		
		//Using filter intermediate operation
		List<String> fruitsList = Arrays.asList("Apple", "Banana", "Cherry");
		List<String> filteredList = fruitsList.stream().filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());

		for (String fruit : filteredList) {
			System.out.println(fruit);
		}

		// Using Distinct Intermediate Operation
		List<Integer> ranksList = Arrays.asList(10, 20, 10, 50, 3, 3, 55, 66, 3, 1, 66);
		List<Integer> distinctList = ranksList.stream().distinct().collect(Collectors.toList());

		for (Integer i : distinctList) {
			System.out.println(i);
		}

	}

}
