package streamsapi.intermediateops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {

		List<String> namesList =  Arrays.asList("Akhil","Bhaskar","Chinni","Anush");
		
		List<String> filteredList  = namesList.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(filteredList);//Output: [Akhil, Anush]
		
	}

}
