package streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
		List<String> namesList = Arrays.asList("Akhil","Ramya", "Bhaskar","Chinnu");
		
		//Finding the length of Strings in a List
		List<Integer> nameLengthList= namesList.stream().map(name->name.length()).collect(Collectors.toList());
	     System.out.println(nameLengthList);
	     
	     //Converting the list of Strings to Uppercase 
		List<String> upperCaseNames= namesList.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseNames);

	
	}
	

}
