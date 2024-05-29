package streamsapi.intermediateops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {

	public static void main(String[] args) {

		List<String> namesList =  Arrays.asList("Kumar","Zohaib","Chinni","Akhil","Bhaskar","Anush");
		
		List<String> sortedList  = namesList.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);//Output: [Akhil, Anush, Bhaskar, Chinni, Kumar, Zohaib]
		
		
	}

}
