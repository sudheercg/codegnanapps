package streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {

	public static void main(String[] args) {

		List<String> namesList = Arrays.asList("Ramya", "Bhaskar", "Chinnu", "Akhil");

		System.out.println("Original List: " + namesList);

		List<String> sortedList = namesList.stream().sorted().collect(Collectors.toList());

		System.out.println("Sorted List: " + sortedList);

	}

}
