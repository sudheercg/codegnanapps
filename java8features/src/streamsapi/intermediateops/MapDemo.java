package streamsapi.intermediateops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {

		List<String> namesList =  Arrays.asList("akhil","bhaskar","chinni","anush");
		List<Integer> nameLengthList = namesList.stream().map(String :: length).collect(Collectors.toList());
		System.out.println(nameLengthList);//Output: [5, 7, 6, 5]
		
		List<String> upperCaseNames= namesList.stream().map(String :: toUpperCase).collect(Collectors.toList());
		
		System.out.println(upperCaseNames);//Output: [AKHIL, BHASKAR, CHINNI, ANUSH]
		
	}

}
