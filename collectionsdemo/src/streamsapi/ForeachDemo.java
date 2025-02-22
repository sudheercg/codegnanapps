package streamsapi;

import java.util.Arrays;
import java.util.List;

public class ForeachDemo {

	public static void main(String[] args) {
		List<String> namesList = Arrays.asList("Ramya", "Amit","Bhaskar", "Akash","Chinnu", "Akhil");
		namesList.stream().filter(name -> name.startsWith("A")).forEach(name -> System.out.println(name));
	}
}
