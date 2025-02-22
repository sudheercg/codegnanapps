package streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamOperationsDemo {
	public static void main(String[] args) {
		List<String> namesList = Arrays.asList("Bhaskar","Ramya","Akash","Amit","Bhaskar",
				"Akash","Chinnu", "Akhil");
     	//map
		//distinct
		//sorted - sort the names in alphabetical order
		//filtering the names starting with 
		List<String> result= namesList.stream().map(name-> name.toLowerCase()).
		filter(name->name.startsWith("a")||name.startsWith("b"))
		.distinct().sorted().collect(Collectors.toList());
		System.out.println(result);
	}
}
